package de.springbootbuch.container_example;

import de.springbootbuch.container_example.java.Bar;
import de.springbootbuch.container_example.java.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean(name = "javaBar")
    public Bar bar() {
        return new Bar();
    }
    
    @Bean(name = "javaFoo")
    public Foo foo(final Bar bar) {
        return new Foo(bar);
    }
}