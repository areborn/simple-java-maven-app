pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/Users/weibo/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn install'
            }
        }
    }
}