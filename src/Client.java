public class Client implements Visitable {
	String name;
	public Client(String name){
		this.name=name;
	}
	@Override
	public void getVisited(Manager m) {
		System.out.println(this.toString() + "visited by " + m.toString());
	}
	@Override
	public String toString() {
		return "Client [name=" + name + "]";
	}
}
