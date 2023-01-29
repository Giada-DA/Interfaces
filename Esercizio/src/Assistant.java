public class Assistant extends CollegePerson implements ITeachingPerson, ILearningPerson {
    @Override
    public void teachToOtherPeople() {
        System.out.println("I am an assistant (from -> ITeachingPerson)");
    }
    @Override
    public void studyAtHome() {
        System.out.println("I am an assistant (from -> ILearningPerson)");
    }
    public boolean isGoingToBeAPhD; //non ho idea di cosa vuol dire
    void learnAndTeach (String name, String surname, int collegeID, boolean isGoingToBeAPhD){
        this.goToCollege();
        System.out.println("The assistant: " + name + " " + surname + ", " + collegeID + ", " + isGoingToBeAPhD);
    }
}
