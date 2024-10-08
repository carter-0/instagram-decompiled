package X;

/* renamed from: X.AhL  reason: case insensitive filesystem */
public final class C40701AhL implements C41824B2f {
    public final /* synthetic */ AGt A00;

    public C40701AhL(AGt aGt) {
        this.A00 = aGt;
    }

    public final void D6B(boolean z, String str) {
        AGt.A00(this.A00);
    }

    public final void D6C(String str) {
        AGt.A00(this.A00);
    }

    public final void onFinish() {
        AGt aGt = this.A00;
        aGt.A00 = null;
        aGt.A05.removeCallbacks(aGt.A0B);
        if (aGt.A04) {
            AGt.A01(aGt);
        }
    }
}
