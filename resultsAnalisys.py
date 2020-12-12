import warnings

warnings.filterwarnings('ignore')

import matplotlib.pyplot as plt
import pandas as pd
import numpy as np
import glob as gl

plt.rcParams.update({'font.size': 10})


def uniqueRows(data):
    data = data.drop_duplicates()
    return data


if __name__ == '__main__':
    import click


    @click.command()
    @click.option('-i', '--file', 'file_in', help='Original file')
    @click.option('-t', '--testData', 'testedData', help='tested file')
    @click.option('-tr', '--testDataResults', 'tsDataResult', help='Report file')
    @click.option('-r', '--fileRules', 'file_rules', help='Rules file')
    @click.option('-o', '--out', 'file_out', help='Name of the file in which data will be stored')
    def main(file_in, testedData, file_rules, tsDataResult, file_out):
        print('*** Reading Data ***')

        oriData = pd.read_csv(file_in, index_col=0)
        testedData = pd.read_csv(testedData, index_col=0)
        tsDataResult = pd.read_csv(tsDataResult, index_col=0)
        rules = pd.read_csv(file_rules)

        uniqueOriData = uniqueRows(oriData)
        print(len(oriData), len(uniqueOriData))

        unique_testedData = uniqueRows(testedData)
        print(len(testedData), len(unique_testedData))

        unique_tsDataResult = uniqueRows(tsDataResult)
        print(len(unique_tsDataResult), len(unique_tsDataResult))

        unique_rules = uniqueRows(rules)
        print(len(rules), len(unique_rules))

        total = pd.concat([uniqueOriData, unique_testedData])
        print(len(total))
        uniqueTotal = uniqueRows(total)
        print(len(uniqueTotal))

        total.to_csv('Total.csv')
main()
