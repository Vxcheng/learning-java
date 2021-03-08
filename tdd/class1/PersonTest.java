package class1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    public Person person = new Person();

    //@Before 标记的方法,运行在@Test之前，初始化
    @Before
    public void init(){

        System.out.println("init @Before");
    }

    //@After标记的方法 运行在@Test方法之后，一般用于销毁
    @After
    public void destory(){
        System.out.println("destory @After");
    }

    //@Test  在测试方法上面加，类似于main独立运行
    @Test
    public void testEat(){
        person.eat("汉堡");
    }
}
