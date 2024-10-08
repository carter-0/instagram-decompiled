package X;

public final class GYM implements Runnable {
    public final /* synthetic */ C52206GIx A00;
    public final /* synthetic */ JMF A01;
    public final /* synthetic */ GYL A02;

    public GYM(C52206GIx gIx, JMF jmf, GYL gyl) {
        this.A02 = gyl;
        this.A01 = jmf;
        this.A00 = gIx;
    }

    public final void run() {
        this.A02.A01(this.A01);
    }
}
