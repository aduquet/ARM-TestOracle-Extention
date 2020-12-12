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
    @click.option('-i', '--file', 'file_in', help='path Original file')
    @click.option('-o', '--out', 'file_out', help='Name of the file in which data will be stored')
    def main(file_in, file_out):
        print('*** Reading Data ***')

        dataPath = gl.glob(file_in)
        df = pd.read_csv(dataPath[0], index_col=0)
        unique_df = uniqueRows(df)
        df_all = unique_df.copy()
        columns = list(df_all.columns)
        # print(len(df_all), len(df))

        for i in range(0, len(dataPath)):
            # print(dataPath[i])
            df = pd.read_csv(dataPath[i], index_col=0)
            df.drop(columns=['size_p', 'isEmpty_p', 'peek_obj_type_p'], inplace=True)
            # print(df.keys())
            unique_df = uniqueRows(df)
            # print(len(unique_df), len(df))
            # df_all = df_all.merge(unique_df, on=columns, how='left', indicator=True)
            # df_all = pd.concat([df_all, unique_df])
            # print(len(df_all), len(unique_df), len(df))
            name = dataPath[i].split('\\')

            name = name[-1]
            # name = name.split('')
            unique_df.to_csv(file_out + '\\' + name)
main()
