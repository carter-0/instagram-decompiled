package X;

public final class M7Y implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60066Jeq A01;

    public M7Y(C60066Jeq jeq, int i) {
        this.A01 = jeq;
        this.A00 = i;
    }

    public final void run() {
        C60066Jeq jeq = this.A01;
        C60066Jeq.A00(jeq, 1.0f, jeq.A01, this.A00);
        jeq.A01 = jeq.A02;
        jeq.A01();
    }
}
