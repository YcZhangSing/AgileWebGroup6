package org.qiyu.live.bank.api.controller;

import jakarta.annotation.Resource;
import org.qiyu.live.bank.api.service.IPayNotifyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理支付回调的逻辑
 * fixed 接口描述
 *   1. 该接口用于处理微信支付回调通知
 *   2. 该接口根据微信支付回调通知进行处理
 *   3. 该接口返回处理结果
 * @Author idea
 * @Date: Created in 21:49 2023/8/19
 * @Description
 */
@RestController
@RequestMapping("/payNotify")
public class PayNotifyController {

    @Resource
    private IPayNotifyService payNotifyService;

    @PostMapping("/wxNotify")
    public String wxNotify(@RequestParam("param") String param) {
        return payNotifyService.notifyHandler(param);
    }

}
