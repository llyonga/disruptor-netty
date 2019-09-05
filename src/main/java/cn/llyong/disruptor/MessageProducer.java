package cn.llyong.disruptor;

import cn.llyong.comm.entity.TranslatorData;
import cn.llyong.comm.entity.TranslatorDataWrapper;
import com.lmax.disruptor.RingBuffer;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-09-05
 * @time: 4:24 下午
 * @version: 1.0
 */
public class MessageProducer {

    private String producerId;
    private RingBuffer<TranslatorDataWrapper> ringBuffer;

    public MessageProducer(String producerId, RingBuffer<TranslatorDataWrapper> ringBuffer) {
        this.producerId = producerId;
        this.ringBuffer = ringBuffer;
    }

    public void onData(ChannelHandlerContext ctx, TranslatorData data) {
        long sequence = ringBuffer.next();
        TranslatorDataWrapper wrapper = ringBuffer.get(sequence);
        wrapper.setData(data);
        wrapper.setCtx(ctx);
        ringBuffer.publish(sequence);

    }
}
