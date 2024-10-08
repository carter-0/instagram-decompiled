package X;

/* renamed from: X.Ljq  reason: case insensitive filesystem */
public final class C64890Ljq implements 0mK {
    public final /* synthetic */ LFC A00;
    public final /* synthetic */ boolean A01;

    public C64890Ljq(LFC lfc, boolean z) {
        this.A00 = lfc;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        LFH lfh = (LFH) obj;
        0qQ.A0B(lfh, 0);
        MU4 mu4 = this.A00.A00;
        if (mu4 != null) {
            boolean z = this.A01;
            int length = lfh.A01.length();
            if (z) {
                if (length > 2) {
                    return;
                }
            } else if (length <= 2) {
                return;
            }
            if (length == 0) {
                mu4.DBw();
            } else {
                mu4.DUA(lfh);
            }
        }
    }
}
