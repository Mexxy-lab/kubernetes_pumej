#!groovy

import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()
def hudsonRealm = new HudsonPrivateSecurityRealm(false)

// Create default admin user
hudsonRealm.createAccount(System.getenv('JENKINS_USER'), System.getenv('JENKINS_PASS'))
instance.setSecurityRealm(hudsonRealm)

// Define the authorization strategy
def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
strategy.setAllowAnonymousRead(false)  // Disable anonymous read access
instance.setAuthorizationStrategy(strategy)

instance.save()
