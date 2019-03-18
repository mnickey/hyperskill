//  The (un)-ordered sequence 
// https://hyperskill.org/learn/step/2734

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        boolean asc = false;
        boolean desc = false;
        for (int i = 0; i < str.length - 2; i++) {
            if (Integer.parseInt(str[i]) >= Integer.parseInt(str[i + 1]))
            {
                asc = true; continue;
            } else {
                asc = false;
                break;
            }
        }
        for (int i = 0; i < str.length - 2; i++)
        {
            if (Integer.parseInt(str[i]) <= Integer.parseInt(str[i + 1]))
            {
                desc = true;
                continue;
            } else {
                desc = false;
                break;
            }
        }
        
        if (str.length <= 1) {
            System.out.println(true);
        } else if (asc || desc) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        
    }
}
