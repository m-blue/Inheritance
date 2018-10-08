package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Commercial\n2. Residential\n3. Done");
        System.out.println("Please select choices 1 - 3 ");
        boolean isValid = false;
        while (!isValid){
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    isValid = true;
                    Commercial();
                    break;
                case 2:
                    isValid = true;
                    Residential();
                    break;
                case 3:
                    isValid = true;
                    break;
                default:
                    System.out.println("Invalid Selection");
                    System.out.println();

            }
        }
    }

    // Asks the user for their customer and commercial information
    // Creates an instance of the commercial class
    static void Commercial(){
        Scanner comm = new Scanner(System.in);
        System.out.println("Enter the customer's name");
        String name = comm.nextLine();
        System.out.println("Enter customer's phone number");
        String phoneNumber = comm.nextLine();
        System.out.println("Enter customer's address");
        String address = comm.nextLine();
        System.out.println("Enter the amount of square footage");
        String sqrFt = comm.nextLine();
        double squareFootage = Double.parseDouble(sqrFt);
        Commercial commercial = new Commercial(name,phoneNumber,address,squareFootage);

        System.out.println("Enter the commercial name");
        commercial.setCommercialName(comm.nextLine());

        System.out.println("Is it a multi-property? (Enter (y)es or (n)o)");
        String answer = comm.nextLine();
        commercial.isMultiField(answer);

        commercial.CommercialRate(squareFootage);
    }

    // Asks the user for customer and Residential Information
    // Creates an instance of the residential class
    static void Residential(){
        Scanner res = new Scanner(System.in);
        System.out.println("Enter the customer's name");
        String name = res.nextLine();
        System.out.println("Enter customer's phone number");
        String phoneNumber = res.nextLine();
        System.out.println("Enter customer's address");
        String address = res.nextLine();
        System.out.println("Enter the amount of square footage");
        String foot = res.nextLine();
        double squareFootage = Double.parseDouble(foot);
        Residential residential = new Residential(name,phoneNumber,address,squareFootage);

        System.out.println("Is this a senior field? (Enter (y)es or (n)o)");
        String resAnswer = res.nextLine();
        residential.isSenior(resAnswer);
        residential.ResidentialRate(squareFootage);
    }
}
