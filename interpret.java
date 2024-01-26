class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<command.length()){
            switch(command.charAt(i)){
                case 'G':{
                    sb.append("G");
                    i++;
                    break;
                }
                case '(':{
                    if(command.charAt(i+1)==')'){
                        sb.append("o");
                        i+=2;
                        break;
                    }else{
                        sb.append("al");
                        i+=4;
                        break;
                    }
                    
                }
            }
        }
        return sb.toString();
    }
}
