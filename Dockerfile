FROM jboss/wildfly:latest
USER jboss
RUN /opt/jboss/wildfly/bin/add-user.sh admin Jboss@admin01 --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "--debug"]

#ADD resttest-ear/target/resttest-ear-1.0-SNAPSHOT.ear /opt/jboss/wildfly/standalone/deployments

# Application Port
EXPOSE 8080
# Management Port
EXPOSE 9990
# Debug Port
EXPOSE 8787