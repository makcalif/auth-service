
kubectl delete crd certificates.certmanager.k8s.io 
kubectl delete crd clusterissuers.certmanager.k8s.io
kubectl delete crd issuers.certmanager.k8s.io 

#helm search -l stable/cert-manager  (found out 0.2.1 is laterst)
helm install --name cert-manager \
    --namespace default \
    --set ingressShim.defaultIssuerName=letsencrypt-prod \
    --set ingressShim.defaultIssuerKind=ClusterIssuer \
    stable/cert-manager \
    --version 0.2.1

