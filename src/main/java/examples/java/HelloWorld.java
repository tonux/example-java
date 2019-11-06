package examples.java;

public class HelloWorld {
	
	public String getMessage(String name) {
		if (name!= null && !name.isEmpty()) {
			return "Hello "+name+"!";
		} else {
			return "Hello World!";
		}
	}

	public int sum(int a, int b){
		return a+b;
	}

}
