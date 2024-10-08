package X;

/* renamed from: X.Hqs  reason: case insensitive filesystem */
public final class C55987Hqs {
    public long A00 = 0;
    public long A01 = 0;
    public boolean A02;
    public final 1Pi A03;
    public final String A04;

    public C55987Hqs(1Pi r4, String str) {
        boolean A1X = DbW.A1X(str);
        this.A04 = str;
        this.A03 = r4;
        this.A02 = A1X;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PositionState(id='");
        A1A.append(this.A04);
        A1A.append("', \nobjectType=");
        A1A.append(this.A03);
        A1A.append(", \ntotalVpvdTimeSpent=");
        A1A.append(this.A01);
        A1A.append(", \nrecentAbove50PctVisibleTime=");
        A1A.append(this.A00);
        A1A.append(", \nis50PctVisible=");
        return G9t.A1C(A1A, this.A02);
    }
}
