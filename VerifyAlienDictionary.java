package PhoneCoding;

import java.util.HashMap;
import java.util.Map;

public class VerifyAlienDictionary {
	
	 public static boolean isAlienSorted(String[] words, String order) {
	        
	        Map<Character,Integer> map = new HashMap<>();
	        for(int i =0 ;i <order.length();i++){
	            map.put(order.charAt(i),i);
	        }
	        for(int i =0 ;i<words.length-1;i++){
	            String first = words[i];
	            String second = words[i+1];
	            if(!helper(first,second,map)){
	                return false;
	            }
	        }
	       return true; 
	    }
	    
	    public static boolean helper(String f, String s, Map<Character,Integer> map){
	        int i1 =0;
	        int i2 = 0;
	        while(i1<f.length() && i2<s.length()){
	            if(f.charAt(i1)!=s.charAt(i2)){
	               if( map.get(f.charAt(i1))<map.get(s.charAt(i2))){
	                   return true;
	               }else{
	                   return false;
	               }
	            }
	            i1++;
	            i2++;
	        }
	        if(f.length()>s.length()){
	            return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		String[] words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		System.out.println(isAlienSorted(words,order));

	}

}
