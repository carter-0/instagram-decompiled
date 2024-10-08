package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.3WP  reason: invalid class name */
public abstract class AnonymousClass3WP {
    public static final String A00(UserSession userSession, 1Xj r4) {
        List list;
        AnonymousClass3WR r1;
        0qQ.A0B(userSession, 0);
        String str = null;
        if (r4 != null) {
            list = r4.A0C.C9Z();
            r1 = r4.CEL();
        } else {
            list = null;
            r1 = null;
        }
        if (!A0A(userSession, r1, list)) {
            return "";
        }
        if (r4 != null) {
            str = r4.A0C.CER();
        }
        return AnonymousClass3WS.A00(userSession, str);
    }

    public static final void A02(UserSession userSession, 1Xj r5, AnonymousClass4DU r6) {
        0qQ.A0B(userSession, 1);
        if (r5 != null) {
            AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
            r0.A00 = r6;
            0wc A00 = r0.A00();
            0Aj A002 = A00.A00(A00.A00, "instagram_video_subtitles_render_event");
            if (A002.isSampled()) {
                String id = r5.getId();
                if (id == null) {
                    id = "";
                }
                A002.AAJ("media_id", id);
                boolean z = false;
                Boolean bool = 1GE.A00(userSession).A01;
                if (!(bool == null || !bool.booleanValue() || 1w8.A00().A01 == 0)) {
                    z = true;
                }
                A002.A7p("is_sound_on", Boolean.valueOf(z));
                A002.AAJ("category", "shown");
                String A07 = C231122qu.A07(userSession, r5);
                if (A07 != null) {
                    A002.AAJ("ad_id", A07);
                }
                String A0F = C231122qu.A0F(userSession, r5);
                if (!(A07 == null || A0F == null)) {
                    A002.AAJ("ad_tracking_token", A0F);
                }
                A002.Cgf();
            }
        }
    }

    public static final void A04(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("show_video_captions", z);
        AR4.apply();
    }

    public static final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (1Au.A00(userSession).A01.contains("generate_captions_for_dovetail_video")) {
            1Av A00 = 1Au.A00(userSession);
            return ((Boolean) A00.A7o.CDM(A00, 1Av.A8a[28])).booleanValue();
        } else if (!1Au.A00(userSession).A01.contains("igtv_captions_toggled_on_pref")) {
            return true;
        } else {
            boolean z = 1Au.A00(userSession).A01.getBoolean("igtv_captions_toggled_on_pref", false);
            if (Boolean.valueOf(z) == null) {
                return true;
            }
            return z;
        }
    }

    public static final boolean A07(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        return A00.A01.getBoolean("show_video_captions", 182.A06(0Tu.A05, userSession, 36315928467607230L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36322920674765485L) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A08(com.instagram.common.session.UserSession r4, X.1Xj r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r3 = 0
            if (r5 == 0) goto L_0x004f
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.CEY()
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            X.1Xy r0 = r5.A0C
            java.util.List r1 = r0.C9Z()
            X.3WR r0 = r5.CEL()
            boolean r0 = A0A(r4, r0, r1)
            if (r0 == 0) goto L_0x0032
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322920674765485(0x810b8100062aad, double:3.034099523158997E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x004e
        L_0x0032:
            X.3WR r0 = r5.CEL()
            boolean r0 = X.AnonymousClass3WS.A0B(r4, r0)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.AnonymousClass3WS.A08(r4, r5)
            if (r0 != 0) goto L_0x0048
            boolean r0 = X.AnonymousClass3WS.A0A(r4, r5)
            if (r0 == 0) goto L_0x004f
        L_0x0048:
            boolean r0 = X.AnonymousClass3WS.A07(r4)
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r3 = 1
        L_0x004f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WP.A08(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public static final boolean A09(UserSession userSession, AnonymousClass3WR r5, Boolean bool, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str3;
        0qQ.A0B(userSession, 0);
        if (z2) {
            if (0qQ.A0K(bool, true) || !z3 || !z4) {
                return false;
            }
            return !z;
        } else if (!z3 || !z4) {
            return false;
        } else {
            if (2R8.A05(userSession, str) && !z5) {
                return false;
            }
            if (!A07(userSession)) {
                if (!A0A(userSession, r5, list)) {
                    return false;
                }
                1Av A00 = 1Au.A00(userSession);
                String obj = AnonymousClass1Q2.A02().toString();
                0qQ.A07(obj);
                Set A0J = A00.A0J(0sc.A06(new String[]{00R.A03(obj, 2)}));
                if (str2 != null) {
                    str3 = 00R.A03(str2, 2);
                } else {
                    str3 = null;
                }
                if (!A0J.contains(str3)) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    public static final boolean A0A(UserSession userSession, AnonymousClass3WR r5, List list) {
        0qQ.A0B(userSession, 0);
        if (list == null || list.isEmpty() || AnonymousClass3WS.A0B(userSession, r5) || !182.A06(0Tu.A05, userSession, 36322920674437800L) || !AnonymousClass3WS.A06(userSession)) {
            return false;
        }
        return true;
    }

    public static final String A01(String str) {
        if (str == null) {
            return "";
        }
        String language = Locale.forLanguageTag(00p.A0g(str, "_", "-", false)).getLanguage();
        0qQ.A07(language);
        return language;
    }

    public static final void A03(UserSession userSession, boolean z) {
        String str;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36322920674896559L);
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        if (A06) {
            str = "auto_translate_reels_captions";
        } else {
            str = "auto_translate_reels";
        }
        AR4.E5T(str, z);
        AR4.apply();
    }

    public static final boolean A05(UserSession userSession) {
        return 182.A06(0Tu.A05, userSession, 36322920674896559L);
    }

    public static final boolean A0B(1Xj r1) {
        if (r1 == null || !(!0qQ.A0K(r1.A0C.CEQ(), false))) {
            return false;
        }
        return true;
    }
}
