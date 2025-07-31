def call(String env) {
    echo "Deploying to environment: ${env}"
    // Example logic
    if (env == 'prod') {
        echo "Running production deployment steps..."
    } else {
        echo "Running non-production deployment..."
    }
}
