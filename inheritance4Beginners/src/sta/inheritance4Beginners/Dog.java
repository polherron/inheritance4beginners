package sta.inheritance4Beginners;

public class Dog extends Pet {

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
	public Dog(int petID, String name, String dob, boolean licenceReq, double purchasePrice) {
		super(petID, name, dob, licenceReq, purchasePrice);
		// TODO Auto-generated constructor stub
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
