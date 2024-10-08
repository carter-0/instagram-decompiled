package X;

/* renamed from: X.3w7  reason: invalid class name and case insensitive filesystem */
public abstract class C256643w7 {
    public static String A00(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'A' || charAt > 'Z') {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static String A01(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'a' || charAt > 'z') {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }

    public static boolean A02(CharSequence charSequence, CharSequence charSequence2) {
        char c;
        int length = charSequence.length();
        if (charSequence != charSequence2) {
            if (length == charSequence2.length()) {
                int i = 0;
                while (i < length) {
                    char charAt = charSequence.charAt(i);
                    char charAt2 = charSequence2.charAt(i);
                    if (charAt == charAt2 || ((c = (char) ((charAt | ' ') - 'a')) < 26 && c == ((char) ((charAt2 | ' ') - 'a')))) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
