import pandas as pd
import numpy as np
import glob as gl
import pickle
from efficient_apriori import apriori
import warnings

warnings.filterwarnings('ignore')


def ruleGenerator(transactions_df, support, conf):
    """
        Generate set of rules with given support and confidence using transactions_df
    """
    # print(transactions_df.head(20))
    transactions_array = transactions_df.to_numpy()
    transactions_list = transactions_array.tolist()
    itemSets, rules = apriori(transactions_list, min_support=support, min_confidence=conf)
    return itemSets, rules


def saveFile(pre, test_path, df, file_out):
    name = test_path.split('\\')
    name = name[-1]
    name = name.split('_')
    name = pre + name[0]
    df.to_csv(file_out + '\\' + name + '.csv')
    print('\n *** DONE!! *** \n', file_out + '\\' + name)


if __name__ == '__main__':
    import click


    @click.command()
    @click.option('-i', '--file', 'file_in', help='Path for getting the data')
    @click.option('-s', '--out', 'sup', help='Name of the file in which data will be stored')
    @click.option('-c', '--out', 'conf', help='Name of the file in which data will be stored')
    @click.option('-o', '--out', 'file_out', help='Name of the file in which data will be stored')
    def main(file_in, file_out, sup, conf):
        print('*** Reading Data ***')
        dataPath = gl.glob(file_in)
        dfAux = {'LHS': "", 'LHS_size': "", 'RHS': "", 'RHS_size': "", 'conf': "", 'sup': "", 'lift': "", 'cov': ""}
        dfListUnion = []
        dfListIntersection = []
        sets1 = []
        sets2 = []

        for i in range(0, len(dataPath)):
            df = pd.read_csv(dataPath[i], index_col=0)
            df.drop(columns=['size_p', 'isEmpty_p', 'peek_obj_type_p'], inplace=True)
            items, rules1 = ruleGenerator(df, float(sup), float(conf))
            sets1.append(set(rules1))
            # print(items, '\n \n')
            sets2.append(set(items))

        sup = sup.split('.')
        sup = sup[-1]
        conf = conf.replace('.', '_')
        union = set.union(*sets1)
        lUnion = list(union)
        intersection = set.intersection(*sets1)
        lIntersection = list(intersection)

        for rul in range(0, len(lUnion)):
            dfAux_union = {'LHS': tuple(lUnion[rul].lhs), 'LHS_size': len(lUnion[rul].lhs),
                           'RHS': tuple(lUnion[rul].rhs), 'RHS_size': len(lUnion[rul].rhs),
                           'conf': lUnion[rul].confidence,
                           'sup': lUnion[rul].support, 'lift': lUnion[rul].lift, 'cov': lUnion[rul].conviction}
            dfListUnion.append(dfAux_union)

        dfRule = pd.DataFrame(dfListUnion)
        ruleName = 'RulesUnion_' + 'sup_0' + sup + 'conf_' + conf + '_'
        saveFile(ruleName, dataPath[0], dfRule, file_out)

        for rul in range(0, len(lIntersection)):
            dfAux_lIntersection = {'LHS': tuple(lIntersection[rul].lhs), 'LHS_size': len(lIntersection[rul].lhs),
                                   'RHS': tuple(lIntersection[rul].rhs),
                                   'RHS_size': len(lIntersection[rul].rhs), 'conf': lIntersection[rul].confidence,
                                   'sup': lIntersection[rul].support, 'lift': lIntersection[rul].lift,
                                   'cov': lIntersection[rul].conviction}
            dfListIntersection.append(dfAux_lIntersection)

        dfRule = pd.DataFrame(dfListIntersection)
        ruleName = 'RulesIntersection_' + 'sup_0' + sup + 'conf_' + conf + '_'
        saveFile(ruleName, dataPath[0], dfRule, file_out)

main()
