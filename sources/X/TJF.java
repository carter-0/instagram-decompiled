package X;

public final class TJF implements Runnable {
    public final /* synthetic */ C13755TgR A00;
    public final /* synthetic */ LO3 A01;
    public final /* synthetic */ 0rm A02;

    public TJF(C13755TgR tgR, LO3 lo3, 0rm r3) {
        this.A01 = lo3;
        this.A02 = r3;
        this.A00 = tgR;
    }

    public final void run() {
        if (!DbX.A1a(this.A01.A00)) {
            String str = (String) this.A02.A00;
            C13755TgR tgR = this.A00;
            if (str != null) {
                tgR.D82(str);
            } else {
                tgR.D6T();
            }
        }
    }
}
