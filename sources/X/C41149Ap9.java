package X;

/* renamed from: X.Ap9  reason: case insensitive filesystem */
public final class C41149Ap9 implements Runnable {
    public final /* synthetic */ C41370Asr A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public C41149Ap9(C41370Asr asr, String str, boolean z) {
        this.A00 = asr;
        this.A02 = z;
        this.A01 = str;
    }

    public final void run() {
        this.A00.A03.Ddm(this.A02, this.A01);
    }
}
