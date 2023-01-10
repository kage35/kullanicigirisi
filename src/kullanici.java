import java.util.Scanner;
public class kullanici {
    public static void main(String[] args) {
        String userName,password,newpass;
        int deger;
        Scanner input=new Scanner(System.in);
        System.out.println("Kullanıcı adını giriniz");
        userName=input.nextLine();

        System.out.println("şifrenizi giriniz");
        password=input.nextLine();
        if (userName.equals("patika") && password.equals("java123"))
        {
            System.out.println("giriş başarılı");
        }
        else
        {
            System.out.println("giriş başarısız yeni şifre oluşturulsun mu \n 1-Evet\n 2-Hayır");
            deger=input.nextInt();
            if (deger==1)
            {
                System.out.println("yeni şifre giriniz");
                input.nextLine();
                newpass=input.nextLine();

                if (newpass.equals("java123"))
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else
                {
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else
            {
                System.out.println("şifreniz değiştirilmedi");
            }
        }
    }
}