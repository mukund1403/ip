package MassimoBoiException;

public class noDueDate extends DeadlineException{
    @Override
    public void errorMessage(){
        System.out.println("No due date mentioned! After your description type /by {date}");
    }
}