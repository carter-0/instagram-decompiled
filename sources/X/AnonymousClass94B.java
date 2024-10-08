package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.94B  reason: invalid class name */
public abstract class AnonymousClass94B {
    public static final 1OC A01(UserSession userSession, Dda dda, G5K g5k, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str4;
        String username;
        Integer BPt;
        String str5;
        0qQ.A0B(userSession, 0);
        1NY A02 = AnonymousClass94C.A02(userSession, dda, g5k, str);
        A02.A0H("exclude_comment", z);
        A02.A07(AnonymousClass05K.A0Y);
        if (str != null) {
            A02.A9m("max_id", str);
        }
        if (z2) {
            A02.A9m("opal_only", "true");
        }
        if (z5) {
            A02.A9m("is_pull_to_refresh", "true");
        }
        A02.A9m("profile_grid_items_cursor", str2);
        A02.A9m("pinned_profile_grid_items_ids", str3);
        if (z3) {
            A02.A9m("fetch_profile_grid_items", "true");
            if (g5k instanceof C46323Dbr) {
                str5 = ((C46323Dbr) g5k).A00;
            } else if (g5k instanceof C46456DfK) {
                str5 = ((C46456DfK) g5k).A00;
            } else {
                throw new RuntimeException();
            }
            A02.A0A = 002.A0R(str5, str2);
        }
        long A01 = 182.A01(0Tu.A05, userSession, 36609626921375612L);
        if (A01 > 0) {
            A02.A07(AnonymousClass05K.A0N);
            A02.A01 = TimeUnit.SECONDS.toMillis(A01);
            User A00 = 0eE.A00(userSession).A00();
            if (g5k instanceof C46323Dbr) {
                str4 = ((C46323Dbr) g5k).A00;
                username = AnonymousClass3ZA.A00(A00);
            } else if (g5k instanceof C46456DfK) {
                str4 = ((C46456DfK) g5k).A00;
                username = A00.getUsername();
            }
            if (0qQ.A0K(str4, username) && (BPt = A00.A03.BPt()) != null) {
                A02.A0A = String.valueOf(BPt.intValue());
            }
        }
        A02.A0H("should_delay_media_metadata_fetch", z4);
        return A02.A0M();
    }

    public static final 1OC A02(UserSession userSession, G5K g5k, String str, boolean z) {
        return A01(userSession, (Dda) null, g5k, str, (String) null, (String) null, true, z, false, false, false);
    }

    public static final 1GP A03(1FR r11, UserSession userSession, Dda dda, G5K g5k, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object[] objArr;
        String str4;
        String str5;
        Integer num;
        boolean z6 = g5k instanceof C46323Dbr;
        if (z6) {
            objArr = new Object[]{((C46323Dbr) g5k).A00};
            str4 = "feed/user_stream/%s/";
        } else if (g5k instanceof C46456DfK) {
            objArr = new Object[]{((C46456DfK) g5k).A00};
            str4 = "feed/user/%s/username_stream/";
        } else {
            throw new RuntimeException();
        }
        String A06 = 0mp.A06(str4, objArr);
        1FZ r0 = new 1FZ(userSession, 1300788553, 1, false);
        r0.A08(AnonymousClass05K.A01);
        r0.A0A(A06);
        r0.A0A = 002.A0R(A06, str);
        r0.A00 = new 1Fj(new 0bH(userSession), new 1NX((File) null), AnonymousClass94D.class, true, false);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36323328696396889L)) {
            r0.A9m("can_support_carousel_mentions", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (dda != null) {
            19V.A01.add(new C318436ow(dda));
        }
        r0.A07(AnonymousClass05K.A0Y);
        if (str != null) {
            r0.A9m("max_id", str);
        }
        if (!(!182.A06(r3, userSession, 36323809733455402L) || r11 == null || (num = r11.A00) == null)) {
            r0.A0F("X-IG-Accept-Hint", 1Fo.A00(num));
        }
        String str6 = str2;
        r0.A9m("profile_grid_items_cursor", str6);
        r0.A9m("pinned_profile_grid_items_ids", str3);
        if (z2) {
            r0.A9m("fetch_profile_grid_items", "true");
            if (z6) {
                str5 = ((C46323Dbr) g5k).A00;
            } else if (g5k instanceof C46456DfK) {
                str5 = ((C46456DfK) g5k).A00;
            } else {
                throw new RuntimeException();
            }
            r0.A0A = 002.A0R(str5, str6);
        }
        if (z3) {
            r0.A9m("fetch_all_highlights", "true");
        }
        if (z4) {
            r0.A9m("is_pull_to_refresh", "true");
        }
        long A01 = 182.A01(r3, userSession, 36609626921375612L);
        if (A01 > 0 && !z) {
            r0.A07(AnonymousClass05K.A0N);
            r0.A01 = TimeUnit.SECONDS.toMillis(A01);
        }
        if (z5) {
            r0.A9m("should_delay_media_metadata_fetch", "true");
        }
        if (182.A06(r3, userSession, 36328216370822230L)) {
            r0.A06 = 1CE.A04;
        }
        return r0.A0M();
    }

    public static final 1Ef A00(UserSession userSession, Dda dda, G5K g5k, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        1Ef A00;
        G5K g5k2 = g5k;
        boolean z9 = g5k2 instanceof C46323Dbr;
        String A002 = C273654mx.A00(3170);
        boolean z10 = z6;
        boolean z11 = z5;
        boolean z12 = z8;
        Dda dda2 = dda;
        boolean z13 = z7;
        UserSession userSession2 = userSession;
        Integer num2 = num;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        boolean z14 = z;
        boolean z15 = z2;
        boolean z16 = z3;
        boolean z17 = z4;
        if (z9) {
            if (dda != null) {
                dda2.A0J(A002, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            }
            A00 = AnonymousClass94C.A01(userSession2, num2, ((C46323Dbr) g5k2).A00, str4, str5, str6, z14, z15, z16, z17, z11, false, z10, z13, z12);
        } else if (g5k2 instanceof C46456DfK) {
            if (dda != null) {
                dda2.A0J(A002, Dbm.A01());
            }
            A00 = AnonymousClass94C.A00(userSession2, num2, ((C46456DfK) g5k2).A00, str4, str5, str6, z14, z15, z16, z17, z11, false, z10, z13, z12);
        } else {
            throw new RuntimeException();
        }
        0qQ.A0C(A00, C273654mx.A00(848));
        return A00;
    }
}
