package com.mdsword.hello.spring.boot.mybatis.dao;

import com.mdsword.hello.spring.boot.mybatis.entity.TUserRole;
import java.util.List;

public interface TUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int insert(TUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    TUserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    List<TUserRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_role
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int updateByPrimaryKey(TUserRole record);
}