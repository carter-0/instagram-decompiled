package X;

import com.instagram.common.session.UserSession;

public abstract class I2F {
    public static void A01(HNS hns, HNP hnp, AnonymousClass1Xp r9, UserSession userSession, AnonymousClass4DU r11) {
        AnonymousClass1Xp r6 = r9;
        HNS hns2 = hns;
        HNP hnp2 = hnp;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r7 = r11;
        if (r9 instanceof 1Xj) {
            1Xj r1 = (1Xj) r6;
            String A11 = DbT.A11(hnp2, HNP.A01);
            if (A11 == null) {
                A11 = "other";
            }
            String A112 = DbT.A11(hns2, HNS.A02);
            if (A112 == null) {
                A112 = "other";
            }
            0qQ.A0B(r1, 1);
            C254523sc A00 = C55028Haz.A00(r1, r11, "igtv_sensitivity_screen_action");
            A00.A6x = A11;
            A00.A4J = A112;
            C233822wX.A0I(userSession, A00, r11, AnonymousClass05K.A00);
        }
        A00(hns2, hnp2, r6, r7, userSession2, AnonymousClass05K.A0j);
    }

    public static void A00(HNS hns, HNP hnp, AnonymousClass1Xp r7, AnonymousClass0iw r8, UserSession userSession, Integer num) {
        HOG hog;
        C54686HOr hOr;
        C277994w4 BQf = r7.BQf();
        if (BQf != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), "instagram_media_overlay");
            if (A0e.isSampled()) {
                A0e.AAJ("client_event_name", "action");
                C51969G9p.A1A(A0e, r8);
                A0e.A9F("entity_id", DbV.A0q(r7.Bi4()));
                A0e.AAJ("overlay_type", BQf.getOverlayType());
                Integer A03 = C52501GVd.A03(BQf);
                A03.getClass();
                A0e.AAJ("overlay_layout_type", HUD.A00(A03));
                A0e.AAJ("action", hns.A01);
                A0e.AAJ("source_of_action", hnp.A00);
                A0e.AAJ("action_url", hns.A00);
                A0e.AAJ("ixt_session_id", BQf.getSessionId());
                A0e.AAJ("subcategory", BQf.getSubCategory());
                A0e.Cgf();
            }
            if (C52501GVd.A04(BQf)) {
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), "cix_warning_screens");
                if (A0e2.isSampled()) {
                    DbS.A1I(A0e2, "action");
                    A0e2.A8M((AnonymousClass0Ac) null, "integrity_ui_element");
                    int ordinal = hns.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        hog = HOG.SHOW_CONTENT;
                    } else if (ordinal != 2) {
                        hog = null;
                    } else {
                        hog = HOG.OPEN_MISINFO_SEE_WHY_DIALOG;
                    }
                    A0e2.A8M(hog, "action");
                    String overlayType = BQf.getOverlayType();
                    if ("MISINFORMATION".equals(overlayType)) {
                        hOr = C54686HOr.A02;
                    } else if ("SENSITIVITY".equals(overlayType)) {
                        hOr = C54686HOr.A03;
                    } else {
                        hOr = null;
                    }
                    A0e2.A8M(hOr, "top_warning_screen_category");
                    A0e2.A9F("ig_content_igid", DbV.A0q(r7.Bi4()));
                    C51965G9l.A1A(C21318XVl.A00(num), A0e2);
                    A0e2.AAJ("endpoint", r8.getModuleName());
                    A0e2.Cgf();
                }
            }
        }
    }

    public static void A02(AnonymousClass1Xp r4, AnonymousClass0iw r5, UserSession userSession, Integer num) {
        C54686HOr hOr;
        C277994w4 BQf = r4.BQf();
        if (BQf != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_media_overlay");
            if (A0e.isSampled()) {
                A0e.AAJ("client_event_name", "impression");
                C51969G9p.A1A(A0e, r5);
                A0e.A9F("entity_id", DbV.A0q(r4.Bi4()));
                A0e.AAJ("overlay_type", BQf.getOverlayType());
                Integer A03 = C52501GVd.A03(BQf);
                A03.getClass();
                A0e.AAJ("overlay_layout_type", HUD.A00(A03));
                A0e.AAJ("ixt_session_id", BQf.getSessionId());
                A0e.AAJ("subcategory", BQf.getSubCategory());
                A0e.Cgf();
            }
            if (C52501GVd.A04(BQf)) {
                0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "cix_warning_screens");
                if (A0e2.isSampled()) {
                    DbS.A1I(A0e2, AnonymousClass000.A00(707));
                    String overlayType = BQf.getOverlayType();
                    if ("MISINFORMATION".equals(overlayType)) {
                        hOr = C54686HOr.A02;
                    } else if ("SENSITIVITY".equals(overlayType)) {
                        hOr = C54686HOr.A03;
                    } else {
                        hOr = null;
                    }
                    A0e2.A8M(hOr, "top_warning_screen_category");
                    A0e2.A9F("ig_content_igid", DbV.A0q(r4.Bi4()));
                    C51965G9l.A1A(C21318XVl.A00(num), A0e2);
                    A0e2.AAJ("endpoint", r5.getModuleName());
                    A0e2.Cgf();
                }
            }
        }
    }
}
