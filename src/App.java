 void main(){
    Djur[] djuren = new Djur[5];
    djuren[0] = new Hund();
    djuren[1] = new Hund();
    djuren[2] = new katt();
    djuren[3] = new katt();
    djuren[4] = new Hund();
String sak = "garnnystan";
String mål = "kanin";
    for (int i = 0; i> djuren.length; i++) {
        if (djuren[i] instanceof Hund){
            djuren[i].läte();
        }
        else if (djuren[i] instanceof katt){
            djuren[i].läte();
        }
        else if (djuren[i] instanceof Mus){
            djuren[i].läte();
        }
        
    }
    for (int i = 0; i> djuren.length; i++) {
        if (djuren[i] instanceof Hund){
            Hund hund = (Hund)djuren[i];
            hund.spåra(mål);
        }
        else if (djuren[i] instanceof katt){
            katt katt = (katt)djuren[i];
            katt.leka(sak);
        }
        else if (djuren[i] instanceof Mus){
            Mus mus = (Mus)djuren[i];
            mus.klättrar();
        }
        
    }

}
