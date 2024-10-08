package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class D20 {
    public static AnonymousClass3IJ parseFromJson(16F r29) {
        16F r2 = r29;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Integer num = null;
            Boolean bool = null;
            SimpleImageUrl simpleImageUrl = null;
            String str9 = null;
            C250533lb r6 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            ArrayList arrayList2 = null;
            String str17 = null;
            String str18 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("action_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("ad_images".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            C41846B3n.A1B(r2, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("bottomsheet_variant".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("business_name".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("button_text".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("cta_destination".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("dismiss_text".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("extra_data_token".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("extra_logging_info".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if (C41845B3m.A1Y(A17)) {
                    num = AnonymousClass7TF.A0X(r2);
                } else if ("has_dismiss".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r2);
                } else if ("icon_url".equals(A17)) {
                    simpleImageUrl = 16h.A00(r2);
                } else if (C41845B3m.A17(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A17)) {
                    r6 = C250523la.parseFromJson(r2);
                } else if ("merchant_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r2.A1P();
                    }
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r2.A1P();
                    }
                } else if ("netego_variant".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r2.A1P();
                    }
                } else if ("product_id".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r2.A1P();
                    }
                } else if (AnonymousClass000.A00(752).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r2.A1P();
                    }
                } else if (AnonymousClass000.A00(359).equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r2.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r2.A1P();
                    }
                } else if ("topic_images".equals(A17)) {
                    if (r2.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r2.A1J() != 16L.A08) {
                            C41846B3n.A1B(r2, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (C41845B3m.A1W(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r2.A1P();
                    }
                } else if ("view_state_item_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            return new AnonymousClass3IJ(r6, simpleImageUrl, bool, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass3IJ r3) {
        r2.A0c();
        String str = r3.A04;
        if (str != null) {
            r2.A0R("action_type", str);
        }
        List list = r3.A0M;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "ad_images", list);
            while (A0s.hasNext()) {
                ImageUrl imageUrl = (ImageUrl) A0s.next();
                if (imageUrl != null) {
                    16h.A01(r2, imageUrl);
                }
            }
            r2.A0Y();
        }
        String str2 = r3.A05;
        if (str2 != null) {
            r2.A0R("bottomsheet_variant", str2);
        }
        String str3 = r3.A06;
        if (str3 != null) {
            r2.A0R("business_name", str3);
        }
        String str4 = r3.A07;
        if (str4 != null) {
            r2.A0R("button_text", str4);
        }
        String str5 = r3.A08;
        if (str5 != null) {
            r2.A0R("cta_destination", str5);
        }
        String str6 = r3.A09;
        if (str6 != null) {
            r2.A0R("dismiss_text", str6);
        }
        String str7 = r3.A0A;
        if (str7 != null) {
            r2.A0R("extra_data_token", str7);
        }
        String str8 = r3.A0B;
        if (str8 != null) {
            r2.A0R("extra_logging_info", str8);
        }
        Integer num = r3.A03;
        if (num != null) {
            r2.A0P("global_position", num.intValue());
        }
        Boolean bool = r3.A02;
        if (bool != null) {
            r2.A0S("has_dismiss", bool.booleanValue());
        }
        ImageUrl imageUrl2 = r3.A01;
        if (imageUrl2 != null) {
            r2.A0q("icon_url");
            16h.A01(r2, imageUrl2);
        }
        C41846B3n.A0y(r2, r3.A0C);
        C67241sS r1 = r3.A00;
        if (r1 != null) {
            r2.A0q("item_client_gap_rules");
            C250523la.A00(r2, r1.F8M());
        }
        C41846B3n.A14(r2, r3.A0D);
        String str9 = r3.A0E;
        if (str9 != null) {
            r2.A0R(DialogModule.KEY_MESSAGE, str9);
        }
        String str10 = r3.A0F;
        if (str10 != null) {
            r2.A0R("netego_variant", str10);
        }
        String str11 = r3.A0G;
        if (str11 != null) {
            r2.A0R("product_id", str11);
        }
        String str12 = r3.A0H;
        if (str12 != null) {
            r2.A0R(AnonymousClass000.A00(752), str12);
        }
        String str13 = r3.A0I;
        if (str13 != null) {
            r2.A0R(AnonymousClass000.A00(359), str13);
        }
        C41846B3n.A10(r2, r3.A0J);
        List list2 = r3.A0N;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(r2, "topic_images", list2);
            while (A0s2.hasNext()) {
                ImageUrl imageUrl3 = (ImageUrl) A0s2.next();
                if (imageUrl3 != null) {
                    16h.A01(r2, imageUrl3);
                }
            }
            r2.A0Y();
        }
        String str14 = r3.A0K;
        if (str14 != null) {
            r2.A0R("tracking_token", str14);
        }
        String str15 = r3.A0L;
        if (str15 != null) {
            r2.A0R("view_state_item_type", str15);
        }
        r2.A0Z();
    }
}
