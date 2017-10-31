#!groovy
import groovy.json.*
import groovy.transform.Field
// Jenkinsfile (Scripted Pipeline)
@Field def image=''
@Field def namespace=''
@Field def service=''
@Field def branch_name=''
try {
	node{
			stage('Git Clone'){
				echo "git clone"
				// deleteDir()
				// branch_name="test-yxn"
				// pwd()
				// Dir('learngit')
				// {
				// 	git credentialsId: '8e36221c-addd-49e7-b89f-c97183028275', url: 'https://github.com/yxn0305/learngit.git'
					
					
				// }
			}
			stage('Build image'){
				echo "Building..."
			}
			stage('Test'){
				echo pwd()
				sh "/bin/bash test_pipe.sh"
				cat file1
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