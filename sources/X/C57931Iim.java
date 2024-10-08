package X;

/* renamed from: X.Iim  reason: case insensitive filesystem */
public final class C57931Iim implements Runnable {
    public final /* synthetic */ C267324bN A00;
    public final /* synthetic */ C52196GIn A01;
    public final /* synthetic */ 0r1 A02;

    public C57931Iim(C267324bN r1, C52196GIn gIn, 0r1 r3) {
        this.A02 = r3;
        this.A01 = gIn;
        this.A00 = r1;
    }

    public final void run() {
        this.A02.A00 = C52196GIn.A02(this.A00, this.A01, true);
    }
}
