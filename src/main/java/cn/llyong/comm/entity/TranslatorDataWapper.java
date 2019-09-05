package cn.llyong.comm.entity;

import io.netty.channel.ChannelHandlerContext;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-09-05
 * @time: 3:03 下午
 * @version: 1.0
 */
@Data
public class TranslatorDataWapper {

    private TranslatorData data;
    private ChannelHandlerContext ctx;
}
