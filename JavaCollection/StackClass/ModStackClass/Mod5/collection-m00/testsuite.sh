export package=$1
export testclasspath="${package//.//}"

JUNIT_HOME=/usr/share/java

CLASSPATH=.:$JUNIT_HOME/junit4.jar:$JUNIT_HOME/hamcrest-core.jar


javac -d ./target/test-classes -cp .:$JUNIT_HOME/junit4.jar:./target/classes/:./target/test-classes/ ./src/test/java/$testclasspath/test/*_$2Test_$3_$4_*.java  

 
java -Dseed=$3 -Dlimit=$4 -cp .:$CLASSPATH:./target/classes/:./target/test-classes/ org.junit.runner.JUnitCore $1.test.Regression_$2Test_$3_$4_
