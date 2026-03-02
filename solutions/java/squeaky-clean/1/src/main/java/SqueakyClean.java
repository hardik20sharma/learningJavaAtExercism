class SqueakyClean {
    static String clean(String identifier) {

        char[] s = identifier.toCharArray();
        
        StringBuilder builder = new StringBuilder();
        String res = "";

        for(int i = 0; i < s.length; i++) {
            if(Character.isWhitespace(s[i]))
                builder.append('_');
            else if(s[i] == '-' && i < (s.length - 1) && Character.isLowerCase(s[i+1]))
                s[i+1] = Character.toUpperCase(s[i+1]);
            else if(s[i] == '4')
                builder.append('a');
            else if(s[i] == '3')
                builder.append('e');
            else if(s[i] == '0')
                builder.append('o');
            else if(s[i] == '1')
                builder.append('l');
            else if(s[i] == '7')
                builder.append('t');
            else if( Character.isLetter(s[i]) )
                builder.append(s[i]);
        }

        return builder.toString();
    }
}
