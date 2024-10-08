package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.api.schemas.WorldLocationPagesInfoImpl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class HU9 {
    public static C53469Gp1 parseFromJson(16F r31) {
        String A00;
        String A002;
        String A003;
        String A004;
        String A005;
        String A006;
        String str;
        16F r1 = r31;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            WearablesAppAttributionType wearablesAppAttributionType = null;
            Integer num = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            User user = null;
            String str15 = null;
            WorldLocationPagesInfoImpl worldLocationPagesInfoImpl = null;
            while (true) {
                16L A1J = r1.A1J();
                16L r9 = 16L.A09;
                A00 = AnonymousClass000.A00(3473);
                A002 = AnonymousClass000.A00(2665);
                A003 = AnonymousClass000.A00(2663);
                A004 = AnonymousClass000.A00(513);
                A005 = AnonymousClass000.A00(2662);
                A006 = AnonymousClass000.A00(2661);
                if (A1J == r9) {
                    break;
                }
                String A17 = AnonymousClass7TE.A17(r1);
                if (A006.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r1.A1P();
                    }
                } else if (A005.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if (A004.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if (A003.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("attribution_title".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if (A002.equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r1.A1P();
                    }
                } else if ("attribution_type".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    wearablesAppAttributionType = (WearablesAppAttributionType) WearablesAppAttributionType.A01.get(str);
                    if (wearablesAppAttributionType == null) {
                        wearablesAppAttributionType = WearablesAppAttributionType.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(3273).equals(A17)) {
                    num = AnonymousClass7TF.A0X(r1);
                } else if (AnonymousClass000.A00(3274).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(3275).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(3276).equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r1.A1P();
                    }
                } else if (A00.equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r1);
                } else if ("pivot_page_cta_label".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r1.A1P();
                    }
                } else if ("pivot_page_cta_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r1.A1P();
                    }
                } else if ("pivot_page_description".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r1.A1P();
                    }
                } else if ("pivot_page_image_url".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r1.A1P();
                    }
                } else if ("pivot_page_micro_user_dict".equals(A17)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    user = 1aC.A00(r1, false);
                } else if ("pivot_page_title".equals(A17)) {
                    if (r1.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r1.A1P();
                    }
                } else if (AnonymousClass000.A00(4221).equals(A17)) {
                    worldLocationPagesInfoImpl = HUC.parseFromJson(r1);
                }
                r1.A0z();
            }
            if (str2 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A006, r1, "WearablesAppAttribution");
            } else if (str3 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A005, r1, "WearablesAppAttribution");
            } else if (str4 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A004, r1, "WearablesAppAttribution");
            } else if (str5 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A003, r1, "WearablesAppAttribution");
            } else if (str6 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L("attribution_title", r1, "WearablesAppAttribution");
            } else if (str7 == null && (r1 instanceof 0c9)) {
                AnonymousClass7TF.A1L(A002, r1, "WearablesAppAttribution");
            } else if (bool != null || !(r1 instanceof 0c9)) {
                return new C53469Gp1(wearablesAppAttributionType, worldLocationPagesInfoImpl, user, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(A00, r1, "WearablesAppAttribution");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
