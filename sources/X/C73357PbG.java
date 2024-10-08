package X;

/* renamed from: X.PbG  reason: case insensitive filesystem */
public final class C73357PbG implements Runnable {
    public final /* synthetic */ OJa A00;
    public final /* synthetic */ C310336ap A01;
    public final /* synthetic */ Boolean A02;
    public final /* synthetic */ String A03;

    public C73357PbG(OJa oJa, C310336ap r2, Boolean bool, String str) {
        this.A02 = bool;
        this.A01 = r2;
        this.A00 = oJa;
        this.A03 = str;
    }

    public final void run() {
        if (DbX.A1a(this.A02)) {
            DbY.A1K(1xC.A01, this.A01);
        } else {
            this.A00.A00(this.A03);
        }
    }
}
