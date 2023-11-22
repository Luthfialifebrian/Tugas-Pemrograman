import java.util.Scanner;

public class PersPanjangInput
{
   public static void main(String[] args)
   {
      /* declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? lebar = ??;								<-- dari raptor
      ?? keliling = ??;
      ?? luas = ??;
      ?? panjang = ??; */
      
	  Scanner sc = new Scanner(System.in);
	  
      //raptor_prompt_variable_zzyz = "inputkan nilai panjang"; <-- dari raptor
      //panjang = get???(raptor_prompt_variable_zzyz); 
	  int panjang = sc.nextInt();
	  
      //raptor_prompt_variable_zzyz = "inputkan nilai lebar"; <-- dari raptor
      //lebar = get???(raptor_prompt_variable_zzyz); 
	  int lebar = sc.nextInt();
	  
      int luas = panjang * lebar;
      int keliling = (panjang + lebar) * 2;
	  
      System.out.println("Panjang: "+panjang);
      System.out.println("Lebar: "+lebar);
      System.out.println("Luas: "+luas);
      System.out.println("Keliling: "+keliling);
   }
}
