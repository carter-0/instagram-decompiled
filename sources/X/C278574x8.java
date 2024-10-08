package X;

import com.instagram.api.schemas.OnImpressionStyle;
import java.io.IOException;

/* renamed from: X.4x8  reason: invalid class name and case insensitive filesystem */
public abstract class C278574x8 {
    public static C257863y5 parseFromJson(16F r19) {
        String str;
        16F r2 = r19;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            OnImpressionStyle onImpressionStyle = null;
            String str15 = null;
            String str16 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("dismiss_icon".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("negative_confirmation_body".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("negative_confirmation_cta_text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("negative_confirmation_icon".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("negative_confirmation_title".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("negative_icon".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("negative_text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("positive_confirmation_body".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("positive_confirmation_cta_text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r2.A1P();
                    }
                } else if ("positive_confirmation_icon".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r2.A1P();
                    }
                } else if ("positive_confirmation_title".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r2.A1P();
                    }
                } else if ("positive_icon".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r2.A1P();
                    }
                } else if ("positive_text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r2.A1P();
                    }
                } else if ("style".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                    onImpressionStyle = (OnImpressionStyle) OnImpressionStyle.A01.get(str);
                    if (onImpressionStyle == null) {
                        onImpressionStyle = OnImpressionStyle.UNRECOGNIZED;
                    }
                } else if ("subtext".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r2.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            return new C257863y5(onImpressionStyle, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C257863y5 r3) {
        r2.A0c();
        String str = r3.A01;
        if (str != null) {
            r2.A0R("dismiss_icon", str);
        }
        String str2 = r3.A02;
        if (str2 != null) {
            r2.A0R("negative_confirmation_body", str2);
        }
        String str3 = r3.A03;
        if (str3 != null) {
            r2.A0R("negative_confirmation_cta_text", str3);
        }
        String str4 = r3.A04;
        if (str4 != null) {
            r2.A0R("negative_confirmation_icon", str4);
        }
        String str5 = r3.A05;
        if (str5 != null) {
            r2.A0R("negative_confirmation_title", str5);
        }
        String str6 = r3.A06;
        if (str6 != null) {
            r2.A0R("negative_icon", str6);
        }
        String str7 = r3.A07;
        if (str7 != null) {
            r2.A0R("negative_text", str7);
        }
        String str8 = r3.A08;
        if (str8 != null) {
            r2.A0R("positive_confirmation_body", str8);
        }
        String str9 = r3.A09;
        if (str9 != null) {
            r2.A0R("positive_confirmation_cta_text", str9);
        }
        String str10 = r3.A0A;
        if (str10 != null) {
            r2.A0R("positive_confirmation_icon", str10);
        }
        String str11 = r3.A0B;
        if (str11 != null) {
            r2.A0R("positive_confirmation_title", str11);
        }
        String str12 = r3.A0C;
        if (str12 != null) {
            r2.A0R("positive_icon", str12);
        }
        String str13 = r3.A0D;
        if (str13 != null) {
            r2.A0R("positive_text", str13);
        }
        OnImpressionStyle onImpressionStyle = r3.A00;
        if (onImpressionStyle != null) {
            r2.A0R("style", onImpressionStyle.A00);
        }
        String str14 = r3.A0E;
        if (str14 != null) {
            r2.A0R("subtext", str14);
        }
        String str15 = r3.A0F;
        if (str15 != null) {
            r2.A0R("text", str15);
        }
        r2.A0Z();
    }
}
