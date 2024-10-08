package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* renamed from: X.Liv  reason: case insensitive filesystem */
public final class C64833Liv implements AnonymousClass0lh {
    public Vector A00 = new Vector();
    public 05G A01;
    public 05G A02 = 106.A01(0sl.A00);
    public final UserSession A03;
    public final AnonymousClass0Ud A04;

    public C64833Liv(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        02z A0u = C51967G9n.A0u();
        this.A01 = A0u;
        this.A04 = 10b.A03(A0u);
    }

    public final void A01(Context context, AnonymousClass3Q2 r15) {
        if (A02(r15, true)) {
            this.A01.Epw((Object) null);
            2IS A042 = C41845B3m.A04();
            UserSession userSession = this.A03;
            ArrayList A002 = AJ0.A00(context, userSession, "ig_android_access_library_igig_feed_cross_posting", "FxIgIgFeedXpostingHelper", (String) null, C368098s4.INSTAGRAM);
            ArrayList A0r = AnonymousClass7TG.A0r(A002);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                2IV r3 = new 2IV();
                r3.A09(((C376139Gr) it.next()).A01.A00, AnonymousClass000.A00(1798));
                A0r.add(r3);
            }
            A042.A05("target_logged_in_account_tokens", ImmutableList.copyOf((Collection) A0r));
            C239113Fa r32 = new C239113Fa(A042, C60869Jsc.class, "IGFxGenEligibleIgIgCrosspostingAccounts", false);
            C363088j4.A00(userSession).ATL(C64392Lb9.A00, new C64398LbF(0, context, this), r32);
        }
    }

    public static final String A00(C64833Liv liv, String str) {
        Object obj;
        List A16 = JTO.A16(liv.A01);
        if (A16 == null) {
            return null;
        }
        Iterator it = A16.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((L6Z) obj).A00, str)) {
                break;
            }
        }
        L6Z l6z = (L6Z) obj;
        if (l6z != null) {
            return l6z.A02;
        }
        return null;
    }

    public final boolean A02(AnonymousClass3Q2 r6, boolean z) {
        boolean A06;
        0Tu r2;
        long j;
        UserSession userSession = this.A03;
        0Tu r4 = 0Tu.A06;
        if (182.A06(r4, userSession, 2342157722205555462L)) {
            return false;
        }
        if (r6 != null && r6.A0u() && !r6.CJg()) {
            r2 = 0Tu.A05;
            j = 36314712992189195L;
        } else if (182.A06(r4, userSession, 36314712991992584L) && (r6 == null || !r6.A0y())) {
            return false;
        } else {
            if (z) {
                r2 = 0Tu.A05;
                j = 36314712991927047L;
            } else {
                A06 = 182.A06(r4, userSession, 36314712991927047L);
                return Boolean.valueOf(A06).booleanValue();
            }
        }
        A06 = 182.A06(r2, userSession, j);
        return Boolean.valueOf(A06).booleanValue();
    }

    public final void onSessionWillEnd() {
        this.A03.A03(C64833Liv.class);
    }
}
