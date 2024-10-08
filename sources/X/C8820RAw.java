package X;

/* renamed from: X.RAw  reason: case insensitive filesystem */
public final class C8820RAw extends V4Q {
    public final C12614Szy A00 = C8637Qya.A00();

    public final Integer A00(String str) {
        0qQ.A0B(str, 0);
        int A0C = Pxj.A0C(C12614Szy.A03(this.A00, str));
        if (A0C < 2 || A0C > 10) {
            return AnonymousClass05K.A01;
        }
        return AnonymousClass05K.A00;
    }

    public final String A01(String str) {
        0qQ.A0B(str, 0);
        String A03 = C12614Szy.A03(this.A00, str);
        if (Pxj.A0C(A03) > 10) {
            return C51967G9n.A0q(A03, 0, 10);
        }
        return A03;
    }
}
