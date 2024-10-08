package X;

/* renamed from: X.SNw  reason: case insensitive filesystem */
public abstract class C11340SNw {
    public final int A00;

    public String toString() {
        return A00(this.A00);
    }

    public C11340SNw(int i) {
        this.A00 = i;
    }

    public static String A00(int i) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("");
        A1A.append((char) ((i >> 24) & 255));
        A1A.append((char) ((i >> 16) & 255));
        A1A.append((char) ((i >> 8) & 255));
        return C51967G9n.A0r(A1A, (char) (i & 255));
    }

    public static void A01(int i, String str) {
        STH.A03("MetadataUtil", 002.A0R(str, A00(i)));
    }
}
