import java.util.Scanner;

public class Binaryword {
    private char letter; 
    private boolean vowelFlag;   
    private int vowelCount = 0; 
    private int consonantCount = 0;

    // individual counters for each letter
    private int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0;
    private int k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0;
    private int u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

    Scanner keyboard = new Scanner(System.in);

    // Return the alphabet ID and increment counters
    public int idcheck(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a': a++; return 1;
            case 'b': b++; return 2;
            case 'c': c++; return 3;
            case 'd': d++; return 4;
            case 'e': e++; return 5;
            case 'f': f++; return 6;
            case 'g': g++; return 7;
            case 'h': h++; return 8;
            case 'i': i++; return 9;
            case 'j': j++; return 10;
            case 'k': k++; return 11;
            case 'l': l++; return 12;
            case 'm': m++; return 13;
            case 'n': n++; return 14;
            case 'o': o++; return 15;
            case 'p': p++; return 16;
            case 'q': q++; return 17;
            case 'r': r++; return 18;
            case 's': s++; return 19;
            case 't': t++; return 20;
            case 'u': u++; return 21;
            case 'v': v++; return 22;
            case 'w': w++; return 23;
            case 'x': x++; return 24;
            case 'y': y++; return 25;
            case 'z': z++; return 26;
            default: return 0;
        }
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public void vowelChecker(){
        vowelFlag = "aeiouAEIOU".indexOf(letter) != -1;
    }

    public void OHCWTB(){ // One Hundred Common Words To Binary
        System.out.println("How many words do you want to convert to binary?");
        int response = keyboard.nextInt();
        keyboard.nextLine(); // consume leftover newline

        for(int j = 0; j < response; j++){   
            System.out.println("Enter a word or sentence:");
            String word = keyboard.nextLine();
            System.out.println("Binary + IDs: ");
            for (int i = 0; i < word.length(); i++) {
    setLetter(word.charAt(i));
    vowelChecker();

    // build binary string
    if (vowelFlag) {
        System.out.print("1");
        vowelCount++;
    } else {
        System.out.print("0");
        if (!(letter == ' ' || letter == '.' || letter == ',' || 
              letter == '!' || letter == '?')) {
            consonantCount++;
        }
    }
    }
    System.out.println(); // move to next line

    for (int i = 0; i < word.length(); i++) {
    System.out.print(idcheck(word.charAt(i)) + " ");
    }
System.out.println();

        }
        System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
        System.out.println("letter counts: ");
        System.out.println("a: " + a + "| b: " + b + "| c: " + c + "| d: " + d + "| e: " + e + 
                           "| f: " + f + "| g: " + g + "| h: " + h + "| i: " + i + "| j: " + j +
                           "| k: " + k + "| l: " + l + "| m: " + m + "| n: " + n + "| o: " + o +
                           "| p: " + p + "| q: " + q + "| r: " + r + "| s: " + s + "| t: " + t +
                           "| u: " + u + "| v: " + v + "| w: " + w + "| x: " + x + "| y: " + y +
                           "| z: " + z);
    }

    public static void main(String[] args){
        Binaryword bw = new Binaryword();
        bw.OHCWTB();
    }
}