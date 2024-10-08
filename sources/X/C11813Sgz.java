package X;

/* renamed from: X.Sgz  reason: case insensitive filesystem */
public final class C11813Sgz implements C13519Tbo {
    public final QGY A00;
    public final C13765Tgd A01;
    public final C13765Tgd A02;
    public final String A03;
    public final boolean A04;

    public final C13687Tf4 Ezs(S7N s7n, Q6Y q6y, C11796Sgi sgi) {
        return new C11788Sga(q6y, this, sgi);
    }

    public C11813Sgz(QGY qgy, C13765Tgd tgd, C13765Tgd tgd2, String str, boolean z) {
        this.A03 = str;
        this.A01 = tgd;
        this.A02 = tgd2;
        this.A00 = qgy;
        this.A04 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RectangleShape{position=");
        A1A.append(this.A01);
        A1A.append(", size=");
        return Pxg.A0p(this.A02, A1A);
    }
}
