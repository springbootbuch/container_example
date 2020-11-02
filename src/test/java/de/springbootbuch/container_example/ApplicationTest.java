package de.springbootbuch.container_example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void checkXmlBeansExists() {

        assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.xml.Bar.class)).hasSize(1);
        assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.xml.Foo.class)).hasSize(1);
        assertThat(ctx.getBean(de.springbootbuch.container_example.xml.Foo.class).getBar()).isNotNull();
    }

    @Test
    public void checkComponentBeansExists() {
        assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.comp.Bar.class)).hasSize(1);
        assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.comp.Foo.class)).hasSize(1);
        assertThat(ctx.getBean(de.springbootbuch.container_example.comp.Foo.class).getBar()).isNotNull();
    }

    @Test
    public void checkJavaBeansExists() {
        assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.java.Bar.class)).hasSize(1);
        assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.java.Foo.class)).hasSize(1);
        assertThat(ctx.getBean(de.springbootbuch.container_example.java.Foo.class).getBar()).isNotNull();
    }
}
