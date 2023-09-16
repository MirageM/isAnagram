public class AnotherAnagram{
    public static boolean isAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        int[] dict1 = new int[26];
        int[] dict2 = new int[26];
        for(char c : word1.toCharArray()){
            dict1[c - 'a']++;
        }
        for(char c : word2.toCharArray()){
            dict2[c - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(dict1[i] != dict2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        boolean flag = isAnagram("listen", "silent");
        System.out.println(flag);
    }
    
}