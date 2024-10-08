package X;

import com.instagram.business.promote.model.AudienceInterest;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vfe  reason: case insensitive filesystem */
public final class C17767Vfe {
    public final /* synthetic */ UZW A00;

    public C17767Vfe(UZW uzw) {
        this.A00 = uzw;
    }

    public final void A00(AudienceInterest audienceInterest) {
        UZW uzw = this.A00;
        UAI uai = uzw.A06;
        if (uai == null) {
            0qQ.A0F("selectedAndSuggestedInterestsAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        List list = uai.A06;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C13991Tnr.A1Y(audienceInterest, it)) {
                    it.remove();
                    uai.A01();
                    C18784W1k w1k = uai.A01;
                    C18784W1k.A02(w1k, (1P0) uai.A07.getValue(), W2V.A05(w1k.A08, uai.A03.A1S, w1k.A02.A03, C256393vh.A02(new C19131WMm(1, (0sP) C20739WyC.A00), list), false));
                    break;
                }
            } else {
                break;
            }
        }
        UZW.A01(uzw);
    }
}
