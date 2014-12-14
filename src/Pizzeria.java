import java.util.ArrayList;


public class Pizzeria implements Visitable {
	protected String name;
	protected int phone;
	protected ArrayList<String> pizzas;
	public Pizzeria(String name, int phone, ArrayList<String> pizzas){
		this.name=name;
		this.phone=phone;
		this.pizzas = new ArrayList<String>(pizzas);
	}
	@Override
	public void accept(Visit v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public ArrayList<String> getPizzas() {
		return pizzas;
	}
	public void setPizzas(ArrayList<String> pizzas) {
		this.pizzas = pizzas;
	}

}
