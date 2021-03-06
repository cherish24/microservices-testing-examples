package welcomememberemailservice.bootstrap;

import org.hibernate.validator.constraints.NotBlank;

import javax.mail.Session;
import java.util.Properties;

public class EmailSenderConfiguration {

    @NotBlank
    private String host;

    @NotBlank
    private String port;

    public Session getSession() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", port);
        return Session.getDefaultInstance(properties);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
