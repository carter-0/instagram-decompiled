package X;

import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public abstract class W0p {
    public static void A00(0wc r5, C14631Tzd tzd) {
        User user = tzd.A0L;
        C255773uh r0 = tzd.A0K;
        r0.getClass();
        1Xj r2 = r0.A0b;
        if (user != null && r2 != null && tzd.A0M != AnonymousClass05K.A0Y) {
            0Aj A0e = AnonymousClass7TE.A0e(r5, "reel_viewer_dashboard_message_click");
            C51965G9l.A1K(A0e, "");
            A0e.AAJ("radio_type", "");
            A0e.A9F("target_id", DbV.A0q(user.getId()));
            String A30 = r2.A30();
            A30.getClass();
            G9t.A1J(A0e, A30);
            C13989Tnp.A1I(A0e, user);
            A0e.A7p("has_like", Boolean.valueOf(tzd.A0B));
            boolean z = true;
            A0e.A7p("has_avatar_reaction", Boolean.valueOf(AnonymousClass7TF.A1V(tzd.A01)));
            if (tzd.A00 == null) {
                z = false;
            }
            A0e.A7p("has_emoji_reaction", Boolean.valueOf(z));
            A0e.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if (r8.A00 != null) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.common.session.UserSession r10, X.C14631Tzd r11, X.C17741VdA r12, boolean r13) {
        /*
            X.3uh r7 = r11.A0K
            r7.getClass()
            X.3QO r1 = r7.A0B()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            r8 = 0
            boolean r2 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.Integer r1 = r11.A0M
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r6 = 1050253722(0x3e99999a, float:0.3)
            r5 = 8
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x010d
            if (r2 != 0) goto L_0x010d
            android.view.View r3 = r12.A04
            if (r13 == 0) goto L_0x0113
            r3.setVisibility(r5)
            android.view.View r2 = r12.A05
            r2.setVisibility(r8)
            android.view.ViewGroup r0 = r12.A07
            r0.setAlpha(r6)
            android.widget.TextView r0 = r12.A0C
            r0.setAlpha(r6)
            android.widget.TextView r0 = r12.A0B
            r0.setAlpha(r6)
        L_0x003e:
            X.2eb r9 = r12.A0F
            android.view.View r0 = r9.A00
            if (r0 == 0) goto L_0x0058
            boolean r0 = r11.A0E
            if (r0 == 0) goto L_0x00fd
            X.0Tu r8 = X.0Tu.A05
            r0 = 36321387371046202(0x810a1c0000253a, double:3.033129855712804E-306)
            boolean r0 = X.182.A06(r8, r10, r0)
            if (r0 == 0) goto L_0x00fd
            r9.A03(r5)
        L_0x0058:
            X.2eb r1 = r12.A0G
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x006c
            android.view.View r1 = r1.A01()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0069
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x0069:
            r1.setAlpha(r0)
        L_0x006c:
            X.2eb r1 = r12.A0E
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0080
            android.view.View r1 = r1.A01()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x007d
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x007d:
            r1.setAlpha(r0)
        L_0x0080:
            X.2eb r1 = r12.A0I
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0094
            android.view.View r1 = r1.A01()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0091
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x0091:
            r1.setAlpha(r0)
        L_0x0094:
            X.2eb r8 = r12.A0D
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x00a8
            android.view.View r1 = r8.A01()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x00a5
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x00a5:
            r1.setAlpha(r0)
        L_0x00a8:
            X.2eb r1 = r12.A0H
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x00f8
            android.view.View r0 = r1.A01()
            if (r13 != 0) goto L_0x00b6
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00b6:
            r0.setAlpha(r6)
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x00c2
            r3.setVisibility(r5)
        L_0x00c2:
            r2.setVisibility(r5)
        L_0x00c5:
            com.instagram.user.model.User r0 = r7.A0i
            r0.getClass()
            com.instagram.user.model.User r6 = r11.A0L
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00d8
            r3.setVisibility(r5)
            r2.setVisibility(r5)
        L_0x00d8:
            if (r6 == 0) goto L_0x00ec
            android.content.res.Resources r2 = X.DbU.A05(r3)
            r1 = 2131972450(0x7f135162, float:1.9581908E38)
            java.lang.String r0 = r6.B8Q()
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r2, r0, r1)
            r3.setContentDescription(r0)
        L_0x00ec:
            boolean r0 = r11.A0G
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = r12.A0J
            if (r0 == 0) goto L_0x012c
            r0 = 1056964608(0x3f000000, float:0.5)
            A03(r11, r1, r0)
            return
        L_0x00f8:
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x00c5
            goto L_0x00c2
        L_0x00fd:
            android.view.View r1 = r9.A01()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0108
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x0108:
            r1.setAlpha(r0)
            goto L_0x0058
        L_0x010d:
            android.view.View r3 = r12.A04
            r3.setVisibility(r5)
            goto L_0x0116
        L_0x0113:
            r3.setVisibility(r8)
        L_0x0116:
            android.view.View r2 = r12.A05
            r2.setVisibility(r5)
            android.view.ViewGroup r0 = r12.A07
            r0.setAlpha(r4)
            android.widget.TextView r0 = r12.A0C
            r0.setAlpha(r4)
            android.widget.TextView r0 = r12.A0B
            r0.setAlpha(r4)
            goto L_0x003e
        L_0x012c:
            A03(r11, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0p.A01(com.instagram.common.session.UserSession, X.Tzd, X.VdA, boolean):void");
    }

    public static void A02(C14631Tzd tzd, X9R x9r, C17741VdA vdA) {
        C71662eb r1 = vdA.A0H;
        r1.A03(0);
        WBD.A00(r1.A01(), 21, tzd, x9r);
        vdA.A04.setVisibility(8);
        vdA.A05.setVisibility(8);
    }

    public static void A03(C14631Tzd tzd, GradientSpinnerAvatarView gradientSpinnerAvatarView, float f) {
        if (!gradientSpinnerAvatarView.getGradientSpinnerActivated() || tzd.A0N) {
            gradientSpinnerAvatarView.setAlpha(f);
            return;
        }
        for (int i = 0; i < gradientSpinnerAvatarView.getChildCount(); i++) {
            gradientSpinnerAvatarView.getChildAt(i).setAlpha(f);
        }
    }
}
