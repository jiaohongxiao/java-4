
public class Interface {      //interface �ӿ�
	public interface TeacherInterface {
		// ���ý�ʦ�Ĺ���
		public abstract void setPay(float pay);
		// ��ȡ��ʦ�Ĺ���
		public abstract void getPay(float pay);
	}
	public interface StudentInterface {
		// ����ѧ����ѧ��
		public abstract void setFee(float fee);
		// ��ȡѧ����ѧ��
		public abstract void getFee(float fee);
	}
	
//	public class Graduate implements StudentInterface,TeacherInterface{       //class ���� Implements �ӿ���
//		// ��Ա����
//		String name;
//		String sex;
//		int age;
//		float fee;    //ÿѧ��ѧ��
//		float pay;    //�¹���
//		
//		Graduate() {           //�޲ι��췽��
//		 
//		}
//		 
//		public Graduate(String name,String sex,int age,float fee,float pay){          //�вι��췽��
//			this.name=name;
//			this.sex=sex;
//			this.age=age;
//			this.fee = fee;
//			this.pay=pay;
//			}
//
//		//ʵ�����Եķ�װ
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
//		// ʵ�ֽӿ��еĳ��󷽷�
//		public void setPay(float pay) {
//			this.pay = pay * 12;       //�¹���*12=
//			System.out.println("������Ϊ��" + this.pay);
//		}
//		
//		public void getPay(float pay) {
//			this.pay = pay * 12;
//			System.out.println("������Ϊ��" + this.pay);
//		}
//		
//		public void setFee(float fee) {
//			this.fee = fee;
//			System.out.println("ѧ������Ϊ��" + this.fee);
//		}
//		
//		public void getFee(float fee) {
//			this.fee = fee;
//			System.out.println("ѧ��Ϊ��" + this.fee);
//		}
//		
//		//�Ƿ��˰
//		public boolean paytaxes(){     //boolean��java�еĲ����ͣ��߼��ͣ���������
//			if ((this.pay - this.fee) < 5000) {
//				System.out.println("\"���������\""
//			    		+ " + this.pay + \","
//			    		+ "��ȥѧ��\" + this.fee"
//			    		+ " + \"����\" "
//			    		+ "+ (this.pay -this.fee)*0.03f");
//				return true;           // true �����桱
//			}
//			else {
//				System.out.println("\"���������\""
//			    		+ " + this.pay + \","
//			    		+ "��ȥѧ��\" + this.fee"
//			    		+ " + \"����\" "
//			    		+ "+ (this.pay -this.fee)*0.03f");
//			    return false;          //false �����١�
//		} 
//		}
//		}
	
}


