package com.luopeng.ui;

//import com.luopeng.factory.BeanFactory;
import com.luopeng.service.IAccountService;
import com.luopeng.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class client {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // 1、获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2、根据id获取Bean对象
//        IAccountService as = (IAccountService)ac.getBean("accountService");
//        as.saveAccount();

//        IAccountService as = (IAccountService)ac.getBean("accountService2");
//        as.saveAccount();

        IAccountService as = (IAccountService)ac.getBean("accountService3");
        as.saveAccount();
    }
}
