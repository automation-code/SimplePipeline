pipeline{
	agent any

	tools{
	    	maven "MAVEN_HOME"
	}

	stages{
	    stage('Code'){
	        steps{
	        	echo "Cloning the code"
	            	git "https://github.com/automation-code/SimplePipeline.git", "master"
			}
	stage('Build'){
	        steps{
	        	echo "Testing the code"
	            	bat "mvn -Dmaven.test.failure.ignore=true clean package"
	        }
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
