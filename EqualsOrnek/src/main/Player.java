package main;

import java.util.Objects;

public class Player {

	private final long tcNo;
	private int age;
	private String name;

	public Player(String name, int age, int tcNo) {
		super();
		this.age = age;
		this.name = name;
		this.tcNo = tcNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTcNo() {
		return tcNo;
	}

//	@Override
//	public int hashCode() {
//		int result = Integer.hashCode(3);
//		result = 31 * result + Integer.hashCode(1);
//		return result;
//
//	}

	@Override
	public int hashCode() {
		return Objects.hash(tcNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return age == other.age && Objects.equals(name, other.name) && tcNo == other.tcNo;
	}

}
