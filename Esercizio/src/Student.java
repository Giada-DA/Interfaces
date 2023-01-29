public class Student extends CollegePerson implements ILearningPerson {
    @Override
    public void studyAtHome() {
        System.out.println("I am a student");
    }
    public int academicYear;
    public void learn(String name, String surname, int collegeID, int academicYear){
        this.goToCollege();
        System.out.println("The student: " + name + " " + surname + ", " + collegeID + ", " + academicYear);
    }
}
