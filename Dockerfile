FROM jboss/wildfly
ADD resttest-ear/target/resttest-ear-1.0-SNAPSHOT.ear /opt/jboss/wildfly/standalone/deployments

# Application Port
EXPOSE 8080
# Management Port
EXPOSE 9990
# Debug Port
EXPOSE 8787