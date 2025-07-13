name: Deploy Spring Boot Application

on:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - name: Checkout code
      uses: actions/checkout@v2

    - name: Set up JDK 17
      uses: actions/setup-java@v2
      with:
        distribution: 'temurin'
        java-version: '17'

    - name: Build with Maven
      run: mvn clean package

    - name: Deploy to Server
      env:
        ARTIFACT_NAME: your-artifact-name.jar
        SERVER_USER: ${{ secrets.abc }}
        SERVER_HOST: ${{ secrets.pqr }}
        DEPLOY_PATH: /path/to/deployment/
      run: |
        scp target/$ARTIFACT_NAME $SERVER_USER@$SERVER_HOST:$DEPLOY_PATH
        ssh $SERVER_USER@$SERVER_HOST 'bash -s' < deploy-script.sh
