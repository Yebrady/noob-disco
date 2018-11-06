public class Fraction {
	private Integer num;
	private Integer denom;
	
	public Fraction(Integer num, Integer denom) {
		this.num = num;
		this.denom = denom;
	}
	
	public String add(Fraction fraction) {
		Integer num = (fraction.num * this.denom) + (this.num * fraction.denom);
		Integer denom = fraction.denom * this.denom;
		return simplify(num, denom);
	}
	
	public String sub(Fraction fraction) {
		Integer num = (fraction.num * this.denom) - (this.num * fraction.denom);
		Integer denom = this.denom * fraction.denom;
		return simplify(num, denom);
	}
	
	public String mul(Fraction fraction) {
		Integer num = this.num * fraction.num;
		Integer denom = this.denom * fraction.denom;
		return simplify(num, denom);
	}
	
	public String div(Fraction fraction) {
		Integer num = fraction.num * this.denom;
		Integer denom = fraction.denom * this.num;
		return simplify(num, denom);
	}
	
	public double getQuotient() {
		return ((double) this.num / this.denom);
	}
	
	public Integer getRemainder() {
		return (this.denom % this.num);
	}
	
	public Float doubleValue() {
		return ((float) this.num / this.denom);
	}
	
	public String simplify (Integer num, Integer denom) {
	      int common = 0;
	      
	      if (num > denom)
	         common = gcd(num, denom);
	      else if (num < denom)
	         common = gcd(denom, num);
	      else
	         common = num;

	      return ((num / common) + "/" + (denom / common));
	   }
	
	public Integer gcd(Integer num, Integer denom) {
	      int factor = denom;
	      while (denom != 0) {
	         factor = denom;
	         denom = num % denom;
	         num = factor;
	      }
	      return num;
	   }
	
}
