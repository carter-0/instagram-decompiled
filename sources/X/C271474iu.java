package X;

/* renamed from: X.4iu  reason: invalid class name and case insensitive filesystem */
public final class C271474iu implements Runnable {
    public final /* synthetic */ 1R0 A00;

    public C271474iu(1R0 r1) {
        this.A00 = r1;
    }

    public final void run() {
        try {
            1R0.A02(this.A00, "token_expired", false);
        } catch (Exception e) {
            0wb.A06("IgZeroTokenManager", Pxd.A00(68), e);
        }
    }
}
