# Deploying an Application to Kubernetes

1. Clone the repo
```
git clone https://github.com/devopswithbrad/kubernetes-class.git
```

# Start with a Fresh Minikube cluster

Remember your minikube commands. Here is how to delete the cluster and start a fresh one. Remember docker needs to be running before minikube will work.
```
minikube delete
minikube start
```

# Resources

## Tools to install:

#### Must have these:
- minikube (simulates Kubernetes in a docker container)https://minikube.sigs.k8s.io/docs/start/
- kubectl (Used for sending commands to kubernetes clusters): https://kubernetes.io/docs/tasks/tools/

#### Optional extras (I will show these off but you don't need them):
- kubectx/kubens - for managing contexts to multiple clusters https://github.com/ahmetb/kubectx
- A powerful CLI tool for managing kubernetes https://k9scli.io/
- OpenLens - A GUI tool https://github.com/MuhammedKalkan/OpenLens

### Official Documentation
https://kubernetes.io/docs/home/


### Kubernetes Documentary
Want to watch a Kubernetes Documentary? Check out these videos:

- https://www.youtube.com/watch?v=BE77h7dmoQU
- https://www.youtube.com/watch?v=318elIq37PE


### Google SRE Book on SRE
Free book from Google. Talks about the need for a self-healing system.

https://sre.google/sre-book/production-environment/
