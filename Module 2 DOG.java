public class Dog {

	// Attributes (variables) with appropriate data types
	private String petType = "dog";
	private String petName;  // Name of dog
	private int petAge;		// Age of dog
	private int dogSpaceNumber;	// The number of spaces allocated for this dog in a kennel
	private int daysStay;  // The number of days the dog will stay
	private float dogWeight;	// The weight of the dog
	private boolean grooming;	// Indicates whether the dog requires grooming
	
	// Constructor method that initializes value for all attributes
	/**
     * Constructor for Dog class.
     * Initializes a new instance of Dog with the provided attribute values.
     *
     * @param petName Name of the dog.
     * @param petAge Age of the dog.
     * @param dogSpaceNumber Kennel space number allocated to the dog.
     * @param daysStay Number of days the dog is scheduled to stay.
     * @param dogWeight Weight of the dog.
     * @param grooming Indicates whether the dog requires grooming.
     */
	public Dog(String petName, int petAge, int dogSpaceNumber, int daysStay, float dogWeight, boolean grooming) {
		this.petName = petName;
		this.petAge = petAge;
		this.dogSpaceNumber = dogSpaceNumber;
		this.daysStay = daysStay;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
	}
	// Accessor (getter) methods 
	// Returns the type of pet
	public String getPetType() {
		return petType;
		
	}
	// Returns the name of the dog
	public String getPetName() {
		return petName;
		
	}
	// Returns the age of the dog
	public int getPetAge() {
		return petAge;
	}
	// Returns the number of spaces allocated for the dog
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}
	// Returns the number of days the dog is scheduled to stay
	public int getDaysStay() {
		return daysStay;
	}
	// Returns the weight of the dog
	public float getDogWeight() {
		return dogWeight;
	}
	// Returns whether the dog needs grooming
	public boolean getGrooming() {
		return grooming;
	}
	
	
	// Mutator (setter) methods
	// Sets the name of the dog
	public void setPetName(String petName) {
		this.petName = petName;
	}
	// Sets the age of the dog
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	// Sets the number of spaces allocated for the dog
	public void setDogSpaceNumber(int dogSpaceNumber) {
		this.dogSpaceNumber = dogSpaceNumber;
	}
	// Sets the number of days the dog will stay
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	// Sets the weight of the dog
	public void setDogWeight(float dogWeight) {
		this.dogWeight = dogWeight;
	}
	// Sets the grooming needs of the dog
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}
	
	
}
