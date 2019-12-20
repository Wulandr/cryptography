import java.util.Scanner;

/**
 * transpose
 */
public class transpose {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Baris\t: ");
        int b = in.nextInt();
        System.out.print("Kolom\t: ");
        int k = in.nextInt();

        System.out.println("Masukkan plain text :");
        String[][]plain = new String[b][k];
        for(int i = 0; i < b; i ++){
            for(int j = 0; j < k; j ++){
                plain[i][j]= in.next();
            }
        }
        System.out.print("Plain text : ");
        for(int i = 0; i < b; i ++){
            for(int j = 0; j < k; j ++){
                System.out.print(plain[i][j]);
            }
        }
        String[][]transpose = new String[k][b];
        for(int i = 0; i < b; i ++){
            for(int j = 0; j < k; j ++){
                transpose[i][j] = plain[j][i];
            }
        }
        System.out.print("\nCipher text : ");
        for(int i = 0; i < b; i ++){
            for(int j = 0; j < k; j ++){
            System.out.print(transpose[i][j]);
            }
        }
        for(int i = 0; i < b; i ++){
            for(int j = 0; j < k; j ++){
                transpose[i][j] = plain[i][j];
            }
        }
        System.out.print("\nPlain text : ");
        for(int i = 0; i < b; i ++){
            for(int j = 0; j < k; j ++){
                System.out.print(transpose[i][j]);
            }
        }
    }
}