# Read me

The original idea is from

https://medium.com/@iK8sJourneyMaverick/efficient-communication-in-spring-boot-applications-leveraging-feign-client-on-kubernetes-41f4c78b01c3
and
https://peterconrey.medium.com/spring-boot-microservice-communication-on-kubernetes-with-feign-clients-69e2cb267c35

# Traveller

```
docker build . -t traveller:1.0.0 
```

# Itenary

```
docker build . -t itenary:1.0.0 
```

# Kubernetes

then

```
kubectl apply -f project.yaml
```