public class keyboardComb{
    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str,int idx,String combination){//("23",0,"");
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);//currchar = 2;
        String mapping = keypad[currChar - '0'];// mapping = keypad['2'-'0'] = keypad[2] = "def";
        for (int i=0;i<mapping.length();i++){
            printComb(str,idx+1,combination+mapping.charAt(i));

        }
    }

    public static void main(String []args){
        String str ="23";
        printComb(str,0,"");
    }
}

// printComb("23", 0, "")
// │
// ├── currChar = '2' → mapping = "def"
// │
// ├── for loop over "def"
// │   │
// │   ├── i=0 → 'd' → printComb("23", 1, "d")
// │   │       ├── currChar = '3' → mapping = "ghi"
// │   │       ├── for loop over "ghi"
// │   │       │
// │   │       ├── i=0 → 'g' → printComb("23", 2, "dg") → print "dg"
// │   │       ├── i=1 → 'h' → printComb("23", 2, "dh") → print "dh"
// │   │       └── i=2 → 'i' → printComb("23", 2, "di") → print "di"
// │   │
// │   ├── i=1 → 'e' → printComb("23", 1, "e")
// │   │       ├── currChar = '3' → mapping = "ghi"
// │   │       ├── for loop over "ghi"
// │   │       │
// │   │       ├── i=0 → 'g' → printComb("23", 2, "eg") → print "eg"
// │   │       ├── i=1 → 'h' → printComb("23", 2, "eh") → print "eh"
// │   │       └── i=2 → 'i' → printComb("23", 2, "ei") → print "ei"
// │   │
// │   └── i=2 → 'f' → printComb("23", 1, "f")
// │           ├── currChar = '3' → mapping = "ghi"
// │           ├── for loop over "ghi"
// │           │
// │           ├── i=0 → 'g' → printComb("23", 2, "fg") → print "fg"
// │           ├── i=1 → 'h' → printComb("23", 2, "fh") → print "fh"
// │           └── i=2 → 'i' → printComb("23", 2, "fi") → print "fi"
// │
// └── all done ✅
