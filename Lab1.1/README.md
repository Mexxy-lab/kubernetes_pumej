# Kubernetes-Lab1.1-Node-Cordon
## Create a Deployment

We need a basic deployment so we have something to work with.

```
kubectl create deployment hello-world --image=k8s.gcr.io/echoserver:1.4
```

# Get/Describe Nodes

Get information on Nodes in a cluster

```
kubectl get nodes
kubectl describe node minikube
```

## Tainting a node

Tainting a node in Kubernetes means marking the node as unsuitable for certain types of workloads, so that no new pods will be scheduled on that node unless they have a matching toleration. Tainting a node is typically used to ensure that critical workloads have exclusive access to certain nodes, or to prevent pods from running on nodes that are running incompatible or conflicting workloads.

```
kubectl taint node minikube key=value:NoSchedule
kubectl describe node minikube
kubectl taint node minikube key-
```

## Cordon a Node

Cordon a node so no new pods can be scheduled on it. This is done so you can do maintenance on the server.
The main difference between cordon and taint in Kubernetes is that cordon marks a node as unschedulable for all pods, while taint marks a node as unsuitable for certain types of workloads.

```
kubectl cordon minikube
kubectl get nodes
```

## Drain Pods off of nodes

Cordon will stop NEW pods from being scheduled, but it wont evict (remove) pods from a worker nodes. For that, you must DRAIN the node.
We specify `--ignore-daemonsets --force` as this is a single node cluster (Minikube)

```
kubectl drain minikube --ignore-daemonsets --force
```
## Check that pods have been removed

```
kubectl get pods
```

##  Uncordon the node

Uncordon the node so the pods can be scheduled again

```
kubectl uncordon minikube
kubectl get Nodes
kubectl get pods
```






