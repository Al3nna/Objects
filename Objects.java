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
    String identity;

    //constructor
    public Pet () {
        name = "null";
        gender = "null";
        species = "null";
        owner = "null";
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
    //setting pet abilities
    void petAbilities (String ability1,int ability1Level,String ability2,int ability2Level) {
        String ability;
        int abilityLevel;

        ability = ability1;  //copying ability1 into ability
        abilityLevel = ability1Level; //copying ability1Level into abilityLevel
        printAbilities(ability, abilityLevel); //printing ability and level

        ability = ability2;
        abilityLevel = ability2Level;
        printAbilities(ability, abilityLevel);
    }
    //printing pet abilities
    void printAbilities (String ability,int abilityLevel) {
        System.out.println(name+" has "+abilityLevel+" "+ability+".");
        if (abilityLevel == 10) {  //checking if abilityLevel is 10
            if (ability == "Royalty") {  //cheching if ability is "Royalty"
                System.out.println(name+" rules the world!");
            }
            if (ability == "Strength") {  //cheching if ability is "Strength"
                System.out.println(name+" is the "+species+" hulk!");
            }
            if (ability == "Snuggle") {  //cheching if ability is "Snuggle"
                System.out.println(name+" is an honorary "+species+" cuddlebug!");
            }
            if (ability == "Speed") {  //cheching if ability is "Speed"
                System.out.println(name+" is lightning!");
            }
        }
        if (abilityLevel == 0) {  //checking if abilityLevel is 0
            if (ability == "Royalty") {  //cheching if ability is "Royalty"
                System.out.println(name+" is wanted..");
            }
            if (ability == "Strength") {  //cheching if ability is "Strength"
                System.out.println(name+" is a twig..");
            }
            if (ability == "Snuggle") {  //cheching if ability is "Snuggle "
                System.out.println(name+" is a wild beast!");
            }
            if (ability == "Speed") {  //cheching if ability is "Speed"
                System.out.println(name+" is now a slug..");
            }
        }
    }

    //changing pet name and adding title
    void petCodename (String codename,String title) {
        identity = name;
        name = codename;
        System.out.println(codename+" the "+title+"!");
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
         System.out.println("but...");
         //adding another space
         System.out.println();

         //Setting and printing pet abilities
         Pepper.petAbilities("Royalty", 10, "Snuggle", 0);
         System.out.println();
         Snuggles.petAbilities("Snuggle", 10, "Royalty", 0);
         System.out.println();
         Halia.petAbilities("Strength", 10, "Speed", 10);
         System.out.println();
         Daisy.petAbilities("Speed", 10, "Strength", 0);

         System.out.println();
         System.out.println("Nia: Now all they need are codenames!");
         System.out.println();

         //Changing pet names and adding titles
         Pepper.petCodename("Ivy", "princess");
         Snuggles.petCodename("Garfield", "chef");
         Halia.petCodename("Balue", "tank");
         Daisy.petCodename("Baby", "brains");
    }
}