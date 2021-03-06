package com.zhg.yunl.modules.test.service;


import com.zhg.yunl.base.page.Page;
import com.zhg.yunl.base.service.BaseService;
import com.zhg.yunl.modules.test.dao.TestDao;
import com.zhg.yunl.modules.test.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService  extends BaseService<TestDao, TestEntity> {


    @Autowired
    TestDao testDao;

    public Page<TestEntity> queryTest(TestEntity testEntity, Page<TestEntity> page) {

        //设置分页参数，才会被mybatis分页插件识别，拦截SQL，然后在其SQL的前后加入分页SQL语句。
        testEntity.setPage(page);
        // 根据分页与查询条件进行测试数据的查询
        List<TestEntity> testList =  testDao.findList(testEntity);
        // 将查询数据设置到分页类的LIST集合当中，一起返回
        page.setList(testList);

        return page;

    }
}




















