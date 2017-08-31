package com.hanvon.kg.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by MJF on 11:12 2017/8/31
 */

@Configuration
@EnableMongoRepositories(basePackages = "com.hanvon.kg")
public class MongoConfig extends AbstractMongoConfiguration {
/*
    @Autowired
    private Environment env;
*/

    @Override
    protected String getDatabaseName() {
        return "weather_feel";
    }

    /**
     * Created by MJF on 15:02 2017/8/31
     *
     * @Description: 三种情况:本地,端口号,认证
     * MongoDB服务器运行在其他机器上在创建MongoClient时指定,
     * 此时没有,MongoDB此时在本地运行,不需要指定
     * 端口如果不是默认的27017,在后面创建MongoClient实例时指定端口号,
     * 此时使用默认的27017,不写
     * 开启认证功能:我们需要提供应用的凭证:如下
     */
    @Override
    public Mongo mongo() throws Exception {
        /*
        //创建MongoDB凭证
        MongoCredential credential = MongoCredential.createMongoCRCredential(
                env.getProperty("mongo.username"),"weather_feel",
                env.getProperty("mongo.password").toCharArray());
                */
        //创建MongoClient
        return new MongoClient(
                /*new ServerAddress("localhost", 37017), Arrays.asList(credential)*/);

    }


}
