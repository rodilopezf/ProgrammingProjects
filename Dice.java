import java.util.*;

public class Dice {
public static void main (String arg[]) {

Scanner scan= new Scanner(System.in);
Random gen = new Random( 6 );
int p1,p2,input;
p1=0;
p2=0;


while (p1<101||p2<101) {

System.out.print("Player 1 Press anything to Roll the dice. whoever gets 100 first wins.");
input=scan.nextInt();
p1=gen.nextInt(6)+p1+1;
System.out.printf("%s\n%10s%10s\n%10d%10d\n", "Current Scores", "Player 1", "Player 2", p1,p2);
if(p1>99&&p2>99) {
System.out.println("tie");
return;
} else if(p1>99) {
System.out.println("Player 1 Wins");
return;
} else if (p2>99) {
System.out.println("Player 2 Wins");
return;
}

System.out.println();

System.out.print("Player 2 Press anything to Roll the dice");
input=scan.nextInt();
p2=gen.nextInt(6)+p2+1;
System.out.printf("%s\n%10s%10s\n%10d%10d\n", "Current Score", "Player 1", "Player 2", p1,p2);
if(p1>99&&p2>99) {
System.out.println("tie");
return;
} else if(p1>99) {
System.out.println("Player 1 Wins");
return;
} else if (p2>99) {
System.out.println("Player 2 Wins");
return;
}

}








}
}