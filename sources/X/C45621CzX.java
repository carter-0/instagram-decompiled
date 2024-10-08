package X;

import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.BusinessProfileDictImpl;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;

/* renamed from: X.CzX  reason: case insensitive filesystem */
public abstract class C45621CzX {
    public static SMBSupportStickerDict parseFromJson(16F r18) {
        String str;
        16F r2 = r18;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            BusinessProfileDictImpl businessProfileDictImpl = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Float f = null;
            String str8 = null;
            String str9 = null;
            SMBPartnerType sMBPartnerType = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            while (r2.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r2);
                if ("business_profile".equals(A17)) {
                    businessProfileDictImpl = CVD.parseFromJson(r2);
                } else if ("button_text".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("button_text_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("cta_title".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("cta_url".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("disclaimer".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("end_background_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if (AnonymousClass000.A00(181).equals(A17)) {
                    f = AnonymousClass7TF.A0U(r2);
                } else if ("partner_name".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("pk".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("service_type".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    sMBPartnerType = C253543qx.A00(str);
                } else if ("start_background_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r2.A1P();
                    }
                } else if ("subtitle_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r2.A1P();
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r2.A1P();
                    }
                } else if ("title_color".equals(A17)) {
                    if (r2.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            return new SMBSupportStickerDict(businessProfileDictImpl, sMBPartnerType, f, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, SMBSupportStickerDict sMBSupportStickerDict, boolean z) {
        if (z) {
            r3.A0c();
        }
        BusinessProfileDict businessProfileDict = sMBSupportStickerDict.A00;
        if (businessProfileDict != null) {
            r3.A0q("business_profile");
            BusinessProfileDictImpl F12 = businessProfileDict.F12();
            r3.A0c();
            C41846B3n.A0y(r3, F12.A01);
            ImageUrl imageUrl = F12.A00;
            if (imageUrl != null) {
                r3.A0q("profile_pic_url");
                16h.A01(r3, imageUrl);
            }
            String str = F12.A02;
            if (str != null) {
                r3.A0R(Dbh.A00(), str);
            }
            r3.A0Z();
        }
        String str2 = sMBSupportStickerDict.A03;
        if (str2 != null) {
            r3.A0R("button_text", str2);
        }
        String str3 = sMBSupportStickerDict.A04;
        if (str3 != null) {
            r3.A0R("button_text_color", str3);
        }
        String str4 = sMBSupportStickerDict.A05;
        if (str4 != null) {
            r3.A0R("cta_title", str4);
        }
        String str5 = sMBSupportStickerDict.A06;
        if (str5 != null) {
            r3.A0R("cta_url", str5);
        }
        String str6 = sMBSupportStickerDict.A07;
        if (str6 != null) {
            r3.A0R("disclaimer", str6);
        }
        String str7 = sMBSupportStickerDict.A08;
        if (str7 != null) {
            r3.A0R("end_background_color", str7);
        }
        Float f = sMBSupportStickerDict.A02;
        if (f != null) {
            r3.A0O(AnonymousClass000.A00(181), f.floatValue());
        }
        String str8 = sMBSupportStickerDict.A09;
        if (str8 != null) {
            r3.A0R("partner_name", str8);
        }
        String str9 = sMBSupportStickerDict.A0A;
        if (str9 != null) {
            r3.A0R("pk", str9);
        }
        SMBPartnerType sMBPartnerType = sMBSupportStickerDict.A01;
        if (sMBPartnerType != null) {
            r3.A0R("service_type", sMBPartnerType.A00);
        }
        String str10 = sMBSupportStickerDict.A0B;
        if (str10 != null) {
            r3.A0R("start_background_color", str10);
        }
        String str11 = sMBSupportStickerDict.A0C;
        if (str11 != null) {
            r3.A0R("subtitle_color", str11);
        }
        C41846B3n.A10(r3, sMBSupportStickerDict.A0D);
        String str12 = sMBSupportStickerDict.A0E;
        if (str12 != null) {
            r3.A0R("title_color", str12);
        }
        if (z) {
            r3.A0Z();
        }
    }
}
