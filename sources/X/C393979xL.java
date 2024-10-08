package X;

/* renamed from: X.9xL  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393979xL {
    public static /* synthetic */ boolean A00(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }
}
