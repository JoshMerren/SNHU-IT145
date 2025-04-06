// Monkey class inherits from RescueAnimal class
public class Monkey extends RescueAnimal {
	
	// Instance variables specific to Monkey
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Default Constructor
    public Monkey() {
        setAnimalType("Monkey");
    }

    // Overloaded constructor with detailed information
    public Monkey(String name, String species, String gender, String age, String weight, String tailLength, String height,
            String bodyLength, String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved,
            String inServiceCountry) {
    	// Call the constructor of the superclass (RescueAnimal) with specific values
        setAnimalType("Monkey");  
        // Set attributes specific to Monkey
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Accessors and Mutators
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    public String getSpecies() {
        return species;
    }

    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }

    public String getHeight() {
        return height;
    }

    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setBodyLength(String monkeyBodyLength) {
        bodyLength = monkeyBodyLength;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    // Additional method to override in RescueAnimal
    @Override
    public String getTrainingStatus() {
    	// Override the getTrainingStatus method to provide additional details for Monkey
        return super.getTrainingStatus();
    }
}
