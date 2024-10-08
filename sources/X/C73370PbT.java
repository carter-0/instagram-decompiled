package X;

/* renamed from: X.PbT  reason: case insensitive filesystem */
public final class C73370PbT implements Runnable {
    public final /* synthetic */ 0xF A00;
    public final /* synthetic */ C74551Pwk A01;
    public final /* synthetic */ 1OS A02;
    public final /* synthetic */ PD5 A03;

    public C73370PbT(0xF r1, C74551Pwk pwk, 1OS r3, PD5 pd5) {
        this.A03 = pd5;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = pwk;
    }

    public final void run() {
        PD5 pd5 = this.A03;
        PD5.A01(this.A00, this.A01, this.A02, pd5);
    }
}
