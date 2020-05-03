# hiroshi-java-design-pattern

### 1. Iterator
* 难以理解抽象类和接口: "不要只使用concrete class来编程, 要优先使用抽象类和接口来编程"

## 3. TemplateMethod
* 从这一个pattern学到了: Design Pattern真的是为了Software Engineering. 为了写更好维护的代码,容易迭代,低耦合,好debug.

### 拓展思路
* 为了是逻辑处理通用化: 
* 父类和子类之间的协作
* 父类和子类的一致性: Liskov substitution princple (LSP) 的一个体现.

### 衍生阅读: 类的层次与抽象类
* 父类对子类的要求
* 抽象类的意义: 可以决定抽象方法的名字, 在抽象类阶段确定处理的流程.
* 父类和子类之间的协作: trade-off (划分处理的级别, 哪些在父类, 哪些在子类)


## 4. FactoryMethod
* 在设计模式中, 多个类/接口扮演各自的角色, 互相协作工作. 在分析设计模式时, 不应当将其中一个类单独难出来分析, 必须着眼于类和接口之间的相互关系.
* `只有白雪公主一个人的话, 是演不了白雪公主这部话剧的`

## 6. Prototype
* `一旦再类中使用了别的类名, 则意味着该类与其他类紧耦合了`

# Ref
* https://github.com/Relph1119/GraphicDesignPattern
