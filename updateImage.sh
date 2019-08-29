  ./gradlew clean bootJar
  
  docker build -t gcr.io/sparkarabic-251004/auth-service:latest .
  docker push gcr.io/sparkarabic-251004/auth-service:latest
  k delete -f gce-deployment.yaml 
  k apply -f gce-deployment.yaml 
