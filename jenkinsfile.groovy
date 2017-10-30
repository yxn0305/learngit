#!groovy
import groovy.json.*
import groovy.transform.Field
// Jenkinsfile (Declarative Pipeline)
pipline{
	agent any
	stages{
		stage('Build'){
			steps{
				echo "Building..."
			}
			
		}
		stage('Test'){
			steps{
				echo "Testing..."
			}
		}
		stage('Deploy'){
			steps{
				echo "Deploying..."
			}
		}
	}
}  