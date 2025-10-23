pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage("Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/michaelarmando1/Calculator'
            }
        }

        stage("Compile") {
            steps {
                sh "mvn clean compile"
            }
        }

        stage("Unit test") {
            steps {
                sh "mvn test"
            }
        }

        stage("Code coverage") {
            steps {
                sh "mvn clean test"
                sh "mvn jacoco:report"
                publishHTML(target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Report'
                ])
                sh "mvn jacoco:check"
            }
        }

    }
}
