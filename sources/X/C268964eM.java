package X;

/* renamed from: X.4eM  reason: invalid class name and case insensitive filesystem */
public final class C268964eM {
    public static final C268974eN A00;
    public static final C268974eN A01;
    public static final C268974eN A02;
    public static final C268974eN A03;

    static {
        C268974eN r3 = new C268974eN("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=', 76, true);
        A00 = r3;
        A01 = new C268974eN(r3, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);
        A03 = new C268974eN(r3, "PEM", 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        A02 = new C268974eN("MODIFIED-FOR-URL", sb.toString(), 0, Integer.MAX_VALUE, false);
    }
}
