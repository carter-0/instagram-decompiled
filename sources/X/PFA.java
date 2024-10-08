package X;

import java.util.ArrayList;
import java.util.Map;

public final class PFA implements C74419PuZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PFA(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final /* synthetic */ void D0U() {
        if (this.A00 != 0) {
            C71153OeR.A0O((C71153OeR) this.A01, "direct_request_allow_folder_dialog_cancel", (ArrayList) this.A02);
            return;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DVU(N4G n4g) {
        if (this.A00 != 0) {
            C71153OeR oeR = (C71153OeR) this.A01;
            ArrayList arrayList = (ArrayList) this.A02;
            C71153OeR.A09(n4g, oeR, arrayList, C71153OeR.A00(oeR, arrayList));
            return;
        }
        0qQ.A0B(n4g, 0);
        ((C67521MpG) this.A02).A03.Cog(n4g, (Map) this.A01);
    }
}
