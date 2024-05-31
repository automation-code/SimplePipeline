pipeline{
	agent any

	tools{
	    maven "MAVEN_HOME"
	}

	stages{
	    stage('Build'){
	        steps{
	            git 'https://github.com/automation-code/SimplePipeline.git'
	            bat "mvn -Dmaven.test.failure.ignore=true clean package"
	}

	post{
	    success{
	        junit '**/target/surefire-reports/TEST-*.xml'
	        archiveArtifacts 'target/*.jar'
	        }
	    }
	    }
	}
}
