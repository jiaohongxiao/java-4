
public class Graduate{       
		// 成员变量
		String name;
		String sex;
		int age;
		float fee;    //每学期学费
		float pay;    //月收入
		
		Graduate() {           //无参构造方法
		 
		}
		 
		public Graduate(String name,String sex,int age){          //有参构造方法
			this.name=name;
			this.sex=sex;
			this.age=age;

			}

		//实现属性的封装
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex; 
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		// 实现接口中的抽象方法
		public void setPay(float pay) {
			this.pay = pay * 12;       //月收入*12=年收入
			System.out.println("年收入为：" + this.pay);
		}
		
		public void getPay(float pay) {
			this.pay = pay * 12;
			System.out.println("年收入为：" + this.pay);
		}
		
		public void setFee(float fee) {
			this.fee = fee;
			System.out.println("学费设置为：" + this.fee);
		}
		
		public void getFee(float fee) {
			this.fee = fee;
			System.out.println("学费为：" + this.fee);
		}
		
		//是否缴税
		public boolean paytaxes(){     //boolean是java中的布尔型（逻辑型）数据类型
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
