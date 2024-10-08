package X;

/* renamed from: X.PZR  reason: case insensitive filesystem */
public final class C73247PZR implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C68053MzK A01;

    public C73247PZR(C68053MzK mzK, float f) {
        this.A01 = mzK;
        this.A00 = f;
    }

    public final void run() {
        C68053MzK mzK = this.A01;
        float f = -this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        mzK.A03.animate().setStartDelay(0).translationX(f).setDuration(2000).withEndAction(new C73247PZR(mzK, f));
    }
}
