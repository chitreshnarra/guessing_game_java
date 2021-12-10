public class guessgame {
    Player p1 = new Player();//itss like int x = 5
    Player p2= new Player();
    Player p3= new Player();

    public void startGame(){
        
        int guessp1 =0;
        int guessp2 =0;
        int guessp3 =0;

        int targetnum = (int)(Math.random()*10);
        System.out.println(targetnum);
        
        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;
        while (true){
            p1.guess();//we are calling the functions of our classes
            p2.guess();
            p3.guess();
            
            guessp1 = p1.num;//we are accessing instance variables
            guessp2 = p2.num;
            guessp3 = p3.num;
            
            if (guessp1 == targetnum){
                p1isright = true;

            }
            if (guessp2==targetnum){
                p2isright = true;
            }
            if (guessp3== targetnum){
                p3isright=true;
            }
            if (p1isright||p2isright||p3isright){//the operator '||' means or 
                System.out.println("we have a winner!");
                break;
            }
            else{
                System.out.println("the players will try again");
            }
        }    
    }
    
}
