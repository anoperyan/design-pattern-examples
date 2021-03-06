[toc]

# 设计模式

## 各个设计模式比较

### 简单工厂模式

#### 分类：

创建型

#### 简述：

在超类中提供了一个创建对象的接口，但是允许子类修改将要被创建的对象的类型

#### 经典应用

- Spring Ioc中的BeanFactory，它使用同一套流程来创建大量的额对象，使用工厂方法模式，使得任何一个对象可以被一个接口获取。
- ThreadExecutorPool中的ThreadFactory接口，提供了一个newThread方法来创建一个线程，ThreadPoolExecutor利用该对象来创建类型一样但是参数不同的Thread对象。

####

|设计模式|分类|简述|应用场景|经典使用|优点|缺点|说明|
|----|----|----|----|----|----|----|----|
|工厂方法模式|创建型|它提供了|在需要重复创建一批创建流程基本相似的对象（对象可以不是一个类型）时使用|ThreadPoolExecutor中的ThreadFactory（需要创建一批类型相同，但是参数不同的对象）<br>Spring Ioc中的BeanFactory（对象类型参数各不相同，但是创建流程是基本一致的）|不需要使用new直接创创建，便捷，减少重复|/|/|
|抽象工厂模式|创建型|需要创建一批类型一样，但是参数是多维参数组合的对象|比如前端中的画笔（Paint），我们可能需要（红色的，虚线的，圆形）||||
||||||||
||||||||
||||||||
||||||||
||||||||

## 常见问题

### Spring源码中用了哪些设计模式？

- 简单工厂模式：BeanFactory，FactoryBean
- 单例模式：Spring中的Bean默认为单例，BeanConverter
- 装饰器模式：BeanWrapper
- 策略模式：SimpleInstantiationStrategy
- 适配器模式：MVC模块中的HandlerAdapter
- 代理模式：AOP中的AOP Proxy，JDK动态代理，和cglib的代理
- 模板方法模式：RestTemplate，JdbcTemplate解决代码重复问题。
- 观察者欧式：ApplicationListener

### 什么是设计模式，设计模式有哪些类型，并谈谈你对他们的理解？

设计模式代表了最佳实践，他主要是经验丰富的工程师的总结，每个设计模式都可以解决一类类似的问题。

设计模式主要分为创建型，结构型，行为型，J2EE四类模式。

- 创建型模式提供了一种在创建对象时候隐藏具体创建逻辑的方法，而不是直接使用new来创建对象，这使得创创建对象更加灵活。
- 结构型模式使用类和对象组合，继承，实现接口等方法来实现某些新功能来解决某些问题。
- 行为型模式主要是关注对象之间的通信。

### 说说你实际应用过哪些设计模式？

- 工厂模式：其中简单工厂比如在ThreadPoolExecutor中的ThreadFactory就是一个简单工厂，用来创建线程。
- 策略模式：在对接多家银行接口时候，为了保证投保流程对下游程序的一致性，我们使用了策略模式来封装不同的保司的接口。
- 建造者模式：在对接保司接口时候，请求接口参数多，不同用户的请求，参数变化大，我们使用建造者模式来实现灵活添加参数。
- 观察者模式：在Android开发中，页面初始化时候为按钮，列表，等添加点击监听器，滑动监听等监听器处理他的交互。
- 适配器模式：在Android开发中，列表，Banner均需使用适配器将接口数据适配为列表接受的View数据。
- 状态模式：在订单系统中，我们将订单的额状态先抽象为一个有限状态机，定义好他的行为，状态，输入等，然后再按照模型编写代码。 比如像ETCD这种分布式KV数据库，底层使用了基于复制状态机的Raft一致性协议来实现了强一致性。

### 模板方法模式和策略模式有何异同？

## 参考文档

- [Design Pattern - 我的推荐](https://refactoring.guru/design-patterns/factory-method)
- [设计模式 - 廖雪峰](https://www.liaoxuefeng.com/wiki/1252599548343744/1264742167474528)
- [重学Java设计模式 - 小博哥](https://github.com/fuzhengwei/itstack-demo-design)