package X;

/* renamed from: X.3Lh  reason: invalid class name and case insensitive filesystem */
public final class C240543Lh implements Runnable {
    public final /* synthetic */ 1TY A00;
    public final /* synthetic */ C226532gy A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C240543Lh(1TY r1, C226532gy r2, boolean z, boolean z2) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = z2;
    }

    public final void run() {
        if (this.A03) {
            this.A01.DEW(this.A00);
            return;
        }
        boolean z = this.A02;
        C226532gy r1 = this.A01;
        1TY r0 = this.A00;
        if (!z) {
            r1.DUB(r0);
        }
    }
}
