package X;

/* renamed from: X.R9v  reason: case insensitive filesystem */
public final class C8794R9v extends 0ng {
    public final /* synthetic */ R98 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8794R9v(R98 r98) {
        super(1537081393, 3, false, false);
        this.A00 = r98;
    }

    public final void run() {
        R98 r98 = this.A00;
        synchronized (r98) {
            if (!r98.A00) {
                r98.A00 = true;
                r98.A01.cancel();
            }
        }
    }
}
