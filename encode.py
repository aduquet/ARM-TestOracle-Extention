import pandas as pd
import numpy as np
import glob as gl
import warnings

warnings.filterwarnings('ignore')


def saveFile(name, test_path, df, file_out):
    name1 = test_path.split('\\')
    name1 = name + name1[-1]
    df.to_csv(file_out + '\\' + name1)
    print('\n *** Encode Data is saved in *** \n', file_out + '\\' + name)


# encodeV1 does not include the method or action of the stack, the column calledMethod is dropped
def encode_v1(stack_data, dataPath, file_out, size_binary=False):
    """
    Encode the Stack dataframe features to make is readable after the rule mining
    """
    data_train = stack_data[
        ['size', 'isEmpty', 'peek', 'peek_obj_type', 'size_p', 'isEmpty_p', 'peek_p', 'peek_obj_type_p']]
    if size_binary:
        data_train['size'] = np.where(data_train['size'] > 0, 1, 0)
    data_train['peek_obj_type'] = np.where(data_train['peek'] == 'EmptyObject', 'EmptyObject',
                                           data_train['peek_obj_type'])
    data_train['peek_obj_type_p'] = np.where(data_train['peek_p'] == 'EmptyObject_p', 'EmptyObject',
                                             data_train['peek_obj_type_p'])
    data_train.drop(columns=['peek', 'peek_p'], inplace=True)

    data_train = data_train.dropna(subset=['peek_obj_type'])
    data_train = data_train.dropna(subset=['peek_obj_type_p'])
    data_train['size'] = data_train['size'].astype(float)
    data_train['isEmpty'] = data_train['isEmpty'].astype(str).str.lower()
    data_train['peek_obj_type'] = data_train['peek_obj_type'].astype(str).str.lower()
    transactions_df = data_train.copy()
    for column in data_train.columns:
        transactions_df[column] = str(column) + ' == ' + '"' + data_train[column].astype(str) + '"'

    saveFile(name='e1_', test_path=dataPath, df=transactions_df, file_out=file_out)


# encode_v2 includes the method or action of the stack, the column calledMethod is dropped
def encode_v2(stack_data, dataPath, file_out, size_binary=False):
    """
    Encode the Stack dataframe features to make is readable after the rule mining
    """
    data_train = stack_data[
        ['size', 'isEmpty', 'peek', 'peek_obj_type', 'calledMethod', 'size_p', 'isEmpty_p', 'peek_p', 'peek_obj_type_p',
         'calledMethod_p']]
    if size_binary:
        data_train['size'] = np.where(data_train['size'] > 0, 1, 0)
    data_train['peek_obj_type'] = np.where(data_train['peek'] == 'EmptyObject', 'EmptyObject',
                                           data_train['peek_obj_type'])
    data_train['peek_obj_type_p'] = np.where(data_train['peek_p'] == 'EmptyObject_p', 'EmptyObject',
                                             data_train['peek_obj_type_p'])
    data_train.drop(columns=['peek', 'peek_p'], inplace=True)

    data_train = data_train.dropna(subset=['peek_obj_type'])
    data_train = data_train.dropna(subset=['peek_obj_type_p'])
    data_train['size'] = data_train['size'].astype(float)
    data_train['isEmpty'] = data_train['isEmpty'].astype(str).str.lower()
    data_train['peek_obj_type'] = data_train['peek_obj_type'].astype(str).str.lower()
    transactions_df = data_train.copy()
    for column in data_train.columns:
        transactions_df[column] = str(column) + ' == ' + '"' + data_train[column].astype(str) + '"'
    saveFile(name='e2_', test_path=dataPath, df=transactions_df, file_out=file_out)


# encode_v3 exclude the size column
def encode_v3(stack_data, dataPath, file_out, size_binary=False):
    """
    Encode the Stack dataframe features to make is readable after the rule mining
    """
    data_trainv2 = stack_data.copy()
    data_train = stack_data[
        ['isEmpty', 'peek', 'peek_obj_type', 'calledMethod', 'isEmpty_p', 'peek_p', 'peek_obj_type_p',
         'calledMethod_p']]

    if size_binary:
        data_trainv2['size'] = np.where(data_trainv2['size'] > 0, 1, 0)
    data_train['peek_obj_type'] = np.where(data_train['peek'] == 'EmptyObject', 'EmptyObject',
                                           data_train['peek_obj_type'])
    data_train['peek_obj_type_p'] = np.where(data_train['peek_p'] == 'EmptyObject_p', 'EmptyObject',
                                             data_train['peek_obj_type_p'])
    data_train.drop(columns=['peek', 'peek_p'], inplace=True)

    data_train = data_train.dropna(subset=['peek_obj_type'])
    data_train = data_train.dropna(subset=['peek_obj_type_p'])

    data_train['isEmpty'] = data_train['isEmpty'].astype(str).str.lower()
    data_train['peek_obj_type'] = data_train['peek_obj_type'].astype(str).str.lower()
    transactions_df = data_train.copy()
    for column in data_train.columns:
        transactions_df[column] = str(column) + ' == ' + '"' + data_train[column].astype(str) + '"'
    saveFile(name='e3_', test_path=dataPath, df=transactions_df, file_out=file_out)


# encode_v4 exclude the peek_obj_Type column
def encode_v4(stack_data, dataPath, file_out, size_binary=False):
    """
    Encode the Stack dataframe features to make is readable after the rule mining
    """
    data_train = stack_data[
        ['size', 'isEmpty', 'calledMethod', 'size_p', 'isEmpty_p',
         'calledMethod_p']]
    if size_binary:
        data_train['size'] = np.where(data_train['size'] > 0, 1, 0)

    data_train['size'] = data_train['size'].astype(float)
    data_train['isEmpty'] = data_train['isEmpty'].astype(str).str.lower()
    transactions_df = data_train.copy()
    for column in data_train.columns:
        transactions_df[column] = str(column) + ' == ' + '"' + data_train[column].astype(str) + '"'
    saveFile(name='e4_', test_path=dataPath, df=transactions_df, file_out=file_out)


# encode_v4 exclude the peek_obj_Type and size columns
def encode_v5(stack_data, dataPath, file_out, size_binary=False):
    """
    Encode the Stack dataframe features to make is readable after the rule mining
    """
    data_trainv2 = stack_data.copy()
    data_train = stack_data[
        ['isEmpty', 'peek', 'calledMethod', 'isEmpty_p', 'calledMethod_p']]
    if size_binary:
        data_trainv2['size'] = np.where(data_trainv2['size'] > 0, 1, 0)

    data_train['isEmpty'] = data_train['isEmpty'].astype(str).str.lower()
    transactions_df = data_train.copy()
    for column in data_train.columns:
        transactions_df[column] = str(column) + ' == ' + '"' + data_train[column].astype(str) + '"'
    saveFile(name='e5_', test_path=dataPath, df=transactions_df, file_out=file_out)


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
            encode_v1(stack_data=df, dataPath=dataPath[i], file_out=file_out)
            encode_v2(stack_data=df, dataPath=dataPath[i], file_out=file_out)
            encode_v3(stack_data=df, dataPath=dataPath[i], file_out=file_out)
            encode_v4(stack_data=df, dataPath=dataPath[i], file_out=file_out)
            encode_v5(stack_data=df, dataPath=dataPath[i], file_out=file_out)

main()
