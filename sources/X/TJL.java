package X;

public final class TJL implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ T8W A02;

    public TJL(T8W t8w, double d, long j) {
        this.A02 = t8w;
        this.A01 = j;
        this.A00 = d;
    }

    public final void run() {
        this.A02.A04.E0F(this.A01, this.A00);
    }
}
