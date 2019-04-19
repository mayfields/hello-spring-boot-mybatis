package com.mdsword.hello.spring.boot.mybatis.dao;

import com.mdsword.hello.spring.boot.mybatis.entity.StWxBill;
import java.util.List;

public interface StWxBillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ST_WX_BILL
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ST_WX_BILL
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int insert(StWxBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ST_WX_BILL
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    StWxBill selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ST_WX_BILL
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    List<StWxBill> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ST_WX_BILL
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int updateByPrimaryKey(StWxBill record);
}