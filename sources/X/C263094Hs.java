package X;

import java.io.IOException;

/* renamed from: X.4Hs  reason: invalid class name and case insensitive filesystem */
public abstract class C263094Hs {
    public static C263154Hz parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            C263144Hx r4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("consumption_sheet_config".equals(A0q)) {
                    r4 = C263104Ht.parseFromJson(r9);
                } else if ("has_active_fundraiser".equals(A0q)) {
                    bool = Boolean.valueOf(r9.A0d());
                } else if ("is_facebook_onboarded_charity".equals(A0q)) {
                    bool2 = Boolean.valueOf(r9.A0d());
                } else if ("pk".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            if (str != null || !(r9 instanceof 0c9)) {
                return new C263154Hz(r4, bool, bool2, str);
            }
            ((0c9) r9).A03.A00("pk", "FundraiserDonateActionButtonModelImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C263154Hz r3) {
        r2.A0c();
        AnonymousClass4Hy r1 = r3.A00;
        if (r1 != null) {
            r2.A0q("consumption_sheet_config");
            C263104Ht.A00(r2, r1.FEU());
        }
        Boolean bool = r3.A01;
        if (bool != null) {
            r2.A0S("has_active_fundraiser", bool.booleanValue());
        }
        Boolean bool2 = r3.A02;
        if (bool2 != null) {
            r2.A0S("is_facebook_onboarded_charity", bool2.booleanValue());
        }
        String str = r3.A03;
        if (str != null) {
            r2.A0R("pk", str);
        }
        r2.A0Z();
    }
}
