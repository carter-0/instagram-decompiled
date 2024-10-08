package X;

public final class TCL implements Runnable {
    public final /* synthetic */ SNf A00;

    public TCL(SNf sNf) {
        this.A00 = sNf;
    }

    public final void run() {
        for (C12216SpG spG : this.A00.A03) {
            if (SNf.A00(spG.A05).A02.size() <= 0) {
                spG.A0E.set(false);
                C12216SpG.A00(spG);
                C12216SpG.A01(spG);
            }
        }
    }
}
