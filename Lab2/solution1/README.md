# Deploying an Application to Kubernetes

# Start with a Fresh Minikube cluster

Remember your minikube commands. Here is how to delete the cluster and start a fresh one. Remember docker needs to be running before minikube will work.
```
minikube delete
minikube start
```

# Deploying the Application


The solution is is in the solution1 folder. Try filling out the deployment, namespaces and services.yml files in the manifests folder. You can use the solution1 folder as a reference. If you run into problems you can always just copy over the files from the solution1 folder.


1. Start with creating the namespaces first.  This will create the namespaces for the application. Namespaces need to be created first because the other resources will be created in the namespaces.
```
kubectl apply -f ./manifests/namespaces.yml
```

2. Now start filling out the deployment.yml file. Once complete run the command:
```
kubectl apply -f ./manifests/deployment.yml
```

3.  Once the deployment is created, create the service.

```
kubectl apply -f ./manifests/services.yml
```

4. Check out the resources you have created
```
kubectl get all -n dev
```

5. Want to test a connection to the application? You can use minikube service command to get the url to the application.  The --all flag will list all the services in the cluster.  The -n flag will list the services in the namespace.
```
minikube service --all -n dev
```

6. Want to make changes to any of the manifests and apply them all?
```
kubectl apply -f ./manifests/
```

The above command will apply ALL the manifests in the manifests folder.
