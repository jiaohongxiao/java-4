
public class Graduate{       
		// ��Ա����
		String name;
		String sex;
		int age;
		float fee;    //ÿѧ��ѧ��
		float pay;    //������
		
		Graduate() {           //�޲ι��췽��
		 
		}
		 
		public Graduate(String name,String sex,int age){          //�вι��췽��
			this.name=name;
			this.sex=sex;
			this.age=age;

			}

		//ʵ�����Եķ�װ
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
		// ʵ�ֽӿ��еĳ��󷽷�
		public void setPay(float pay) {
			this.pay = pay * 12;       //������*12=������
			System.out.println("������Ϊ��" + this.pay);
		}
		
		public void getPay(float pay) {
			this.pay = pay * 12;
			System.out.println("������Ϊ��" + this.pay);
		}
		
		public void setFee(float fee) {
			this.fee = fee;
			System.out.println("ѧ������Ϊ��" + this.fee);
		}
		
		public void getFee(float fee) {
			this.fee = fee;
			System.out.println("ѧ��Ϊ��" + this.fee);
		}
		
		//�Ƿ��˰
		public boolean paytaxes(){     //boolean��java�еĲ����ͣ��߼��ͣ���������
			if ((this.pay - this.fee) < 5000) {
				System.out.println("��˰���Ϊ:"+(this.pay -this.fee)*0.03f+"\n");
				return true;           // true �����桱
			}
			else {
				System.out.println("��˰���Ϊ:"+(this.pay -this.fee)*0.03f+"\n");
			    return false;          //false �����١�
		} 
		}
		}
