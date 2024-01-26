class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;int index;
        /* there are three variable in the list
        1.type 2.color 3.name 
        if rule key equals type then we check for index 1 so on*/
        if(ruleKey.equals("type")){
            index=0;
        }else if(ruleKey.equals("color")){
            index=1;
        }else{
            index=2;
        }
        for(List list: items){
            if(list.get(index).equals(ruleValue))   count++;
        }
        return count;
    }
}
