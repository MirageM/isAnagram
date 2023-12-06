class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> d1 = new HashMap<>();
        Map<Character, Integer> d2 = new HashMap<>();
        for(char c: s.toCharArray()){
            d1.put(c, d1.getOrDefault(c, 0) + 1);
        }
        for(char c: t.toCharArray()){
            d2.put(c, d2.getOrDefault(c, 0) + 1);
        }
        return d1.equals(d2);
    }
}