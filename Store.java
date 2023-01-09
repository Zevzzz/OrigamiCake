
public class Store {
  public static void main(String[] args) {
    int x = 1000;
    Cookie yummyCookie = new Cookie("vanilla", 1.3, 0);

    System.out.println(yummyCookie); 

    Cookie yummyCookie1 = Cookie.makeCookie("vanilla", 0, 0);
    System.out.println(yummyCookie1);
    Cookie yummyCookie2 = Cookie.makeCookie("vanilla", 0, 0);
    System.out.println(yummyCookie2);
    Cookie yummyCookie3 = Cookie.makeCookie("vanilla", 0, 0);
    System.out.println(yummyCookie3);
    System.out.println(yummyCookie.randomCookie(yummyCookie1));
    
    System.out.println("- - - - - - - - - - - - -");
    System.out.println(yummyCookie.randomCookie(yummyCookie1).toString());
    // System.out.println(yummyCookie.randomCookie(yummyCookie1).length());


  }

  /*
   * Cake chocolateCake = new Cake(); // it will find the constructor in the Cake
   * class and run it
   * System.out.println("chocolateCake: " + chocolateCake);
   * 
   * 
   * //chocolateCake.print();
   * 
   * 
   * 
   * Cake letsMakeACake = new Cake(4);
   * //letsMakeACake.print();
   * System.out.println("With object" + chocolateCake.getOnePlusOne());
   * System.out.println("Without object" + Cake.getOnePlusOne());
   * 
   * Cookie yummyCookie = new Cookie("vanilla", 1.3 , 0);
   * yummyCookie.smashCookie();
   * yummyCookie.showStatus();
   * System.out.println(yummyCookie);
   * 
   * Cake whereIsMyCake = chocolateCake;
   * System.out.println("whereIsMyCake: " + whereIsMyCake);
   * 
   * chocolateCake = null;
   * whereIsMyCake = null;
   * System.out.println("chocolateCake: " + chocolateCake);
   * System.out.println("whereIsMyCake: " + whereIsMyCake);
   * chocolateCake = whereIsMyCake;
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * System.out.println("The flavor of the cookie is: " +
   * yummyCookie.getFlavor()+".");
   * String lastFlavor = yummyCookie.getFlavor();
   * System.out.println("What is stored in lastFlavor? It is... " + lastFlavor +
   * "!");
   * 
   * lastFlavor = "chocolate"; // this will not change the flavor of yummyCookie
   */

}

/*
 * new Cake();
 * new Cake();
 * 
 * new Cake(6); // it will find the constructor in Cake class with an INT and
 * run it
 * 
 * new Cake(1.5); // it will find the constructor with a DOUBLE and run it
 * 
 * new Cake(4, 5); // passing in the actual parameters of 4 and 5
 * 
 * new Cookie(3);
 */
