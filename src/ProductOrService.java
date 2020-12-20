
public abstract class ProductOrService {
	TaxPercentage taxPercentage = new tax20p();
	
	public void setTax(TaxPercentage taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public int tax(){
		return taxPercentage.tax();
	}
}
