package main.java;

public class BuilderDesignPattern {

	public static void main(String[] args) {

		User user = new User.Builder()
				.name("test")
				.address("test1")
				.age(4)
				.location("ind")
				.build();
		System.out.println(user);
	}

}
class User{
	private String name;
	private String address;
	private int age;
	private String location;
	
	private User(Builder builder) {
		this.name = builder.name;
		this.address = builder.address;
		this.age = builder.age;
		this.location = builder.location;
	}
	public String toString() {
		return "User[name="+this.name+", address="+this.address+", age="+this.age+", location="+this.location+"]";
	}
	public static class Builder {
		private String name;
		private String address;
		private int age;
		private String location;
	
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		public Builder location(String location) {
			this.location = location;
			return this;
		}
		public User build() {
			return new User(this);
		}
		
	}
}
