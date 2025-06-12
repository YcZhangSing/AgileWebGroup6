package org.qiyu.live.user.interfaces;


import org.qiyu.live.user.constants.UserTagsEnum;

/**
 * @Author idea
 * @Date: Created in 15:42 2023/4/16
 * @Description 用户标签RPC服务
 */
public interface IUserTagRpc {

   /**
    * 设置标签
    * fixed 接口描述
    *   1. 该接口用于设置用户标签
    *   2. 该接口根据用户id和标签枚举进行设置
    *   3. 该接口返回设置是否成功
    * @param userId
    * @param userTagsEnum
    * @return
    */
   boolean setTag(Long userId, UserTagsEnum userTagsEnum);

   /**
    * 取消标签
    *
    * @param userId
    * @param userTagsEnum
    * @return
    */
   boolean cancelTag(Long userId,UserTagsEnum userTagsEnum);

   /**
    * 是否包含某个标签
    *
    * @param userId
    * @param userTagsEnum
    * @return
    */
   boolean containTag(Long userId,UserTagsEnum userTagsEnum);

   // 修改usertag rpc接口
   
}
