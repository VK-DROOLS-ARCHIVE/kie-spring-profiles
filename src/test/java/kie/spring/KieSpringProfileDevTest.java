package kie.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration("/spring/kmodule-spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "development")
public class KieSpringProfileDevTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testContextNotNull(){
        assertNotNull(applicationContext);
    }

    @Test
    public void testSession1NotNull(){
        assertNotNull(applicationContext.getBean("ksession1"));
    }

    @Test
    public void testPerson2NotNull(){
        assertNotNull(applicationContext.getBean("person2"));
    }
}
