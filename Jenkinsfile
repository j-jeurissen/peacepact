#!groovy

pipeline {
    agent any
    stages {
        stage ('Build') {
            agent { docker 'maven:3.3.9-jdk-8' }
            steps {
                checkout scm
                sh 'mvn clean install'
                sh 'docker-compose build'
            }
        }
        stage ('deploy'){
            steps {
                docker-compose up
            }
        }
    }
}
