package X;

public final class OJY {
    public final /* synthetic */ C68464NJc A00;

    public OJY(C68464NJc nJc) {
        this.A00 = nJc;
    }

    public final void A00() {
        C68464NJc nJc = this.A00;
        C69319NjK njK = nJc.A03;
        if (njK == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        }
        C69319NjK njK2 = C69319NjK.AI_STICKER_NUX;
        if (njK != njK2) {
            if (njK == C69319NjK.REOPEN_AI_STICKER_TRAY) {
                nJc.A03 = njK2;
            }
            nJc.requireArguments().putString("param_extra_initial_tab", "stickers");
            if (!182.A06(0Tu.A05, DbT.A0X(nJc.A0G), 2342171337253862641L)) {
                C68464NJc.A04(nJc);
                return;
            }
            return;
        }
        AnonymousClass37D r0 = nJc.A04;
        if (r0 != null) {
            r0.A0B();
        }
        C74511Pw6 pw6 = nJc.A02;
        if (pw6 != null) {
            pw6.Du2();
        }
    }
}
