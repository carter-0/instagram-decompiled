package X;

/* renamed from: X.WmU  reason: case insensitive filesystem */
public final /* synthetic */ class C20170WmU implements Runnable {
    public final /* synthetic */ AnonymousClass5NB A00;
    public final /* synthetic */ AnonymousClass4SA A01;

    public /* synthetic */ C20170WmU(AnonymousClass5NB r1, AnonymousClass4SA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        try {
            AnonymousClass5NB.A0N(this.A01);
        } catch (C2612348u e) {
            2AG.A05(C273654mx.A00(482), AnonymousClass000.A00(1045), e);
            throw new RuntimeException(e);
        }
    }
}
