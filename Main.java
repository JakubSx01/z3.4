import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int silnia=scan.nextInt();
    int wyniksilni=1;
    for(int i=2;i<=silnia;i++){
        wyniksilni*=i;
        System.out.println("wynik silni to:"+wyniksilni);
    }
    
  }
}