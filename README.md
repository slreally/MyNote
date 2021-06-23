# MyNote

上班不摸鱼，态度有问题

Spring Boot 整合 JDBC， Mybatis， JPA 等

demo27 Sping Boot 整合 JDBC

demo28 Spring Boot 整合 Mybatis

demo29 Spring Boot 整合 JPA

SpringStudy 
	 IoC 控制反转
	  创建对象的控制权由程序自己创建改为IoC容器创建，降低耦合度
	 DI 依赖注入
	   作用域：单例模式 原型模式
           spring默认的是单例模式，每次从容器中 get 的时候都会获得相同的对象，适用单线程；
           普通的 new 一个对象是原型模式，每次从容器中 get 的时候会获取一个新的对象，适用多线程
	 实现 aop 的3种方式
	  1.通过原生接口
	  2.通过自定义接口(推荐方式)
 	  3.注解
