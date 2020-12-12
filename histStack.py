import pandas as pd
import numpy as np
import glob as gl
import matplotlib.pyplot as plt

import warnings

warnings.filterwarnings('ignore')


def histoData(df):
    df = df.sort_values(by=['testId', 'instanceId'], ascending=False)
    df = df.reset_index()
    df = df.drop(['arguments'], axis=1)
    new_df = df.assign(size_p=0, isEmpty_p='True', peek_p=str(0), peek_obj_type_p=str(0), calledMethod_p=str(0))

    for index, row in df.iterrows():

        if index != len(df):

            if index == 0:
                new_df.at[index, 'size_p'] = df.at[index, 'size']
                new_df.at[index, 'isEmpty_p'] = df.at[index, 'isEmpty']
                new_df.at[index, 'peek_p'] = df.at[index, 'peek']
                new_df.at[index, 'peek_obj_type_p'] = df.at[index, 'peek_obj_type']
                new_df.at[index, 'calledMethod_p'] = df.at[index, 'calledMethod']

            else:
                new_df.at[index, 'size_p'] = df.at[index - 1, 'size']
                new_df.at[index, 'isEmpty_p'] = df.at[index - 1, 'isEmpty']
                new_df.at[index, 'peek_p'] = df.at[index - 1, 'peek']
                new_df.at[index, 'peek_obj_type_p'] = df.at[index - 1, 'peek_obj_type']
                new_df.at[index, 'calledMethod_p'] = df.at[index - 1, 'calledMethod']

    return new_df


def saveFile(test_path, df, file_out):
    name = test_path.split('\\')
    name = 'Hist_' + name[-1]
    df.to_csv(file_out + '\\' + name)
    print('\n *** Historical Data is saved in *** \n', file_out + '\\' + name)


if __name__ == '__main__':
    import click


    @click.command()
    @click.option('-i', '--file', 'file_in', help='Path for getting the data')
    @click.option('-o', '--out', 'file_out', help='Name of the file in which data will be stored')
    def main(file_in, file_out):
        print('*** Reading Data ***')
        dataPath = gl.glob(file_in + '/*')

        for i in range(0, len(dataPath)):
            df = pd.read_csv(dataPath[i], index_col=0)
            new_df = histoData(df)
            saveFile(dataPath[i], new_df, file_out)

main()
