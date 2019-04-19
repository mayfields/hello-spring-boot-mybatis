package com.mdsword.hello.spring.boot.mybatis;

import com.mdsword.hello.spring.boot.mybatis.dao.TUserMapper;
import com.mdsword.hello.spring.boot.mybatis.entity.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootMybatisApplication.class)
@Transactional
@Rollback
public class MybatisTest {

    Logger logger = LoggerFactory.getLogger(MybatisTest.class);

    /**
     * 注入数据查询接口
     */
    @Autowired
    private TUserMapper tUserMapper;

    /**
     * 测试查询集合
     */
    @Test
    public void testSelect() {
        List<TUser> tbUsers = tUserMapper.selectAll();
        for (TUser tbUser : tbUsers) {
            logger.info(tbUser.getUserName());
            logger.debug(tbUser.getUserName());
        }
    }
}
