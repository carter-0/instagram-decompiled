package X;

import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveCredentialList;

/* renamed from: X.Sti  reason: case insensitive filesystem */
public final class C12406Sti implements C13731Tg2 {
    public static final C12406Sti A00 = new Object();

    public final void AC2(ECPIncentive eCPIncentive, QDL qdl, Integer num) {
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            AnonymousClass2Fj r3 = qdl.A0C;
            0sn A03 = SRl.A03(r3);
            if (A03 == null) {
                A03 = 0sn.A00;
            }
            String str = ((ECPOnsiteOffer) eCPIncentive).A01;
            if (!A03.contains(str)) {
                0sn A032 = SRl.A03(r3);
                if (A032 == null) {
                    A032 = 0sn.A00;
                }
                SUj.A0J(r3, AnonymousClass05K.A01, new IncentiveCredentialList(00k.A0T(str, A032)), (String) null);
            }
        }
    }

    public final void EDj(ECPIncentive eCPIncentive, QDL qdl) {
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            AnonymousClass2Fj r3 = qdl.A0C;
            0sn A03 = SRl.A03(r3);
            if (A03 == null) {
                A03 = 0sn.A00;
            }
            SUj.A0J(r3, AnonymousClass05K.A01, new IncentiveCredentialList(00k.A0f(A03, ((ECPOnsiteOffer) eCPIncentive).A01)), (String) null);
        }
    }
}
