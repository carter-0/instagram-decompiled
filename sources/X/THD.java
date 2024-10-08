package X;

public final class THD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ QCH A01;

    public THD(QCH qch, int i) {
        this.A01 = qch;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A02.A0p(this.A00);
    }
}
