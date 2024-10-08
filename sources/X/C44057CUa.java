package X;

import java.io.IOException;

/* renamed from: X.CUa  reason: case insensitive filesystem */
public abstract class C44057CUa {
    public static BDq parseFromJson(16F r29) {
        16F r4 = r29;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Integer num2 = null;
            Integer num3 = null;
            String str7 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str8 = null;
            Integer num4 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            BDr bDr = null;
            String str15 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("appId".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                } else if ("appInstallObjectiveInvalidationBehavior".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else if ("appName".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r4.A1P();
                    }
                } else if ("callToActionTitle".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r4.A1P();
                    }
                } else if ("canvasDocId".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r4.A1P();
                    }
                } else if ("contentId".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r4.A1P();
                    }
                } else if ("deeplinkUri".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r4.A1P();
                    }
                } else if ("funnelId".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r4);
                } else if ("funnelPurpose".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r4);
                } else if ("igUserId".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r4.A1P();
                    }
                } else if ("isAndroidAppLink".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r4);
                } else if ("isSKOverlayEnabled".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r4);
                } else if ("isUniversalLink".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r4);
                } else if ("isVtOdirEligible".equals(A17)) {
                    bool4 = AnonymousClass7TF.A0S(r4);
                } else if ("leadGenFormId".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r4.A1P();
                    }
                } else if ("linkType".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r4);
                } else if ("package".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r4.A1P();
                    }
                } else if ("playableUri".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r4.A1P();
                    }
                } else if ("productPageId".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r4.A1P();
                    }
                } else if ("rawWebUri".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r4.A1P();
                    }
                } else if ("redirectUri".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str13 = null;
                    } else {
                        str13 = r4.A1P();
                    }
                } else if ("referrerData".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str14 = null;
                    } else {
                        str14 = r4.A1P();
                    }
                } else if ("skAdNetworkMetadata".equals(A17)) {
                    bDr = C44058CUb.parseFromJson(r4);
                } else if ("webUri".equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str15 = null;
                    } else {
                        str15 = r4.A1P();
                    }
                }
                r4.A0z();
            }
            if (str3 != null || !(r4 instanceof 0c9)) {
                return new BDq(bDr, bool, bool2, bool3, bool4, num, num2, num3, num4, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
            }
            AnonymousClass7TF.A1L("callToActionTitle", r4, "AsyncAdLinkImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
