import java.util.*;
@SuppressWarnings("serial")
public class PrintingArrayData extends Exception{
	public PrintingArrayData(String msg) {
		super(msg);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try (s;){
			System.out.print("ENTER THE NUMBER OF ELEMENT YOU WANT TO ADD :");
			int n=s.nextInt();
			Integer al[]=new Integer[n];
			for (int i=0;i<al.length;i++) {
				System.out.print("ENTER THE ELEMENT :");
				al[i]=s.nextInt();
			}
			System.out.println("======PRINTING USING OLD FOR LOOP=====");
			for (int i=0;i<al.length;i++) {
				System.out.print(al[i]+" ," );
			}
			System.out.println("\n======PRINTING USING EXTENDED FOR=====");
			for (int k:al) {
				System.out.print(k+" ," );
			}
			System.out.println("\n======PRINTING USING SPECIAL ITERATOR=====");
			Spliterator<Integer> sp=Arrays.spliterator(al);
			sp.forEachRemaining((p)->
			{
				System.out.print(p+",");
			});
			System.out.println("\n======ELEMENTS IN ASCENDING ORDER=====");
			for (int k:al) {
				System.out.print(k+" ," );
			}
		}catch(InputMismatchException ime) {
			System.out.println("PLEASE ENTER THE NUMBERS ONLY...");	
		}
		catch (Exception e)
		{
			System.out.println("PLEASE ENTER THE NUMBERS ONLY...");
			System.out.println(e.getMessage());
		}
		
	}

}
