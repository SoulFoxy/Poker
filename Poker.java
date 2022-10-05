import java.io.*;

public class Poker {

    public static void main(String args[]) throws IOException{
        int i,x;
        String str;
		
		System.out.println("遊戲開始!");
		System.out.println("");
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		do{  //遊戲主迴圈_頭
			System.out.print("請輸入TOTEL(若要結束程式請輸入數字\"0\"):\t");
			str=buf.readLine();
			i=Integer.parseInt(str);
			
			if(i==0){
				break;
			}
			
			System.out.print("請輸入幾奧:\t");
			str=buf.readLine();
			x=Integer.parseInt(str);
			
			switch (x){
				case 1:
					System.out.println("1奧，購買上限\n"+(i/30));
				break;
				case 2:
					System.out.println("2奧，購買上限\n"+(i/16));
				break;
				case 3:
					System.out.println("3奧，購買上限\n"+(i/10));
				break;
				case 4:
					System.out.println("4奧，購買上限\n"+(i/8));
				break;
				case 5:
					System.out.println("5奧，購買上限\n"+(i/6));
				break;
				case 6:
					System.out.println("6奧，購買上限\n"+(i/5));
				break;
				case 7:
					System.out.println("7奧，購買上限\n"+(i/4));
				break;
				case 8:
					System.out.println("8奧，購買上限\n"+(i/3.5f));
				break;
				case 9:
					System.out.println("9奧，購買上限\n"+(i/3));
				break;
				case 10:
					System.out.println("10奧，購買上限\n"+(i/2.5f));
				break;
				case 11:
					System.out.println("11奧，購買上限\n"+(i/2.2f));
				break;
				case 12:
					System.out.println("12奧，購買上限\n"+(i/2));
				break;
				case 13:
					System.out.println("13奧，購買上限\n"+(i/1.8f));
				break;
				case 14:
					System.out.println("14奧，購買上限\n"+(i/1.6f));
				break;
				case 15:
					System.out.println("15奧，購買上限\n"+(i/1.4f));
				break;
			}
			
		}while(true); //遊戲主迴圈_尾
		System.out.println("");
		System.out.print("遊戲結束......"); //遊戲結束提示
    }
    
 
}
