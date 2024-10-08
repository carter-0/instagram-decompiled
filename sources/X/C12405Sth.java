package X;

import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;

/* renamed from: X.Sth  reason: case insensitive filesystem */
public final class C12405Sth implements C13731Tg2 {
    public static final C12405Sth A00 = new Object();

    public final void AC2(ECPIncentive eCPIncentive, QDL qdl, Integer num) {
        0qQ.A0B(num, 2);
        if (eCPIncentive instanceof ECPOffsiteOffer) {
            AnonymousClass2Fj r2 = qdl.A0D;
            0sn A04 = SRl.A04(r2);
            if (A04 == null) {
                A04 = 0sn.A00;
            }
            String str = ((ECPOffsiteOffer) eCPIncentive).A01;
            if (!A04.contains(str)) {
                0sn A042 = SRl.A04(r2);
                if (A042 == null) {
                    A042 = 0sn.A00;
                }
                SUj.A0J(r2, num, new PromoCodeList(00k.A0T(str, A042)), (String) null);
            }
        }
    }

    public final void EDj(ECPIncentive eCPIncentive, QDL qdl) {
        if (eCPIncentive instanceof ECPOffsiteOffer) {
            AnonymousClass2Fj r3 = qdl.A0D;
            0sn A04 = SRl.A04(r3);
            if (A04 == null) {
                A04 = 0sn.A00;
            }
            SUj.A0J(r3, AnonymousClass05K.A01, new PromoCodeList(00k.A0f(A04, ((ECPOffsiteOffer) eCPIncentive).A01)), (String) null);
        }
    }
}
