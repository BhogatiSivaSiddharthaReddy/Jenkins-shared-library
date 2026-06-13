def call(Map config) {

    echo "Building Docker image ${config.imageName}:${config.imageTag}"

    sh """
        docker build \
        -t ${config.imageName}:${config.imageTag} .
    """
}
