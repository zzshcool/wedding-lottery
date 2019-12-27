import com.wedding.lottery.WeddingLotteryApplication;
import com.wedding.lottery.service.LotteryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WeddingLotteryApplication.class)
public class WeddingLotteryTest {

    @Autowired
    LotteryService lotteryService;


    @Test
    public void getLabelsTest() {
        log.info("getLabelsTest = {}  ", lotteryService.getLabels());
    }

    @Test
    public void getDataTest() {
        log.info("getDataTest = {}  ", lotteryService.getData());
    }
}
