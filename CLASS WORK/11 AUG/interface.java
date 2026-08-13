interface finance_data{
	void expences();
	void profit();
	void investors();
}
class member implements finance_data{
	@Override
	public void profit() {
		System.out.println("450000");
	}
	@Override
	public void expences() {
		System.out.println("20000");
	}
	@Override
	public void investors() {
		System.out.println("7 investors");
	}
}
public class finance {
	public static void main(String[] args) {
        member b= new member();
        b.profit();
        b.expences();
        b.investors();
    
	}
