#!groovy
import groovy.json.*
import groovy.transform.Field
// Jenkinsfile (Scripted Pipeline)
@Field def image=''
@Field def namespace=''
@Field def service=''
@Field def branch_name=''
try {
	Pipeline{
		agent any

		stages{
			stage('Git Clone'){
				deleteDir()
				branch_name="test-yxn"
				Dir('learngit')
				{
					git credentialsId: '8e36221c-addd-49e7-b89f-c97183028275', url: 'https://github.com/yxn0305/learngit'
					
					
				}
			}
			stage('Build image'){
				echo "Building..."
			}
			stage('Test'){
				pwd()
				sh "/bin/bash test_pipe.sh"
				cat file1
			}	
		}
		
	}
}
catch(Exception e) {
	echo "an error"
}
finally {
	cleanWs()
}

// node {
//     stage('Build') {
//         echo 'Building....'
//     }
//     stage('Test') {
//         echo 'Building....'
//     }
//     stage('Deploy') {
//         echo 'Deploying....'
//     }
// }