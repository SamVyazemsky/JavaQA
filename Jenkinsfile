pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile'
    }

  }
  stages {
    stage('build') {
      parallel {
        stage('build') {
          steps {
            git(url: 'https://github.com/SamVyazemsky/JavaQA.git', branch: 'main')
          }
        }

        stage('sendAlert') {
          steps {
            echo 'It\'s alert'
            sh 'lscpu'
          }
        }

      }
    }

    stage('Test') {
      steps {
        sh 'mvn -version'
      }
    }

  }
}