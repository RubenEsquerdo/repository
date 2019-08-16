package es.eoi.jdbc.entity;

public class Alumno {

	private String dni;
	private String name;
	private String secondName;
	private int age;

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", name=" + name + ", secondName=" + secondName + ", age=" + age + "]";
	}

	public Alumno(String dni, String name, String secondName, int age) {
		super();
		this.dni = dni;
		this.name = name;
		this.secondName = secondName;
		this.age = age;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
