package com.mdsword.hello.spring.boot.mybatis.dao;

import com.mdsword.hello.spring.boot.mybatis.entity.Table3;
import java.util.List;

public interface Table3Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE3
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE3
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int insert(Table3 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE3
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    Table3 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE3
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    List<Table3> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE3
     *
     * @mbg.generated Tue Feb 19 10:46:17 CST 2019
     */
    int updateByPrimaryKey(Table3 record);
}