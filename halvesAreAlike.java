class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        String count1=s.substring(0,mid);
        String count2=s.substring(mid);
        return count(count1)==count(count2);
    }
    public int count(String s){
        int c=0;
        for(char word:s.toCharArray()){
            if(word=='a' || word=='e' ||word=='i' ||word=='o' ||word=='u' ||word=='A' ||word=='E' ||word=='I' ||word=='O' ||word=='U'){
                c++;
            }
        }
            return c;
    }
}
