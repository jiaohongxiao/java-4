
public class Interface {      //interface 接口
	public interface TeacherInterface {
		// 设置教师的工资
		public abstract void setPay(float pay);
		// 获取教师的工资
		public abstract void getPay(float pay);
	}
	public interface StudentInterface {
		// 设置学生的学费
		public abstract void setFee(float fee);
		// 获取学生的学费
		public abstract void getFee(float fee);
	}
	
//	public class Graduate implements StudentInterface,TeacherInterface{       //class 类名 Implements 接口名
//		// 成员变量
//		String name;
//		String sex;
//		int age;
//		float fee;    //每学期学费
//		float pay;    //月工资
//		
//		Graduate() {           //无参构造方法
//		 
//		}
//		 
//		public Graduate(String name,String sex,int age,float fee,float pay){          //有参构造方法
//			this.name=name;
//			this.sex=sex;
//			this.age=age;
//			this.fee = fee;
//			this.pay=pay;
//			}
//
//		//实现属性的封装
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getSex() {
//			return sex;
//		}
//		public void setSex(String sex) {
//			this.sex = sex; 
//		}
//		public int getAge() {
//			return age;
//		}
//		public void setAge(int age) {
//			this.age = age;
//		}
//		// 实现接口中的抽象方法
//		public void setPay(float pay) {
//			this.pay = pay * 12;       //月工资*12=
//			System.out.println("年收入为：" + this.pay);
//		}
//		
//		public void getPay(float pay) {
//			this.pay = pay * 12;
//			System.out.println("年收入为：" + this.pay);
//		}
//		
//		public void setFee(float fee) {
//			this.fee = fee;
//			System.out.println("学费设置为：" + this.fee);
//		}
//		
//		public void getFee(float fee) {
//			this.fee = fee;
//			System.out.println("学费为：" + this.fee);
//		}
//		
//		//是否缴税
//		public boolean paytaxes(){     //boolean是java中的布尔型（逻辑型）数据类型
//			if ((this.pay - this.fee) < 5000) {
//				System.out.println("\"你的年收入\""
//			    		+ " + this.pay + \","
//			    		+ "减去学费\" + this.fee"
//			    		+ " + \"等于\" "
//			    		+ "+ (this.pay -this.fee)*0.03f");
//				return true;           // true 代表“真”
//			}
//			else {
//				System.out.println("\"你的年收入\""
//			    		+ " + this.pay + \","
//			    		+ "减去学费\" + this.fee"
//			    		+ " + \"等于\" "
//			    		+ "+ (this.pay -this.fee)*0.03f");
//			    return false;          //false 代表“假”
//		} 
//		}
//		}
	
}


