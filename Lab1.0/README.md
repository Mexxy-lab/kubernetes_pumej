# Basic Minikube/Kubernetes usage

### Start minikube 

Start using the docker driver (for virtualization)
```
minikube start --driver docker
```

if you don't want to specify --driver docker in the future, you can set it as the default in your configuration. 
```
minikube config set driver docker
```

## Check the Status 
Check the status of you Minikube Kubernetes cluster

```
minikube status
```

## Check out the dashboard
Open a new terminal and run the below command.
```
minikube dashboard
```

Follow the link and explore. Not much to see right now! But as we start deploying objects this is a good way to visualize what's in your cluster.

Press ctrl+c to escape out.

## Namespaces

Create/Get/Delete namespaces

```
kubectl get namespaces
kubectl create namespace test
kubectl create namespace dev
kubectl create namespace prod
kubectl create namespace customer1
kubectl get namespaces
kubectl delete namespace customer1
kubectl get namespaces
```

## Stop/Start the cluster

Stop and start the cluster. Notice that your namespaces will persist.
```
minikube stop
minikube status
minikube start
kubectl get namespaces
```

## Delete and Start a new cluster

Deleting the cluster will destroy your kubernetes environment, allowing you to start fresh. Notice after deleting and starting the cluster the namespaces are gone.

```
minikube delete
minikube start
kubectl get namespaces
```

## Create a Deployment

Hello world application:
```
kubectl create deployment hello-world --image=k8s.gcr.io/echoserver:1.4
```

Now explore the deployed resources
```
kubectl get all
kubectl get pods
kubectl get deployments
kubectl get replicaset
```

Want more information about any of the items? use the `kubectl describe` command. Use the resoruce name given in the previous commands.

```
kubectl describe <resource name>
```
examples `kubectl describe pods/hello-world-68bfd59bd9-8cjlg`

## See all resources on Kubernetes

By default.. we were only seeing whats on the default namespace. Want to see everything? Run the below command:

```
kubectl get all --all-namespaces
```

## Get information about the Kubernetes Cluster

Need information about the kubernetes cluster? the below command may help.
```
kubectl cluster-info
```