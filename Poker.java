import java.io.*;

public class Poker {

    public static void main(String args[]) throws IOException{
        int i,x;
        String str;
		
		System.out.println("�C���}�l!");
		System.out.println("");
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		do{  //�C���D�j��_�Y
			System.out.print("�п�JTOTEL(�Y�n�����{���п�J�Ʀr\"0\"):\t");
			str=buf.readLine();
			i=Integer.parseInt(str);
			
			if(i==0){
				break;
			}
			
			System.out.print("�п�J�X��:\t");
			str=buf.readLine();
			x=Integer.parseInt(str);
			
			switch (x){
				case 1:
					System.out.println("1���A�ʶR�W��\n"+(i/30));
				break;
				case 2:
					System.out.println("2���A�ʶR�W��\n"+(i/16));
				break;
				case 3:
					System.out.println("3���A�ʶR�W��\n"+(i/10));
				break;
				case 4:
					System.out.println("4���A�ʶR�W��\n"+(i/8));
				break;
				case 5:
					System.out.println("5���A�ʶR�W��\n"+(i/6));
				break;
				case 6:
					System.out.println("6���A�ʶR�W��\n"+(i/5));
				break;
				case 7:
					System.out.println("7���A�ʶR�W��\n"+(i/4));
				break;
				case 8:
					System.out.println("8���A�ʶR�W��\n"+(i/3.5f));
				break;
				case 9:
					System.out.println("9���A�ʶR�W��\n"+(i/3));
				break;
				case 10:
					System.out.println("10���A�ʶR�W��\n"+(i/2.5f));
				break;
				case 11:
					System.out.println("11���A�ʶR�W��\n"+(i/2.2f));
				break;
				case 12:
					System.out.println("12���A�ʶR�W��\n"+(i/2));
				break;
				case 13:
					System.out.println("13���A�ʶR�W��\n"+(i/1.8f));
				break;
				case 14:
					System.out.println("14���A�ʶR�W��\n"+(i/1.6f));
				break;
				case 15:
					System.out.println("15���A�ʶR�W��\n"+(i/1.4f));
				break;
			}
			
		}while(true); //�C���D�j��_��
		System.out.println("");
		System.out.print("�C������......"); //�C����������
    }
    
 
}
