public void potion(){ //tests to see if need to drink strength potion		
        General.sleep(sleepTime); //sleep				

        int currentStrLevel = Skills.getCurrentLevel(SKILLS.STRENGTH); //gets current Str lvl						
               
                System.out.println("Checking if Strength Potion is needed..."); //prints on your command prompt the task			

        if(currentStrLevel <= strLevel + 15){ //if strLvl is low enough							

                        drinkPotion(); //Drinks the potion								

                        System.out.println("You have drank a dose of Strength Potion."); //prints on your command prompt the task			

        }else{ //if Strength level is not low enough							

                System.out.println("Character does not currently need Overload...");			
               
                }		
      
        }
