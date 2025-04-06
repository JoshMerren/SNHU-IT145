public class Pet {
    // Properties
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;

    // Constructor
    public Pet() {
        // Default constructor
    	this.petType = "DEFAULT";
        this.petName = "DEFAULT";
        this.petAge = 0;
        this.dogSpaces = 0;
        this.catSpaces = 0;
        this.daysStay = 0;
        this.amountDue = 0;
    }

    
    public Pet(String petType, String petName, int petAge, int daysStay, int dogSpaces, int catSpaces, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.amountDue = amountDue;
    }

    // Accessors and Mutators
    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public int getDaysStay() {
        return daysStay;
    }

    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    
}

	
	

