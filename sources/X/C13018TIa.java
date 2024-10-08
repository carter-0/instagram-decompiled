package X;

/* renamed from: X.TIa  reason: case insensitive filesystem */
public final /* synthetic */ class C13018TIa implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SJG A01;
    public final /* synthetic */ RE5 A02;

    public /* synthetic */ C13018TIa(SJG sjg, RE5 re5, int i) {
        this.A01 = sjg;
        this.A02 = re5;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A05(this.A02, C8896REo.FAILED_INSTALL, "FAILED_INSTALL", String.valueOf(this.A00));
    }
}
