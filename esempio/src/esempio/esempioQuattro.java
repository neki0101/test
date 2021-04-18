package esempio;

public class esempioQuattro {
	
	
	
	private static class MyObject {
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public MyObject(String name) {
			this.name = new String(name);
		}
		@Override
		public boolean equals(Object o) {
			if(o instanceof MyObject)
				return this.name.equals(((MyObject) o).getName());
			return false;
		}
	}
 
	public static void main(String[] args) {
		MyObject a = new MyObject("It's Me");
		MyObject b = a;
 
		//b should be equal to a
 
		System.out.println(a.equals(b)); //true	
		a.setName("HELLO");
		System.out.println(a.equals(b)); //false	
		System.out.printf("ciao \n");
	}

}
