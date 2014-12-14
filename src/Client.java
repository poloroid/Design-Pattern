public class Client implements Visitable {
	String name;
	public Client(String name){
		this.name=name;
	}
	@Override
	public void accept(Visit v) {
		v.visit(this);
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + "]";
	}
	
}
