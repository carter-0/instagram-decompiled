package X;

/* renamed from: X.VwV  reason: case insensitive filesystem */
public final class C18672VwV {
    public static int A00(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        C13989Tnp.A1T("Invalid layoutDirection: ", str);
        return -1;
    }

    public static int A01(String str) {
        if (str == null) {
            return 1;
        }
        if (!str.equals("balanced")) {
            return str.equals("simple") ? 0 : 1;
        }
        return 2;
    }
}
