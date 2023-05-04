package advance.dev;
import java.util.Scanner;
import java.util.Arrays;

public class Student {	

	
		private String name;
		private int age;
		private String address;
		private String phoneNumber;
		private float averageScore;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if (age > 0) {
				this.age = age;
			} else {
				System.out.println("Invalid age");
			}
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public float getAverageScore() {
			return averageScore;
		}

		public void setAverageScore(float averageScore) {
			if (averageScore >= 0) {
				this.averageScore = averageScore;
			} else {
				System.out.println("Invalid average score");
			}
		}
	}



