kubectl delete -f cluster-issuer.yaml
kubectl delete -f echo-server-tls-ingress.yaml
kubectl delete secret letsencrypt-prod
kubectl delete crd certificates.certmanager.k8s.io 
kubectl delete crd clusterissuers.certmanager.k8s.io
kubectl delete crd issuers.certmanager.k8s.io 
helm delete  cert-manager --purge
