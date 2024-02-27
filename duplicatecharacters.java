public class duplicatecharacters {
    public static void main(String[] args) {
        String string1 = "vinaykumarreddy";
        int count;
        char string[] = string1.toCharArray();
        System.out.println("Duplicate values in a given string: ");
        for(int i = 0; i<string.lenght; i++){
            count = 1;
            for(int j = i+1; j<string.length; j++) {
                if(string[i] == string[j] &&string[i] != '') {
                    count++;
                    string[j] = '0';
                }
            }
            if(count>1 && string[i]!='0')
            System.out.println(string[i]);
        }
    }
    
}
