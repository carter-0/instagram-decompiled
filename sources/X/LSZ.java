package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class LSZ {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r4 != null) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r12, X.AnonymousClass4DH r13, com.instagram.common.session.UserSession r14, X.C299935wF r15, X.C63768L6a r16, X.LEH r17, instagram.features.stories.dashboard.fragment.ReelDashboardFragment r18) {
        /*
            java.lang.String r3 = r15.A05
            r2 = 0
            r10 = r13
            r11 = r17
            if (r3 == 0) goto L_0x00d7
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00d7
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r11.A0A
            if (r0 == 0) goto L_0x0112
            r0.setVisibility(r2)
            X.3oV r1 = r11.A06
            if (r1 == 0) goto L_0x0115
            r0 = 8
            r1.setVisibility(r0)
            android.content.Context r1 = r13.getContext()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r11.A0A
            if (r0 == 0) goto L_0x0112
            X.AnonymousClass3YO.A00(r1, r13, r0, r3)
        L_0x0029:
            com.instagram.common.ui.base.IgTextView r0 = r11.A04
            if (r0 == 0) goto L_0x010f
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r1 = r11.A04
            if (r1 == 0) goto L_0x010f
            r0 = 2131973602(0x7f1355e2, float:1.9584244E38)
            r1.setText(r0)
            java.lang.String r3 = r15.A04
            r9 = r16
            boolean r0 = r9.A01
            r6 = r12
            r7 = r14
            if (r0 == 0) goto L_0x00af
            java.lang.String r4 = X.C367158qH.A00(r12, r14, r15)
            if (r3 == 0) goto L_0x0050
            int r0 = r3.length()
            if (r0 != 0) goto L_0x0059
        L_0x0050:
            X.819 r5 = X.AnonymousClass819.ROWSHARE_SINGLE_STORY
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_name"
            A02(r1, r5, r14, r9, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x0061
            int r0 = r4.length()
            if (r0 != 0) goto L_0x006c
        L_0x0061:
            X.819 r5 = X.AnonymousClass819.ROWSHARE_SINGLE_STORY
            X.8sM r1 = X.C368278sM.SUPPRESS
            java.lang.String r0 = "empty_audience"
            A02(r1, r5, r14, r9, r0)
            if (r4 == 0) goto L_0x00af
        L_0x006c:
            X.3oV r0 = r11.A08
            if (r0 == 0) goto L_0x010c
            r0.setVisibility(r2)
            X.3oV r0 = r11.A08
            if (r0 == 0) goto L_0x010c
            android.view.View r1 = r0.getView()
            r0 = 2131442048(0x7f0b3980, float:1.8506125E38)
            com.instagram.common.ui.base.IgTextView r1 = X.JTR.A0h(r1, r0)
            r11.A03 = r1
            r0 = 2131964456(0x7f133228, float:1.9565694E38)
            X.JTR.A18(r12, r1, r3, r4, r0)
        L_0x008a:
            X.3oV r0 = r11.A07
            if (r0 == 0) goto L_0x0109
            r3 = 8
            r0.setVisibility(r3)
            X.3oV r0 = r11.A05
            if (r0 == 0) goto L_0x0106
            r0.setVisibility(r3)
            boolean r1 = A03(r9)
            com.instagram.igds.components.button.IgdsButton r0 = r11.A00()
            if (r1 == 0) goto L_0x00e9
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r0 = r11.A02
            if (r0 == 0) goto L_0x0118
            r0.setVisibility(r2)
            return
        L_0x00af:
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x00cd
            boolean r0 = A03(r9)
            if (r0 != 0) goto L_0x00cd
            X.27y r1 = X.27u.A00(r14)
            com.facebook.common.callercontext.CallerContext r0 = X.C59719JVd.A01
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x00cd
            X.3oV r0 = r11.A08
            if (r0 == 0) goto L_0x010c
            r0.setVisibility(r2)
            goto L_0x008a
        L_0x00cd:
            X.3oV r1 = r11.A08
            if (r1 == 0) goto L_0x010c
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x008a
        L_0x00d7:
            X.3oV r0 = r11.A06
            if (r0 == 0) goto L_0x0115
            r0.setVisibility(r2)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r11.A0A
            if (r1 == 0) goto L_0x0112
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0029
        L_0x00e9:
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r1 = r11.A00()
            r0 = 2131973447(0x7f135547, float:1.958393E38)
            r1.setText((int) r0)
            com.instagram.igds.components.button.IgdsButton r0 = r11.A00()
            r5 = 2
            X.LXh r4 = new X.LXh
            r8 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.AnonymousClass0fU.A00(r4, r0)
            return
        L_0x0106:
            java.lang.String r0 = "autoShareButtons"
            goto L_0x011a
        L_0x0109:
            java.lang.String r0 = "shareButtonGroup"
            goto L_0x011a
        L_0x010c:
            java.lang.String r0 = "subtitle"
            goto L_0x011a
        L_0x010f:
            java.lang.String r0 = "title"
            goto L_0x011a
        L_0x0112:
            java.lang.String r0 = "fbProfileAvatar"
            goto L_0x011a
        L_0x0115:
            java.lang.String r0 = "icon"
            goto L_0x011a
        L_0x0118:
            java.lang.String r0 = "sharedButtonEvergreen"
        L_0x011a:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LSZ.A00(android.content.Context, X.4DH, com.instagram.common.session.UserSession, X.5wF, X.L6a, X.LEH, instagram.features.stories.dashboard.fragment.ReelDashboardFragment):void");
    }

    public static final void A01(Context context, AnonymousClass4DH r8, UserSession userSession, C63768L6a l6a, LEH leh, ReelDashboardFragment reelDashboardFragment, boolean z, boolean z2) {
        if (!l6a.A01 && C59719JVd.A00 == null) {
            C64697LgS lgS = new C64697LgS(0, context, r8, userSession, l6a, leh, reelDashboardFragment);
            C59719JVd.A00 = lgS;
            AnonymousClass1Nd.A00(userSession).A01(lgS, C61149Jy0.class);
        }
        LQh lQh = new LQh(AnonymousClass818.IG_STORY_VIEWERS_DASHBOARD, r8, userSession, new C63769L6b(l6a, leh, reelDashboardFragment));
        C255773uh r6 = l6a.A02;
        if (z2) {
            LQh.A00(lQh, r6, C51972G9s.A0n(), z);
            return;
        }
        UserSession userSession2 = lQh.A04;
        if (!AnonymousClass8PU.A07(userSession2)) {
            C58736Iwj iwj = new C58736Iwj(17, lQh, z);
            C48153EZv.A05.A04(lQh.A03, userSession2, new C65628Lx5(lQh, r6, iwj), EXN.A0g);
            return;
        }
        LQh.A01(lQh, r6, z);
    }

    public static final void A02(C368278sM r8, AnonymousClass819 r9, UserSession userSession, C63768L6a l6a, String str) {
        String str2;
        String str3;
        AnonymousClass818 r5 = AnonymousClass818.IG_STORY_VIEWERS_DASHBOARD;
        AnonymousClass81A A0O = JTO.A0O();
        1Xj r6 = l6a.A02.A0b;
        String str4 = null;
        if (r6 != null) {
            str2 = r6.getId();
        } else {
            str2 = null;
        }
        A0O.A06("ig_media_id", str2);
        A0O.A09(Boolean.valueOf(l6a.A01));
        A0O.A06("suppress_reason", str);
        C368288sN.A00(r5, r8, r9, A0O, userSession);
        if (r8 == C368278sM.VIEW && r9 == AnonymousClass819.ROWSHARE_SINGLE_STORY) {
            JZY jzy = JZY.VIEW;
            JZZ jzz = JZZ.STORY;
            0bb r2 = new 0bb();
            if (r6 != null) {
                str3 = r6.getId();
            } else {
                str3 = null;
            }
            r2.A06("media_id", str3);
            JZX.A00(jzy, jzz, r5, r2, userSession);
        }
        if (r8 == C368278sM.ACCEPT && r9 == AnonymousClass819.ROWSHARE_SINGLE_STORY) {
            JZY jzy2 = JZY.SHARE_CLICK;
            JZZ jzz2 = JZZ.STORY;
            0bb r1 = new 0bb();
            if (r6 != null) {
                str4 = r6.getId();
            }
            r1.A06("media_id", str4);
            JZX.A00(jzy2, jzz2, r5, r1, userSession);
        }
    }

    public static final boolean A03(C63768L6a l6a) {
        1Xj r1 = l6a.A02.A0b;
        if (r1 == null) {
            return false;
        }
        if (r1.A5O() || r1.A12() == 19) {
            return true;
        }
        return false;
    }
}
