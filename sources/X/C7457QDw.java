package X;

/* renamed from: X.QDw  reason: case insensitive filesystem */
public final class C7457QDw extends C11717SfE {
    public int A00 = -1;
    public int A01 = -1;
    public final int A02;
    public final /* synthetic */ C12342Sro A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7457QDw(C13509Tba tba, C12342Sro sro, int i) {
        super(tba);
        this.A03 = sro;
        this.A02 = i;
    }

    public final String toString() {
        return String.format("trackId: %s, mainTrackIndex: %s, compatibilityTrackIndex: %s", Pxf.A1Y(Integer.valueOf(this.A02), Integer.valueOf(this.A01), this.A00));
    }

    public final void EJm(S4h s4h, int i, int i2, int i3, long j) {
        int i4 = i & -536870913;
        int i5 = this.A00;
        if (i5 != -1) {
            this.A03.A0H.addLast(Integer.valueOf(i5));
        }
        int i6 = this.A01;
        C11366SPh.A02(JTQ.A1O(i6, -1));
        this.A03.A0H.addLast(Integer.valueOf(i6));
        super.EJm(s4h, i4, i2, i3, j);
    }
}
