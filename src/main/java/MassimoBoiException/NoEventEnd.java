package MassimoBoiException;

public class NoEventEnd extends EventException{
    @Override
    public void errorMessage(){
        System.out.println("No end date mentioned! After your /from {date}, type /to {date}");
    }
}