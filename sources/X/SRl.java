package X;

import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import com.facebookpay.incentives.model.IncentiveList;
import com.google.common.collect.ImmutableList;
import java.util.List;

public abstract class SRl {
    public static final List A01(2Fk r5) {
        C250663lr r3;
        C250663lr optionalTreeField;
        ImmutableList requiredCompactedTreeListField;
        0qQ.A0B(r5, 0);
        SUj A0W = Pxe.A0W(r5);
        if (A0W == null || (r3 = (C250663lr) A0W.A01) == null || (optionalTreeField = r3.getOptionalTreeField(0, "all_eligible_incentives", C7700QTp.class, -2132818263)) == null || (requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "incentives", QXS.class, 935491380)) == null) {
            return 0sn.A00;
        }
        return requiredCompactedTreeListField;
    }

    public static final List A02(2Fk r1) {
        IncentiveList incentiveList;
        0qQ.A0B(r1, 0);
        SUj A0W = Pxe.A0W(r1);
        if (A0W == null || (incentiveList = (IncentiveList) A0W.A01) == null) {
            return 0sn.A00;
        }
        return incentiveList.A00;
    }

    public static final List A03(AnonymousClass2Fj r1) {
        C10575RuU ruU;
        IncentiveCredentialList incentiveCredentialList;
        0qQ.A0B(r1, 0);
        SUj A0W = Pxe.A0W(r1);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (incentiveCredentialList = (IncentiveCredentialList) ruU.A01) == null) {
            return null;
        }
        return incentiveCredentialList.A00;
    }

    public static final List A04(AnonymousClass2Fj r1) {
        C10575RuU ruU;
        PromoCodeList promoCodeList;
        0qQ.A0B(r1, 0);
        SUj A0W = Pxe.A0W(r1);
        if (A0W == null || (ruU = (C10575RuU) A0W.A01) == null || (promoCodeList = (PromoCodeList) ruU.A01) == null) {
            return null;
        }
        return promoCodeList.A00;
    }

    public static final C13731Tg2 A00(ECPIncentive eCPIncentive) {
        C13731Tg2 tg2;
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            tg2 = C12406Sti.A00;
        } else if (eCPIncentive instanceof ECPOffsiteOffer) {
            tg2 = C12405Sth.A00;
        } else {
            throw AnonymousClass7TE.A0w("Processor not implemented yet for this incentive type");
        }
        return tg2;
    }
}
