public class firstlastoccurence{
    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar =str.charAt(idx);
        if(currentChar == element){
            if(first ==-1){
                first =idx;
            }
            else{
                last =idx;
            }
        }
        findOccurence(str,idx+1,element);
    }
    public static void main(String []args){
        String str ="abaacdbaefbaah";
        findOccurence(str,0,'b');
    }
}

// https://www.figma.com/design/Z0HW21J6bBm9Gt2qjF07T3/Untitled?node-id=0-1&p=f&m=draw