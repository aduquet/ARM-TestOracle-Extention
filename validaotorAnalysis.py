import warnings

warnings.filterwarnings('ignore')

import matplotlib.pyplot as plt
import pandas as pd
import numpy as np
import glob as gl


def saveNoCoverRows(df, name):
    df.to_csv('noCoverrules_' + name)


if __name__ == '__main__':
    import click


    @click.command()
    @click.option('-i', '--file', 'file_in', help='Path for getting the data')
    @click.option('-o', '--out', 'file_out', help='Name of the file in which data will be stored')
    def main(file_in, file_out):

        dataPath = gl.glob(file_in)
        for i in range(0, len(dataPath)):
            print(dataPath[i])
            df = pd.read_csv(dataPath[i], index_col=0)
            name = dataPath[i].split('\\')
            name = name[0]
            print(df.keys())
            # Coverture analysis
            NoCoverRows = df.drop(df[df['Matched'] != 0].index)
            saveNoCoverRows(NoCoverRows, name)
            print(df['Matched'].value_counts())
            print(df['Matched'].describe())
            print('\n', df['Violated'].value_counts())
            print(df['Violated'].describe())

main()
