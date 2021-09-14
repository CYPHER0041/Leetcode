class Solution {
    public String reverseOnlyLetters(String s) {
            int pointer_1=0;
            char temp1;
            int pointer_2=s.length()-1;
            char [] letters=s.toCharArray();
            while(pointer_1<pointer_2)
            {
                    if(Character.isLetter(letters[pointer_1])&&Character.isLetter(letters[pointer_2]))
                    {
                            temp1=letters[pointer_1];
                            letters[pointer_1]=letters[pointer_2];
                            letters[pointer_2]=temp1;
                            pointer_1++;
                            pointer_2--;
                    }
                    else if(!Character.isLetter(letters[pointer_1]))
                            pointer_1++;
                    else
                            pointer_2--;
}
           String result=new String(letters);
            return result;
        
    }
}
