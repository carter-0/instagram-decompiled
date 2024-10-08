package X;

import java.util.HashMap;

public final class LCA {
    public final /* synthetic */ K6H A00;

    public LCA(K6H k6h) {
        this.A00 = k6h;
    }

    public final void A00() {
        C62540KhW khW;
        K6H k6h = this.A00;
        Integer num = AnonymousClass05K.A0W;
        HashMap A1E = AnonymousClass7TE.A1E();
        C62466KgG kgG = (C62466KgG) JTT.A0a(k6h.A0O).A0H.getValue();
        0qQ.A0B(kgG, 0);
        if (AnonymousClass7TF.A1W(kgG, C62466KgG.EDIT)) {
            khW = C62540KhW.EDIT;
        } else {
            khW = C62540KhW.VIEW;
        }
        A1E.put("current_mode", khW.A00);
        C64127LPb.A02(k6h, num, A1E);
        k6h.onBackPressed();
    }
}
