package X;

/* renamed from: X.JcI  reason: case insensitive filesystem */
public final class C59952JcI implements Runnable {
    public boolean A00;
    public final 07T A01;
    public final 0h9 A02;

    public final void run() {
        if (!this.A00) {
            this.A02.A0B(this.A01);
            this.A00 = true;
        }
    }

    public C59952JcI(07T r1, 0h9 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }
}
