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

    //Printing the pet details and their owner
    void printPetDetails (Pet Pepper,Pet Snuggles,Pet Halia,Pet Daisy) {
        Pet petName = new Pet();
        if (Pepper != null) {
            petName = Pepper;
            System.out.println(petName.name+" is a "+petName.age+" year old "+petName.gender+" "+petName.species+" that belongs to "+petName.owner+".");
        }
        if (Snuggles != null) {
            petName = Snuggles;
            System.out.println(petName.name+" is a "+petName.age+" year old "+petName.gender+" "+petName.species+" that belongs to "+petName.owner+".");
        }
        if (Halia != null) {
            petName = Halia;
            System.out.println(petName.name+" is a "+petName.age+" year old "+petName.gender+" "+petName.species+" that belongs to "+petName.owner+".");
        }
        if (Daisy != null) {
            petName = Daisy;
            System.out.println(petName.name+" is a "+petName.age+" year old "+petName.gender+" "+petName.species+" that belongs to "+petName.owner+".");
        }
        }

    //Changing owner to Nia
    void claimPetOwnership (Pet Pepper,Pet Snuggles,Pet Halia,Pet Daisy) {
        Pet petName = new Pet();
        if (Pepper != null) {
            petName = Pepper;
            petName.owner = "Nia";
            System.out.println(petName.name+" has been claimed by "+petName.owner+".");
        }
        if (Snuggles != null) {
            petName = Snuggles;
            petName.owner = "Nia";
            System.out.println(petName.name+" has been claimed by "+petName.owner+".");
        }
        if (Halia != null) {
            petName = Halia;
            petName.owner = "Nia";
            System.out.println(petName.name+" has been claimed by "+petName.owner+".");
        }
        if (Daisy != null) {
            petName = Daisy;
            petName.owner = "Nia";
            System.out.println(petName.name+" has been claimed by "+petName.owner+".");
        }
    }
    
    public static void main(String[] args) {
        //creating object named "Pepper"
        Pet Pepper = new Pet();
        //Giving value to Pepper's attributes
        Pepper.name = "Pepper";
        Pepper.gender = "female";
        Pepper.species = "kitty cat";
        Pepper.owner = "Melody";
        Pepper.age = 12;

        //creating object named "Snuggles"
        Pet Snuggles = new Pet();
        //Giving value to Snuggles' attributes
        Snuggles.name = "Snuggles";
        Snuggles.gender = "male";
        Snuggles.species = "catdog";
        Snuggles.owner = "Melody";
        Snuggles.age = 11;

        //creating object named "Halia"
        Pet Halia = new Pet();
        //Giving value to Halia's attributes
        Halia.name = "Halia";
        Halia.gender = "female";
        Halia.species = "pupcat";
        Halia.owner = "Melody";
        Halia.age = 2;

        //creating object named "Daisy"
        Pet Daisy = new Pet();
        //Giving value to Daisy's attributes
        Daisy.name = "Daisy";
        Daisy.gender = "female";
        Daisy.species = "puppers";
        Daisy.owner = "Nia";
        Daisy.age = 2;

        //creating an object named "ob"
        Pet ob = new Pet();

        System.out.println("Melody and Nia have 4 pets. Nia LOVES them.");
        //accessing ob method printPetDetails
        ob.printPetDetails(Pepper, Snuggles, Halia, Daisy);

        //adding a space
        System.out.println();
        System.out.println("Later.. Nia wants a fluffball army!");

        //Nia claiming all of the pets
        ob.claimPetOwnership(Pepper, Snuggles, Halia, null);

         //adding a space
         System.out.println();
         System.out.println("Melody tries not to notice...");
    }
}