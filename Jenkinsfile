pipeline {
  agent {label 'generic-debian-jdk17'}
  tools { 
      maven 'maven-jdk8' 
      jdk 'JDK 1.8.0_91' 
  }
  options { 
    buildDiscarder(logRotator(daysToKeepStr: '10', numToKeepStr: '5')) 
  }
  
  stages {
     stage("Prepare") {
       steps {
         println "------->"+scm.branches
         println "------->"+scm.userRemoteConfigs
         checkout([$class: 'GitSCM', 
                   branches: scm.branches, 
                   doGenerateSubmoduleConfigurations: false, 
                   extensions: [[$class: 'SubmoduleOption', 
                                 disableSubmodules: false, 
                                 parentCredentials: true, 
                                 recursiveSubmodules: true, 
                                 reference: '', 
                                 trackingSubmodules: false]], 
                   submoduleCfg: [], 
                   userRemoteConfigs: scm.userRemoteConfigs
                  ])
      	 checkout scm   
      }
    }
    stage ('Initialize') {
      steps {
        script {
          sh '''
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
             ''' 
          sh 'java -version'
        }        
      }
    }
    stage('Build') {
      steps {
        script {
          println "Build"       
          sh 'mvn -f pom.xml -s /opt/maven/conf/settings.xml clean package -DskipTests'
        }
      } 
    }
 
  }
}
