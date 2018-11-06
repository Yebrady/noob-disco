/**
 *	VeryLargeInteger is a class for arbitrary precision integer computation.
 */
public class VeryLargeInteger {	
	
	/**
	 * Constructs a new VLI object from a long integer.
	 * @param init initial value
	 */
	public VeryLargeInteger(long init) {
		this.init = Long.toString(init);
	}
	
	/**
	 * Constructs a new VLI object from a long integer.
	 * @param init initial value. Note, the string represents a valid VLI but can
	 * be prefixed with a sign (either + or -).
	 */
	public VeryLargeInteger(String init) {
		this.init = init;
	}
	
	public String getInit() {
		return this.init;
	}
	
	public void setInit(String init) {
		this.init = init;
	}
	/**
	 * Computes this+other and return the result in a new object.
	 * @param other the left-hand side operand.
	 * @return a new VLI representing this+other.
	 */
	public VeryLargeInteger add(VeryLargeInteger other) {
		String num1   = this.init;
		String num2   = other.init;
		String sum 	  = "";
		int thisSize  = this.init.length();
		int otherSize = other.init.length();
		int lesser    = 0;
		int greater   = 0;
		
		if (thisSize > otherSize) {
			lesser = otherSize;
			greater = thisSize;
		} else {
			lesser = thisSize;
			greater = otherSize;
		}
		
		int carry = 0;
		for (int i = 0; i < lesser; i++) {
			int result = (Character.getNumericValue(num1.charAt(num1.length()-1-i)) + (Character.getNumericValue(num2.charAt(num2.length()-1-i))) + carry);
			
			if (result > 9) {
				carry = 1;
				result = result - 10;
			} else 
				carry = 0;
			
			sum = result + sum;
		}
		
		if(thisSize > otherSize) {
			for (int i = lesser; i < greater; i++) {
				int result = Character.getNumericValue(num1.charAt(num1.length()-1-i) + carry);
				sum = result + sum;
			}
		} else if (thisSize < otherSize) {
			for (int i = lesser; i < greater; i++) {
				int result = Character.getNumericValue(num2.charAt(num2.length()-1-i) + carry);
				sum = result + sum;
			}
		}
		
		return new VeryLargeInteger(sum);
		
		
	}
	
	/**
	 * Computes this-other and returns the result in a new object.
	 * @param other the left-hand side operand.
	 * @return a new VLI representing this-other.
	 */
	public VeryLargeInteger sub(VeryLargeInteger other) {
		String num1   = this.init;
		String num2   = other.init;
		String sum 	  = "";
		int thisSize  = this.init.length();
		int otherSize = other.init.length();
		int lesser    = 0;
		int greater   = 0;
		
		if (thisSize > otherSize) {
			lesser = otherSize;
			greater = thisSize;
		} else {
			lesser = thisSize;
			greater = otherSize;
		}
		
		int carry = 0;
		for (int i = 0; i < lesser; i++) {
			int result = (Character.getNumericValue(num1.charAt(num1.length()-1-i)) - (Character.getNumericValue(num2.charAt(num2.length()-1-i))) - carry);
			if (result < 0) {
				carry = 1;
				result = result + 10;
			} else 
				carry = 0;
			
			sum = result + sum;
		}
		
		if(thisSize > otherSize) {
			for (int i = lesser; i < greater; i++) {
				int result = Character.getNumericValue(num1.charAt(num1.length()-1-i) - carry);
				sum = result + sum;
			}
		} else if (thisSize < otherSize) {
			for (int i = lesser; i < greater; i++) {
				int result = Character.getNumericValue(num2.charAt(num2.length()-1-i) - carry);
				sum = result + sum;
			}
		}
		
		return new VeryLargeInteger(sum);
	}
	
	/**
	 * Computes this*other and returns the result in a new object.
	 * @param other the left-hand side operand.
	 * @return a new VLI object representing this*other.
	 */
	public VeryLargeInteger mul(VeryLargeInteger other) {
		String num1   = this.init;
		String num2   = other.init;
		String sum 	  = "";
		int thisSize  = this.init.length();
		int otherSize = other.init.length();
		int lesser    = 0;
		int greater   = 0;
		
		if (thisSize > otherSize) {
			lesser = otherSize;
			greater = thisSize;
		} else {
			lesser = thisSize;
			greater = otherSize;
		}
		
		if (thisSize > otherSize) {
			int product = 0;
			int shift = 0;
			
			for (int i = 0; i < lesser; i++) {
				int result = 0;
				int carry = 0;
				String foo = "";
				
				int n1 = Character.getNumericValue(num2.charAt(num2.length()-1-i));
				
				for (int n = 0; n < greater; n++) {
					result =  n1 * Character.getNumericValue(num1.charAt(num1.length()-1-n)) + carry;
					
					if (result > 9) {
						carry = Integer.parseInt(Integer.toString(result).substring(0,1));
						result = result % 10;
						
					} else
						carry = 0;
					foo = result + foo;
				}
				
				foo = foo + (new String(new char[shift]).replace("\0", "0"));
				product = product + Integer.parseInt(foo);
				shift++;
			}
			sum = String.valueOf(product);
		} else {
			int product = 0;
			int shift = 0;
			
			for (int i = 0; i < lesser; i++) {
				int result = 0;
				int carry = 0;
				String foo = "";
				
				int n1 = Character.getNumericValue(num1.charAt(num1.length()-1-i));
				
				for (int n = 0; n < greater; n++) {
					result =  n1 * Character.getNumericValue(num2.charAt(num2.length()-1-n)) + carry;
					
					if (result > 9) {
						carry = Integer.parseInt(Integer.toString(result).substring(0,1));
						result = result % 10;
						
					} else
						carry = 0;
					foo = result + foo;
				}
				
				foo = foo + (new String(new char[shift]).replace("\0", "0"));
				product = product + Integer.parseInt(foo);
				shift++;
			}
			sum = String.valueOf(product);
		}
		return new VeryLargeInteger(sum);
	}
	
	/**
	 * Computes this/other and returns the result in a new object.
	 * @param other the left-hand side operand.
	 * @return a new VLI object representing this/other.
	 */
	public VeryLargeInteger div(VeryLargeInteger other ) {
		return null;
	}
	
	/**
	 * Computes this%other and returns the result in a new object.
	 * @param other the left-hand side operand.
	 * @return a new VLI object representing this%other.
	 */
	public VeryLargeInteger mod(VeryLargeInteger other) {
		return null;

	}	
	
	public String toString() {
		return this.init.toString();
	}
	
	private String init;
}
