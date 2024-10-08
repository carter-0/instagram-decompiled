package X;

/* renamed from: X.IiU  reason: case insensitive filesystem */
public final class C57913IiU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C234422xq A02;

    public C57913IiU(C234422xq r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        float f;
        C234422xq r3 = this.A02;
        1Xj A002 = C234422xq.A00(r3);
        if (this.A00 == 24) {
            if (!r3.A08.isPlaying() && A002 != null) {
                AnonymousClass4P2 r0 = (AnonymousClass4P2) r3.A09.get(A002);
                if (r0 != null) {
                    f = r0.A00;
                } else {
                    f = 0.0f;
                }
                if (C234422xq.A07(r3, f) && !AnonymousClass3ZJ.A0D(r3.A06, A002)) {
                    C234422xq.A05(A002, r3);
                }
            }
        } else if (this.A01 == 0 && A002 != null) {
            C234422xq.A04(A002, r3);
        }
    }
}
