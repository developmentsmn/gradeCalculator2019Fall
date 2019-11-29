package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

class Grades {

    HashMap< String, ArrayList<Double> > rubric = new HashMap<String, ArrayList<Double> >();
    HashMap< String, ArrayList<Double> > grades = new HashMap<String, ArrayList<Double> >();
    String schoolCourse = "";

    void addRubric(String key, Double percentage){

        ArrayList<Double> gradePortion = new ArrayList<Double>();
        gradePortion.add(percentage);
        rubric.put(key, gradePortion);
    }

    void readGrades() throws Exception{

        File file = new File("/Users/salvadormedinanava/Desktop/2019_fall/GradesCalculator/src/com/company/InfSecGrades.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\r,\n");

        String typeOfGrade = "";
        double gradeWeith = 0.0;

        boolean changeGradeType = true;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] tokens = line.split(",");

//            if(!changeGradeType){
//
//
//
//            }

            if (changeGradeType){
                typeOfGrade = tokens[0];
                gradeWeith = Double.parseDouble(tokens[1]);
                System.out.println(38.0/gradeWeith);
                changeGradeType = false;
            }

            if (tokens.length == 1){
                changeGradeType = true;
            }



        }

    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Choose Option:");
        System.out.println("(1) Inf Sec");
        System.out.println("(2) Intro AI");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();

        Grades grades = new Grades();

        if (option == 1){
            grades.schoolCourse = "Inf Sec Grades";
            grades.addRubric("Lesser Labs", 14.0);
            grades.addRubric("Main Labs", 22.0);
            grades.addRubric("CTF Lab", 11.0);
            grades.addRubric("CTF Write-up", 4.0);
            grades.addRubric("Reading Assignments", 15.0);
            grades.addRubric("Exams", 30.0);
            grades.addRubric("Presentation & Class Participation", 4.0);

            grades.readGrades();


        }
        else if (option == 2){
            grades.schoolCourse = "Intro AI Grades";
            grades.addRubric("Exams", 50.0);
            grades.addRubric("Assignments", 50.0);
        }



	// write your code here
    }
}
