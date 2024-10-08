package X;

import java.io.IOException;

/* renamed from: X.Cbi  reason: case insensitive filesystem */
public abstract class C44247Cbi {
    public static C42066BFt parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            Integer num = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Long l = null;
            Integer num2 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("contract_sent_date".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("media_igid".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r9);
                } else {
                    num2 = C41847B3o.A13(r9, num2, A17, "payout_per_delivery_amount");
                }
                r9.A0z();
            }
            if (num == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("contract_sent_date", r9, "PresetDealPayoutDetailsImpl");
            } else if (l == null && (r9 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_igid", r9, "PresetDealPayoutDetailsImpl");
            } else if (num2 != null || !(r9 instanceof 0c9)) {
                return new C42066BFt(num.intValue(), l.longValue(), num2.intValue());
            } else {
                AnonymousClass7TF.A1L("payout_per_delivery_amount", r9, "PresetDealPayoutDetailsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
