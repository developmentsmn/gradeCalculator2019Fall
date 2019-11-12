package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Grades {

    HashMap< String, ArrayList<Integer> > rubric = new HashMap<String, ArrayList<Integer> >();

    void addRubric(String key, Integer percentage){

        ArrayList<Integer> gradePortion = new ArrayList<Integer>();
        gradePortion.add(percentage);
        rubric.put(key, gradePortion);
    }

}

public class Main {

    public static void main(String[] args) {

        System.out.println("Choose Option:");
        System.out.println("(1) Inf Sec");
        System.out.println("(2) Intro AI\n");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        Grades grades = new Grades();

        if (option == 1){
            grades.addRubric("Lesser Labs", 11);
            grades.addRubric("Main Labs", 22);
            grades.addRubric("CTF Lab", 11);
            grades.addRubric("CTF Write-up", 4);
            grades.addRubric("Reading Assignments", 15);
            grades.addRubric("Exams", 30);
            grades.addRubric("Presentation & Class Participation", 4);

            System.out.println(grades.rubric);
        }
        else if (option == 2){

        }



	// write your code here
    }
}
