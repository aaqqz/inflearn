package hello.core.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {

    @Test
    public void lifeCycleTest() {
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(lifeCycleConfig.class);
        NetwortClient client = ac.getBean(NetwortClient.class);
        ac.close();

    }

    @Configuration
    static class lifeCycleConfig {

        @Bean
        public NetwortClient networtClient() {
            NetwortClient networtClient = new NetwortClient();
            networtClient.setUrl("http://hello-spring.dev");
            return networtClient;
        }
    }
}
