public class Motor1841720065Rifqie{
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan += 5*20;
        }
        else{
            System.out.println("Engine off, no increases from speed");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Engine still off, no decreases from speed");
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak ON");
        }
        else{
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan " +kecepatan+"\n");
    }
}