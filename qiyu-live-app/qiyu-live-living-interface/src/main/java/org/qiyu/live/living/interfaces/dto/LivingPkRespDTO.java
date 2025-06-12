package org.qiyu.live.living.interfaces.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author idea
 * @Date: Created in 20:01 2023/8/29
 * @Description
 */
public class LivingPkRespDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -4135802655494838696L;
    private boolean onlineStatus;
    private String msg;

    /**
     * 连上线结果
     * fixed 接口描述
     *   1. 该字段用于表示连上线结果
     *   2. 该字段为true表示连上线成功
     *   3. 该字段为false表示连上线失败
     */
    public boolean isOnlineStatus() {
        return onlineStatus;
    }

    /**
     * 连上线结果
     * fixed 接口描述
     *   1. 该字段用于表示连上线结果
     *   2. 该字段为true表示连上线成功
     *   3. 该字段为false表示连上线失败
     * @param onlineStatus
     */
    public void setOnlineStatus(boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    /**
     * 连上线结果描述
     * fixed 接口描述
     *   1. 该字段用于表示连上线结果描述
     *   2. 该字段为连上线成功时返回成功描述
     *   3. 该字段为连上线失败时返回失败描述
     * @return
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
