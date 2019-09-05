package cn.llyong.comm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-09-05
 * @time: 2:51 下午
 * @version: 1.0
 */
@Data
public class TranslatorData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String msgId;
    private String msg;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"msgId\":\"")
                .append(msgId).append('\"');
        sb.append(",\"msg\":\"")
                .append(msg).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
