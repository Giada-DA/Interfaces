public class Professor extends CollegePerson implements ITeachingPerson{
    @Override
    public void teachToOtherPeople() {
        System.out.println("I am a teacher");
    }
    public String teachingSubject;
    public void teach (){
        this.goToCollege();
        System.out.println("The professor: " + name + " " + surname + ", " + collegeID + ", " + teachingSubject);
    }
}