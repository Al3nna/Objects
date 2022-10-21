//Alenna - alenna.castaneda@oneidaihla.org
//for CTE software development 1
//instructor Mr Gross
public class ObProject {

    //creating pet
    void createNewPet (String name,String species,String owner) {
        //calling print function
        printPet(name, species,  owner);
    }

    //printing new pet with their owner
    void printPet (String name,String species,String owner) {
        System.out.println(name+" is a "+species+" that belongs to "+owner+".");
    }

    //printing pet with the owner that claimed them
    void printPetO2 (String name,String species,String owner) {
        System.out.println(name+" is a "+species+" that "+owner+" now claims.");
    }

    //transferring pet ownership
    void petOwnershipTransfer (String name,String species,String owner,String newOwner) {
        owner = newOwner;
        printPetO2(name, species, newOwner);
    }
    //Setting ability lvl
    void petAbilities (String name,String species,String ability,int abilityLevel,String ability2,int ability2Level,String ability3,int ability3Level) {
        //checking for "Royalty" ability
        if ( ability == "Royalty" || ability2 == "Royalty" || ability3 == "Royalty") {
            //checking if royalty is ability 1
            if (ability == "Royalty") {
                //calling petRoyalty function
                petRoyalty(name, species, ability, abilityLevel);  
            } else {
               //checking if royalty is ability 2
                if (ability2 == "Royalty") {
                    //calling petRoyalty function
                    petRoyalty(name, species, ability2, ability2Level);
                } else {
                    //Acknowledging royalty is ability 3
                    //calling petRoyalty function
                    petRoyalty(name, species, ability3, ability3Level);
                } 
            }
        }
        //checking for "Snuggle" ability
        if ( ability == "Snuggle" || ability2 == "Snuggle" || ability3 == "Snuggle") {
            //checking if snuggle is ability 1
            if (ability == "Snuggle") {
                //calling petSnuggle function
                petSnuggle(name, species, ability, abilityLevel);
            } else {
                 //checking if snuggle is ability 2
                if (ability2 == "Snuggle") {
                    //calling petSnuggle function
                    petSnuggle(name, species, ability2, ability2Level);
                } else {
                    //Acknowledging snuggle is ability 3
                    //calling petSnuggle function
                    petSnuggle(name, species, ability3, ability3Level);
                }
            }
        }
        //checking for "Speed" ability
        if ( ability == "Speed" || ability2 == "Speed" || ability3 == "Speed") {
            //checking if speed is ability 1
            if (ability == "Speed") {
                //calling petSpeed function
                petSpeed(name, species, ability, abilityLevel);
            } else {
                //checking if speed is ability 2
                if (ability2 == "Speed") {
                    //calling petSpeed function
                    petSpeed(name, species, ability2, ability2Level);
                } else {
                   //Acknowledging speed is ability 3
                   //calling petSpeed function
                    petSpeed(name, species, ability3, ability3Level); 
                }
            }
        }
        //checking for "Strength" ability
        if ( ability == "Strength" || ability2 == "Strength" || ability3 == "Strength") {
            //checking if strength is ability 1
            if (ability == "Strength") {
                //calling petStrength function
                petStrength(name, species, ability, abilityLevel);
            } else {
                //checking if strength is ability 2
                if (ability2 == "Strength") {
                    //calling petStrength function
                    petStrength(name, species, ability2, ability2Level);
                } else {
                    //Acknowledging strength is ability 3
                    //calling petStrength function
                    petStrength(name, species, ability3, ability3Level);
                }
            }
        }
    }
    //Setting royalty lvl
    void petRoyalty (String name,String species,String ability,int abilityLevel) {
        System.out.println(name+" has level "+abilityLevel+" "+ability);
        if (abilityLevel == 10) {
            System.out.println(name+" rules the world!!");
        }
        if (abilityLevel == 0) {
            System.out.println(name+" is a wanted "+species+" in 37 U.S. states..");
        }
    }

    //Setting snuggle lvl
    void petSnuggle (String name,String species,String ability,int abilityLevel) {
        System.out.println(name+" has level "+abilityLevel+" "+ability);
        if (abilityLevel == 10) {
            System.out.println(name+" is the "+species+" cuddle-bug!");
        }
        if (abilityLevel == 0) {
            System.out.println(name+" is a wild beast!");
        }
    }
    
    //Setting speed lvl
    void petSpeed (String name,String species,String ability,int abilityLevel) {
        System.out.println(name+" has level "+abilityLevel+" "+ability);
        if (abilityLevel == 10) {
            System.out.println(name+" is lightning!");
        }
        if (abilityLevel == 0) {
            System.out.println(name+" is an honorary "+species+" slug.");
        }
    }

    //Setting stength lvl 
    void petStrength (String name,String species,String ability,int abilityLevel) {
        System.out.println(name+" has level "+abilityLevel+" "+ability);
        if (abilityLevel == 10) {
            System.out.println(name+" is the "+species+" hulk!");
        } if (abilityLevel == 0) {
            System.out.println(name + " is a twig..");
        }
    }

    public static void main(String[] args) {

        //creating new object
        ObProject obj = new ObProject();
        System.out.println("Melody has 4 pets. Nia loves them.");

        //creating 4 pets
        obj.createNewPet("Pepper", "cat", "Melody");
        obj.createNewPet("Snuggles", "cat", "Melody");
        obj.createNewPet("Halia", "dog", "Melody");
        obj.createNewPet("Daisy", "dog", "Melody");

        //adding a space
        System.out.println();
        System.out.println("Later.. Nia wants a fluffball army!");
        
        //transferring ownership to Nia
        obj.petOwnershipTransfer("Pepper", "cat", "Melody", "Nia");
        obj.petOwnershipTransfer("Snuggles", "cat", "Melody", "Nia");
        obj.petOwnershipTransfer("Halia", "dog", "Melody", "Nia");
        obj.petOwnershipTransfer("Daisy", "dog", "Melody", "Nia");

        //adding a space
        System.out.println();
        System.out.println("Melody tries not to notice...");
        System.out.println("She is a bit worried about their abilities though.");
        System.out.println(); //adding another space

        //printing Halia's abilities
        obj.petAbilities("Halia", "pup-cat", "Strength", 10, "Speed", 10, "Snuggle", 8);
        //adding a space
        System.out.println();

        //printing Daisy's abilities
        obj.petAbilities("Daisy", "puppers", "Speed", 10, "Snuggle", 10, "Royalty", 7);
        //adding a space
        System.out.println();

        //printing Pepper's abilities
        obj.petAbilities("Pepper", "kitty cat", "Royalty", 10, "Strength", 0, "Snuggle", 0);
        //adding a space
        System.out.println();

        //printing Snuggle's abilities
        obj.petAbilities("Snuggles", "catdog", "Snuggle", 10, "Royalty", 0, "Speed", 7);
    }
}