package X;

/* renamed from: X.RVj  reason: case insensitive filesystem */
public abstract class C9258RVj {
    public static boolean A00(String str, String str2) {
        if (str == null || str.isEmpty() || str2.isEmpty()) {
            return false;
        }
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str2.indexOf(58);
        if (indexOf2 != -1) {
            str2 = str2.substring(0, indexOf2);
        }
        return str.equals(str2);
    }
}
