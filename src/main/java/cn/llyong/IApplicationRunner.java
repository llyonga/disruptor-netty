package cn.llyong;

import cn.llyong.netty.NettyServer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-09-05
 * @time: 5:14 下午
 * @version: 1.0
 */
@Component
public class IApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        new NettyServer(8765);
    }
}
