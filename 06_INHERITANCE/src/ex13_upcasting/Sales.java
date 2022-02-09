package ex13_upcasting;
public class Sales extends Regular{
	
	private int salesVolume;
	private double insentive;
	
	public Sales(String name, int salary, int salesVolume, double insentive) {
		super(name, salary);
		this.salesVolume = salesVolume;
		this.insentive = insentive;

	}
	public int getSalesPay() {
		return (int)(salesVolume * insentive );
	}
	
	@Override
	public int getPay() {
		// return 기본급 + 판매수당
		return super.getPay() + getSalesPay();
	}
}