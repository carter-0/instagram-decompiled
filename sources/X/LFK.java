package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

public final class LFK {
    public String A00;
    public String A01;
    public final EffectCollectionService A02;
    public final C66420MRa A03;
    public final UserSession A04;
    public final C262224Cq A05;

    public final void A00(MTK mtk) {
        0qQ.A0B(mtk, 0);
        MHD.A00(mtk, this, this.A05, 38);
    }

    public final void A01(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public LFK(Context context, C66420MRa mRa, AnonymousClass12V r5, UserSession userSession) {
        0qQ.A0B(r5, 5);
        this.A04 = userSession;
        this.A03 = mRa;
        this.A02 = C311766dD.A00(context, userSession);
        this.A05 = DbY.A0r(r5, 345149159);
    }
}
