package X;

/* renamed from: X.4tO  reason: invalid class name and case insensitive filesystem */
public abstract class C276474tO {
    public static int A00(String str) {
        int length;
        if (str == null || (length = str.length()) == 0 || str.offsetByCodePoints(0, 1) != length) {
            return -1;
        }
        return str.codePointAt(0);
    }
}
