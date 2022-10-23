//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross

class Pet {
    //creating attributes
    String name;
    String gender;
    String species;
    String owner;
    int age;

    //constructor
    public Pet () {
        name = "empty";
        gender = "empty";
        species = "empty";
        owner = "empty";
        age = 0;
    }

    //setting pet values
    void setValues (String petName,String petGender,String petSpecies,String petOwner,int petAge) {
        name = petName;
        gender = petGender;
        species = petSpecies;
        owner = petOwner;
        age = petAge;
    }
    //Printing the pet details and their owner
    void printPetDetails () {
        System.out.println(name+" is a "+age+" year old "+gender+" "+species+" that belongs to "+owner+".");
    }
    //Changing owner to Nia
    void claimPetOwnership (String newOwner) {
        owner = newOwner;
        System.out.println(name+" has been claimed by "+owner+".");
    }
    
    public static void main(String[] args) {
        //creating object named "Pepper"
        Pet Pepper = new Pet();
        //Giving value to Pepper's attributes
        Pepper.setValues ("Pepper","female","kitty cat", "Melody", 12);

        //creating object named "Snuggles"
        Pet Snuggles = new Pet();
        //Giving value to Snuggles' attributes
        Snuggles.setValues("Snuggles", "male", "catdog", "Melody", 11);

        //creating object named "Halia"
        Pet Halia = new Pet();
        //Giving value to Halia's attributes
        Halia.setValues("Halia", "female", "pupcat", "Melody", 2);

        //creating object named "Daisy"
        Pet Daisy = new Pet();
        //Giving value to Daisy's attributes
        Daisy.setValues("Daisy", "female", "puppers", "Nia", 2);

        //creating a string of all pets
        Pet[] allPets = {Pepper,Snuggles,Halia,Daisy};

        System.out.println("Melody and Nia have 4 pets. Nia LOVES them.");

        //printing pet details
        for (int i=0; i < allPets.length; i++) {
            allPets[i].printPetDetails();
        }
        //adding a space
        System.out.println();
        System.out.println("Later.. Nia wants a fluffball army!");

        //Nia claiming all of the pets (that she doesn't already own)
        for (int i=0; i < allPets.length; i++) {
            if (allPets[i].owner != "Nia"){
                allPets[i].claimPetOwnership("Nia");
            }
        }

         //adding a space
         System.out.println();
         System.out.println("Melody tries not to notice...");
    }
}