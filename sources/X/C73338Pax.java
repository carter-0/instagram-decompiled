package X;

/* renamed from: X.Pax  reason: case insensitive filesystem */
public final class C73338Pax implements Runnable {
    public final /* synthetic */ C331127Pr A00;
    public final /* synthetic */ C67614Mqm A01;
    public final /* synthetic */ NIR A02;

    public C73338Pax(C331127Pr r1, C67614Mqm mqm, NIR nir) {
        this.A01 = mqm;
        this.A00 = r1;
        this.A02 = nir;
    }

    public final void run() {
        C67614Mqm mqm = this.A01;
        C331157Pu r4 = mqm.A00;
        if (r4 == null) {
            C331157Pu A002 = this.A00.A00();
            A002.A02(mqm.A03, this.A02);
            mqm.A00 = A002;
            return;
        }
        r4.A0G(this.A02, this.A00, false, true);
    }
}
