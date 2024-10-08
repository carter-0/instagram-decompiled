package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DeN  reason: case insensitive filesystem */
public final class C46400DeN {
    public static long A00;
    public static long A01;
    public static String A02 = "";
    public static String A03 = "";
    public static boolean A04;
    public static final AnonymousClass0JR A05;
    public static final String A06 = DbV.A0t();

    public static final HashMap A02(C46398DeL deL, 0lg r13, Boolean bool, Long l, Long l2, long j, boolean z) {
        String str;
        0qQ.A0B(r13, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r13), "switcher_button_tapped");
        String A0j = AnonymousClass7TG.A0j();
        double A002 = DbS.A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        16V A012 = AnonymousClass0eD.A01(r13);
        String[] A08 = A08(deL);
        String str2 = A08[0];
        String str3 = A08[1];
        String valueOf = String.valueOf(A002);
        if (valueOf != null) {
            A1E.put(TraceFieldType.StartTime, valueOf);
        }
        A1E.put("event_session_id", A0j);
        A1E.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, deL.A00);
        if (A0e.isSampled()) {
            A0e.A7p("is_badge_shown", Boolean.valueOf(z));
            A0e.A9F("badge_count", Long.valueOf(j));
            A0e.A9F("raw_initiator_account_id", l);
            A0e.A9F("initiator_identity_id", l2);
            A0e.A8M(C46397DeK.INSTAGRAM, "initiator_account_type");
            A0e.A7p("is_cds", bool);
            A0e.A8M(deL, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            DbW.A12(A0e, A002);
            A0e.AAJ("event_session_id", A0j);
            DbS.A1H(A0e, "switcher");
            if (16V.A08 == A012) {
                str = null;
            } else {
                int ordinal = A012.ordinal();
                if (ordinal == 2) {
                    str = "IG_BUSINESS";
                } else if (ordinal != 3) {
                    str = "IG_PERSONAL";
                } else {
                    str = "IG_CREATOR";
                }
            }
            A0e.AAJ("initiator_identity_type", str);
            A0e.AAJ("tooltip_type", str2);
            A0e.A7p("is_tooltip_shown", DbV.A0m(str3));
            A0e.Cgf();
        }
        return A1E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e4, code lost:
        if (r0 == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.0lg r11, java.lang.Long r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, double r21, boolean r23, boolean r24, boolean r25) {
        /*
            r3 = 0
            X.DbW.A1O(r11, r3, r15)
            X.0wc r1 = X.AnonymousClass0kN.A02(r11)
            java.lang.String r0 = "switched_success"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 377(0x179, float:5.28E-43)
            X.1Ln r2 = new X.1Ln
            r2.<init>(r1, r0)
            X.DeL r4 = A00(r16)
            java.lang.String[] r1 = A08(r4)
            r3 = r1[r3]
            r0 = 1
            r10 = r1[r0]
            X.AnonymousClass0eD.A01(r11)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "raw_target_account_id"
            r2.A0Q(r0, r12)
            java.lang.String r0 = "target_identity_id"
            r2.A0Q(r0, r13)
            r9 = 0
            if (r20 == 0) goto L_0x00e7
            X.DeK r1 = A01(r20)
        L_0x003c:
            java.lang.String r0 = "target_account_type"
            r2.A0M(r1, r0)
            java.lang.String r0 = "entry_point"
            r2.A0M(r4, r0)
            java.lang.Double r1 = java.lang.Double.valueOf(r21)
            java.lang.String r0 = "start_time"
            r2.A0P(r0, r1)
            java.lang.String r0 = "xapp_session_id"
            r1 = r19
            r2.A0R(r0, r1)
            java.lang.String r0 = "event_session_id"
            r2.A0R(r0, r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r23)
            java.lang.String r0 = "is_logged_in"
            r2.A0O(r0, r1)
            java.lang.String r0 = "switch_type"
            r2.A0R(r0, r14)
            r11 = r18
            if (r18 == 0) goto L_0x0083
            int r0 = r11.hashCode()
            java.lang.String r9 = "app_store"
            java.lang.String r8 = "a2w_success"
            java.lang.String r7 = "logged_out"
            java.lang.String r6 = "preload"
            java.lang.String r5 = "a2w_failed_route_to_appstore"
            java.lang.String r4 = "inactive_session"
            java.lang.String r1 = "active_session"
            switch(r0) {
                case -1663636798: goto L_0x00c7;
                case -785521755: goto L_0x00cd;
                case -318476791: goto L_0x00d3;
                case 518669073: goto L_0x00d9;
                case 705975146: goto L_0x00df;
                case 1842542915: goto L_0x00c2;
                default: goto L_0x0082;
            }
        L_0x0082:
            r9 = r1
        L_0x0083:
            java.lang.String r0 = "landing_point"
            r2.A0R(r0, r9)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)
            java.lang.String r0 = "is_cds"
            r2.A0O(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            java.lang.String r0 = "is_sso_enabled"
            r2.A0O(r0, r1)
            java.lang.Boolean r1 = X.DbV.A0m(r10)
            java.lang.String r0 = "is_tooltip_shown"
            r2.A0O(r0, r1)
            java.lang.String r0 = "tooltip_type"
            r2.A0R(r0, r3)
            X.DeK r1 = A01(r17)
            java.lang.String r0 = "initiator_account_type"
            r2.A0M(r1, r0)
            double r0 = X.DbS.A01()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "end_time"
            r2.A0P(r0, r1)
            r2.Cgf()
        L_0x00c1:
            return
        L_0x00c2:
            boolean r0 = r11.equals(r9)
            goto L_0x00e4
        L_0x00c7:
            boolean r0 = r11.equals(r4)
            r9 = r4
            goto L_0x00e4
        L_0x00cd:
            boolean r0 = r11.equals(r5)
            r9 = r5
            goto L_0x00e4
        L_0x00d3:
            boolean r0 = r11.equals(r6)
            r9 = r6
            goto L_0x00e4
        L_0x00d9:
            boolean r0 = r11.equals(r7)
            r9 = r7
            goto L_0x00e4
        L_0x00df:
            boolean r0 = r11.equals(r8)
            r9 = r8
        L_0x00e4:
            if (r0 != 0) goto L_0x0083
            goto L_0x0082
        L_0x00e7:
            r1 = r9
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46400DeN.A03(X.0lg, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, boolean, boolean):void");
    }

    public static final void A06(UserSession userSession) {
        Iterator it = AnonymousClass0BO.A00(userSession).BO1(DbT.A0j(userSession)).iterator();
        while (it.hasNext()) {
            int A022 = DbT.A0k(it).A02();
            if (A022 > 0) {
                DbU.A0c(userSession).A00.AHZ();
                2aX r3 = new 2aX(2aD.A06, (List) null, A022, A022);
                2aT A0c = DbU.A0c(userSession);
                AnonymousClass2g1 r1 = AnonymousClass2g1.BOTTOM_SHEET_VERTICAL;
                C226252fx r4 = C226252fx.NUMBERED;
                A0c.A03(r4, r1, r3, AnonymousClass05K.A0C);
                2aV A0a = DbV.A0a(userSession);
                2aX r2 = new 2aX(2aD.A0p, (List) null, A022, A022);
                AnonymousClass2g1 r12 = AnonymousClass2g1.BOTTOM_SHEET;
                0qQ.A0B(r12, 0);
                A0a.A02(new C239993Jd(r4, r12, (C71062aE) null, (Set) null), r2);
            }
        }
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        A05 = awakeTimeSinceBootClock;
    }

    public static final C46398DeL A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -976711082:
                    if (str.equals("tab_bar_long_press")) {
                        return C46398DeL.A0D;
                    }
                    break;
                case -713987006:
                    if (str.equals("profile_title")) {
                        return C46398DeL.A09;
                    }
                    break;
                case -416741326:
                    if (str.equals("mini_switcher_select")) {
                        return C46398DeL.A06;
                    }
                    break;
                case -138683230:
                    if (str.equals("snack_bar")) {
                        return C46398DeL.A0B;
                    }
                    break;
                case 129084363:
                    if (str.equals("tab_bar_double_tap")) {
                        return C46398DeL.A0C;
                    }
                    break;
                case 359330359:
                    if (str.equals("new_account_created")) {
                        return C46398DeL.A07;
                    }
                    break;
                case 441111834:
                    if (str.equals("unknown_nt_action")) {
                        return C46398DeL.A0F;
                    }
                    break;
                case 660917936:
                    if (str.equals("direct_inbox")) {
                        return C46398DeL.A04;
                    }
                    break;
                case 1414199215:
                    if (str.equals("horizontal_switch")) {
                        return C46398DeL.A05;
                    }
                    break;
                case 2005378358:
                    if (str.equals("bookmark")) {
                        return C46398DeL.A03;
                    }
                    break;
            }
        }
        return C46398DeL.A0E;
    }

    public static final C46397DeK A01(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1984105012) {
                if (hashCode == 328036763 && str.equals("BARCELONA_ANDROID")) {
                    return C46397DeK.THREADS;
                }
            } else if (str.equals("FB_ANDROID")) {
                return C46397DeK.FACEBOOK;
            }
        }
        return C46397DeK.INSTAGRAM;
    }

    public static final synchronized void A05(0lg r9, String str, String str2) {
        synchronized (C46400DeN.class) {
            0qQ.A0B(r9, 0);
            boolean A1Y = DbW.A1Y(str2);
            if (A04) {
                02m r4 = 02m.A0p;
                0qQ.A07(r4);
                r4.markerStart(857811724);
                r4.markerAnnotate(857811724, AnonymousClass000.A00(109), "PREVIOUS_TIMESTAMP_FOUND");
                r4.markerEnd(857811724, 3, A05.now(), TimeUnit.MILLISECONDS);
            }
            A04 = A1Y;
            A01 = A05.now();
            A02 = str2;
            A03 = str;
        }
    }

    public static final String[] A08(C46398DeL deL) {
        String str;
        boolean z;
        if (C46398DeL.A0D == deL) {
            z = AnonymousClass7TF.A1R(DbV.A0d().getInt("long_press_account_switcher_row_to_create_shortcut_tooltip_impressions", 0));
            str = "long_press_tooltip";
        } else {
            str = "";
            z = false;
        }
        if (C46398DeL.A0C == deL) {
            z = AnonymousClass7TF.A1R(DbV.A0d().getInt("preference_double_tap_profile_tab_tooltip_impressions", 0));
            str = "double_tap_tooltip";
        }
        return new String[]{str, String.valueOf(z)};
    }

    public static final void A04(0lg r3, String str, String str2) {
        AnonymousClass7TG.A1N(r3, str);
        02m r32 = 02m.A0p;
        0qQ.A07(r32);
        r32.markerStart(857814227);
        r32.markerAnnotate(857814227, Dbq.A04(), A06);
        r32.markerAnnotate(857814227, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        if (!"".equals(str2)) {
            r32.markerAnnotate(857814227, "native_or_bloks", str2);
        }
    }

    public static final void A07(UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "switcher_tooltip_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("tooltip_type", str);
            A0e.Cgf();
        }
    }
}
