import java.util.Scanner;

public class test extends Interface{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ����һ������
		Graduate  g = new Graduate("������","Ů",22);
		System.out.println("-------������Ϣ����-------");
		System.out.println("������"+g.getName());
		System.out.println("�Ա�"+g.getSex());
		System.out.println("���䣺"+g.getAge());
		System.out.println("-------------------------"+"\n");
		
		// �����¹���
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������������룺");
		float pay = scanner.nextFloat();
		g.setPay(pay);
		System.out.println("-------------------------"+"\n");		
		// ����ѧ��
		System.out.println("���������ѧ�ѣ�");
		float fee = scanner.nextFloat();
		g.setFee(fee);
		System.out.println("-------------------------"+"\n");		
		// �ж��Ƿ���Ҫ��˰
	    boolean flag = g.paytaxes();
		if (flag) {
			System.out.println("���ã����������˰������������˰��");
				}
		else {
			  System.out.println("���ã���������˰��������Ҫ��˰��");
				}
	}
}