package ch08_member01;

public class C {
	public void k() {
		B b = new B();
		b.n = 7;
		b.g();
	}

	public void k1() {
		// ������Ű������
		// Ŭ������ public�̹Ƿ� ���ٰ���
		B2 b2 = new B2();
		// �ʵ�� �޼ҵ�� private�̹Ƿ�
		// ���� ��Ű���������� ���ٺҰ���
		// b2.n=10;
		// b2.g();
	}

	public void k3() {
		B3 b3 = new B3();
		b3.n = 10;
		b3.g();
	}

	public void k4() {
		B4 b4 = new B4();
		b4.n = 10;
		b4.g();
	}
}