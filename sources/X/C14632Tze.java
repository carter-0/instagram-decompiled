package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Tze  reason: case insensitive filesystem */
public final class C14632Tze extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final X9R A04;

    public final int getViewTypeCount() {
        return 2;
    }

    /* JADX WARNING: type inference failed for: r0v111, types: [X.WBD] */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05c8, code lost:
        if (r9.A0H != false) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05ed, code lost:
        if (r8.CPV() != false) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0706, code lost:
        if (r13 != r12.hashCode()) goto L_0x0708;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05e8  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0460  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r40, android.view.View r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            r39 = this;
            r9 = r42
            r0 = 1485846987(0x589039cb, float:1.26862315E15)
            int r17 = X.AnonymousClass0fD.A03(r0)
            X.Tzd r9 = (X.C14631Tzd) r9
            com.instagram.user.model.User r8 = r9.A0L
            r2 = r39
            if (r8 == 0) goto L_0x07ad
            com.instagram.common.session.UserSession r1 = r2.A03
            X.1OP r0 = X.1OP.$redex_init_class
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.model.reels.Reel r23 = X.AnonymousClass3PQ.A02(r1, r8)
        L_0x001d:
            X.3uh r0 = r9.A0K
            r38 = r0
            r38.getClass()
            X.1Xj r4 = r0.A0b
            if (r8 == 0) goto L_0x009f
            if (r4 == 0) goto L_0x009f
            X.0wc r1 = r2.A02
            java.lang.String r0 = "reel_viewer_dashboard_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.0iw r0 = r2.A01
            X.DbW.A15(r3, r0)
            java.lang.String r0 = r8.getId()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "target_user_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = r4.A30()
            r0.getClass()
            X.G9t.A1J(r3, r0)
            X.C13989Tnp.A1I(r3, r8)
            X.BBV r0 = r9.A00
            r4 = 1
            if (r0 == 0) goto L_0x07a9
            r0 = 1
        L_0x0059:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "has_reaction"
            r3.A9F(r0, r1)
            X.XA1 r0 = r9.A01
            if (r0 == 0) goto L_0x07a5
            r0 = 1
        L_0x0068:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "has_avatar_reaction"
            r3.A9F(r0, r1)
            java.lang.String r1 = r9.A09
            if (r1 == 0) goto L_0x07a1
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07a1
        L_0x007d:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r0 = "has_reply"
            r3.A9F(r0, r1)
            boolean r0 = r9.A0B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_like"
            r3.A7p(r0, r1)
            boolean r0 = r9.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_spam_viewer"
            r3.A7p(r0, r1)
            r3.Cgf()
        L_0x009f:
            r1 = r40
            if (r40 == 0) goto L_0x00f8
            r0 = 1
            if (r1 != r0) goto L_0x07b1
            java.lang.Object r6 = X.DbT.A0o(r41)
            X.VZg r6 = (X.C17527VZg) r6
            X.X9R r3 = r2.A04
            X.0iw r2 = r2.A01
            android.view.View r1 = r6.A01
            r0 = 19
            X.WBD.A00(r1, r0, r9, r3)
            X.VW6 r5 = r9.A0I
            r5.getClass()
            com.instagram.model.reels.Reel r3 = r5.A02
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r6.A04
            com.instagram.common.typedurl.ImageUrl r0 = r3.A07()
            r0.getClass()
            r1.setUrl(r0, r2)
            android.widget.TextView r2 = r6.A03
            android.content.res.Resources r4 = r6.A00
            r1 = 2131967704(0x7f133ed8, float:1.9572282E38)
            X.1Ns r0 = r3.A0W
            r0.getClass()
            java.lang.String r0 = r0.getName()
            X.DbY.A0y(r4, r2, r0, r1)
            int r3 = r5.A01
            android.widget.TextView r2 = r6.A02
            r1 = 2131820871(0x7f110147, float:1.927447E38)
            java.lang.String r0 = X.C13989Tnp.A0m(r3)
            java.lang.String r0 = X.DbV.A0v(r4, r0, r1, r3)
            r2.setText(r0)
        L_0x00ef:
            r1 = 1613598593(0x602d8f81, float:5.0025426E19)
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x00f8:
            com.instagram.common.session.UserSession r7 = r2.A03
            java.lang.Object r6 = X.DbT.A0o(r41)
            X.VdA r6 = (X.C17741VdA) r6
            X.X9R r5 = r2.A04
            android.content.Context r10 = r2.A00
            X.0wc r0 = r2.A02
            r37 = r0
            X.0iw r0 = r2.A01
            r19 = r0
            android.widget.TextView r4 = r6.A0B
            r3 = 0
            r4.setVisibility(r3)
            android.widget.TextView r0 = r6.A0C
            r36 = r0
            X.C244273av.A0B(r0, r3)
            android.view.View r0 = r6.A04
            r35 = r0
            r13 = 0
            r0.setOnClickListener(r13)
            android.view.View r0 = r6.A05
            r34 = r0
            r0.setOnClickListener(r13)
            android.view.ViewGroup r0 = r6.A08
            r33 = r0
            r0.setOnClickListener(r13)
            android.view.View r0 = r6.A01
            int r2 = X.JTQ.A02(r0)
            r22 = 2
            r0 = r22
            r4.setMaxLines(r0)
            X.2eb r0 = r6.A0D
            r32 = r0
            r0.A03(r2)
            X.2eb r14 = r6.A0E
            r14.A03(r2)
            X.2eb r11 = r6.A0I
            r11.A03(r2)
            X.2eb r0 = r6.A0F
            r31 = r0
            r0.A03(r2)
            X.2eb r1 = r6.A0G
            r1.A03(r2)
            X.2eb r0 = r6.A0H
            r18 = r0
            r0.A03(r2)
            android.view.View r0 = r6.A06
            r30 = r0
            r0.setVisibility(r2)
            java.lang.Integer r0 = r9.A0M
            int r12 = r0.intValue()
            if (r12 == r3) goto L_0x03b7
            r15 = 1
            if (r12 == r15) goto L_0x029d
            r0 = r22
            if (r12 == r0) goto L_0x01e2
            r0 = 3
            if (r12 != r0) goto L_0x07c0
            r0 = 2131238000(0x7f081c70, float:1.8092266E38)
            android.graphics.drawable.Drawable r5 = r10.getDrawable(r0)
            int r0 = X.2Yu.A01(r10)
            X.AnonymousClass7TE.A1R(r5, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A0J
            r0.A0D(r5)
            r8 = 0
            r0.setGradientSpinnerVisible(r3)
            r0.setBottomBadgeDrawable(r13)
            r0.setClickable(r3)
            r5 = r31
            r0 = r18
            A00(r5, r1, r0, r14, r2)
            r11.A03(r2)
            r0 = r32
            r0.A03(r2)
            X.4jy r0 = X.C297825sP.A00(r38)
            r0.getClass()
            java.util.List r5 = r0.A0E
            r5.getClass()
            java.lang.Object r1 = r5.get(r3)
            X.4jw r1 = (X.C272004jw) r1
            java.lang.Object r0 = r5.get(r15)
            X.4jw r0 = (X.C272004jw) r0
            int r5 = X.C18687Vwl.A01(r1)
            int r0 = X.C18687Vwl.A01(r0)
            int r5 = r5 + r0
            android.content.res.Resources r3 = r10.getResources()
            r1 = 2131820888(0x7f110158, float:1.9274504E38)
            java.lang.String r0 = X.C13989Tnp.A0m(r5)
            java.lang.String r1 = X.DbV.A0v(r3, r0, r1, r5)
            r0 = r36
            r0.setText(r1)
            r4.setVisibility(r2)
        L_0x01dd:
            X.W0p.A01(r7, r9, r6, r8)
            goto L_0x00ef
        L_0x01e2:
            X.VW6 r8 = r9.A0I
            r8.getClass()
            com.instagram.model.reels.Reel r0 = r8.A02
            r16 = r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r15 = r6.A0J
            com.instagram.common.typedurl.ImageUrl r0 = r16.A07()
            r0.getClass()
            r12 = r19
            r15.A0F(r13, r12, r0)
            r15.setGradientSpinnerVisible(r3)
            r15.setBottomBadgeDrawable(r13)
            r0 = r16
            X.1Ns r0 = r0.A0W
            r16 = r0
            r16.getClass()
            android.content.res.Resources r12 = r36.getResources()
            r0 = 2131967704(0x7f133ed8, float:1.9572282E38)
            java.lang.String r15 = r16.getName()
            r13 = r36
            X.DbY.A0y(r12, r13, r15, r0)
            r0 = r31
            A00(r0, r1, r14, r11, r2)
            r0 = r18
            r0.A03(r2)
            r0 = r32
            r0.A03(r2)
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            int r11 = r8.A01
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131820871(0x7f110147, float:1.927447E38)
            java.lang.String r0 = X.C13989Tnp.A0m(r11)
            java.lang.String r0 = X.DbV.A0v(r2, r0, r1, r11)
            r12.append(r0)
            r4.setText(r12)
            android.view.View r0 = r6.A01
            if (r0 != 0) goto L_0x025a
            android.view.ViewStub r0 = r6.A09
            android.view.View r1 = r0.inflate()
            r6.A01 = r1
            r0 = 2131439363(0x7f0b2f03, float:1.850068E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r0 = (com.instagram.reels.ui.badge.ReelBrandingBadgeView) r0
            r6.A03 = r0
        L_0x025a:
            android.view.View r0 = r6.A01
            if (r0 == 0) goto L_0x07d8
            r0.setVisibility(r3)
            X.3Nl r1 = r16.Aht()
            X.3Nl r0 = X.C240993Nl.NONE
            boolean r0 = X.C51969G9p.A1a(r1, r0)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r1 = r6.A03
            if (r1 == 0) goto L_0x07d0
            if (r0 == 0) goto L_0x0298
            r1.setVisibility(r3)
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r1 = r6.A03
            if (r1 == 0) goto L_0x07c8
            X.3Nl r0 = r16.Aht()
            r1.A03(r0)
        L_0x027f:
            r1 = 27
            r0 = r33
            X.WBD.A00(r0, r1, r8, r5)
            r1 = 28
            r0 = r35
            X.WBD.A00(r0, r1, r8, r5)
            r1 = 20
            r0 = r34
            X.WBD.A00(r0, r1, r8, r5)
            boolean r8 = r8.A00
            goto L_0x01dd
        L_0x0298:
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x027f
        L_0x029d:
            if (r8 == 0) goto L_0x00ef
            java.lang.String r12 = r8.getFullName()
            r0 = r33
            r0.setContentDescription(r12)
            X.2eS.A01(r33)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r15 = r6.A0J
            com.instagram.common.typedurl.ImageUrl r12 = r8.Bh3()
            r0 = r19
            r15.A0F(r13, r0, r12)
            r12 = 0
            r15.setGradientSpinnerVisible(r3)
            r15.setBottomBadgeDrawable(r13)
            r0 = 2131973912(0x7f135718, float:1.9584873E38)
            X.DbU.A12(r10, r15, r0)
            X.2eS.A01(r15)
            com.instagram.model.reels.Reel r0 = r9.A0J
            if (r0 == 0) goto L_0x02f2
            com.instagram.user.model.User r0 = X.DbT.A0j(r7)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x02f2
            boolean r0 = r8.CPV()
            if (r0 == 0) goto L_0x0382
            r0 = r31
            A00(r0, r1, r14, r11, r2)
            r0 = r32
            r0.A03(r3)
            android.view.View r11 = r32.A01()
            r1 = 2131971470(0x7f134d8e, float:1.957992E38)
            java.lang.String r0 = r8.getFullName()
            X.C13989Tnp.A0z(r10, r11, r0, r1)
        L_0x02f2:
            android.widget.ImageView r0 = r6.A0A
            r0.setVisibility(r2)
            java.lang.String r0 = r9.A09
            if (r0 != 0) goto L_0x0365
            X.BBV r0 = r9.A00
            if (r0 != 0) goto L_0x0365
            r4.setVisibility(r2)
        L_0x0302:
            java.lang.String r1 = r8.getFullName()
            r0 = r36
            r0.setText(r1)
            r1 = 26
            r0 = r33
            X.WBD.A00(r0, r1, r9, r5)
            boolean r0 = r8.A1w()
            if (r0 != 0) goto L_0x031e
            boolean r0 = r8.CPV()
            if (r0 == 0) goto L_0x031f
        L_0x031e:
            r12 = 1
        L_0x031f:
            X.W0p.A01(r7, r9, r6, r12)
            X.W0E r4 = X.C14639Tzl.A00(r7)
            r0 = r38
            java.lang.String r5 = r0.A0j
            X.0qQ.A0B(r5, r3)
            com.instagram.common.session.UserSession r3 = r4.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325592144032839(0x810def00003447, double:3.035788971080815E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ef
            java.lang.Long r0 = X.W0E.A00(r4, r5)
            if (r0 == 0) goto L_0x00ef
            long r1 = r0.longValue()
            java.util.ArrayList r0 = r4.A00
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0353
            java.util.ArrayList r0 = r4.A00
            r0.remove(r8)
        L_0x0353:
            java.util.ArrayList r0 = r4.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00ef
            X.1QP r3 = r4.A02
            java.lang.String r0 = "fb_viewers_list_render_success"
            goto L_0x0634
        L_0x0365:
            r4.setVisibility(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r9.A09
            if (r0 != 0) goto L_0x0377
            X.BBV r0 = r9.A00
            if (r0 == 0) goto L_0x037a
            java.lang.String r0 = r0.A00
        L_0x0377:
            r1.append(r0)
        L_0x037a:
            java.lang.String r0 = r1.toString()
            r4.setText(r0)
            goto L_0x0302
        L_0x0382:
            r13 = r31
            r0 = r32
            A00(r14, r11, r0, r13, r2)
            r1.A03(r3)
            android.view.View r13 = r1.A01()
            r11 = 2131971493(0x7f134da5, float:1.9579967E38)
            java.lang.String r0 = r8.getFullName()
            X.C13989Tnp.A0z(r10, r13, r0, r11)
            android.view.View r1 = r1.A01()
            r19 = 16
            X.WBF r0 = new X.WBF
            r18 = r0
            r20 = r8
            r21 = r37
            r22 = r5
            r23 = r9
            r18.<init>((int) r19, (java.lang.Object) r20, (java.lang.Object) r21, (java.lang.Object) r22, (java.lang.Object) r23)
            X.AnonymousClass0fU.A00(r0, r1)
            X.W0p.A02(r9, r5, r6)
            goto L_0x02f2
        L_0x03b7:
            android.content.res.Resources r21 = r10.getResources()
            r8.getClass()
            java.lang.String r12 = r8.getUsername()
            r0 = r33
            r0.setContentDescription(r12)
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            r12 = r20
            X.2eS.A04(r0, r12)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A0J
            com.instagram.common.typedurl.ImageUrl r12 = r8.Bh3()
            r16 = 0
            r15 = r19
            r0.A0F(r13, r15, r12)
            r19 = 1
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r19)
            boolean r12 = X.AnonymousClass7TF.A1V(r23)
            r0.setGradientSpinnerVisible(r12)
            if (r12 == 0) goto L_0x0401
            r23.getClass()
            r12 = r23
            boolean r12 = r12.A16(r7)
            r12 = r12 ^ 1
            r0.setGradientSpinnerActivated(r12)
            r12 = r23
            com.instagram.api.schemas.RingSpec r12 = X.AnonymousClass3NW.A00(r7, r12)
            r0.setGradientColor(r12)
        L_0x0401:
            boolean r12 = r9.A0B
            if (r12 == 0) goto L_0x06ec
            android.content.res.Resources r13 = r10.getResources()
            r12 = 2131165248(0x7f070040, float:1.7944708E38)
            int r12 = r13.getDimensionPixelSize(r12)
            float r12 = (float) r12
            r0.A00 = r12
            android.content.res.Resources r13 = r10.getResources()
            r12 = 2131165266(0x7f070052, float:1.7944744E38)
            int r12 = r13.getDimensionPixelSize(r12)
            float r12 = (float) r12
            r0.A01 = r12
            r12 = r19
            r0.A07 = r12
            android.graphics.drawable.Drawable r12 = r6.A00
            if (r12 != 0) goto L_0x0433
            android.content.Context r12 = r33.getContext()
            X.3Lj r12 = X.C70899OQr.A00(r12)
            r6.A00 = r12
        L_0x0433:
            r0.setBottomBadgeDrawable(r12)
            r12 = 2131974447(0x7f13592f, float:1.9585958E38)
        L_0x0439:
            java.lang.String r12 = X.DbY.A0b(r10, r8, r12)
            r0.setContentDescription(r12)
        L_0x0440:
            r25 = 14
            X.WBF r12 = new X.WBF
            r24 = r12
            r26 = r9
            r27 = r5
            r28 = r23
            r29 = r6
            r24.<init>((int) r25, (java.lang.Object) r26, (java.lang.Object) r27, (java.lang.Object) r28, (java.lang.Object) r29)
            X.AnonymousClass0fU.A00(r12, r0)
            X.4Cl r0 = r8.A03
            java.lang.String r0 = r0.B3O()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06e6
            X.4Cl r0 = r8.A03
            java.lang.String r12 = r0.B3O()
        L_0x0466:
            com.instagram.model.reels.Reel r0 = r9.A0J
            if (r0 == 0) goto L_0x04ab
            r0 = r38
            X.4gL r0 = r0.A0c
            if (r0 != 0) goto L_0x04ab
            com.instagram.user.model.User r0 = X.DbT.A0j(r7)
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x04ab
            boolean r0 = r8.CPV()
            if (r0 == 0) goto L_0x0675
            r0 = r31
            A00(r0, r1, r14, r11, r2)
            r0 = r32
            r0.A03(r3)
            android.view.View r1 = r32.A01()
            r0 = 2131971470(0x7f134d8e, float:1.957992E38)
            X.C13989Tnp.A0z(r10, r1, r12, r0)
            android.view.View r11 = r32.A01()
            r1 = 22
            X.WBD r0 = new X.WBD
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r5)
        L_0x049f:
            X.AnonymousClass0fU.A00(r0, r11)
            boolean r0 = r8.CPV()
            if (r0 != 0) goto L_0x04ab
            X.W0p.A02(r9, r5, r6)
        L_0x04ab:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x04b9
            r1.append(r12)
        L_0x04b9:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)
            java.lang.Integer r0 = r9.A04
            r11 = 10
            java.lang.String r13 = " • "
            if (r0 == 0) goto L_0x050b
            java.util.Locale r16 = X.AnonymousClass1Q2.A02()
            X.4jy r0 = X.C297825sP.A00(r38)
            r0.getClass()
            java.util.List r14 = X.AnonymousClass9OX.A01(r0)
            java.lang.Integer r0 = r9.A04
            int r0 = r0.intValue()
            java.lang.Object r0 = r14.get(r0)
            X.4jx r0 = (X.C272014jx) r0
            java.lang.String r15 = r0.getText()
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x04ed
            r1.append(r13)
        L_0x04ed:
            r14 = 2131969572(0x7f134624, float:1.957607E38)
            r0 = r21
            java.lang.String r14 = X.AnonymousClass7TF.A0e(r0, r15, r14)
            r0 = r16
            java.lang.String r14 = r14.toLowerCase(r0)
            r0 = 32
            java.lang.String r0 = r14.replace(r11, r0)
            java.lang.String r0 = r0.trim()
            r1.append(r0)
            r15 = r18
        L_0x050b:
            java.lang.String r0 = r9.A07
            if (r0 == 0) goto L_0x0532
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0518
            r1.append(r13)
        L_0x0518:
            r15 = 2131971242(0x7f134caa, float:1.9579458E38)
            java.lang.String r14 = r9.A07
            r0 = r21
            java.lang.String r14 = X.AnonymousClass7TF.A0e(r0, r14, r15)
            r0 = 32
            java.lang.String r0 = r14.replace(r11, r0)
            java.lang.String r0 = r0.trim()
            r1.append(r0)
            r15 = r18
        L_0x0532:
            java.lang.Float r0 = r9.A03
            if (r0 == 0) goto L_0x066e
            android.widget.ImageView r14 = r6.A0A
            r14.setVisibility(r3)
            android.graphics.drawable.Drawable r11 = r14.getDrawable()
            X.U1V r11 = (X.U1V) r11
            if (r11 != 0) goto L_0x056a
            X.U1V r11 = new X.U1V
            r11.<init>(r10, r7)
            r0 = r19
            r11.A09 = r0
            r11.invalidateSelf()
            int r0 = X.AnonymousClass7TE.A0F(r21)
            r11.A02(r0)
            r0 = r20
            r11.A04(r0)
            r10 = 2131165217(0x7f070021, float:1.7944645E38)
            r0 = r21
            int r0 = r0.getDimensionPixelSize(r10)
            r11.A03(r0)
            r14.setImageDrawable(r11)
        L_0x056a:
            java.lang.Float r0 = r9.A03
            float r0 = r0.floatValue()
            r11.A01(r0)
        L_0x0573:
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L_0x066a
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0580
            r1.append(r13)
        L_0x0580:
            java.lang.String r0 = r9.A05
            r1.append(r0)
        L_0x0585:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0664
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x0664
        L_0x058f:
            r0 = r36
            r0.setText(r12)
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x059d
            r0 = r30
            r0.setVisibility(r3)
        L_0x059d:
            boolean r10 = r8.isVerified()
            r0 = r36
            X.C244273av.A0B(r0, r10)
            java.lang.String r0 = r9.A09
            if (r0 != 0) goto L_0x05b4
            X.BBV r0 = r9.A00
            if (r0 != 0) goto L_0x05b4
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x05ca
        L_0x05b4:
            java.lang.Float r0 = r9.A03
            if (r0 != 0) goto L_0x05ca
            X.BBV r0 = r9.A00
            if (r0 != 0) goto L_0x05ca
            boolean r0 = r18.booleanValue()
            if (r0 != 0) goto L_0x064e
            java.lang.String r0 = r9.A09
            if (r0 != 0) goto L_0x0652
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x064e
        L_0x05ca:
            r4.setVisibility(r2)
        L_0x05cd:
            r1 = 23
            r0 = r35
            X.WBD.A00(r0, r1, r8, r5)
            r1 = 24
            r0 = r34
            X.WBD.A00(r0, r1, r8, r5)
            r1 = 25
            r0 = r33
            X.WBD.A00(r0, r1, r9, r5)
            boolean r0 = r8.A1w()
            if (r0 != 0) goto L_0x05ef
            boolean r1 = r8.CPV()
            r0 = 0
            if (r1 == 0) goto L_0x05f0
        L_0x05ef:
            r0 = 1
        L_0x05f0:
            X.W0p.A01(r7, r9, r6, r0)
            X.W0E r4 = X.C14639Tzl.A00(r7)
            r0 = r38
            java.lang.String r5 = r0.A0j
            X.0qQ.A0B(r5, r3)
            com.instagram.common.session.UserSession r3 = r4.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325592144032839(0x810def00003447, double:3.035788971080815E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ef
            java.lang.Long r0 = X.W0E.A00(r4, r5)
            if (r0 == 0) goto L_0x00ef
            long r1 = r0.longValue()
            java.util.ArrayList r0 = r4.A00
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x0624
            java.util.ArrayList r0 = r4.A00
            r0.remove(r8)
        L_0x0624:
            java.util.ArrayList r0 = r4.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x00ef
            X.1QP r3 = r4.A02
            java.lang.String r0 = "ig_viewers_list_render_success"
        L_0x0634:
            r3.flowMarkPoint(r1, r0)
            boolean r0 = X.W0E.A01(r4, r5)
            if (r0 == 0) goto L_0x00ef
            java.lang.Long r0 = X.W0E.A00(r4, r5)
            if (r0 == 0) goto L_0x00ef
            long r1 = r0.longValue()
            X.1QP r0 = r4.A02
            r0.flowEndSuccess(r1)
            goto L_0x00ef
        L_0x064e:
            r4.setVisibility(r3)
            goto L_0x065f
        L_0x0652:
            r4.setVisibility(r3)
            java.lang.String r1 = r9.A09
            if (r1 != 0) goto L_0x065f
            X.BBV r0 = r9.A00
            if (r0 == 0) goto L_0x05cd
            java.lang.String r1 = r0.A00
        L_0x065f:
            r4.setText(r1)
            goto L_0x05cd
        L_0x0664:
            java.lang.String r12 = r8.getUsername()
            goto L_0x058f
        L_0x066a:
            r18 = r15
            goto L_0x0585
        L_0x066e:
            android.widget.ImageView r0 = r6.A0A
            r0.setVisibility(r2)
            goto L_0x0573
        L_0x0675:
            r0 = r32
            A00(r14, r11, r0, r1, r2)
            r0 = r31
            r0.A03(r3)
            android.view.View r1 = r31.A01()
            r0 = 2131971493(0x7f134da5, float:1.9579967E38)
            X.C13989Tnp.A0z(r10, r1, r12, r0)
            X.2Ix r0 = X.2Ix.A00(r7)
            java.lang.Integer r1 = r0.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            boolean r15 = r1.equals(r0)
            X.0Tu r11 = X.0Tu.A05
            r0 = 36315206913231961(0x81047d00020c59, double:3.029221309304372E-306)
            boolean r14 = X.182.A06(r11, r7, r0)
            r0 = 36315206913166424(0x81047d00010c58, double:3.029221309262926E-306)
            boolean r13 = X.182.A06(r11, r7, r0)
            r0 = 36315206913297498(0x81047d00030c5a, double:3.0292213093458177E-306)
            boolean r0 = X.182.A06(r11, r7, r0)
            r1 = 2131238210(0x7f081d42, float:1.8092692E38)
            if (r13 == 0) goto L_0x06e0
            if (r0 == 0) goto L_0x06bd
            if (r15 == 0) goto L_0x06e0
        L_0x06bd:
            r1 = 2131237893(0x7f081c05, float:1.809205E38)
        L_0x06c0:
            android.view.View r0 = r31.A01()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r1)
            android.view.View r11 = r31.A01()
            r23 = 15
            X.WBF r0 = new X.WBF
            r22 = r0
            r24 = r8
            r25 = r37
            r26 = r5
            r27 = r9
            r22.<init>((int) r23, (java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26, (java.lang.Object) r27)
            goto L_0x049f
        L_0x06e0:
            if (r14 == 0) goto L_0x06c0
            r1 = 2131238713(0x7f081f39, float:1.8093712E38)
            goto L_0x06c0
        L_0x06e6:
            java.lang.String r12 = r8.getFullName()
            goto L_0x0466
        L_0x06ec:
            X.XA1 r12 = r9.A01
            if (r12 == 0) goto L_0x0749
            X.Tzd r12 = r6.A02
            if (r12 == 0) goto L_0x0708
            X.XA1 r12 = r12.A01
            r12.getClass()
            int r13 = r12.hashCode()
            X.XA1 r12 = r9.A01
            r12.getClass()
            int r12 = r12.hashCode()
            if (r13 == r12) goto L_0x0440
        L_0x0708:
            r6.A02 = r9
            r13 = 2131165207(0x7f070017, float:1.7944625E38)
            r12 = 2131165259(0x7f07004b, float:1.794473E38)
            r0.A0C(r10, r13, r12)
            X.XA1 r12 = r9.A01
            X.UNU r12 = (X.UNU) r12
            java.lang.String r12 = r12.A00
            r15 = r12
            android.content.res.Resources r13 = r10.getResources()
            r12 = 2131165219(0x7f070023, float:1.7944649E38)
            int r27 = r13.getDimensionPixelSize(r12)
            int r28 = X.AnonymousClass7TF.A02(r10, r12)
            r12 = r19
            X.0qQ.A0B(r7, r12)
            r12 = r22
            X.0qQ.A0B(r15, r12)
            boolean r29 = X.C63282KuR.A00(r7)
            r24 = r10
            r25 = r7
            r26 = r15
            android.graphics.drawable.Drawable r15 = X.C320996tP.A02(r24, r25, r26, r27, r28, r29)
        L_0x0741:
            r0.setBottomBadgeDrawable(r15)
            r12 = 2131971324(0x7f134cfc, float:1.9579624E38)
            goto L_0x0439
        L_0x0749:
            X.BBV r12 = r9.A00
            if (r12 == 0) goto L_0x0777
            r13 = 2131165248(0x7f070040, float:1.7944708E38)
            r12 = 2131165266(0x7f070052, float:1.7944744E38)
            r0.A0C(r10, r13, r12)
            android.text.Spannable r12 = X.C306386Ly.A0d
            android.content.res.Resources r12 = r10.getResources()
            r13 = 2131165204(0x7f070014, float:1.7944619E38)
            int r12 = r12.getDimensionPixelSize(r13)
            X.8vV r15 = new X.8vV
            r15.<init>(r10, r12)
            X.BBV r12 = r9.A00
            java.lang.String r12 = r12.A00
            r15.A0M(r12)
            android.content.res.Resources r12 = r10.getResources()
            X.AnonymousClass7TF.A11(r12, r15, r13)
            goto L_0x0741
        L_0x0777:
            if (r23 != 0) goto L_0x0788
            boolean r12 = r9.A0N
            if (r12 == 0) goto L_0x0788
            r12 = 2130970844(0x7f0408dc, float:1.755041E38)
            int r12 = X.2Yu.A0H(r10, r12)
            android.graphics.drawable.Drawable r16 = r10.getDrawable(r12)
        L_0x0788:
            r12 = r16
            r0.setBottomBadgeDrawable(r12)
            r0.A07 = r3
            r12 = 0
            r0.A00 = r12
            r0.A01 = r12
            r12 = 2131973912(0x7f135718, float:1.9584873E38)
            X.DbU.A12(r10, r0, r12)
            r12 = r20
            X.2eS.A04(r0, r12)
            goto L_0x0440
        L_0x07a1:
            r4 = 0
            goto L_0x007d
        L_0x07a5:
            r0 = 0
            goto L_0x0068
        L_0x07a9:
            r0 = 0
            goto L_0x0059
        L_0x07ad:
            r23 = 0
            goto L_0x001d
        L_0x07b1:
            java.lang.String r0 = "Unsupported view type: "
            java.lang.IllegalStateException r2 = X.DbW.A0b(r0, r1)
            r1 = 1781265402(0x6a2bf3fa, float:5.1969615E25)
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        L_0x07c0:
            java.lang.String r1 = "Unknown reel dashboard viewer type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x07c8:
            java.lang.String r1 = "Holder#reelBrandingBadgeView is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07d0:
            java.lang.String r1 = "Holder#reelBrandingBadgeView is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07d8:
            java.lang.String r1 = "Holder#reelRing is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14632Tze.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2 != X.AnonymousClass05K.A15) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.C232672uC r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            r3 = this;
            X.Tzd r5 = (X.C14631Tzd) r5
            X.VW6 r0 = r5.A0I
            if (r0 == 0) goto L_0x0015
            com.instagram.model.reels.Reel r0 = r0.A02
            X.1Ns r0 = r0.A0W
            if (r0 == 0) goto L_0x0015
            java.lang.Integer r2 = r0.CAm()
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            r0 = 1
            if (r2 == r1) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r4.A7U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14632Tze.buildRowViewTypes(X.2uC, java.lang.Object, java.lang.Object):void");
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        String str;
        if (i == 0) {
            User user = ((C14631Tzd) obj).A0L;
            user.getClass();
            str = user.getId();
        } else if (i != 1) {
            return Integer.MAX_VALUE;
        } else {
            VW6 vw6 = ((C14631Tzd) obj).A0I;
            vw6.getClass();
            str = vw6.A02.getId();
        }
        return str.hashCode();
    }

    public C14632Tze(Context context, AnonymousClass0iw r3, UserSession userSession, X9R x9r) {
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = x9r;
        this.A01 = r3;
        this.A02 = AnonymousClass0kN.A01(r3, userSession);
    }

    public static void A00(C71662eb r0, C71662eb r1, C71662eb r2, C71662eb r3, int i) {
        r0.A03(i);
        r1.A03(i);
        r2.A03(i);
        r3.A03(i);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        View view;
        int A032 = AnonymousClass0fD.A03(1934320243);
        if (i == 0) {
            ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_reel_viewer);
            viewGroup2.setTag(new C17741VdA(viewGroup2));
            i2 = 1558656181;
            view = viewGroup2;
        } else if (i == 1) {
            View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.reel_dashboard_aggregate_product_row);
            A0C.setTag(new C17527VZg(A0C));
            i2 = 786646145;
            view = A0C;
        } else {
            IllegalStateException A0b = DbW.A0b("Unsupported view type: ", i);
            AnonymousClass0fD.A0A(-42183208, A032);
            throw A0b;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return view;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
