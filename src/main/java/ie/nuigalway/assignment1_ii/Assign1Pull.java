/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.assignment1_ii;
import ie.nuigalway.assignment1.*;
import java.util.ArrayList;
import org.joda.time.LocalDate;
/**
 *
 * @author riogh_000
 */
public class Assign1Pull {
    
    public static void main(String atgs[]){
            
        Student stu1 = new Student("Samuel Jones", 22, 15358888, "17/8/1996", "4BP1");
        Student stu2 = new Student("Molly Burke", 23, 15358557, "26/2/1995", "4BP1");
        Student stu3 = new Student("Eoin Farnin", 23, 15358557, "26/2/1995", "4BP1");
        Student stu4 = new Student("Eibhin Smith", 25, 15387188, "17/8/1993", "4BG1");
        Student stu5 = new Student("josh Flannery", 21, 19996388, "17/8/1997", "4BG1");
        Student stu6 = new Student("James Murphy", 19, 15456825, "17/8/1999", "4BG1");

        //ArrayList for students of 4BP1
        ArrayList<Student> stuArrBP = new ArrayList<Student>();
        stuArrBP.add(stu1);
        stuArrBP.add(stu2);
        stuArrBP.add(stu3);

        //ArrayList for students of 1RT1
        ArrayList<Student> stuArrBG = new ArrayList<Student>();
        stuArrBG.add(stu4);
        stuArrBG.add(stu5);
        stuArrBG.add(stu6);
    
        //4BP1 modules
        Modules SWEng = new Modules("Software Engineering", "CT417", stuArrBP);
        Modules Telecomms = new Modules("telecommunications Software Engineering", "EE453", stuArrBP);
        Modules DSP = new Modules("Digital Signal Processing", "EE445", stuArrBP);
        Modules ML = new Modules("Machine Learning and Data Mining", "CT475", stuArrBP);
        Modules SoC = new Modules("System on Chip Design", "EE451", stuArrBP);
        
        //4BG1 Modules
        Modules CompM = new Modules("Computer Methods", "BME402", stuArrBG);
        Modules BioMech = new Modules("Biomechanics", "BME400", stuArrBG);
        Modules MImplant = new Modules("Medical Implant and Device Design", "BME403", stuArrBG);
        Modules Thermo = new Modules("Thermo and Heat Transfer", "ME322", stuArrBG);
        Modules TE = new Modules("Tissue Engineering", "BME405", stuArrBG);
        
        //creating module arraylist for BP
        ArrayList<Modules> modulesBP = new ArrayList<Modules>();
        modulesBP.add(SWEng);
        modulesBP.add(Telecomms);
        modulesBP.add(DSP);
        modulesBP.add(ML);
        modulesBP.add(SoC);
        
        //creating module arraylist for BG
        ArrayList<Modules> modulesBG = new ArrayList<Modules>();
        modulesBG.add(CompM);
        modulesBG.add(BioMech);
        modulesBG.add(MImplant);
        modulesBG.add(Thermo);
        modulesBG.add(TE);
        
        //Course dates
        LocalDate start = new LocalDate(2018,9,10);
        LocalDate endBP = new LocalDate(2019,5,20);
        LocalDate endBG = new LocalDate(2019,5,23);
        
        //courses
        CourseProgramme BP = new CourseProgramme("Electronic and Computer Engineering", modulesBP, start, endBP);
        CourseProgramme BG = new CourseProgramme("Biomedical Engineering", modulesBG, start, endBG);
        
        BP.ToString();
        BG.ToString();
    }
}
