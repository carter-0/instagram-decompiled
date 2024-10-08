package X;

/* renamed from: X.6tc  reason: invalid class name and case insensitive filesystem */
public final class C321126tc extends 0ng {
    public final /* synthetic */ C321016tR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C321126tc(C321016tR r3, int i) {
        super(134, i, false, false);
        this.A00 = r3;
    }

    public final void run() {
        C321016tR r5 = this.A00;
        C20997X8u x8u = r5.A0A;
        if (x8u != null) {
            try {
                r5.A06 = r5.A05 + ((long) x8u.EL4(r5.A02, C321016tR.A02(r5, x8u)));
                11Z.A02(r5.A0i);
            } catch (OutOfMemoryError unused) {
                r5.A0K = true;
                11Z.A02(r5.A0j);
            } catch (RuntimeException e) {
                r5.A0K = true;
                if (r5.A0B == AnonymousClass05K.A0C) {
                    11Z.A02(r5.A0j);
                    return;
                }
                throw e;
            }
        }
    }
}
