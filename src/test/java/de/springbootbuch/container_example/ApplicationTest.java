package de.springbootbuch.container_example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.notNullValue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void checkXmlBeansExists() {

        Assert.assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.xml.Bar.class).size(), is(equalTo(1)));
        Assert.assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.xml.Foo.class).size(), is(equalTo(1)));
        Assert.assertThat(ctx.getBean(de.springbootbuch.container_example.xml.Foo.class).getBar(), is(notNullValue()));
    }

    @Test
    public void checkComponentBeansExists() {
        Assert.assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.comp.Bar.class).size(), is(equalTo(1)));
        Assert.assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.comp.Foo.class).size(), is(equalTo(1)));
        Assert.assertThat(ctx.getBean(de.springbootbuch.container_example.comp.Foo.class).getBar(), is(notNullValue()));
    }

    @Test
    public void checkJavaBeansExists() {
        Assert.assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.java.Bar.class).size(), is(equalTo(1)));
        Assert.assertThat(ctx.getBeansOfType(de.springbootbuch.container_example.java.Foo.class).size(), is(equalTo(1)));
        Assert.assertThat(ctx.getBean(de.springbootbuch.container_example.java.Foo.class).getBar(), is(notNullValue()));
    }
}