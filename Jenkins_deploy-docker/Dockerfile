# Start with the official Jenkins LTS image
FROM jenkins/jenkins:lts

# Set environment variables
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"  
ENV JENKINS_USER=admin  
ENV JENKINS_PASS=admin 

# Switch to root to install additional packages
USER root

# Install additional packages if needed
RUN apt-get update && apt-get install -y sudo vim && rm -rf /var/lib/apt/lists/*

# Switch back to the jenkins user
USER jenkins

# Install Jenkins plugins if needed
# To install plugins, uncomment and add them here:
RUN jenkins-plugin-cli --plugins "git workflow-aggregator docker-workflow"

# Create an admin user with default password
COPY --chown=jenkins:jenkins security.groovy /usr/share/jenkins/ref/init.groovy.d/security.groovy

# Expose Jenkins HTTP port and the default JNLP port
EXPOSE 8080
EXPOSE 50000

# Run Jenkins
CMD ["java", "-jar", "/usr/share/jenkins/jenkins.war"]

