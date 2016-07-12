package learn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        /*
        // Can override this by setting VM Option -DSERVER_PORT=8088 as well
        Properties props = System.getProperties();
        props.setProperty("SERVER_PORT","8088");
        */
        SpringApplication.run(App.class,args);
    }
}
