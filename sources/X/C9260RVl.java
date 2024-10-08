package X;

/* renamed from: X.RVl  reason: case insensitive filesystem */
public abstract class C9260RVl {
    public static String A00(String str, boolean z) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (str.startsWith("/")) {
            A1A.append("file://");
        }
        A1A.append(str);
        if (z && !str.endsWith("/")) {
            A1A.append("/");
        }
        return A1A.toString();
    }
}
