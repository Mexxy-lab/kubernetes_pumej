
## Start with a clean minikube

```
minikube delete
minikube start
```


## Install our application using Helm

Let's do a fresh install of our applicaiton from lab 4.  Notice the `--create-namespace` flag? this creates a namespace for us if it doesnt exist..

```
helm install myhelmapp-prod-lab5 myhelmapp/. --values myhelmapp/values.yaml --values myhelmapp/values-prod.yaml --namespace prod --create-namespace
```


## Inspect our installed application

Remember, we installed it into the `prod` namespace.

```
helm ls -n prod
kubectl get all -n prod
```

## Recreating a Pod

Want to restart a pod? Delete it!

```
kubectl get pods -n prod
kubectl delete pod <podname>
kubectl get pods -n prod
```

Notice a new one took its place? That's because our pods are dynamically created by a deployment.


## Working with our deployment - Scaling/Rollouts

### Scaling
Let's do some quick scaling
```
kubectl get pods -n prod
kubectl get deployment -n prod
kubectl scale deployment mydeployment -n prod --replicas 10
kubectl get pods -n prod
```

### Rollouts
Let's get some history/information
```
kubectl get pods -n prod
kubectl get deployment -n prod
kubectl rollout status deployment mydeployment -n prod
kubectl rollout history deployment mydeployment -n prod
```

Let's do a rollout
```
kubectl rollout restart deployment mydeployment -n prod
kubectl rollout history deployment mydeployment -n prod
kubectl get pods -n prod
```


