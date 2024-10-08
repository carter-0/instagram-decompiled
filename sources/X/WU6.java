package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.OnFeedMessagesIntf;

public final class WU6 implements C250603lj {
    public boolean A00;
    public final C52673Gal A01;

    public final void ATF(AnonymousClass30Y r11, C252093oY r12) {
        OnFeedMessagesIntf BTY;
        boolean A1U = AnonymousClass7TF.A1U(0, r11, r12);
        IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = (IGCTMessagingAdsInfoDict) r11.A03;
        String str = r11.A05;
        if (r12.CEk(r11) == AnonymousClass05K.A00 && !this.A00) {
            boolean z = true;
            this.A00 = A1U;
            if (iGCTMessagingAdsInfoDict == null || (BTY = iGCTMessagingAdsInfoDict.BTY()) == null) {
                throw AnonymousClass7TE.A0y();
            }
            long A002 = C16947VBz.A00(iGCTMessagingAdsInfoDict);
            C52673Gal gal = this.A01;
            0qQ.A0A(str);
            String A003 = AnonymousClass3ZN.A00(BTY);
            if (BTY.BFz() == null) {
                z = false;
            }
            0qQ.A0B(str, 0);
            0Aj A0e = AnonymousClass7TE.A0e(gal.A01, "welcome_message_impression");
            if (A0e.isSampled()) {
                C13990Tnq.A11(A0e, gal, str, A002);
                A0e.A7p("has_image_impression", JTP.A0g(A0e, "message_destination", A003, z));
                A0e.Cgf();
            }
        }
    }

    public WU6(C52673Gal gal) {
        this.A01 = gal;
    }
}
