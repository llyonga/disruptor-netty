package cn.llyong.disruptor;

import cn.llyong.comm.entity.TranslatorData;
import com.lmax.disruptor.EventFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-09-05
 * @time: 2:56 下午
 * @version: 1.0
 */
public class TranslatorDataFactory implements EventFactory<TranslatorData> {

    @Override
    public TranslatorData newInstance() {
        return new TranslatorData();
    }
}
