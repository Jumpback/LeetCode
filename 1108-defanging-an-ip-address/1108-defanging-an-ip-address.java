class Solution {
    public String defangIPaddr(String address) {
        String str;
         str=address.replace(".","[.]");
        // System.out.print(str);
       return str;
    }
}