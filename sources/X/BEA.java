package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.List;

public final class BEA extends AnonymousClass0T0 implements DSV {
    public final IntentAwareAdsInfo A00;
    public final List A01;

    public final BEA F1a(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEA) {
                BEA bea = (BEA) obj;
                if (!0qQ.A0K(this.A00, bea.A00) || !0qQ.A0K(this.A01, bea.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ IntentAwareAdsInfoIntf BIC() {
        return this.A00;
    }

    public final List BUU() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public BEA(IntentAwareAdsInfo intentAwareAdsInfo, List list) {
        AnonymousClass7TG.A1O(intentAwareAdsInfo, list);
        this.A00 = intentAwareAdsInfo;
        this.A01 = list;
    }

    public final DSV E7C(1E9 r1) {
        return this;
    }
}
