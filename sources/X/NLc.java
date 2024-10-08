package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

public final class NLc extends C231632rz {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C74492Pvm A05;
    public final C251033mS A06;
    public final C250993mO A07;
    public final boolean A08;

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (r4.A07.A0D(X.C250993mO.A03(r4.A06, java.util.Collections.singletonList(r7.A00.getId()))) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a3, code lost:
        if (r6 != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0220, code lost:
        if (r22.CXO() != false) goto L_0x0222;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r29, android.view.View r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            r28 = this;
            r7 = r31
            r0 = -123146257(0xfffffffff8a8efef, float:-2.7411634E34)
            r3 = r30
            int r20 = X.DbX.A04(r3, r0)
            r2 = 2
            X.0qQ.A0B(r7, r2)
            X.N9q r7 = (X.C68303N9q) r7
            r4 = r28
            com.instagram.common.session.UserSession r0 = r4.A04
            r27 = r0
            X.0iw r0 = r4.A03
            r26 = r0
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0038
            X.3mO r5 = r4.A07
            X.3mS r1 = r4.A06
            com.instagram.user.model.User r0 = r7.A00
            java.lang.String r0 = r0.getId()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.List r0 = X.C250993mO.A03(r1, r0)
            boolean r0 = r5.A0D(r0)
            r15 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r15 = 0
        L_0x0039:
            X.Pvm r8 = r4.A05
            boolean r0 = r4.A00
            r19 = r0
            boolean r6 = r4.A01
            r5 = 0
            r18 = 1
            r0 = r18
            X.0qQ.A0B(r7, r0)
            r1 = r26
            r0 = r27
            X.AnonymousClass7TF.A1C(r0, r2, r1)
            r0 = 6
            X.0qQ.A0B(r8, r0)
            java.lang.Object r4 = r3.getTag()
            X.OI8 r4 = (X.OI8) r4
            if (r4 == 0) goto L_0x02b9
            com.instagram.user.follow.FollowButton r0 = r4.A0A
            r25 = r0
            r2 = 8
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r1 = r4.A07
            r1.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r11 = r4.A06
            r11.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r10 = r4.A08
            r10.setVisibility(r2)
            android.widget.TextView r0 = r4.A02
            r24 = r0
            r0.setVisibility(r2)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r9 = r4.A04
            r9.setVisibility(r2)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r4.A03
            r23 = r0
            r0.setVisibility(r2)
            r0 = 59
            X.C71408Ok7.A00(r3, r0, r7, r8)
            r7.Bh3()
            r12 = 0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r13 = r4.A09
            com.instagram.user.model.User r0 = r7.A00
            r22 = r0
            com.instagram.common.typedurl.ImageUrl r14 = r22.Bh3()
            r0 = r26
            r13.A0F(r12, r0, r14)
            if (r15 == 0) goto L_0x00b4
            android.content.Context r14 = r13.getContext()
            android.content.Context r12 = r3.getContext()
            r0 = 2130970843(0x7f0408db, float:1.7550408E38)
            int r0 = X.2Yu.A0H(r12, r0)
            android.graphics.drawable.Drawable r12 = r14.getDrawable(r0)
        L_0x00b4:
            r13.setBottomBadgeDrawable(r12)
            java.lang.String r14 = r22.getFullName()
            java.lang.String r17 = r22.getUsername()
            boolean r13 = r22.CPm()
            r0 = r22
            boolean r0 = r0.A06
            r21 = r0
            java.lang.String r12 = r7.A01
            if (r6 == 0) goto L_0x02a3
            if (r12 == 0) goto L_0x02a3
            r17 = r12
        L_0x00d1:
            android.content.Context r3 = r3.getContext()
            java.lang.String r14 = r22.getFullName()
            java.lang.String r13 = r22.getUsername()
            int r15 = r22.BIW()
            boolean r16 = r22.CPm()
            if (r12 != 0) goto L_0x00f1
            if (r6 == 0) goto L_0x027c
            if (r14 == 0) goto L_0x027c
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x027c
        L_0x00f1:
            boolean r0 = r7.A07
            r16 = 0
            if (r0 == 0) goto L_0x0234
            if (r13 == 0) goto L_0x0230
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0230
            r0 = 2131958990(0x7f131cce, float:1.9554608E38)
        L_0x0102:
            java.lang.String r13 = X.DbW.A0h(r3, r13, r0)
        L_0x0106:
            android.widget.TextView r0 = r4.A00
            r18 = r0
            boolean r12 = r22.isVerified()
            r0 = 0
            r15 = r17
            r14 = r0
            r0 = r18
            X.C46334Dcc.A00(r0, r14, r15, r12)
            boolean r0 = r22.isVerified()
            if (r0 == 0) goto L_0x012f
            java.lang.String r12 = ", "
            r0 = 2131976380(0x7f1360bc, float:1.9589879E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r12 = X.002.A0g(r15, r12, r0)
            r0 = r18
            r0.setContentDescription(r12)
        L_0x012f:
            if (r13 == 0) goto L_0x0229
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0229
            android.widget.TextView r12 = r4.A01
            r12.setVisibility(r5)
            r12.setText(r13)
        L_0x013f:
            int r0 = r22.BIW()
            if (r0 != 0) goto L_0x021c
            if (r19 != 0) goto L_0x021c
            if (r6 != 0) goto L_0x021c
            boolean r0 = r22.CPV()
            if (r0 != 0) goto L_0x0222
            X.0eM r0 = r7.A02
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x01c3
            X.0eM r0 = r7.A03
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x01c3
            r1.setVisibility(r5)
            r0 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1.setText((int) r0)
            r0 = 61
            X.C71408Ok7.A00(r1, r0, r7, r8)
        L_0x016d:
            r0 = r27
            java.lang.String r1 = r0.A06
            r0 = r22
            boolean r0 = X.DbV.A1Z(r0, r1)
            if (r0 != 0) goto L_0x01a3
            if (r6 != 0) goto L_0x01a5
            if (r19 == 0) goto L_0x0183
            r0 = 2131238564(0x7f081ea4, float:1.809341E38)
            r9.setImageResource(r0)
        L_0x0183:
            r9.setVisibility(r5)
            r0 = 63
            X.C71408Ok7.A00(r9, r0, r7, r8)
        L_0x018b:
            boolean r0 = X.C308436Ug.A02(r22)
            X.3oV r1 = r4.A05
            if (r0 != 0) goto L_0x0195
            r16 = 8
        L_0x0195:
            r0 = r16
            r1.setVisibility(r0)
            r1 = 1841717945(0x6dc662b9, float:7.6746725E27)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x01a3:
            if (r6 == 0) goto L_0x018b
        L_0x01a5:
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x01b7
            X.0qQ.A07(r3)
            r0 = r23
            r0.setVisibility(r5)
            r1 = 64
            X.C71408Ok7.A00(r0, r1, r7, r8)
            goto L_0x018b
        L_0x01b7:
            r1 = 2132017526(0x7f140176, float:1.9673333E38)
            r0 = r18
            r0.setTextAppearance(r1)
            r12.setTextAppearance(r1)
            goto L_0x018b
        L_0x01c3:
            com.instagram.user.model.FollowStatus r1 = r22.B6o()
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 != r0) goto L_0x01da
            X.0Tu r13 = X.0Tu.A05
            r1 = 36322194824898555(0x810ad8000027fb, double:3.0336404927803876E-306)
            r0 = r27
            boolean r0 = X.182.A06(r13, r0, r1)
            if (r0 != 0) goto L_0x020c
        L_0x01da:
            boolean r0 = r7.A0F
            if (r0 != 0) goto L_0x020c
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x01f2
            r10.setVisibility(r5)
            r0 = 2131959021(0x7f131ced, float:1.955467E38)
            r10.setText((int) r0)
            r0 = 62
            X.C71408Ok7.A00(r10, r0, r7, r8)
            goto L_0x016d
        L_0x01f2:
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x016d
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x016d
            r0 = r25
            r0.setVisibility(r5)
            X.4at r10 = r0.A0J
            r2 = r26
            r1 = r22
            r0 = r27
            r10.A03(r2, r0, r1)
            goto L_0x016d
        L_0x020c:
            r11.setVisibility(r5)
            r0 = 2131966184(0x7f1338e8, float:1.9569199E38)
            r11.setText((int) r0)
            r0 = 60
            X.C71408Ok7.A00(r11, r0, r7, r8)
            goto L_0x016d
        L_0x021c:
            boolean r0 = r22.CXO()
            if (r0 == 0) goto L_0x016d
        L_0x0222:
            r0 = r24
            r0.setVisibility(r5)
            goto L_0x016d
        L_0x0229:
            android.widget.TextView r12 = r4.A01
            r12.setVisibility(r2)
            goto L_0x013f
        L_0x0230:
            r0 = 2131958991(0x7f131ccf, float:1.955461E38)
            goto L_0x0276
        L_0x0234:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0245
            if (r13 == 0) goto L_0x0273
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0273
            r0 = 2131958939(0x7f131c9b, float:1.9554504E38)
            goto L_0x0102
        L_0x0245:
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x025a
            if (r13 == 0) goto L_0x0256
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0256
            r0 = 2131958935(0x7f131c97, float:1.9554496E38)
            goto L_0x0102
        L_0x0256:
            r0 = 2131958936(0x7f131c98, float:1.9554498E38)
            goto L_0x0276
        L_0x025a:
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x0262
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0106
        L_0x0262:
            if (r13 == 0) goto L_0x026f
            int r0 = r13.length()
            if (r0 == 0) goto L_0x026f
            r0 = 2131958937(0x7f131c99, float:1.95545E38)
            goto L_0x0102
        L_0x026f:
            r0 = 2131958938(0x7f131c9a, float:1.9554502E38)
            goto L_0x0276
        L_0x0273:
            r0 = 2131958940(0x7f131c9c, float:1.9554506E38)
        L_0x0276:
            java.lang.String r13 = r3.getString(r0)
            goto L_0x0106
        L_0x027c:
            if (r15 == 0) goto L_0x028e
            r0 = r18
            if (r15 == r0) goto L_0x0285
            r13 = 0
            goto L_0x00f1
        L_0x0285:
            r0 = 2131961885(0x7f13281d, float:1.956048E38)
            java.lang.String r13 = r3.getString(r0)
            goto L_0x00f1
        L_0x028e:
            r15 = 0
            r12 = r16
            r0 = r21
            boolean r0 = X.AnonymousClass50n.A09(r14, r12, r0)
            if (r0 == 0) goto L_0x02a0
            boolean r0 = r13.equals(r14)
            if (r0 != 0) goto L_0x02a0
            r15 = r13
        L_0x02a0:
            r13 = r15
            goto L_0x00f1
        L_0x02a3:
            if (r14 == 0) goto L_0x00d1
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x00d1
            if (r6 != 0) goto L_0x02b5
            r0 = r21
            boolean r0 = X.AnonymousClass50n.A09(r14, r13, r0)
            if (r0 == 0) goto L_0x00d1
        L_0x02b5:
            r17 = r14
            goto L_0x00d1
        L_0x02b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NLc.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public NLc(Context context, AnonymousClass0iw r3, UserSession userSession, C74492Pvm pvm) {
        this.A02 = context;
        this.A04 = userSession;
        this.A03 = r3;
        this.A05 = pvm;
        this.A08 = 1Au.A00(userSession).A21();
        this.A06 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A07 = A012;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        int A042 = DbX.A04(viewGroup2, 91280115);
        View inflate = LayoutInflater.from(this.A02).inflate(R.layout.direct_user_row, viewGroup2, false);
        TextView textView = (TextView) AnonymousClass7TF.A0G(inflate, R.id.row_user_primary_name);
        TextView textView2 = (TextView) AnonymousClass7TF.A0G(inflate, R.id.row_user_secondary_name);
        IgdsButton igdsButton = (IgdsButton) AnonymousClass7TF.A0G(inflate, R.id.remove_button);
        TextView textView3 = (TextView) AnonymousClass7TF.A0G(inflate, R.id.row_user_blocked_text);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) AnonymousClass7TF.A0G(inflate, R.id.user_admin_tools_button);
        IgdsButton igdsButton2 = (IgdsButton) AnonymousClass7TF.A0G(inflate, R.id.message_button);
        IgdsButton igdsButton3 = (IgdsButton) AnonymousClass7TF.A0G(inflate, R.id.see_channel_button);
        OI8 oi8 = new OI8(textView, textView2, textView3, (IgSimpleImageView) AnonymousClass7TF.A0G(inflate, R.id.arrow_action_button), colorFilterAlphaImageView, DbV.A0T(inflate, R.id.internal_badge, false), igdsButton, igdsButton2, igdsButton3, (GradientSpinnerAvatarView) AnonymousClass7TF.A0G(inflate, R.id.row_user_avatar), (FollowButton) AnonymousClass7TF.A0G(inflate, R.id.button));
        oi8.A09.setGradientSpinnerVisible(false);
        inflate.setTag(oi8);
        AnonymousClass0fD.A0A(-1917120754, A042);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
