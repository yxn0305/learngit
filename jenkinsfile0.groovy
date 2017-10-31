#!groovy

stage 'git clone'
node(){
	checkout scm
}


stage 'build'
node(){
	echo "build"
}

stage 'test'
node(){
	sh "bash test_pipe.sh"
}