import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir("temp");
        String port = System.getenv("PORT");

        if (port == null) {
            port="8080";
        }

        tomcat.setPort(Integer.parseInt(port));
        tomcat.getConnector();

        tomcat.addWebapp("/", new File("src/main/webapp").getAbsolutePath());

        tomcat.start();

        tomcat.getServer().await();
    }
}