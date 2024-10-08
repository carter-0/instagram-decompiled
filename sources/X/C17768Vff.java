package X;

import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vff  reason: case insensitive filesystem */
public final class C17768Vff {
    public final /* synthetic */ UZV A00;

    public final void A00(AudienceInterest audienceInterest) {
        UZV uzv = this.A00;
        UAD uad = uzv.A06;
        if (uad == null) {
            0qQ.A0F("selectedAndSuggestedInterestsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        List list = uad.A08;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C13991Tnr.A1Y(audienceInterest, it)) {
                    it.remove();
                    uad.A00();
                    C17325VRe vRe = uad.A01;
                    UserSession userSession = uad.A03;
                    String str = uad.A04;
                    List A02 = C256393vh.A02(new C19131WMm(2, (0sP) C20740WyD.A00), list);
                    1OC A05 = W2V.A05(userSession, str, uad.A05, A02, false);
                    A05.A00 = (1P0) uad.A09.getValue();
                    vRe.A00.schedule(A05);
                    break;
                }
            } else {
                break;
            }
        }
        UZV.A01(uzv);
    }

    public C17768Vff(UZV uzv) {
        this.A00 = uzv;
    }
}
