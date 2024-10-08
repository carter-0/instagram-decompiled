package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import java.util.HashSet;
import java.util.Set;

public final class WU5 implements C250603lj {
    public final C52673Gal A00;
    public final Set A01 = new HashSet();

    public WU5(C52673Gal gal) {
        this.A00 = gal;
    }

    public final void ATF(AnonymousClass30Y r12, C252093oY r13) {
        AnonymousClass7TG.A1N(r12, r13);
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) r12.A03;
        String str = (String) r12.A04;
        String str2 = r12.A05;
        0qQ.A06(str2);
        int parseInt = Integer.parseInt(str2);
        if (iGCTMessagingAdsInfoDict != null && str != null) {
            OnFeedMessagesIntf BTY = iGCTMessagingAdsInfoDict.BTY();
            if (BTY != null) {
                String BSH = ((IceBreakerMessageIntf) AnonymousClass3ZO.A01(BTY).get(parseInt)).BSH();
                if (r13.CEk(r12) == AnonymousClass05K.A00 && this.A01.add(Integer.valueOf(parseInt))) {
                    C52673Gal gal = this.A00;
                    long A002 = C16947VBz.A00(iGCTMessagingAdsInfoDict);
                    long j = (long) parseInt;
                    String A003 = AnonymousClass3ZN.A00(BTY);
                    0Aj A0e = AnonymousClass7TE.A0e(gal.A01, "icebreaker_impression");
                    if (A0e.isSampled()) {
                        C51965G9l.A1D(A0e, DbV.A0q(str));
                        A0e.A9F("page_id", Long.valueOf(A002));
                        A0e.A9F("position", Long.valueOf(j));
                        A0e.AAJ(C21058XCk.A00(), gal.A02);
                        A0e.AAJ(AnonymousClass000.A00(1424), BSH);
                        A0e.A8M(gal.A00, "on_feed_messaging_surface");
                        A0e.AAJ("message_destination", A003);
                        A0e.Cgf();
                        return;
                    }
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
