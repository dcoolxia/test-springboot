package name.nvshen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class) //指定spring-boot的启动类
//@SpringApplicationConfiguration(classes = Application.class)//1.4.0之前版本使用
public class TestSpringBoot {

    @Test
    public void test() {
        System.out.println("run===============================================================");
    }
}