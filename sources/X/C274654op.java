package X;

import com.instagram.api.schemas.ActionButtonPartnerType;
import java.io.IOException;

/* renamed from: X.4op  reason: invalid class name and case insensitive filesystem */
public abstract class C274654op {
    public static C274664or parseFromJson(16F r15) {
        String str;
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ActionButtonPartnerType actionButtonPartnerType = null;
            String str8 = null;
            while (r15.A1J() != 16L.A09) {
                String A0q = r15.A0q();
                r15.A1J();
                if ("app_id".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("app_logo_url".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r15.A1P();
                    }
                } else if ("button_label".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r15.A1P();
                    }
                } else if ("category_type".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r15.A1P();
                    }
                } else if ("display_category_name".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r15.A1P();
                    }
                } else if ("partner_name".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r15.A1P();
                    }
                } else if ("partner_type".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                    actionButtonPartnerType = (ActionButtonPartnerType) ActionButtonPartnerType.A01.get(str);
                    if (actionButtonPartnerType == null) {
                        actionButtonPartnerType = ActionButtonPartnerType.UNRECOGNIZED;
                    }
                } else if ("url".equals(A0q)) {
                    if (r15.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r15.A1P();
                    }
                }
                r15.A0z();
            }
            if (str2 == null && (r15 instanceof 0c9)) {
                ((0c9) r15).A03.A00("app_id", "ActionButtonPartnerImpl");
            } else if (str7 == null && (r15 instanceof 0c9)) {
                ((0c9) r15).A03.A00("partner_name", "ActionButtonPartnerImpl");
            } else if (actionButtonPartnerType == null && (r15 instanceof 0c9)) {
                ((0c9) r15).A03.A00("partner_type", "ActionButtonPartnerImpl");
            } else if (str8 != null || !(r15 instanceof 0c9)) {
                return new C274664or(actionButtonPartnerType, str2, str3, str4, str5, str6, str7, str8);
            } else {
                ((0c9) r15).A03.A00("url", "ActionButtonPartnerImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C274664or r3) {
        r2.A0c();
        String str = r3.A01;
        if (str != null) {
            r2.A0R("app_id", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0R("app_logo_url", str2);
        }
        String str3 = r3.A03;
        if (str3 != null) {
            r2.A0R("button_label", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0R("category_type", str4);
        }
        String str5 = r3.A05;
        if (str5 != null) {
            r2.A0R("display_category_name", str5);
        }
        String str6 = r3.A06;
        if (str6 != null) {
            r2.A0R("partner_name", str6);
        }
        ActionButtonPartnerType actionButtonPartnerType = r3.A00;
        if (actionButtonPartnerType != null) {
            r2.A0R("partner_type", actionButtonPartnerType.A00);
        }
        String str7 = r3.A07;
        if (str7 != null) {
            r2.A0R("url", str7);
        }
        r2.A0Z();
    }
}
