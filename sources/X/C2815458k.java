package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.List;

/* renamed from: X.58k  reason: invalid class name and case insensitive filesystem */
public abstract class C2815458k {
    public static C278094wG parseFromJson(16F r8) {
        String str;
        String str2;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            IGLiveBadgeSettings iGLiveBadgeSettings = null;
            Integer num = null;
            Boolean bool = null;
            C2816658x r5 = null;
            LiveUserPaySupportTier liveUserPaySupportTier = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("badge_setting".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                    iGLiveBadgeSettings = C2816858z.A00(str2);
                } else if ("badges_count".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("max_amount_reached".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                } else if ("pay_config".equals(A0q)) {
                    r5 = C2815558l.parseFromJson(r8);
                } else if ("viewer_support_tier".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    liveUserPaySupportTier = C2815758n.A00(str);
                }
                r8.A0z();
            }
            return new C278094wG(iGLiveBadgeSettings, liveUserPaySupportTier, r5, bool, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r5, C278094wG r6) {
        r5.A0c();
        IGLiveBadgeSettings iGLiveBadgeSettings = r6.A00;
        if (iGLiveBadgeSettings != null) {
            r5.A0R("badge_setting", iGLiveBadgeSettings.A00);
        }
        Integer num = r6.A04;
        if (num != null) {
            r5.A0P("badges_count", num.intValue());
        }
        Boolean bool = r6.A03;
        if (bool != null) {
            r5.A0S("max_amount_reached", bool.booleanValue());
        }
        C2816658x r3 = r6.A02;
        if (r3 != null) {
            r5.A0q("pay_config");
            r5.A0c();
            C2816458v r2 = r3.A03;
            if (r2 != null) {
                r5.A0q("consumption_sheet_config");
                r5.A0c();
                String str = r2.A00;
                if (str != null) {
                    r5.A0R(DevServerEntity.COLUMN_DESCRIPTION, str);
                }
                String str2 = r2.A01;
                if (str2 != null) {
                    r5.A0R("privacy_disclaimer", str2);
                }
                String str3 = r2.A02;
                if (str3 != null) {
                    r5.A0R("privacy_disclaimer_link", str3);
                }
                String str4 = r2.A03;
                if (str4 != null) {
                    r5.A0R("privacy_disclaimer_link_text", str4);
                }
                String str5 = r2.A04;
                if (str5 != null) {
                    r5.A0R(DialogModule.KEY_TITLE, str5);
                }
                r5.A0Z();
            }
            r5.A0Q("digital_non_consumable_product_id", r3.A00);
            r5.A0Q("digital_product_id", r3.A01);
            r5.A0Q("payee_id", r3.A02);
            C2816258t r1 = r3.A04;
            if (r1 != null) {
                r5.A0q("pinned_row_config");
                C2816158s F5Y = r1.F5Y();
                r5.A0c();
                String str6 = F5Y.A00;
                if (str6 != null) {
                    r5.A0R("button_title", str6);
                }
                String str7 = F5Y.A01;
                if (str7 != null) {
                    r5.A0R(DevServerEntity.COLUMN_DESCRIPTION, str7);
                }
                r5.A0Z();
            }
            List<C2815858p> list = r3.A05;
            if (list != null) {
                16P.A03(r5, "tier_infos");
                for (C2815858p r22 : list) {
                    if (r22 != null) {
                        r5.A0c();
                        r5.A0Q("digital_product_id", r22.A00);
                        String str8 = r22.A02;
                        if (str8 != null) {
                            r5.A0R("sku", str8);
                        }
                        LiveUserPaySupportTier liveUserPaySupportTier = r22.A01;
                        if (liveUserPaySupportTier != null) {
                            r5.A0R("support_tier", liveUserPaySupportTier.A00);
                        }
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            r5.A0Z();
        }
        LiveUserPaySupportTier liveUserPaySupportTier2 = r6.A01;
        if (liveUserPaySupportTier2 != null) {
            r5.A0R("viewer_support_tier", liveUserPaySupportTier2.A00);
        }
        r5.A0Z();
    }
}
