package X;

/* renamed from: X.Sh0  reason: case insensitive filesystem */
public final class C11814Sh0 implements C13519Tbo {
    public final QGY A00;
    public final QGY A01;
    public final QGY A02;
    public final Integer A03;
    public final boolean A04;

    public final C13687Tf4 Ezs(S7N s7n, Q6Y q6y, C11796Sgi sgi) {
        return new C11783SgV(this, sgi);
    }

    public C11814Sh0(QGY qgy, QGY qgy2, QGY qgy3, Integer num, boolean z) {
        this.A03 = num;
        this.A02 = qgy;
        this.A00 = qgy2;
        this.A01 = qgy3;
        this.A04 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Trim Path: {start: ");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(443));
        A1A.append(this.A00);
        A1A.append(", offset: ");
        return C66582MXn.A0v(this.A01, A1A);
    }
}
