class Solution {
    public String sortSentence(String s) {
        String[] arr=new String[s.split(" ").length];
        for(String ch:s.split(" ")){
            arr[ch.charAt(ch.length()-1)-'1']=ch.substring(0,ch.length()-1);
        }
        return String.join(" ",arr);
    }
}
