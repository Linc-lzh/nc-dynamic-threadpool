package nc.dtp;

import nc.dtp.core.annotations.EnableDynamicThreadPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDynamicThreadPool
@SpringBootApplication
public class DtpApplication
{
    public static void main(String[] args)   {
        SpringApplication.run(DtpApplication.class, args);
    }
}
