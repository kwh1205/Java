package ch01_Object.copy.copy;

//thread,collection,network,file�����
public class Member {
	private String name;//����Ÿ��
	private int age;//�⺻Ÿ��

	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

public String getName() {return name;}
public int getAge() {return age;}
public void setName(String name) {this.name = name;}
public void setAge(int age) {this.age = age;}

@Override
public boolean equals(Object obj) {
	if(obj instanceof Member) {//hash
	return this.name.equals(((Member)obj).getName())&& this.age==((Member)obj).getAge();}return false;}
//1.hash�ڵ� ��
@Override
public int hashCode() {
	return name.hashCode()+age;
}

	
	
}
