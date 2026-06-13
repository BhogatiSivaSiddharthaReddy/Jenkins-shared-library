def call() {

    echo "Scanning Docker Image..."

    sh '''
        trivy image sample-app:v1
    '''
}
