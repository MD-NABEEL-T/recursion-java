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
            printComb(str,idx+1,combination+mapping.charAt(i));//("23",1,"d");("23",1,"de");("23",2,"def");
        }
    }

    public static void main(String []args){
        String str ="23";
        printComb(str,0,"");
    }
}