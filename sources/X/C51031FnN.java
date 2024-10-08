package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.FnN  reason: case insensitive filesystem */
public final class C51031FnN implements G7P {
    public Reel A00;
    public C48086EVe A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass4D6 A05;
    public final F35 A06;
    public final C51924G7s A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A00(0eO.A02, new C20607Wvo(this, 38));

    public C51031FnN(Fragment fragment, AnonymousClass0iw r5, UserSession userSession, AnonymousClass4D6 r7, F35 f35, C51924G7s g7s) {
        0qQ.A0B(userSession, 2);
        this.A02 = fragment;
        this.A04 = userSession;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = f35;
        this.A07 = g7s;
    }

    public final void A01(C14631Tzd tzd) {
        0qQ.A0B(tzd, 0);
        Fragment fragment = this.A02;
        if (fragment.getContext() != null) {
            User user = tzd.A0L;
            if (user != null) {
                this.A06.A01(user);
                boolean CPV = user.CPV();
                1Z4 r4 = 1Z4.A00;
                Context context = fragment.getContext();
                if (context != null) {
                    r4.A00(context, (FragmentActivity) null, this.A04, user, new C51047Fnd(tzd, this, CPV), this.A03.getModuleName(), (String) null, user.getUsername());
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r12.A02 == null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C14631Tzd r12) {
        /*
            r11 = this;
            r0 = 0
            X.0qQ.A0B(r12, r0)
            androidx.fragment.app.Fragment r0 = r11.A02
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L_0x00aa
            com.instagram.user.model.User r4 = r12.A0L
            if (r4 == 0) goto L_0x00ab
            X.F35 r0 = r11.A06
            X.0wc r1 = r0.A00
            java.lang.String r0 = "reel_viewer_dashboard_overflow_click"
            X.0Aj r2 = X.DbZ.A0G(r1, r4, r0)
            int r0 = X.DbZ.A03(r2, r4)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "entity_user_type"
            r2.AAJ(r0, r1)
            r2.Cgf()
            java.lang.Integer r10 = r12.A0M
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            if (r10 != r9) goto L_0x0035
            X.3gp r0 = r12.A02
            r6 = 1
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            com.instagram.common.session.UserSession r5 = r11.A04
            X.6nl r8 = new X.6nl
            r8.<init>(r5)
            X.3gp r7 = r12.A02
            r2 = 0
            if (r7 == 0) goto L_0x006f
            X.3uh r0 = r12.A0K
            if (r0 == 0) goto L_0x006f
            X.1Xj r1 = r0.A0b
            if (r1 == 0) goto L_0x006f
            if (r10 != r9) goto L_0x006f
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x006f
            X.1Xy r0 = r1.A0C
            java.util.List r0 = r0.C0K()
            if (r0 == 0) goto L_0x006f
            java.util.Map r1 = X.JZW.A01(r0)
            java.lang.String r0 = r7.A0G
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x006f
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            java.lang.String r9 = r4.getId()
            X.ExF r8 = new X.ExF
            r8.<init>(r12, r11)
            X.E1Y r7 = new X.E1Y
            r7.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "ReelDashboardActionsFragment.VIEWER_USER_ID"
            r1.putString(r0, r9)
            java.lang.String r0 = "ReelDashboardActionsFragment.IS_COMMENTS_ACTION"
            r1.putBoolean(r0, r6)
            java.lang.String r0 = "ReelDashboardActionsFragment.IS_COMMENT_LIKES_ACTION"
            r1.putBoolean(r0, r2)
            r7.setArguments(r1)
            r7.A04 = r8
            r7.A01 = r12
            X.7Pr r2 = X.DbS.A0W(r5)
            r1 = 3
            X.FmB r0 = new X.FmB
            r0.<init>(r1, r4, r11, r12)
            r2.A0U = r0
            X.7Pu r0 = r2.A00()
            r0.A03(r3, r7)
        L_0x00aa:
            return
        L_0x00ab:
            java.lang.String r0 = "Viewer User must not be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51031FnN.A02(X.Tzd):void");
    }

    public final void A04(User user) {
        0Aj A0e;
        int i;
        User user2 = user;
        0qQ.A0B(user, 0);
        F35 f35 = this.A06;
        boolean A1w = user.A1w();
        0wc r1 = f35.A00;
        if (A1w) {
            A0e = AnonymousClass7TE.A0e(r1, "unhide_story_button_tapped");
            i = 385;
        } else {
            A0e = AnonymousClass7TE.A0e(r1, "hide_story_button_tapped");
            i = 166;
        }
        1Ln A0F = Dbb.A0F(A0e, user, i);
        Dbb.A1F(A0F);
        A0F.A0R("entity_user_type", String.valueOf(user.BIW()));
        A0F.Cgf();
        F3J f3j = (F3J) this.A08.getValue();
        Reel reel = this.A00;
        if (reel != null) {
            f3j.A01(this, user2, "dashboard", false, reel.A0d());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Dc5(User user, boolean z) {
        0Aj A0e;
        int i;
        0qQ.A0B(user, 0);
        0wc r1 = this.A06.A00;
        if (z) {
            A0e = AnonymousClass7TE.A0e(r1, "hide_story_dialog_confirmed");
            i = 167;
        } else {
            A0e = AnonymousClass7TE.A0e(r1, "unhide_story_dialog_confirmed");
            i = 386;
        }
        1Ln A0F = Dbb.A0F(A0e, user, i);
        Dbb.A1F(A0F);
        A0F.A0R("entity_user_type", String.valueOf(user.BIW()));
        A0F.Cgf();
    }

    public static final void A00(C14631Tzd tzd, C51031FnN fnN) {
        User user = tzd.A0L;
        if (user != null) {
            C47692EDb eDb = new C47692EDb(24, (Object) tzd, (Object) fnN, (Object) user);
            AnonymousClass4D6 r3 = fnN.A05;
            UserSession userSession = fnN.A04;
            String id = user.getId();
            1NY A0O = DbU.A0O(userSession);
            A0O.A0A("media/unmark_as_spam_viewer/");
            DbS.A1P(A0O, id);
            A0O.A0R(1XP.class, 1XY.class);
            DbW.A1E(A0O, eDb, r3);
        }
    }

    public final void A03(User user) {
        FEC.A00(this.A02.requireContext(), this.A03, this.A04, AnonymousClass7TE.A10(user.getId()), "ig_reel_dashboard");
    }

    public final void A05(String str) {
        UserSession userSession = this.A04;
        C46474Dfc A012 = C46548Dgp.A01(userSession, str, AnonymousClass000.A00(3853), this.A03.getModuleName());
        Fragment fragment = this.A02;
        0hq r0 = fragment.mFragmentManager;
        FragmentActivity activity = fragment.getActivity();
        if (AnonymousClass06S.A01(r0) && activity != null) {
            C46474Dfc.A03(DbW.A0H(fragment, userSession), userSession, C46447Df9.A02(), A012);
        }
    }

    public final void Dc4() {
        this.A07.Cs5();
    }
}
