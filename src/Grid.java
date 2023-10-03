public class Grid {

    private Player player;







    public void baseGrid8(Player tile8){
        this.player = tile8;
        System.out.println("""
                      |     |    
                      |     |   
                 _____|_____|_____
                      |     |    
                      |     |  
                 _____|_____|_____
                      |     |       
                      |""" + " " + " "  +  player.getXo()+  """ 
                  | 
                     |     |
                
                """);
    }
    public void baseGrid9(Player nine9) {
        this.player = nine9;
        System.out.println("""
                      |     |    
                      |     |   
                 _____|_____|_____
                      |     |    
                      |     |  
                 _____|_____|_____
                      |     |       
                      |     |   """ + " " + player.getXo() + """
                      
                     |     |
                """);
    }

}
