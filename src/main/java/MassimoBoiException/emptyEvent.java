package MassimoBoiException;

public class emptyEvent extends EventException{
    @Override
    public void errorMessage(){
        System.out.println("Ma G! You got no description for event. Please re-add event with description.");
    }
}