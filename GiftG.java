import java.util.*;

public class GiftG{

private Person list[];

	public GiftG(){
		Scanner scan=new Scanner(System.in);
		int numberofpeople=Integer.parseInt(scan.nextLine());
		list=new Person[numberofpeople];
		String line=scan.nextLine();
		String names[]=line.split(" ");
			for(int i=0;i<names.length;i++){
			    list[i]=new Person();
				list[i].name=names[i];
			}


		String line2=scan.nextLine();
		String words[]=line2.split(" ");
		String name=words[0];
		float spent=Float.parseFloat(words[1]);
			for(int i=0;i<list.length;i++){
				if(list[i].name.equals(name))
					list[i].spent=spent;
			}
		int numFriends=Integer.parseInt(words[2]);
		float cash=spent/numFriends;
			for(int i=0;i<numFriends;i++){
				String gifter=list[3+i].name;
				for(int j=0;j<list.length;j++){
					if(list[j].name.equals(gifter))
					list[j].amount=cash;
				}

			}
		for(int i=0;i<list.length;i++){
			System.out.println(list[i].name+ (list[i].amount-list[i].spent));
		}

	}


	public static void main(String args[]){
		new GiftG();
	}







}