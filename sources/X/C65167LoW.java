package X;

/* renamed from: X.LoW  reason: case insensitive filesystem */
public final class C65167LoW implements C13755TgR {
    public final /* synthetic */ C61849KOo A00;

    public C65167LoW(C61849KOo kOo) {
        this.A00 = kOo;
    }

    public final void D6T() {
        C61849KOo kOo = this.A00;
        Runnable runnable = kOo.A02;
        if (runnable != null) {
            runnable.run();
        }
        05G r1 = kOo.A08;
        if (((C61028JvS) r1.getValue()).A01 == null) {
            C61028JvS jvS = (C61028JvS) r1.getValue();
            r1.Epw(new C61028JvS(jvS.A01, 2, jvS.A03, true, jvS.A04));
        }
    }

    public final void D82(String str) {
        C61849KOo.A01(this.A00, str);
    }
}
