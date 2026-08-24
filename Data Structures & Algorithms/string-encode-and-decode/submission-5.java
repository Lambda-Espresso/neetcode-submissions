class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length() + "#" + str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int len = str.length();
        int i = 0;
        while (i < len) {
            int strLen = str.charAt(i) - '0';
            while (++i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                strLen = strLen * 10 + (str.charAt(i) - '0');
            }
            list.add(str.substring(++i, i += strLen));
        }
        return list;
    }
}
