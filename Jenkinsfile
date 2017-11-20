pipeline {
    agent none
    stages {
        stage('Back-end') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Front-end') {
            agent {
                dockerfile true
            }
            steps {
                sh 'java -version'
            }
        }
    }
}
