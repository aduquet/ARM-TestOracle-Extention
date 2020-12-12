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

        for i in range(1, len(dataPath)):
            # print(dataPath[i])
            df = pd.read_csv(dataPath[i], index_col=0)
            unique_df = uniqueRows(df)
            df_all = pd.concat([df_all, unique_df])
            # print(len(df_all), len(unique_df), len(df))
        df_all.to_csv(file_out + '.csv')
main()
