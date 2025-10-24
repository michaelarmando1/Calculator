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
                sh "mvn clean verify"
                publishHTML(target: [
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Report'
                ])
            }
        }

        stage("Static code analysis") {
            steps {
                sh "mvn checkstyle:check"
            }
        }

        stage("Publish Checkstyle Report") {
            steps {
                publishHTML(target: [
                    reportDir: 'target/site',
                    reportFiles: 'checkstyle.html',
                    reportName: "Checkstyle Report"
                ])
            }
        }

    }
}
