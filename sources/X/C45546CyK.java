package X;

import java.io.IOException;

/* renamed from: X.CyK  reason: case insensitive filesystem */
public abstract class C45546CyK {
    public static C267534bi parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("contact_bar".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("setting_toggle".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("setting_toggle_description".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if (!"stories_config_cta_title".equals(A17)) {
                    num = C41847B3o.A13(r8, num, A17, "stories_config_cta_title_type");
                } else if (r8.A11() == 16L.A0G) {
                    str4 = null;
                } else {
                    str4 = r8.A1P();
                }
                r8.A0z();
            }
            return new C267534bi(num, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, C267534bi r3) {
        r2.A0c();
        String str = r3.A01;
        if (str != null) {
            r2.A0R("contact_bar", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0R("setting_toggle", str2);
        }
        String str3 = r3.A03;
        if (str3 != null) {
            r2.A0R("setting_toggle_description", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0R("stories_config_cta_title", str4);
        }
        Integer num = r3.A00;
        if (num != null) {
            r2.A0P("stories_config_cta_title_type", num.intValue());
        }
        r2.A0Z();
    }
}
