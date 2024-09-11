# software-class

Program calculates cost for a HybridVehicle that runs on both gas and power. It implements an interface for each mode and runs the cost for gas, power, and hybrid trips.

git clone https://automatic-spork-5g4wvj4wv7qg24pvw.github.dev/

download the dependencies by typing the following in termninal
wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

Run: "javac -cp junit-4.13.2.jar src/c/*.java src/u/*.java" then "java -cp ./src c.CarRunner"
Run: "java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.CarRunnerTests"