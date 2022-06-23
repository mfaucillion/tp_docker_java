pipeline {
    agent any
    tools {
        maven 'maven'
    }
    
    stages {
        stage('build') {
            steps {
                echo 'Building...'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'docker build -t hellonodejs .'
                sh 'docker tag hellonodejs mfisika/hellonodejs:latest'
                sh 'docker login -u mfisika -p Parsifal0.'
                sh 'docker push mfisika/hellonodejs:latest'
            }
        }
    }
}
