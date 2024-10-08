package X;

/* renamed from: X.DiV  reason: case insensitive filesystem */
public abstract class C46650DiV {
    public static boolean A00(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt < 9 || (charAt > 13 && (charAt < ' ' || charAt > '~'))) {
                return true;
            }
        }
        return false;
    }
}
