pipeline{
	agent any

	tools{
	maven "MAVEN_HOME"
	}

	stages{
		stage('Build'){
			steps{
				echo "Building the code"
				set "mvn clean"
			}
		}
		stage('Test'){
			steps{
				echo "Testing the code"
				set "mvn test"
			}
		}
		stage('Compile'){
			steps{
				echo "Compile the code"
				set "mvn compile"
			}
		}
		stage('Release'){
			steps{
				echo "Release the code"
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
