package X;

/* renamed from: X.Pac  reason: case insensitive filesystem */
public final class C73317Pac implements Runnable {
    public final /* synthetic */ C3258874o A00;
    public final /* synthetic */ C66680Man A01;
    public final /* synthetic */ C328657Fq A02;

    public C73317Pac(C3258874o r1, C66680Man man, C328657Fq r3) {
        this.A00 = r1;
        this.A01 = man;
        this.A02 = r3;
    }

    public final void run() {
        C3258874o r2 = this.A00;
        C66680Man man = this.A01;
        C3258874o.A02(r2, man, this.A02);
        C70762OKi oKi = man.A04;
        if (oKi != null) {
            oKi.A00();
        }
        man.A04 = null;
    }
}
