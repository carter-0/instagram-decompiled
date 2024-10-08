package X;

/* renamed from: X.AQi  reason: case insensitive filesystem */
public final class C40078AQi implements C341737nR {
    public final /* synthetic */ C341737nR A00;
    public final /* synthetic */ C341627nG A01;

    public C40078AQi(C341737nR r1, C341627nG r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onError(Throwable th) {
        this.A01.A06(new AUS(this.A00, th, 0));
    }

    public final void onSuccess() {
        C341627nG.A01(this.A01, AnonymousClass05K.A01);
        this.A00.onSuccess();
    }
}
