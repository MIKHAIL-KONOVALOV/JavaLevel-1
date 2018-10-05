/**
 * Java Level 1. Lesson 5. Homework.
 * @author Mihail Konovalov
 * @version 28.09.2018
*/

class HomeWork5 {
	public static void main(String[] args) {
		Person[] persArray = new Person[5];
		persArray[0] = new Person("Semenov Oleg", "Driver", "abc@mail.ru", "+79219876541", 10000, 20);
		persArray[1] = new Person("Efremov Igor", "Programmer", "def@mail.ru", "+79219876542", 20000, 30);
		persArray[2] = new Person("Menshov Anton", "Actor", "ghi@mail.ru", "+79219876543", 30000, 40);
		persArray[3] = new Person("Harlamov Dmitry", "Tester", "jkl@mail.ru", "+79219876544", 40000, 50);
		persArray[4] = new Person("Zadolbalov Pridymov", "Killer", "mno@mail.ru", "+6666666666", 50000, 60);
		
		for (int i = 0; i < persArray.length; i++) {
			if (persArray[i].getAge() > 40)
			System.out.println(persArray[i].dataExport());
		}
	}
	
	
	
	
/* А если сделать статичным то все работает но инкапсуляция теряется. static */ class Person {
		
		String fio, post , email, phone;
		int salary;
		private int age;
		
		Person(String fio, String post , String email, String phone, int salary, int age) {
			this.fio = fio;
			this.post = post;
			this.email = email;
			this.phone = phone;
			this.salary = salary;
			this.age = age;
		}
		
		public void setAge(int age) {
			if (age >= 18)
			this.age = age;
		}
		
		public int getAge() {
			return this.age;
		}
		
		String dataExport() {
			return fio + "  " + post + "  " + email + " " + phone + " " + salary + " " + age;
		}
	}
}