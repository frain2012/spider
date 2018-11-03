import com.frain.spider.mapper.TMpConfMapper;
import com.frain.spider.model.TMpConf;
import com.frain.spider.service.mp.MpService;
import com.frain.spider.service.spider.SpiderMovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class SimpleTest{

    @Autowired
    SpiderMovieService spiderMovieService;

//    @Autowired
//    TMpConfMapper tMpConfMapper;
//    @Autowired
//    MpService mpService;

    @Test
    public void testSer(){
//        List<String> list=spiderMovieService.firstMatchContent("http://www.dytt8.net/",null);

        spiderMovieService.ThirdMatchContent("http://www.dytt8.net/html/gndy/dyzz/20181102/57714.html",null);

    }

    @Test
    public void testMp(){
//        List<TMpConf> mpConfs = tMpConfMapper.selectByExample(null);
//        for (TMpConf conf:mpConfs) {
//            if (conf.getType().intValue()==1){
//                mpService.spider(conf);
//            }
//        }
    }
}
