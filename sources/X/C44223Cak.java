package X;

import java.io.IOException;

/* renamed from: X.Cak  reason: case insensitive filesystem */
public abstract class C44223Cak {
    public static C42049BFc parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Integer num = null;
            BEQ beq = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r12.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r12);
                if ("contextual_ads_info".equals(A17)) {
                    beq = CWM.parseFromJson(r12);
                } else if (AnonymousClass000.A00(3610).equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                } else if ("multi_ads_seed_ad_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r12.A1P();
                    }
                } else if ("multi_ads_type".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r12);
                } else if ("multi_ads_unit_category_hash_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r12.A1P();
                    }
                } else if ("multi_ads_unit_id".equals(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r12.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r12.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (num != null || !(r12 instanceof 0c9)) {
                return new C42049BFc(beq, str, str2, str3, str4, str5, num.intValue());
            }
            AnonymousClass7TF.A1L("multi_ads_type", r12, "MultiAdsInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
