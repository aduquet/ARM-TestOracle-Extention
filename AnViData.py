import warnings

warnings.filterwarnings('ignore')

import matplotlib.pyplot as plt
import pandas as pd
import numpy as np
import glob as gl

plt.rcParams.update({'font.size': 10})

archivo = open("archivo.txt", "w")

# df = pd.read_csv('Aleja_data/nStackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/Training/nStackTestDriver_seed30_limit8000.csv')
# df = pd.read_csv('DataStack/Testing/Mod1_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/Testing/Mod2_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/Testing/Mod3_TestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/Testing/Mod4_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/Testing/Mod5_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/Testing/Mod6_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/Testing/Mod7_StackTestDriver_seed0_limit8000.csv')


# df = pd.read_csv('DataStack/BugsCounter/Mod1_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/BugsCounter/Mod2_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/BugsCounter/Mod3_TestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/BugsCounter/Mod4_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/BugsCounter/Mod5_StackTestDriver_seed0_limit8000.csv')
# df = pd.read_csv('DataStack/BugsCounter/Mod6_StackTestDriver_seed0_limit8000.csv')
df = pd.read_csv('DataStack/BugsCounter/Mod7_StackTestDriver_seed0_limit8000.csv')

print(df.keys())
print(df.shape, df.size)
# print(df.dtypes)
# print(df.describe())
# uniqueTestId = pd.unique(df['testId'])
# a = 200
# archivo.write(str(pd.unique(df['peek'])))
# archivo.write('\n' + str(pd.unique(df['size'])))
# archivo.close()
# print(pd.unique(df['instanceId']))
# testId = df.drop_duplicates(['testId'])
# print(testId['testId'].count())
df['bug'].fillna('No',  inplace=True)
test = df['bug'].value_counts()
# test.hist()
instanceId = df['instanceId'].value_counts()
# instanceId.hist()
size = df['size'].value_counts()
# df['size'].hist(bins=25)
# isEmpty = df['isEmpty'].value_counts()
# print(df['isEmpty'].describe())
# df['isEmpty'].hist(bins=25)
# peek = df['peek'].value_counts()
# print(df['peek'].describe())
# peek.hist()
# peek_obj_type = df['peek_obj_type'].value_counts()
# peek_obj_type.hist()
# print(df['peek_obj_type'].describe())
calledMethod = df['calledMethod'].value_counts()
# print(df['instanceId'].describe())
# calledMethod.hist()
print('\n TEST ID')
print(test.describe())
print(test)

print('\n INSTANCE ID')
print(instanceId.describe())
print('\n SIZE')
print(size.describe())
print(size)
# print(isEmpty.describe())
# print(peek.describe())
# print(peek_obj_type.describe())
print('\n CALLED METHOD')
print(calledMethod.describe())
print(calledMethod)
print(df['calledMethod'].describe())

# instance_count = df['instanceId'].count()
# print(df['testId'].count(), test_count, instance_count)
# print(df['size'].describe())
# df_testId = df.groupby('instanceId')
# print('****',df_testId['instanceId'].count())
# a=df_testId['instanceId'].count()
#
# print(a.value_counts())
# instances_count = df_testId['instanceId'].count()
# print(df_testId)]
# print(df_testId.describe())
# print(instances_count)
# print(instances_count.describe())

# calledMethod.plot(kind ='bar')
# df_testId['testId'].count().hist(bins=25)
plt.show()
