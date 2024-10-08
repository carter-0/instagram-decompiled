package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;

/* renamed from: X.HGr  reason: case insensitive filesystem */
public final class C54505HGr extends C252313ou {
    public IntentAwareAdsInfoIntf A00;
    public Integer A01;
    public final UserSession A02;

    public C54505HGr(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, UserSession userSession, AnonymousClass4DU r5, Integer num) {
        super(userSession, r5, (String) null, false);
        this.A02 = userSession;
        this.A00 = intentAwareAdsInfoIntf;
        this.A01 = num;
    }

    public final void A0A(0xI r3, C263934Nx r4) {
        AnonymousClass4OC r1;
        0qQ.A0B(r3, 0);
        if (r4 != null && (r1 = r4.A07) != null) {
            r1.A00 = this.A00;
            r1.A0I = this.A01;
        }
    }

    public final Integer A08() {
        return AnonymousClass05K.A1I;
    }
}
