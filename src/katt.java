public class katt extends Djur{

    public katt(){
        super(3, 10000, false);

    }
    public void läte(){
        IO.println("miaou");
    }
    public void leka(String sak){
        IO.println("leker med " + sak);
    }

}
