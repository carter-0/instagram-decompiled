package X;

public final class NSQ extends 0ng {
    public final /* synthetic */ OO3 A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSQ(OO3 oo3, Long l, String str, boolean z) {
        super(1497980138, 3, false, false);
        this.A00 = oo3;
        this.A03 = z;
        this.A02 = str;
        this.A01 = l;
    }

    public final void run() {
        OO3 oo3 = this.A00;
        if (oo3.A07 != null) {
            C69495Nmd nmd = C69495Nmd.DWELL;
            boolean z = this.A03;
            oo3.A02(nmd, this.A01, this.A02, z);
        }
    }
}
