public class Djur {
    double vikt;
    int energi;
    Boolean alive;

    int antaldjur;

    public Djur(double vikt, int energi, boolean alive ){
        this.vikt = vikt;
        this.energi = energi;
        this.alive = alive;
    }
    public void äta(int energi){
        energi+=1000;
    }
    public void spring(int energi, int vikt){
        String löp = IO.readln("hur mycket springer djuret");
        int meter = Integer.parseInt(löp);
        energi=energi-vikt*meter;

        if(energi <= 0){
            alive = false;
        }
    }
    public void läte(){
        IO.println("Djuret låter");
    }
    
}
