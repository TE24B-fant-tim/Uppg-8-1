public class Hund extends Djur{

    public Hund(){
        super(20000, 5, true);
    }

     public void läte(){
        IO.println("woof");
    }


    public void spåra(String mål ){
        IO.println("Spårar " + mål);

    }


}
