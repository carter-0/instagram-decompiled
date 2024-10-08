package X;

public final class TGL implements Runnable {
    public final /* synthetic */ C11026S6d A00;
    public final /* synthetic */ SIa A01;

    public TGL(C11026S6d s6d, SIa sIa) {
        this.A01 = sIa;
        this.A00 = s6d;
    }

    public final void run() {
        SIa.A00(this.A00, this.A01);
    }
}
