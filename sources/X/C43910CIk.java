package X;

import com.instagram.api.schemas.ImmutablePandoIntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CIk  reason: case insensitive filesystem */
public final class C43910CIk extends 17P implements DSV {
    public List A00;

    public final IntentAwareAdsInfoIntf BIC() {
        return (IntentAwareAdsInfoIntf) A04(-1964130399, ImmutablePandoIntentAwareAdsInfo.class);
    }

    public final List BUU() {
        List list = this.A00;
        if (list == null) {
            return A0o(557197200, CHo.class);
        }
        return list;
    }

    public final DSV E7C(1E9 r4) {
        List<YCC> BUU = BUU();
        ArrayList A0r = AnonymousClass7TG.A0r(BUU);
        for (YCC ycc : BUU) {
            ycc.E71(r4);
            A0r.add(ycc);
        }
        this.A00 = A0r;
        return this;
    }

    public final BEA F1a(1E9 r5) {
        IntentAwareAdsInfo F5F = BIC().F5F();
        List<YCC> BUU = BUU();
        ArrayList A0r = AnonymousClass7TG.A0r(BUU);
        for (YCC F0D : BUU) {
            A0r.add(F0D.F0D(r5));
        }
        return new BEA(F5F, A0r);
    }
}
