package sta.inheritance4Beginners;

public class Pet {
	
	 private int petID;
	 private String name;
	 private String ownerFName;
	 private String ownerLName;
	 private String eircode;
	 private String dob;
	 private boolean licenceReq;
	 private double sellingPrice;
	 private double purchasePrice;
	
 	 /**
	 * 
	 */
	public Pet() {
		super();
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
	public Pet(int petID, String name, String ownerFName, String ownerLName, String eircode, String dob,
			boolean licenceReq, double sellingPrice, double purchasePrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.ownerFName = ownerFName;
		this.ownerLName = ownerLName;
		this.eircode = eircode;
		this.dob = dob;
		this.licenceReq = licenceReq;
		this.sellingPrice = sellingPrice;
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @param petID
	 * @param name
	 * @param dob
	 * @param licenceReq
	 * @param purchasePrice
	 */
	public Pet(int petID, String name, String dob, boolean licenceReq, double purchasePrice) {
		super();
		this.petID = petID;
		this.name = name;
		this.dob = dob;
		this.licenceReq = licenceReq;
		this.purchasePrice = purchasePrice;
	}

	/**
	 * @return the petID
	 */
	int getPetID() {
		return petID;
	}

	/**
	 * @param petID the petID to set
	 */
	void setPetID(int petID) {
		this.petID = petID;
	}

	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ownerFName
	 */
	String getOwnerFName() {
		return ownerFName;
	}

	/**
	 * @param ownerFName the ownerFName to set
	 */
	void setOwnerFName(String ownerFName) {
		this.ownerFName = ownerFName;
	}

	/**
	 * @return the ownerLName
	 */
	String getOwnerLName() {
		return ownerLName;
	}

	/**
	 * @param ownerLName the ownerLName to set
	 */
	void setOwnerLName(String ownerLName) {
		this.ownerLName = ownerLName;
	}

	/**
	 * @return the eircode
	 */
	String getEircode() {
		return eircode;
	}

	/**
	 * @param eircode the eircode to set
	 */
	void setEircode(String eircode) {
		this.eircode = eircode;
	}

	/**
	 * @return the dob
	 */
	String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the licenceReq
	 */
	boolean isLicenceReq() {
		return licenceReq;
	}

	/**
	 * @param licenceReq the licenceReq to set
	 */
	void setLicenceReq(boolean licenceReq) {
		this.licenceReq = licenceReq;
	}

	/**
	 * @return the sellingPrice
	 */
	double getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * @param sellingPrice the sellingPrice to set
	 */
	void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	/**
	 * @return the purchasePrice
	 */
	double getPurchasePrice() {
		return purchasePrice;
	}

	/**
	 * @param purchasePrice the purchasePrice to set
	 */
	void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", name=" + name + ", ownerFName=" + ownerFName + ", ownerLName=" + ownerLName
				+ ", eircode=" + eircode + ", dob=" + dob + ", licenceReq=" + licenceReq + ", sellingPrice="
				+ sellingPrice + ", purchasePrice=" + purchasePrice + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((eircode == null) ? 0 : eircode.hashCode());
		result = prime * result + (licenceReq ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ownerFName == null) ? 0 : ownerFName.hashCode());
		result = prime * result + ((ownerLName == null) ? 0 : ownerLName.hashCode());
		result = prime * result + petID;
		long temp;
		temp = Double.doubleToLongBits(purchasePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sellingPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (eircode == null) {
			if (other.eircode != null)
				return false;
		} else if (!eircode.equals(other.eircode))
			return false;
		if (licenceReq != other.licenceReq)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ownerFName == null) {
			if (other.ownerFName != null)
				return false;
		} else if (!ownerFName.equals(other.ownerFName))
			return false;
		if (ownerLName == null) {
			if (other.ownerLName != null)
				return false;
		} else if (!ownerLName.equals(other.ownerLName))
			return false;
		if (petID != other.petID)
			return false;
		if (Double.doubleToLongBits(purchasePrice) != Double.doubleToLongBits(other.purchasePrice))
			return false;
		if (Double.doubleToLongBits(sellingPrice) != Double.doubleToLongBits(other.sellingPrice))
			return false;
		return true;
	}
	
	String feedingInstructions()
	{
		return "Feed me Seymour";
	}

}
