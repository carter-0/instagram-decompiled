package X;

public final class INS implements C13753TgP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LVB A01;

    public final void DXi(C390949s6 r1, C390949s6 r2) {
    }

    public INS(LVB lvb, long j) {
        this.A00 = j;
        this.A01 = lvb;
    }

    public final void DXb(long j) {
        C55570Hjq hjq;
        if (j >= Math.min(this.A00, 3000) && (hjq = this.A01.A04) != null) {
            I04 i04 = hjq.A00;
            LVB lvb = i04.A01;
            if (lvb != null) {
                lvb.A00 = false;
                lvb.A02.A05();
            }
            i04.A00 = (i04.A00 + 1) % 4;
            I04.A00(i04);
        }
    }
}
