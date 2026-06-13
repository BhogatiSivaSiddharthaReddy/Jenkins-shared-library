def call(Map config) {

    echo "Scanning Docker image"

    sh """
        trivy image \
        --severity HIGH,CRITICAL \
        ${config.imageName}:${config.imageTag}
    """
}
