##软件设计七大原则

##### 1、开闭原则
+ **定义：一个软件实体如类，模块和函数应该对扩展开放，对修改关闭**
+ 用抽象构建框架，用实现扩展细节
+ 优点：提高软件系统的可重复用性及可维护性

##### 2、依赖倒置原则
+ **定义：高层模块不应该依赖底层模块，二者都应该依赖其抽象**
+ 抽象不应该依赖细节；细节应该依赖抽象
+ 针对接口编程，不要针对实现编程
+ 优点：可以减少类间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险

##### 3、单一直责原则
+ **定义：不要存在多于一个导致类变更的原因**
+ 一个类、接口、方法只负责一想职责
+ 优点：降低类的复杂度、提高类的可读性、提高系统的可维护性、降低变更引起的风险
+ tips:实际开发中接口和方法要保证单一职责，类要综合项目实际情况看是否严格保持单一职责

##### 4、接口隔离原则
+ **定义：用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口**
+ 一个类对一个类的依赖应该建立在最小的接口上
+ 建立单一接口，不要建立臃肿庞大的接口
+ 尽量细化接口， 接口中的方法尽量少
+ **注意适度原则，接口的细化一定要适度，不要造成接口数量过多**
+ 优点：符合我们常说的高内聚低耦合的设计思想，从而使得类具有良好的可读性、可扩展性和可维护性。

##### 5、迪米特原则（最少知道原则）
+ **定义：一个对象应该对其他对象保持最少的了解。**
+ 尽量降低类与类之间的耦合
+ 优点：降低类之间的额耦合
+ 强调只和朋友说话，不和陌生人说话
+ 朋友：出现在成员变量、方法输入、输出参数中的类称为成员朋友、而出现在方法体内部的类不属于朋友类。
