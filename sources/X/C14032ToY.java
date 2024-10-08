package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.ToY  reason: case insensitive filesystem */
public final class C14032ToY extends C249703kE {
    public final View A00;
    public final UserSession A01;
    public final C14146Tqi A02;
    public final GradientSpinnerAvatarView A03;
    public final View A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final FollowButton A08;

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0137, code lost:
        if (r14.length() == 0) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass0iw r10, X.0xF r11, com.instagram.user.model.User r12, com.instagram.user.model.User r13, java.lang.String r14) {
        /*
            r9 = this;
            r4 = 1
            X.0qQ.A0B(r13, r4)
            r0 = 37
            X.WBG r6 = new X.WBG
            r6.<init>(r0, r9, r13)
            android.view.View r3 = r9.A00
            X.AnonymousClass0fU.A00(r6, r3)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r5 = r9.A03
            r8 = 0
            if (r12 == 0) goto L_0x004a
            X.4Cl r0 = r12.A03
            java.lang.Integer r1 = r0.B6v()
            if (r5 == 0) goto L_0x004a
            boolean r0 = r12.A1x()
            if (r0 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            int r1 = r1.intValue()
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 > r0) goto L_0x004a
            java.lang.String r1 = r12.getId()
            com.instagram.common.session.UserSession r7 = r9.A01
            java.lang.String r0 = r7.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328315153300703(0x81106900003cdf, double:3.0375110131064904E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x004a
            r8 = 1
        L_0x004a:
            r1 = 8
            r2 = 0
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r9.A07
            if (r8 == 0) goto L_0x0184
            r0.setVisibility(r1)
            r5.setVisibility(r2)
            com.instagram.common.typedurl.ImageUrl r1 = r13.Bh3()
            r0 = 0
            r5.A0F(r0, r10, r1)
            r5.A07()
            com.instagram.common.session.UserSession r1 = r9.A01
            X.1OP r0 = X.1OP.$redex_init_class
            X.0qQ.A0B(r1, r2)
            com.instagram.model.reels.Reel r1 = X.AnonymousClass3PQ.A02(r1, r13)
            if (r1 == 0) goto L_0x017c
            r5.setGradientSpinnerVisible(r4)
            r0 = 35
            X.WB4.A00(r5, r1, r13, r9, r0)
        L_0x0077:
            if (r14 != 0) goto L_0x007f
            X.4Cl r0 = r13.A03
            java.lang.String r14 = r0.Bgl()
        L_0x007f:
            android.widget.TextView r5 = r9.A05
            boolean r0 = r5 instanceof com.instagram.common.ui.text.TightTextView
            if (r0 == 0) goto L_0x008a
            r0 = r5
            com.instagram.common.ui.text.TightTextView r0 = (com.instagram.common.ui.text.TightTextView) r0
            r0.A00 = r4
        L_0x008a:
            java.lang.String r1 = r13.A0P()
            java.lang.String r0 = "business_profile_chaining_nebula"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            com.instagram.common.session.UserSession r7 = r9.A01
            X.0Tu r6 = X.0Tu.A05
            r0 = 36317156828255021(0x8106430000132d, double:3.0304544434166325E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0130
            boolean r0 = X.C308436Ug.A01(r7, r13)
            android.widget.TextView r1 = r9.A06
            X.DbU.A1H(r1, r13)
            r5.setSingleLine()
            if (r0 == 0) goto L_0x00cb
            android.content.Context r6 = r3.getContext()
            r0 = 2131954372(0x7f130ac4, float:1.9545241E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r6, r0)
            r5.setText(r0)
            r6 = 18
            X.FPF r0 = new X.FPF
            r0.<init>((int) r6, (java.lang.Object) r13, (java.lang.Object) r9)
            X.AnonymousClass0fU.A00(r0, r5)
        L_0x00cb:
            boolean r0 = r13.isVerified()
            X.C244273av.A0B(r1, r0)
            android.view.View r1 = r9.A04
            r0 = 36
            X.WBG.A01(r1, r0, r9, r13)
            com.instagram.user.follow.FollowButton r7 = r9.A08
            com.instagram.common.session.UserSession r5 = r9.A01
            java.lang.String r0 = r13.getId()
            X.C267154b3.A02(r7, r5, r0)
            r7.setVisibility(r2)
            if (r12 == 0) goto L_0x00ef
            boolean r0 = X.C324376zB.A01(r5, r12)
            if (r0 == 0) goto L_0x0101
        L_0x00ef:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36329715312771353(0x8111af00024119, double:3.038396479593719E-306)
            boolean r0 = X.182.A06(r6, r5, r0)
            if (r0 == 0) goto L_0x0101
            r7.A09 = r4
            r7.setIsElevated(r4)
        L_0x0101:
            X.4at r1 = r7.A0J
            X.Utj r0 = new X.Utj
            r0.<init>(r9, r2)
            r1.A07(r0)
            r1.A03 = r11
            java.lang.String r0 = "similar_users_chaining_unit"
            r1.A0H = r0
            r1.A03(r10, r5, r13)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325484769915884(0x810dd6000133ec, double:3.035721067256892E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x012f
            android.content.Context r1 = r3.getContext()
            r0 = 2130968861(0x7f04011d, float:1.7546388E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbU.A11(r1, r3, r0)
        L_0x012f:
            return
        L_0x0130:
            if (r14 == 0) goto L_0x0139
            int r1 = r14.length()
            r0 = 0
            if (r1 != 0) goto L_0x013a
        L_0x0139:
            r0 = 1
        L_0x013a:
            r6 = 2
            android.widget.TextView r1 = r9.A06
            if (r0 == 0) goto L_0x015c
            X.DbU.A1H(r1, r13)
            X.4Cl r0 = r13.A03
            java.lang.String r14 = r0.Bgk()
            if (r14 == 0) goto L_0x0150
            int r0 = r14.length()
            if (r0 != 0) goto L_0x016f
        L_0x0150:
            r5.setSingleLine()
            java.lang.String r0 = r13.getFullName()
            r5.setText(r0)
            goto L_0x00cb
        L_0x015c:
            java.lang.String r0 = r13.getFullName()
            if (r0 == 0) goto L_0x0177
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = r13.getFullName()
        L_0x016c:
            r1.setText(r0)
        L_0x016f:
            r5.setLines(r6)
            r5.setText(r14)
            goto L_0x00cb
        L_0x0177:
            java.lang.String r0 = r13.getUsername()
            goto L_0x016c
        L_0x017c:
            r5.setGradientSpinnerVisible(r2)
            X.AnonymousClass0fU.A00(r6, r5)
            goto L_0x0077
        L_0x0184:
            X.DbU.A1S(r10, r0, r13)
            r5.setVisibility(r1)
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14032ToY.A00(X.0iw, X.0xF, com.instagram.user.model.User, com.instagram.user.model.User, java.lang.String):void");
    }

    public C14032ToY(View view, UserSession userSession, C14146Tqi tqi) {
        super(view);
        this.A01 = userSession;
        this.A02 = tqi;
        this.A00 = AnonymousClass7TF.A0G(view, R.id.suggested_entity_card_container);
        this.A07 = DbX.A0a(view, R.id.suggested_entity_card_image);
        this.A03 = (GradientSpinnerAvatarView) AnonymousClass7TF.A0F(view, R.id.suggested_entity_card_avatar_view);
        this.A06 = AnonymousClass7TG.A0R(view, R.id.suggested_entity_card_name);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.suggested_entity_card_context);
        this.A04 = AnonymousClass7TF.A0G(view, R.id.dismiss_button);
        this.A08 = (FollowButton) AnonymousClass7TF.A0F(view, R.id.suggested_user_card_follow_button);
    }
}
