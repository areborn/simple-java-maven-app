pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /Users/weibo/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean package' 
            }
        }
    }
}