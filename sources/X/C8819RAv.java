package X;

/* renamed from: X.RAv  reason: case insensitive filesystem */
public final class C8819RAv extends V4Q {
    public final C12614Szy A00 = C8637Qya.A00();

    public final Integer A00(String str) {
        0qQ.A0B(str, 0);
        int A0C = Pxj.A0C(C12614Szy.A03(this.A00, str));
        if (A0C == 7 || A0C == 8) {
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public final String A01(String str) {
        0qQ.A0B(str, 0);
        String A03 = C12614Szy.A03(this.A00, str);
        if (Pxj.A0C(A03) > 8) {
            return C51967G9n.A0q(A03, 0, 8);
        }
        return A03;
    }
}
