package X;

/* renamed from: X.Qyi  reason: case insensitive filesystem */
public final class C8645Qyi extends C12614Szy {
    public final C12614Szy A00;
    public final C12614Szy A01;

    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return A09(((Character) obj).charValue());
    }

    public C8645Qyi(C12614Szy szy, C12614Szy szy2) {
        this.A00 = szy;
        szy2.getClass();
        this.A01 = szy2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CharMatcher.or(");
        A1A.append(this.A00);
        Pxe.A1Y(A1A);
        return Pxg.A0q(this.A01, A1A);
    }
}
