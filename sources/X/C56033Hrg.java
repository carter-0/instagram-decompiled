package X;

/* renamed from: X.Hrg  reason: case insensitive filesystem */
public final class C56033Hrg {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C3022462f A03;

    public final C56100Hsn A00(int i) {
        return new C56100Hsn(HRB.A00(this.A03, i), i, 1);
    }

    public C56033Hrg(C3022462f r1, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SelectionInfo(id=");
        A1A.append(1);
        A1A.append(", range=(");
        int i = this.A02;
        A1A.append(i);
        A1A.append('-');
        C3022462f r1 = this.A03;
        A1A.append(HRB.A00(r1, i));
        A1A.append(',');
        int i2 = this.A00;
        A1A.append(i2);
        A1A.append('-');
        A1A.append(HRB.A00(r1, i2));
        A1A.append("), prevOffset=");
        return C51975G9x.A0j(A1A, this.A01);
    }
}
