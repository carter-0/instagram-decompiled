package X;

/* renamed from: X.TJo  reason: case insensitive filesystem */
public final class C13058TJo implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SRW A01;
    public final /* synthetic */ RF9 A02;
    public final /* synthetic */ C7341Q4r A03;

    public C13058TJo(SRW srw, RF9 rf9, C7341Q4r q4r, int i) {
        this.A03 = q4r;
        this.A02 = rf9;
        this.A00 = i;
        this.A01 = srw;
    }

    public final void run() {
        this.A03.A00.Dib(this.A01, this.A02, this.A00);
    }
}
