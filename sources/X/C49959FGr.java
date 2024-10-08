package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FGr  reason: case insensitive filesystem */
public abstract class C49959FGr {
    public static final void A06(AnonymousClass0iw r4, UserSession userSession, Integer num) {
        String str;
        Long l;
        String str2;
        String Ac5;
        0qQ.A0B(userSession, 0);
        C274674os A03 = A03(userSession, num);
        0Aj A02 = A02(AnonymousClass0kN.A01(r4, userSession), userSession, AnonymousClass000.A00(1484));
        DbS.A1H(A02, AnonymousClass000.A00(4059));
        DbS.A1J(A02, "view");
        A02.AAJ(Dd6.A01(), AnonymousClass7TG.A0j());
        A02.A7p("is_support_partner_enabled", Boolean.valueOf(AnonymousClass7TF.A1V(A03)));
        if (A03 != null) {
            str = A03.Bao();
        } else {
            str = null;
        }
        A02.AAJ("partner_name", str);
        if (A03 == null || (Ac5 = A03.Ac5()) == null) {
            l = null;
        } else {
            l = AnonymousClass7TE.A10(Ac5);
        }
        A02.A9F("partner_id", l);
        if (A03 != null) {
            str2 = A03.getUrl();
        } else {
            str2 = null;
        }
        A02.AAJ("url", str2);
        A02.AAJ("service_type", VG1.A00(num));
        A02.Cgf();
    }

    public static final boolean A08(UserSession userSession) {
        for (Integer A03 : AnonymousClass05K.A00(3)) {
            if (A03(userSession, A03) != null) {
                return true;
            }
        }
        return false;
    }

    public static final long A00(UserSession userSession) {
        return DbZ.A07(userSession.A06);
    }

    public static final long A01(String str) {
        Long A10;
        if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
            return 0;
        }
        return A10.longValue();
    }

    public static 0Aj A02(0wc r2, UserSession userSession, String str) {
        0Aj A00 = r2.A00(r2.A00, str);
        A00.A9F("igid", Long.valueOf(A00(userSession)));
        return A00;
    }

    public static final C274674os A03(UserSession userSession, Integer num) {
        User A0j = DbT.A0j(userSession);
        if (num == AnonymousClass05K.A01) {
            return A0j.A03.Bwz();
        }
        return A0j.A03.Bx2();
    }

    public static void A04(0Aj r2, String str, boolean z) {
        r2.A7p("is_profile_owner", Boolean.valueOf(z));
        r2.A9F("profile_owner_id", Long.valueOf(A01(str)));
    }

    public static final void A05(AnonymousClass0iw r2, UserSession userSession) {
        0Aj A02 = A02(DbX.A0O(r2, userSession), userSession, AnonymousClass000.A00(1484));
        DbS.A1H(A02, AnonymousClass000.A00(1852));
        DbS.A1J(A02, "dismiss");
        A02.AAJ(Dd6.A01(), AnonymousClass7TG.A0j());
        A02.A7p("is_support_partner_enabled", Boolean.valueOf(A08(userSession)));
        A02.Cgf();
    }

    public static final void A07(AnonymousClass0iw r2, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5) {
        String str6;
        0Aj A02 = A02(DbX.A0O(r2, userSession), userSession, "instagram_smb_partner_flow_consumer");
        DbS.A1H(A02, C273654mx.A00(3105));
        DbS.A1J(A02, "open");
        A02.AAJ(Dd6.A01(), AnonymousClass7TG.A0j());
        boolean z = true;
        if (str3 == null || !2R8.A07(userSession.A06, str3)) {
            z = false;
        }
        A04(A02, str3, z);
        Dba.A1A(A02, str4, str5);
        if (num != null) {
            str6 = VG1.A00(num);
        } else {
            str6 = null;
        }
        Dbc.A0d(A02, str6, str2, str);
    }
}
