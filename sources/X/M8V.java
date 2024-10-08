package X;

public final class M8V implements Runnable {
    public float A00;
    public boolean A01;
    public final /* synthetic */ C60059Jea A02;

    public M8V(C60059Jea jea) {
        this.A02 = jea;
    }

    public final void run() {
        C60059Jea jea = this.A02;
        C60059Jea.A05(jea, this.A00);
        this.A01 = false;
        jea.removeCallbacks(this);
    }
}
