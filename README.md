# Read me

The original idea is from

https://medium.com/@iK8sJourneyMaverick/efficient-communication-in-spring-boot-applications-leveraging-feign-client-on-kubernetes-41f4c78b01c3

# Traveller

```
docker build . -t traveller:1.0.0 
```

# Itenary

```
docker build . -t itenary:1.0.0 
```

# Kubernetes

```
kubectl create serviceaccount my-service-account
serviceaccount/my-service-account created
```

then

```
kubectl create role traveller --verb=get --verb=list --verb=watch --resource=service,endpoints,pods,deployment,rs
role.rbac.authorization.k8s.io/traveller created

kubectl create rolebinding itenary --role=itenary --serviceaccount=ingress-nginx:my-service-account
rolebinding.rbac.authorization.k8s.io/itenary created
```