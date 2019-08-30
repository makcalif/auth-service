  ./gradlew clean bootJar
  
  docker build -t gcr.io/sparkarabic-251004/auth-service:latest .
  docker push gcr.io/sparkarabic-251004/auth-service:latest
  kubectl delete -f gce-deployment.yaml 
  kubectl apply -f gce-deployment.yaml 
