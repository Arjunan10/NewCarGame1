package com.cargame;

import java.util.Scanner;

public class Home extends CarGame{
Scanner in = new Scanner(System.in);
private String userName;

//Login Method for USER details
public void login(){
    System.out.print("Enter your Sweet Name:");
     String userName = this.userName;
     this.userName = in.nextLine();
    System.out.print("Enter Your Age:");
    int age = in.nextInt();
    System.out.println("");
    if (age<18){
        System.out.println("Sorry Child you can't play this Game");
        System.exit(0);
}
    else{
        System.out.println("****************************");
        System.out.println(" Enjoy your Race "+this.userName);
        System.out.println("****************************");

    }
}

//Buy a Car to participate in race
public void chooseCar() {
    System.out.println("\n1. Audi R8 LMS\n2. Aston Martin Speedster\n3. BMW M2\n4. Ferrari Roma\n5. Ford Mustang");

    System.out.print("Choose Your Car:");
    int car = in.nextInt();
    System.out.println("");
    switch (car) {
        case 1:
            System.out.println("Wow... Great news\"" + userName + "\"\nYou Bought a Brand New \"AUDI R8\"\nSo,What you are Waiting for? Go for a Race ");
            break;
        case 2:
            System.out.println("Wow...Great news\"" + userName + "\"\nYou Bought a Brand New \"Aston Martin Speedster\"\nSo,What you are Waiting for? Go for a Race ");
            break;
        case 3:
            System.out.println("Wow...Great news\"" + userName + "\"\nYou Bought a Brand New \"BMW M2\"\nSo,What you are Waiting for? Go for a Race ");
            break;
        case 4:
            System.out.println("Wow... Great news\"" + userName + "\"\nYou Bought a Brand New \"Ferrari Roma\"\nSo,What you are Waiting for? Go for a Race ");
            break;
        case 5:
            System.out.println("Wow... Great news\"" + userName + "\"\nYou Bought a Brand New \"Ford Mustang\"\nSo,What you are Waiting for? Go for a Race ");
            break;
        default:
            System.out.println("Please choose Available Cars");
    }

}

//Choose a race to Start your Career
  public void chooseRace(){
      System.out.println("\n1.Formula Racing\n2.Sports Car Racing\n3.Stock Car Racing\n4.Mutliplayer\n5.One on One");
      System.out.println("Come on "+userName+",In which race you gonna show your Skill:");
      int race = in.nextInt();
      switch(race){
          case 1:
              System.out.println("Hi everyone here watching,Welcome to \"Grand F1 Racing\"\nWe have new Racer "+userName+" may be New \"Superstar\" \nRacers are furious to Start & Here We GO!!!!!");
          break;
          case 2:
              System.out.println("Hi everyone here watching,Welcome to \"SuperSprint Sport Racing\"\nWe have new Racer "+userName+" may be new \"Superstar\" \nRacers are furious to Start & Here We GO!!!!!");
          break;
          case 3:
              System.out.println("Hi everyone here watching,Welcome to  \"KingsLynn 1800 Stock Race\"\nWe have new Racer "+userName+" may be new Superstar \nRacers are furious to Start \n Here We GO!!!!!");
          break;
          case 4:
              System.out.println("Recommended to have high stable Network \nHi "+userName+" please connect with your Friends and enjoy your Race");
          break;
          case 5:
              System.out.println("Hi everyone here watching \"\nWe have new Racer "+userName+" to take on custom101 \nHere We GO!!!!!");
              break;
           default:
              System.out.println("Choose a Valid Race to Shine");
      }
}
}





