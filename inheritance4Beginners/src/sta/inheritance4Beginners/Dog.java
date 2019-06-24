package sta.inheritance4Beginners;

public class Dog extends Pet {
	
	private boolean isGuardDog;
	private boolean isDangerous;
	

	/**
	 * @return the isGuardDog
	 */
	boolean isGuardDog() {
		return isGuardDog;
	}

	/**
	 * @param isGuardDog the isGuardDog to set
	 */
	void setGuardDog(boolean isGuardDog) {
		this.isGuardDog = isGuardDog;
	}

	/**
	 * 
	 */
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param petID
	 * @param name
	 * @param dob
	 * @param licenceReq
	 * @param purchasePrice
	 */
	public Dog(int petID, String name, String dob, boolean licenceReq, double purchasePrice, boolean isGuardDog) {
		super(petID, name, dob, licenceReq, purchasePrice);
		
		this.isGuardDog = isGuardDog;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String myString = super.toString() +  " Dog [isGuardDog=" + isGuardDog + "]";
		return myString;
	}

	/**
	 * @param petID
	 * @param name
	 * @param ownerFName
	 * @param ownerLName
	 * @param eircode
	 * @param dob
	 * @param licenceReq
	 * @param sellingPrice
	 * @param purchasePrice
	 */
	public Dog(int petID, String name, String ownerFName, String ownerLName, String eircode, String dob,
			boolean licenceReq, double sellingPrice, double purchasePrice) {
		super(petID, name, ownerFName, ownerLName, eircode, dob, licenceReq, sellingPrice, purchasePrice);
		// TODO Auto-generated constructor stub
	}

}
