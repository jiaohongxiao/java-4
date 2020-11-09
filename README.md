# java-2020.10.26  云班课  实验四 接口程序实验
## 实验4

### **计G202  2020322104  焦鸿霄**

**阅读程序**

**一、实验目的**

1. 掌握Java中抽象类和抽象方法的定义；
2. 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；
3. 了解异常的使用方法，并在程序中根据输入情况做异常处理；

**二、实验要求**

说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
* 在博士研究生类中实现各个接口定义的抽象方法;
* 对年学费和年收入进行统计，用收入减去学费，求得纳税额；
* 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义
* 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入
* 根据输入情况，要在程序中做异常处理。
* * * 

**三、实验方法**

##### 实验流程图

![]()

##### 实验里的核心代码、注释
```
 //interface 接口
	public interface TeacherInterface {
		public abstract void setPay(float pay);// 设置教师的工资
		public abstract void getPay(float pay);// 获取教师的工资
	}
	public interface StudentInterface {
		public abstract void setFee(float fee);// 设置学生的学费
		public abstract void getFee(float fee);// 获取学生的学费
	}
```

```
	public Graduate(String name,String sex,int age){          //有参构造方法
			this.name=name;
			this.sex=sex;
			this.age=age;
			}
   Graduate() {                                            //无参构造方法
		}
```

```
//实现属性的封装  (例如)
	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
```

```
// 实现接口中的抽象方法
		public void setPay(float pay) {
			this.pay = pay * 12;       //月收入*12=年收入
			System.out.println("年收入为：" + this.pay);
		}
		
		public void getPay(float pay) {
			this.pay = pay * 12;
			System.out.println("年收入为：" + this.pay);
		}
```
```
//boolean是java中的布尔型（逻辑型）数据类型
	public boolean paytaxes(){    
			if ((this.pay - this.fee) < 5000) {
				System.out.println("纳税金额为:"+(this.pay -this.fee)*0.03f+"\n");
				return true;           // true 代表“真”
			}
			else {
				System.out.println("纳税金额为:"+(this.pay -this.fee)*0.03f+"\n");
			    return false;          //false 代表“假”
		} 
		}
		}
```
```
//调用前面的boolean
boolean flag = g.paytaxes();
		if (flag) {
			System.out.println("您好，您不满足缴税条件，无需纳税。");
				}
		else {
			  System.out.println("您好，您满足纳税条件，需要纳税！");
				}
	}
```

**四、实验结果**

```
-------个人信息管理-------
姓名：焦鸿霄
性别：女
年龄：22
-------------------------

请输入你的月收入：
1500                    //需要手动输入
年收入为：18000.0        //自动生成
-------------------------

请输入你的学费：
5000                    //需要手动输入
学费设置为：5000.0
-------------------------

纳税金额为:390.0

您好，您满足纳税条件，需要纳税！

```

**五、实验感想**

通过这次实验掌握Java中接口的定义、抽象类和抽象方法的定义，熟练掌握接口的定义形式以及接口的实现方法，学会使用boolean【布尔型（逻辑型）数据类型】，并了解到在java中boolean值只能是true和false，而不能用0和1代替，并且一定要小写。

实验中遇到的问题：
1. Java出现总是No enclosing instance of type E is accessible.------通过百度查询以及向同学讨教解决了问题；
2. 接口可以被多重实现（implements）,抽象类只能被单一继承（extends）还是没有搞懂，需要回去看书、查询资料；
3. 布尔型的值只能用 true和false，而不能用0和1代替，并且一定要小写，需要**谨记**
