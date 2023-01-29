public class Test {
    public static void main(String[] args) {
        CollegePerson collegePerson = new CollegePerson();
        //istanzio le classi
        Student student = new Student();
        Professor professor = new Professor();
        Assistant assistant = new Assistant();

        System.out.println("---------------------");
        //assegno i valori alle variabili
        student.name = "Giovanni";
        student.surname = "Pascoli";
        student.collegeID = 912;
        student.academicYear = 2;

        professor.name = "Giosuè";
        professor.surname = "Carducci";
        professor.collegeID = 907;
        professor.teachingSubject = "Italian literature";

        assistant.name = "Helene";
        assistant.surname = "Dukas";
        assistant.collegeID = 982;
        assistant.isGoingToBeAPhD = true;

        //stampo i metodi acquisiti, poi le variabili
        student.studyAtHome();
        student.learn(student.name, student.surname, student.collegeID, student.academicYear);
        professor.teachToOtherPeople();
        professor.teach();
        assistant.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.learnAndTeach(assistant.name, assistant.surname, assistant.collegeID, assistant.isGoingToBeAPhD);
    }
}