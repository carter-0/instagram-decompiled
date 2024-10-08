package X;

import android.view.View;

public final class F2Y {
    public boolean A00;
    public final int A01;
    public final FEY A02;
    public final View A03;
    public final /* synthetic */ C46722Dk7 A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: X.EKB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: X.EKC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.EKB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: X.EKB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public F2Y(X.C46722Dk7 r20, int r21) {
        /*
            r19 = this;
            r3 = r19
            r4 = r20
            r3.A04 = r4
            r3.<init>()
            r2 = r21
            r3.A01 = r2
            r6 = 4
            r1 = 2
            r0 = 1
            if (r2 == r0) goto L_0x0158
            if (r2 == r1) goto L_0x0142
            r0 = 3
            if (r2 == r0) goto L_0x012c
            if (r2 != r6) goto L_0x016e
            android.view.View r1 = r4.getContentView()
            r0 = 2131428430(0x7f0b044e, float:1.8478504E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A03 = r0
            android.view.View r1 = r4.getContentView()
            r0 = 2131428436(0x7f0b0454, float:1.8478516E38)
        L_0x002d:
            android.view.View r14 = r1.findViewById(r0)
            com.instagram.common.ui.base.IgTextView r14 = (com.instagram.common.ui.base.IgTextView) r14
            r5 = 0
            boolean r8 = r4 instanceof X.EKD
            if (r8 == 0) goto L_0x0125
            r0 = r4
            X.EKD r0 = (X.EKD) r0
            java.util.List r0 = r0.A01
        L_0x003d:
            int r0 = r0.size()
            int[] r0 = new int[]{r0, r6}
            r1 = r0[r5]
            if (r6 >= r1) goto L_0x004a
            r1 = 4
        L_0x004a:
            java.lang.Integer r0 = r4.A0P
            boolean r0 = X.C48874Ela.A00(r0)
            int r7 = r21 + -1
            if (r0 == 0) goto L_0x0056
            int r7 = r1 - r21
        L_0x0056:
            android.view.View r6 = r3.A03
            if (r8 == 0) goto L_0x00f8
            X.EKD r4 = (X.EKD) r4
            X.AnonymousClass7TG.A1O(r6, r14)
            android.app.Activity r11 = r4.A0G
            com.instagram.common.session.UserSession r13 = r4.A0M
            java.util.List r0 = r4.A01
            java.lang.Object r15 = r0.get(r7)
            com.instagram.model.direct.DirectShareTarget r15 = (com.instagram.model.direct.DirectShareTarget) r15
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r6
            boolean r0 = r4.A08
            X.0iw r12 = r4.A0L
            X.EKC r10 = new X.EKC
            r17 = r2
            r18 = r0
            r16 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.model.direct.DirectShareTarget r7 = r10.A02
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r8 = r10.A01
            com.instagram.user.model.User r1 = r0.A01(r8)
            java.util.List r0 = X.DbT.A14(r7)
            r7.A0S()
            r9 = 0
            X.34S r4 = X.AnonymousClass3UE.A02(r9, r1, r9, r0)
            boolean r0 = r7.A0M()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r6 = r10.A03
            if (r0 == 0) goto L_0x00ee
            X.0iw r2 = r10.A08
            java.lang.Object r1 = r4.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.Object r0 = r4.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r6.A0G(r9, r2, r1, r0)
        L_0x00a7:
            com.instagram.common.ui.base.IgTextView r4 = r10.A09
            java.lang.String r1 = X.DbT.A0y(r7)
            int r0 = r10.A00
            java.lang.String r0 = X.0mp.A04(r1, r0)
            r4.setText(r0)
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x00e1
            boolean r2 = X.DbV.A1Y(r8)
            X.3mS r1 = X.C251033mS.A00(r8)
            X.3mO r0 = X.C250993mO.A01(r8)
            X.0qQ.A07(r0)
            if (r2 == 0) goto L_0x00e1
            boolean r0 = r0.A0A(r7, r1)
            if (r0 == 0) goto L_0x00e1
            android.content.Context r1 = r10.A06
            r0 = 2130970844(0x7f0408dc, float:1.755041E38)
            int r0 = X.2Yu.A0H(r1, r0)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r6.setBottomBadgeDrawable(r0)
        L_0x00e1:
            r6.A05()
            r6.setVisibility(r5)
        L_0x00e7:
            r0 = 0
            r4.setTextSize(r0)
            r3.A02 = r10
            return
        L_0x00ee:
            java.lang.Object r1 = r4.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            X.0iw r0 = r10.A08
            r6.A0F(r9, r0, r1)
            goto L_0x00a7
        L_0x00f8:
            X.EKE r4 = (X.EKE) r4
            X.AnonymousClass7TG.A1O(r6, r14)
            android.app.Activity r2 = r4.A0G
            com.instagram.common.ui.base.IgSimpleImageView r6 = (com.instagram.common.ui.base.IgSimpleImageView) r6
            X.0iw r1 = r4.A0L
            java.util.List r0 = r4.A01
            java.lang.Object r0 = r0.get(r7)
            X.FBq r0 = (X.C49890FBq) r0
            X.EKB r10 = new X.EKB
            r11 = r2
            r12 = r1
            r13 = r6
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r10.A00
            X.FBq r1 = r10.A01
            int r0 = r1.A04
            r2.setImageResource(r0)
            com.instagram.common.ui.base.IgTextView r4 = r10.A09
            int r0 = r1.A00
            r4.setText(r0)
            goto L_0x00e7
        L_0x0125:
            r0 = r4
            X.EKE r0 = (X.EKE) r0
            java.util.List r0 = r0.A01
            goto L_0x003d
        L_0x012c:
            android.view.View r1 = r4.getContentView()
            r0 = 2131428429(0x7f0b044d, float:1.8478502E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A03 = r0
            android.view.View r1 = r4.getContentView()
            r0 = 2131428435(0x7f0b0453, float:1.8478514E38)
            goto L_0x002d
        L_0x0142:
            android.view.View r1 = r4.getContentView()
            r0 = 2131428428(0x7f0b044c, float:1.84785E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A03 = r0
            android.view.View r1 = r4.getContentView()
            r0 = 2131428434(0x7f0b0452, float:1.8478512E38)
            goto L_0x002d
        L_0x0158:
            android.view.View r1 = r4.getContentView()
            r0 = 2131428427(0x7f0b044b, float:1.8478498E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A03 = r0
            android.view.View r1 = r4.getContentView()
            r0 = 2131428433(0x7f0b0451, float:1.847851E38)
            goto L_0x002d
        L_0x016e:
            java.lang.String r0 = "rank higher than MAX_AVATAR_COUNT"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F2Y.<init>(X.Dk7, int):void");
    }

    public final Object A00() {
        EKC ekc;
        FEY fey = this.A02;
        if ((fey instanceof EKC) && (ekc = (EKC) fey) != null) {
            return ekc.A02;
        }
        0qQ.A0C(fey, "null cannot be cast to non-null type com.instagram.direct.share.ui.quicksend.QuickSendExternalPog");
        return ((EKB) fey).A01;
    }
}
