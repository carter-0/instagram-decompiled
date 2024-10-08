package X;

import android.os.Bundle;

public final class WO7 implements X6L {
    public final /* synthetic */ C15328Uac A00;
    public final /* synthetic */ C19176WOi A01;
    public final /* synthetic */ C21004X9b A02;

    public final void DED() {
    }

    public final void Doe(String str) {
        0qQ.A0B(str, 0);
        C15328Uac uac = this.A00;
        C18662VwK vwK = uac.A07;
        if (vwK == null) {
            0qQ.A0F("adsManagerLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        String obj = C16678UzE.PROMOTION_INFORMATION.toString();
        C19176WOi wOi = (C19176WOi) this.A02;
        vwK.A05("ads_manager", obj, wOi.BYo());
        C309516Yo r3 = new C309516Yo(uac.requireActivity(), AnonymousClass7TE.A0l(uac.A0f));
        C13990Tnq.A0h();
        String BYo = wOi.BYo();
        String str2 = this.A01.A0B;
        Bundle A0N = C51971G9r.A0N(BYo);
        A0N.putString("access_token", str);
        A0N.putString("ad_account_id", str2);
        DbW.A0x(A0N, new C15304UaB(), r3);
    }

    public WO7(C15328Uac uac, C19176WOi wOi, C21004X9b x9b) {
        this.A00 = uac;
        this.A02 = x9b;
        this.A01 = wOi;
    }
}
