import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author puyijun
 * @ClassName LogTest
 * @date 2018-01-24
 * @time 18:00
 * @Description
 **/

public class LogTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void doSomeThing(){
        logger.info("现在是测试log4j与slf4j的使用：。。。。。");
    }
}
