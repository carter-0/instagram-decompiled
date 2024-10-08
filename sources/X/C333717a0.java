package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7a0  reason: invalid class name and case insensitive filesystem */
public final class C333717a0 {
    public final C53335GmL A00;
    public final 0wc A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C249763kK A04;
    public final C60640iu A05;

    public C333717a0(C53335GmL gmL, UserSession userSession, AnonymousClass4DU r4, C249763kK r5) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(gmL, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r5, 4);
        this.A03 = r4;
        this.A00 = gmL;
        this.A02 = userSession;
        this.A04 = r5;
        this.A01 = AnonymousClass0kN.A01(r4, userSession);
        this.A05 = C60510iO.A00(userSession);
    }

    public final void A07(1Xl r11, String str, String str2, String str3, int i, int i2) {
        boolean z;
        0qQ.A0B(str2, 2);
        0xI A012 = A01(r11, str2, str, str3, str3, AnonymousClass000.A00(1203));
        1Xj BPf = r11.BPf();
        UserSession userSession = this.A02;
        AnonymousClass4DU r1 = this.A03;
        if (r11 instanceof 1Xj) {
            z = AnonymousClass3WX.A02(r11, r1);
        } else {
            z = false;
        }
        A03(A012, userSession, BPf, i, i2, z);
        String loggingInfoToken = r11.BPf().A0C.getLoggingInfoToken();
        if (loggingInfoToken != null) {
            A012.A0C("ranking_info_token", loggingInfoToken);
        }
        this.A05.EFq(A012);
    }

    public final void A08(1Xl r16, String str, String str2, String str3, int i, int i2) {
        boolean z;
        String str4 = str2;
        0qQ.A0B(str4, 2);
        UserSession userSession = this.A02;
        AnonymousClass4DU r2 = this.A03;
        String A002 = AnonymousClass000.A00(2906);
        1Xl r4 = r16;
        C254523sc A032 = C254513sb.A03(userSession, r4, r2, A002);
        A032.A4o = str4;
        String str5 = str;
        A032.A4q = str5;
        String str6 = str3;
        A032.A6k = str6;
        A032.A6J = str6;
        A032.A1e = Boolean.valueOf(r2.isOrganicEligible());
        if (!C271764jY.A00(userSession, A032, r2, AnonymousClass05K.A01)) {
            0xI A012 = A01(r4, str4, str5, str6, str6, A002);
            1Xj BPf = r4.BPf();
            if (r4 instanceof 1Xj) {
                z = AnonymousClass3WX.A02(r4, r2);
            } else {
                z = false;
            }
            A03(A012, userSession, BPf, i, i2, z);
            this.A05.EFq(A012);
        }
    }

    public final void A09(User user, String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(user, 1);
        0qQ.A0B(str2, 2);
        I21 i21 = I21.A00;
        UserSession userSession = this.A02;
        02m r2 = 02m.A0p;
        0qQ.A07(r2);
        r2.markerPoint(309476254, "select_comment_screen_un_restrict_tap");
        i21.A01(userSession);
        AnonymousClass73V r3 = AnonymousClass73V.A00;
        0wc r4 = this.A01;
        String A002 = C66579MXk.A00(1177);
        r3.A0J(r4, user, "click", A002, str2, str3, str, (String) null);
    }

    public final void A0A(User user, String str, String str2, String str3, String str4) {
        0qQ.A0B(str2, 1);
        0qQ.A0B(user, 2);
        0qQ.A0B(str3, 3);
        02m r2 = 02m.A0p;
        0qQ.A07(r2);
        r2.markerPoint(309476254, "select_comment_screen_restrict_tap");
        AnonymousClass73V r1 = AnonymousClass73V.A00;
        0wc r22 = this.A01;
        String str5 = str;
        r1.A0J(r22, user, "click", str5, str3, str4, str2, (String) null);
    }

    public final void A0C(String str, String str2, String str3, String str4) {
        AnonymousClass3U9 A0N;
        String C6k;
        0qQ.A0B(str2, 1);
        Long l = null;
        if (!(str4 == null || (A0N = 2L2.A00(this.A02).A0N(str4)) == null || (C6k = A0N.C6k()) == null)) {
            l = 00y.A0n(10, C6k);
        }
        Map A0M = 0se.A0M(new 0eP("nav_chain", AnonymousClass1QI.A00.A02.A00));
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "instagram_wellbeing_comment_cover_event");
        A002.AAJ("media_id", str2);
        A002.AAJ("step", str);
        A002.A9H("extra_values", A0M);
        A002.AAJ("action", (String) null);
        A002.AAJ("comment_id", str3);
        A002.A9F("thread_fbid", l);
        A002.AAJ("entrypoint", this.A03.getModuleName());
        A002.Cgf();
    }

    public static final int A00(Integer num, Integer num2) {
        if (num != null) {
            return num.intValue();
        }
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    private final 0xI A01(1Xl r9, String str, String str2, String str3, String str4, String str5) {
        UserSession userSession = this.A02;
        AnonymousClass4DU r5 = this.A03;
        0xI A002 = C254513sb.A03(userSession, r9, r5, str5).A00();
        1Xj BPf = r9.BPf();
        A002.A0C("c_pk", str);
        A002.A0C("ca_pk", str2);
        String A003 = C273654mx.A00(871);
        if (str3 != null) {
            A002.A0C(A003, str3);
        }
        String A004 = AnonymousClass000.A00(5183);
        if (str4 != null) {
            A002.A0C(A004, str4);
        }
        int ordinal = BPf.BR7().ordinal();
        int i = 2;
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal != 1) {
            i = -1;
        }
        A002.A08(Integer.valueOf(i), "m_t");
        A002.A0C("inventory_source", BPf.A0C.BIl());
        String sessionId = this.A04.getSessionId();
        String A022 = C46476Dff.A02(21, 10, 87);
        if (sessionId != null) {
            A002.A0C(A022, sessionId);
        }
        A002.A09("is_media_organic", Boolean.valueOf(r5.isOrganicEligible()));
        return A002;
    }

    public static final void A02(C333717a0 r5, String str, String str2, List list) {
        Map A0M = 0se.A0M(new 0eP("nav_chain", AnonymousClass1QI.A00.A02.A00));
        0wc r2 = r5.A01;
        0Aj A002 = r2.A00(r2.A00, AnonymousClass000.A00(3383));
        A002.AAJ("step", str);
        A002.A9H("extra_values", A0M);
        A002.AAJ(C46476Dff.A00(), str2);
        A002.AAJ(AnonymousClass000.A00(3943), 00k.A0P(",", "", "", list, (0sP) null));
        A002.Cgf();
    }

    public static final void A03(0xI r3, UserSession userSession, 1Xj r5, int i, int i2, boolean z) {
        if (z) {
            r3.A0C("action", r5.A0C.AYt());
            r3.A0C(AnonymousClass000.A00(1900), C231122qu.A0F(userSession, r5));
            r3.A0C("ad_id", C231122qu.A07(userSession, r5));
        }
        if (r5.A5D() && i != -1) {
            r3.A08(Integer.valueOf(i), "carousel_index");
            1Xj A1c = r5.A1c(0);
            if (A1c != null) {
                r3.A0C(C273654mx.A00(607), A1c.getId());
                1Xj A1c2 = r5.A1c(i);
                if (A1c2 != null) {
                    r3.A0C(C273654mx.A00(608), A1c2.getId());
                    r3.A0C(AnonymousClass000.A00(5020), r5.A0C.BOq());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (i2 >= 0) {
            r3.A08(Integer.valueOf(i2), "m_ix");
        }
    }

    public final void A05(C337207ft r8) {
        0wc r2 = this.A01;
        String str = r8.A02;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0Aj A002 = r2.A00(r2.A00, "instagram_wellbeing_warning_system_undo");
        A002.AAJ("source_of_action", "comment_create");
        A002.AAJ("text_language", str);
        A002.A7p("is_offensive", true);
        A002.A9H("extra_values", hashMap);
        A002.Cgf();
    }

    public final void A06(1Xj r18, Integer num, Integer num2, Integer num3) {
        int i;
        UserSession userSession = this.A02;
        C249763kK r6 = this.A04;
        AnonymousClass4DU r4 = this.A03;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        C233822wX.A0P(userSession, r18, r4, (SearchContext) null, r6, (Boolean) null, (Double) null, Integer.valueOf(A00(num2, num3)), (Integer) null, AnonymousClass000.A00(5210), (String) null, (String) null, (ArrayList) null, (HashMap) null, i);
    }

    public final void A0B(String str, int i) {
        C60640iu r4 = this.A05;
        AnonymousClass4DU r3 = this.A03;
        0xI A002 = 0xI.A00(r3, str);
        A002.A08(Integer.valueOf(i), "count");
        A002.A09("is_media_organic", Boolean.valueOf(r3.isOrganicEligible()));
        r4.EFq(A002);
    }

    public final void A0D(String str, String str2, String str3, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "ig_wellbeing_pin_comment_action");
        A002.AAJ("media_id", str3);
        A002.AAJ("comment_id", str2);
        A002.A7p("is_self_comment", Boolean.valueOf(z));
        A002.AAJ("step", str);
        A002.A9H("extra_values", hashMap);
        A002.AAJ("module_name", this.A03.getModuleName());
        A002.Cgf();
    }

    public final String A04() {
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        Map A0M = 0se.A0M(new 0eP("nav_chain", AnonymousClass1QI.A00.A02.A00));
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "instagram_wellbeing_comment_management_start_session");
        A002.AAJ(C46476Dff.A00(), obj);
        A002.A9H("extra_values", A0M);
        A002.Cgf();
        return obj;
    }
}
