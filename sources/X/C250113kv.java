package X;

import com.instagram.model.androidlink.AndroidLinkImpl;
import java.io.IOException;

/* renamed from: X.3kv  reason: invalid class name and case insensitive filesystem */
public abstract class C250113kv {
    public static AndroidLinkImpl parseFromJson(16F r30) {
        16F r2 = r30;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            Integer num2 = null;
            String str11 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str12 = null;
            Integer num3 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("androidClass".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("appId".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if ("appInstallObjectiveInvalidationBehavior".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("appName".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("callToActionTitle".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("canvasData".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("canvasDocId".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("contentId".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("deeplinkUri".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("destinationContext".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("funnelId".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r2.A1P();
                    }
                } else if ("funnelPurpose".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("igUserId".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r2.A1P();
                    }
                } else if ("isAndroidAppLink".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("isSKOverlayEnabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("isUniversalLink".equals(A0q)) {
                    bool3 = Boolean.valueOf(r2.A0d());
                } else if ("isVtOdirEligible".equals(A0q)) {
                    bool4 = Boolean.valueOf(r2.A0d());
                } else if ("leadGenFormId".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r2.A1P();
                    }
                } else if ("linkType".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                } else if ("package".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r2.A1P();
                    }
                } else if ("playableUri".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r2.A1P();
                    }
                } else if ("productPageId".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r2.A1P();
                    }
                } else if ("rawWebUri".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str16 = null;
                    } else {
                        str16 = r2.A1P();
                    }
                } else if ("redirectUri".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str17 = null;
                    } else {
                        str17 = r2.A1P();
                    }
                } else if ("referrerData".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str18 = null;
                    } else {
                        str18 = r2.A1P();
                    }
                } else if ("tapAndHoldContext".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str19 = null;
                    } else {
                        str19 = r2.A1P();
                    }
                } else if ("webUri".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str20 = null;
                    } else {
                        str20 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            return new AndroidLinkImpl(bool, bool2, bool3, bool4, num, num2, num3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, AndroidLinkImpl androidLinkImpl) {
        r2.A0c();
        String str = androidLinkImpl.A08;
        if (str != null) {
            r2.A0R("androidClass", str);
        }
        String str2 = androidLinkImpl.A09;
        if (str2 != null) {
            r2.A0R("appId", str2);
        }
        Integer num = androidLinkImpl.A04;
        if (num != null) {
            r2.A0P("appInstallObjectiveInvalidationBehavior", num.intValue());
        }
        String str3 = androidLinkImpl.A0A;
        if (str3 != null) {
            r2.A0R("appName", str3);
        }
        String str4 = androidLinkImpl.A0B;
        if (str4 != null) {
            r2.A0R("callToActionTitle", str4);
        }
        String str5 = androidLinkImpl.A0C;
        if (str5 != null) {
            r2.A0R("canvasData", str5);
        }
        String str6 = androidLinkImpl.A0D;
        if (str6 != null) {
            r2.A0R("canvasDocId", str6);
        }
        String str7 = androidLinkImpl.A0E;
        if (str7 != null) {
            r2.A0R("contentId", str7);
        }
        String str8 = androidLinkImpl.A0F;
        if (str8 != null) {
            r2.A0R("deeplinkUri", str8);
        }
        String str9 = androidLinkImpl.A0G;
        if (str9 != null) {
            r2.A0R("destinationContext", str9);
        }
        String str10 = androidLinkImpl.A0H;
        if (str10 != null) {
            r2.A0R("funnelId", str10);
        }
        Integer num2 = androidLinkImpl.A05;
        if (num2 != null) {
            r2.A0P("funnelPurpose", num2.intValue());
        }
        String str11 = androidLinkImpl.A0I;
        if (str11 != null) {
            r2.A0R("igUserId", str11);
        }
        Boolean bool = androidLinkImpl.A00;
        if (bool != null) {
            r2.A0S("isAndroidAppLink", bool.booleanValue());
        }
        Boolean bool2 = androidLinkImpl.A01;
        if (bool2 != null) {
            r2.A0S("isSKOverlayEnabled", bool2.booleanValue());
        }
        Boolean bool3 = androidLinkImpl.A02;
        if (bool3 != null) {
            r2.A0S("isUniversalLink", bool3.booleanValue());
        }
        Boolean bool4 = androidLinkImpl.A03;
        if (bool4 != null) {
            r2.A0S("isVtOdirEligible", bool4.booleanValue());
        }
        String str12 = androidLinkImpl.A0J;
        if (str12 != null) {
            r2.A0R("leadGenFormId", str12);
        }
        Integer num3 = androidLinkImpl.A06;
        if (num3 != null) {
            r2.A0P("linkType", num3.intValue());
        }
        String str13 = androidLinkImpl.A07;
        if (str13 != null) {
            r2.A0R("package", str13);
        }
        String str14 = androidLinkImpl.A0K;
        if (str14 != null) {
            r2.A0R("playableUri", str14);
        }
        String str15 = androidLinkImpl.A0L;
        if (str15 != null) {
            r2.A0R("productPageId", str15);
        }
        String str16 = androidLinkImpl.A0M;
        if (str16 != null) {
            r2.A0R("rawWebUri", str16);
        }
        String str17 = androidLinkImpl.A0N;
        if (str17 != null) {
            r2.A0R("redirectUri", str17);
        }
        String str18 = androidLinkImpl.A0O;
        if (str18 != null) {
            r2.A0R("referrerData", str18);
        }
        String str19 = androidLinkImpl.A0P;
        if (str19 != null) {
            r2.A0R("tapAndHoldContext", str19);
        }
        String str20 = androidLinkImpl.A0Q;
        if (str20 != null) {
            r2.A0R("webUri", str20);
        }
        r2.A0Z();
    }
}
