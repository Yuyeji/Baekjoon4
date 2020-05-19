import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), cycle = 0, num = N;

        do{
            num = (num%10)*10 + (num/10 + num%10)%10;
            cycle++;
        }while(N != num);

        System.out.println(cycle);
    }
}