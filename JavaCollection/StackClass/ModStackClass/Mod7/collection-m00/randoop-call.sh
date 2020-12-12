java -cp target/classes:target/test-classes:bin:/home/anastasiia/randoop-4.2.1/randoop-all-4.2.1.jar randoop.main.Main gentests --testclass="$1"."$2"TestDriver --junit-output-dir=src/test/java/ --regression-test-basename=Regression_"$2"Test_"$3"_"$4"_ --error-test-basename=Error_"$2"Test_"$3"_"$4"_ --junit-package-name="$1".test --randomseed="$3" --output-limit="$4"
export package=$1
export path2Delete="${package//.//}"
rm -f "$path2Delete/test/*.class"
rm -f *seed0_limit0.csv
