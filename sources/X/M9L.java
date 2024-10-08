package X;

public final class M9L implements Runnable {
    public float A00;
    public int A01;
    public boolean A02;
    public final /* synthetic */ C60059Jea A03;

    public M9L(C60059Jea jea) {
        this.A03 = jea;
    }

    public final void run() {
        C60059Jea jea = this.A03;
        int i = jea.A05;
        int i2 = this.A01;
        jea.A05 = i + i2;
        this.A02 = false;
        if (jea.A0B == 3) {
            C60059Jea.A06(jea, (float) i2, false);
        } else if (jea.A0A()) {
            C60059Jea.A02(jea, (float) i2, this.A00);
        }
    }
}
