package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.3WS  reason: invalid class name */
public abstract class AnonymousClass3WS {
    public static final String A00(UserSession userSession, String str) {
        String str2;
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        String obj = AnonymousClass1Q2.A02().toString();
        0qQ.A07(obj);
        Set A0J = A00.A0J(0sc.A06(new String[]{00R.A03(obj, 2)}));
        if (str != null) {
            str2 = 00R.A03(str, 2);
        } else {
            str2 = null;
        }
        if (A0J.contains(str2)) {
            return "";
        }
        String language = AnonymousClass1Q2.A02().getLanguage();
        0qQ.A07(language);
        return language;
    }

    public static final String A01(String str) {
        0qQ.A0B(str, 0);
        String displayLanguage = new Locale(str).getDisplayLanguage(AnonymousClass1Q2.A02());
        0qQ.A07(displayLanguage);
        return displayLanguage;
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36323156897639330L);
    }

    public static final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36322920674437800L) || 182.A06(r2, userSession, 36323002278816488L) || 182.A06(r2, userSession, 36323002278750951L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        return A00.A01.getBoolean(AnonymousClass000.A00(2678), 182.A06(0Tu.A06, userSession, 36323156897639330L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A07(com.instagram.common.session.UserSession r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.1Av r3 = X.1Au.A00(r4)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36322920674437800(0x810b8100012aa8, double:3.0340995229517677E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x002c
            r0 = 36323002278816488(0x810b9400012ae8, double:3.0341511298894444E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x002c
            r0 = 36323002278750951(0x810b9400002ae7, double:3.0341511298479985E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r2 = 0
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            X.0xa r1 = r3.A01
            java.lang.String r0 = "auto_translate_reels"
            boolean r0 = r1.getBoolean(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WS.A07(com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A08(UserSession userSession, 1Xj r5) {
        return r5 != null && A0C(r5) && 182.A06(0Tu.A05, userSession, 36323002278816488L);
    }

    public static final boolean A09(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 0);
        if (!2R8.A02(userSession, r2) || !r2.CEL().A07()) {
            return false;
        }
        return true;
    }

    public static final boolean A0A(UserSession userSession, 1Xj r5) {
        return r5 != null && A0D(r5) && 182.A06(0Tu.A05, userSession, 36323002278750951L);
    }

    public static final boolean A0B(UserSession userSession, AnonymousClass3WR r5) {
        Locale A03;
        0qQ.A0B(userSession, 0);
        if (r5 == null) {
            return false;
        }
        if (AnonymousClass11c.A01) {
            A03 = AnonymousClass1Q2.A02();
        } else {
            A03 = AnonymousClass1Q2.A03();
        }
        String language = A03.getLanguage();
        0qQ.A0A(language);
        if (!r5.A09(language) || !182.A06(0Tu.A05, userSession, 36323156897639330L) || !A05(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        if (!182.A06(0Tu.A05, userSession, 36322920674896559L)) {
            return A07(userSession);
        }
        1Av A00 = 1Au.A00(userSession);
        return A00.A01.getBoolean("auto_translate_reels_captions", A07(userSession));
    }

    public static final boolean A0C(1Xj r2) {
        List list;
        List<C255783ui> A3o = r2.A3o(AnonymousClass3WT.CLIPS_KARAOKE_CAPTIONS_STICKER);
        if (A3o != null && !A3o.isEmpty() && (!(A3o instanceof Collection) || !A3o.isEmpty())) {
            for (C255783ui r0 : A3o) {
                BFH bfh = r0.A0J;
                if (bfh != null && (list = bfh.A06) != null && !list.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A0D(1Xj r2) {
        List list;
        List<C255783ui> A3o = r2.A3o(AnonymousClass3WT.CLIPS_TEXT);
        if (A3o != null && !A3o.isEmpty() && (!(A3o instanceof Collection) || !A3o.isEmpty())) {
            for (C255783ui r0 : A3o) {
                C42117BHv bHv = r0.A0g;
                if (bHv != null && (list = bHv.A09) != null && !list.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        if (!A04(userSession) && !182.A06(0Tu.A05, userSession, 36323156897639330L)) {
            0Tu r2 = 0Tu.A06;
            if (182.A06(r2, userSession, 36322920674503337L) || 182.A06(r2, userSession, 36323156897704867L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
