package ch03_abstract;

//*���޻��,�˹ٻ�� �޿� ���*/
public abstract class Employee {
	private String name;
	private int sal;//�޿�
	private final float INCENTIVE_RATE = 0.1f;//
	
	public Employee(String name) {
		this.name = name;
	}
	//�޼ҵ�
	int computePay() {return 0;}
	final int computeIncentive() {
		int pay =computePay();
		int bonus=0;
		if(pay>10000) {
			bonus=(int)(pay*INCENTIVE_RATE);//�޿����
		}
		return bonus;
	}
	void print() {
		System.out.println("================================");
		System.out.println("�̸�:"+name);
		System.out.println("�޿�:"+sal);
		System.out.println(":"+name);
	}
}