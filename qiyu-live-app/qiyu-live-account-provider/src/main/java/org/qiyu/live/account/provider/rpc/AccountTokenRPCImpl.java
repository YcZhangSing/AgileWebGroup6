package org.qiyu.live.account.provider.rpc;

import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;
import org.qiyu.live.account.interfaces.IAccountTokenRPC;
import org.qiyu.live.account.provider.service.IAccountTokenService;

/**
 * @Author xueyu
 * @Date: Created in 08:39 2023/6/21
 * @Description
 */
@DubboService
public class AccountTokenRPCImpl implements IAccountTokenRPC {

    @Resource
    private IAccountTokenService accountTokenService;

    /**
     * 登录token缓存key前缀
     */
    private static final String LOGIN_TOKEN_KEY_PREFIX = "login_token_key:";

    @Override
    public String createAndSaveLoginToken(Long userId) {
        return accountTokenService.createAndSaveLoginToken(userId);
    }

    @Override
    public Long getUserIdByToken(String tokenKey) {
        return accountTokenService.getUserIdByToken(tokenKey);
    }
}
