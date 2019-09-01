#!/bin/sh
#echo-service         NodePort    10.8.11.212   <none>        80:31698/TCP     3m15s
kubectl run curltest --image=radial/busyboxplus:curl -i --tty --rm
