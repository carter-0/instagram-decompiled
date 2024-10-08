package X;

public final class PQ9 implements C295005nO {
    public final /* synthetic */ C329837Kk A00;

    public PQ9(C329837Kk r1) {
        this.A00 = r1;
    }

    public final void onFinish() {
        C329837Kk r4 = this.A00;
        C329067Hl r1 = r4.A04.A00;
        r1.A1B = true;
        C329067Hl.A0e(r1, 0);
        r4.A02.removeAllViews();
        C71029OZg oZg = r4.A00;
        if (oZg != null) {
            C71029OZg.A00(oZg);
            oZg.A03 = null;
            oZg.A02 = null;
            C71029OZg oZg2 = r4.A00;
            if (oZg2 != null) {
                oZg2.A04 = false;
                return;
            }
        }
        0qQ.A0F("currentTray");
        throw AnonymousClass00P.createAndThrow();
    }
}
