class Solution {
    public boolean judgeCircle(String moves) {
        int lr=0;int ud=0;
         
      for (char ch : moves.toCharArray()) {
          if(ch=='L')   lr++;
          else if(ch=='R')  lr--;
          else if(ch=='U')  ud++;
          else  ud--;
        }
        return ud==0 && lr==0;
    }
}
