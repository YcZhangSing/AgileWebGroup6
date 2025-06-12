package org.qiyu.live.user.interfaces;

import org.qiyu.live.user.dto.UserLoginDTO;
import org.qiyu.live.user.dto.UserPhoneDTO;

import java.util.List;

/**
 * 用户手机相关RPC
 *
 * @Author idea
 * @Date: Created in 17:17 2023/6/13
 * @Description
 */
public interface IUserPhoneRPC {

    /**
     * 用户登录（底层会进行手机号的注册）
     * fixed 接口描述
     *   1. 该接口用于用户登录
     *   2. 该接口根据手机号进行登录
     *   3. 该接口返回用户登录信息
     * @param phone
     * @return
     */
    UserLoginDTO login(String phone);

    /**
     * 根据手机信息查询相关用户信息
     * fixed 接口描述
     *   1. 该接口根据手机号查询用户信息
     *   2. 该接口返回用户信息
     * @param phone
     * @return
     */
    UserPhoneDTO queryByPhone(String phone);

    /**
     * 根据用户id查询手机相关信息
     * fixed 接口描述
     *   1. 该接口根据用户id查询用户手机号
     *   2. 该接口返回用户手机号
     * @param userId
     * @return
     */
    List<UserPhoneDTO> queryByUserId(Long userId);
}
