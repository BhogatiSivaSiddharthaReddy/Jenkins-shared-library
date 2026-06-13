def call() {

    echo "Building Docker Image..."

    sh '''
        docker build -t sample-app:v1 .
    '''
}
