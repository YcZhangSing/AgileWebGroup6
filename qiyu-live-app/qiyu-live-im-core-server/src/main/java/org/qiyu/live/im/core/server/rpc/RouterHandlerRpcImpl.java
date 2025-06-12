package org.qiyu.live.im.core.server.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.qiyu.live.im.core.server.interfaces.rpc.IRouterHandlerRpc;
import org.qiyu.live.im.core.server.service.IRouterHandlerService;
import org.qiyu.live.im.dto.ImMsgBody;

import java.util.List;

/**
 * @Author xueyu
 * @Date: Created in 10:20 2023/7/12
 * @Description
 */
@DubboService
public class RouterHandlerRpcImpl implements IRouterHandlerRpc {

    @Resource
    private IRouterHandlerService routerHandlerService;

    @Override
    /**
     * 发送消息
     * fixed 接口描述
     *   1. 该接口用于发送消息
     *   2. 该接口根据消息体进行路由处理
     *   3. 该接口返回处理结果
     * @param imMsgBody
     */
    public void sendMsg(ImMsgBody imMsgBody) {
        routerHandlerService.onReceive(imMsgBody);
    }

    @Override
    // 
    public void batchSendMsg(List<ImMsgBody> imMsgBodyList) {
        imMsgBodyList.forEach(imMsgBody -> {
            routerHandlerService.onReceive(imMsgBody);
        });
    }
}
