# MicroSpringServer  :rocket:

## Getting Started
Solution to MicroSprinBoot Server implementation Arep:
[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://cryptic-cliffs-94626.herokuapp.com/)[![CircleCI](https://circleci.com/gh/AlejandroBohal/MicroSpring-Arep.svg?style=svg)](https://circleci.com/gh/AlejandroBohal/MicroSpring-Arep) 

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

Open the deploy to heroku and Use the request mapping using the endpoint
/Apps/hello

### Prerequisites

- Java SE Development Kit 8
- Java SE Runtime Environment 8
- In order to use the program you will need Maven on your system to be able to build it.
- To run a local heroku app you will need to intall last version of Heroku CLI.
- Git to be able to clone this repository. 


### Installing

we will first clone the repository with the following command

```
git clone https://github.com/AlejandroBohal/MicroSpring-Arep
cd /MicroSpring-Arep
```

After this we will build the project with the next command or phase:
```
mvn clean install
```
Once the project is built, we can execute it with Maven in the following way:
```
 java -cp target/classes:target/dependency/* edu.eci.arep.microspring.MicroSpringBoot
```
To open a local Heroku Server you can execute the following command.
```
 heroku local web
```
you can access the local server at http://localhost:36000


## Running the tests

Test cases are automated with JUnit and can be executed with the following command:
```
mvn test
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* CircleCI for CI
    [![CircleCI](https://circleci.com/gh/AlejandroBohal/AREP-CalculadoraEstadistica.svg?style=svg)](https://circleci.com/gh/AlejandroBohal/AREP-CalculadoraEstadistica)
* Build to Heroku
    [![Deploy](https://www.herokucdn.com/deploy/button.svg)](http://fathomless-bayou-96611.herokuapp.com/)
* [Spark](http://sparkjava.com/) - MicroSpring



## Author

* **Sergio Alejandro Bohorquez Alzate** 
Student at the Colombian School of Engineering

## License

This project is licensed under the GNU v3.0 - see the [LICENSE.md](LICENSE.md) file for details
