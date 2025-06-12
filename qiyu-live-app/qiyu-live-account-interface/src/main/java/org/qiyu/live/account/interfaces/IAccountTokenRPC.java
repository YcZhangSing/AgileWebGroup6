package org.qiyu.live.account.interfaces;

/**
 * @Author xueyu
 * @Date: Created in 10:13 2023/6/20
 * @Description
 */
public interface IAccountTokenRPC {

    /**
     * 登录token缓存key前缀
     */
    String LOGIN_TOKEN_KEY_PREFIX = "login_token_key:";

    /**
     * 创建一个登录token
     *
     * @param userId
     * @return
     */
    String createAndSaveLoginToken(Long userId);

    /**
     * 校验用户token
     *
     * @param tokenKey
     * @return
     */
    Long getUserIdByToken(String tokenKey);

}
