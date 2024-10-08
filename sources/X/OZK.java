package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class OZK {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass7X0 A02;
    public final C71027OZe A03;
    public final C68148N2o A04;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.75A, java.lang.Object] */
    public /* synthetic */ OZK(AnonymousClass0iw r9, UserSession userSession, AnonymousClass7X0 r11, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        C71027OZe oZe = (i2 & 8) != 0 ? new C71027OZe(userSession, new Object()) : null;
        boolean A1Q = C51966G9m.A1Q(i2 & 16, z);
        boolean A1Q2 = C51966G9m.A1Q(i2 & 32, z2);
        boolean A1Q3 = C51966G9m.A1Q(i2 & 64, z3);
        boolean A1Q4 = C51966G9m.A1Q(i2 & 128, z4);
        i3 = (i2 & 256) != 0 ? 0 : i3;
        0qQ.A0B(oZe, 4);
        this.A01 = userSession;
        this.A00 = r9;
        this.A02 = r11;
        this.A03 = oZe;
        this.A04 = new C68148N2o(A1Q, i3, A1Q2, A1Q3, A1Q4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (X.C71050OaS.A03(r8) == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        if (r2 == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r0 > 1.0f) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C68070Mzb r30, X.C328687Ft r31) {
        /*
            r29 = this;
            r5 = 0
            r9 = r31
            boolean r10 = r9.A08
            r4 = r10 ^ 1
            r1 = 4
            java.util.List r3 = r9.A04
            int r0 = r3.size()
            int r17 = java.lang.Math.min(r1, r0)
            r6 = r29
            X.N2o r0 = r6.A04
            boolean r2 = r0.A02
            boolean r7 = r0.A01
            java.lang.Object r1 = r3.get(r5)
            X.NYf r1 = (X.C68821NYf) r1
            X.7Fr r0 = r1.A02
            X.777 r8 = r0.A0F
            X.77B r0 = r1.A01
            if (r0 == 0) goto L_0x01af
            X.5yB r0 = r0.A0F
        L_0x002a:
            r15 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x019c
            float r0 = r0.A01()
        L_0x0033:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ac
        L_0x0037:
            X.N2o r1 = new X.N2o
            r11 = r1
            r12 = r2
            r13 = r17
            r14 = r7
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            com.instagram.common.session.UserSession r0 = r6.A01
            r28 = r0
            boolean r0 = X.C70867OPg.A00(r28)
            r16 = 1
            r7 = r30
            if (r0 == 0) goto L_0x0064
            android.view.View r11 = r7.A01
            java.lang.Object r8 = r11.getTag()
            boolean r0 = r8 instanceof X.C68148N2o
            if (r0 != 0) goto L_0x005c
            r8 = 0
        L_0x005c:
            boolean r0 = X.0qQ.A0K(r8, r1)
            if (r0 == 0) goto L_0x0197
            r16 = 0
        L_0x0064:
            if (r16 == 0) goto L_0x0069
            A01(r6, r7, r1)
        L_0x0069:
            r0 = r17
            if (r4 >= r0) goto L_0x01b2
            if (r16 == 0) goto L_0x007a
            java.util.List r0 = r7.A04
            java.lang.Object r0 = r0.get(r4)
            X.OWC r0 = (X.OWC) r0
            A00(r0, r1, r4)
        L_0x007a:
            boolean r0 = r1.A04
            r18 = r0
            java.lang.Object r8 = r3.get(r4)
            X.NYf r8 = (X.C68821NYf) r8
            java.util.List r0 = r7.A04
            java.lang.Object r0 = r0.get(r4)
            X.OWC r0 = (X.OWC) r0
            int r12 = r9.A00
            r11 = 2
            if (r12 != r11) goto L_0x0098
            boolean r11 = X.C71050OaS.A03(r8)
            r14 = 1
            if (r11 != 0) goto L_0x0099
        L_0x0098:
            r14 = 0
        L_0x0099:
            X.3oV r12 = r0.A08
            boolean r11 = X.C70867OPg.A01(r28)
            if (r11 == 0) goto L_0x0173
            boolean r11 = r12.CVM()
            if (r11 != 0) goto L_0x0173
            if (r14 != 0) goto L_0x0173
        L_0x00a9:
            X.7Fr r11 = X.C68821NYf.A01(r3, r5)
            X.7FE r12 = r11.A0C
            X.0eM r11 = r0.A0O
            r27 = r11
            com.instagram.common.ui.widget.imageview.IgImageView r14 = X.C66580MXl.A0R(r27)
            boolean r11 = X.C70867OPg.A01(r28)
            r11 = r11 ^ 1
            X.0qQ.A0B(r14, r5)
            X.3Us r13 = new X.3Us
            r13.<init>()
            android.content.res.Resources r15 = r14.getResources()
            if (r11 != 0) goto L_0x00d0
            r11 = 2131165207(0x7f070017, float:1.7944625E38)
            if (r2 != 0) goto L_0x00d2
        L_0x00d0:
            r11 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x00d2:
            float r11 = X.AnonymousClass7TE.A01(r15, r11)
            r13.A07(r11, r11, r11, r11)
            X.77D r21 = X.C3265577g.A04(r13, r14)
            X.0qQ.A0B(r8, r5)
            X.7Fr r11 = r8.A02
            X.777 r11 = r11.A0F
            boolean r11 = r11 instanceof X.AnonymousClass776
            if (r11 == 0) goto L_0x00ee
            boolean r11 = X.C70867OPg.A01(r28)
            if (r11 != 0) goto L_0x00fc
        L_0x00ee:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r14 = r0.A0N
            X.7L2 r13 = r12.A03
            android.graphics.drawable.Drawable r11 = X.C328037De.A00()
            X.AnonymousClass7FB.A07(r11, r13, r2)
            r14.setBackground(r11)
        L_0x00fc:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r11 = r0.A0N
            r13 = r18
            android.util.Size r19 = X.C71104Oci.A00(r11, r13, r10, r2)
            X.0iw r14 = r6.A00
            X.7X0 r13 = r6.A02
            X.4Cq r23 = r13.ArY()
            r18 = r0
            r20 = r14
            r22 = r8
            r18.A02(r19, r20, r21, r22, r23)
            boolean r13 = X.C70867OPg.A01(r28)
            if (r13 != 0) goto L_0x0130
            android.content.Context r13 = r11.getContext()
            X.C3265577g.A01(r13, r12)
            r12 = 2131438224(0x7f0b2a90, float:1.8498369E38)
            android.view.View r11 = r11.findViewById(r12)
            if (r11 == 0) goto L_0x0130
            X.3oV r11 = r0.A0C
            r11.getView()
        L_0x0130:
            com.instagram.common.ui.widget.imageview.IgImageView r20 = X.C66580MXl.A0R(r27)
            X.0eM r11 = r0.A0P
            android.view.View r18 = X.AnonymousClass7TE.A0c(r11)
            X.3oV r11 = r0.A0C
            X.0eM r14 = r9.A05
            boolean r26 = X.C71050OaS.A03(r8)
            r23 = r8
            r24 = r9
            r25 = r14
            r19 = r28
            r22 = r11
            X.C71050OaS.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.OZe r12 = r6.A03
            com.instagram.common.ui.widget.imageview.IgImageView r19 = X.C66580MXl.A0R(r27)
            X.3oV r11 = r0.A06
            r13 = r28
            X.3Q2 r22 = X.C70043NwL.A00(r13, r8)
            r20 = r21
            r21 = r11
            r23 = r7
            r24 = r14
            r18 = r12
            r18.A02(r19, r20, r21, r22, r23, r24)
            android.view.View r0 = r0.A00
            r0.setVisibility(r5)
            int r4 = r4 + 1
            goto L_0x0069
        L_0x0173:
            android.view.View r13 = r12.getView()
            android.content.res.Resources r12 = r13.getResources()
            r11 = 2131165250(0x7f070042, float:1.7944712E38)
            if (r2 == 0) goto L_0x0183
            r11 = 2131165248(0x7f070040, float:1.7944708E38)
        L_0x0183:
            int r11 = r12.getDimensionPixelSize(r11)
            X.C66580MXl.A1C(r13, r11)
            X.C66580MXl.A1B(r13, r11)
            r11 = 8
            if (r14 == 0) goto L_0x0192
            r11 = 0
        L_0x0192:
            r13.setVisibility(r11)
            goto L_0x00a9
        L_0x0197:
            r11.setTag(r1)
            goto L_0x0064
        L_0x019c:
            boolean r0 = r8 instanceof X.AnonymousClass776
            if (r0 == 0) goto L_0x01ac
            X.776 r8 = (X.AnonymousClass776) r8
            java.lang.Float r0 = r8.A02
            if (r0 == 0) goto L_0x01ac
            float r0 = r0.floatValue()
            goto L_0x0033
        L_0x01ac:
            r15 = 0
            goto L_0x0037
        L_0x01af:
            r0 = 0
            goto L_0x002a
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZK.A02(X.Mzb, X.7Ft):void");
    }

    public static final void A00(OWC owc, C68148N2o n2o, int i) {
        boolean z = n2o.A01;
        if (z) {
            0nA.A0W(owc.A00, 17);
        }
        C71104Oci oci = C71104Oci.A00;
        View view = owc.A00;
        boolean z2 = n2o.A04;
        boolean z3 = n2o.A03;
        boolean z4 = n2o.A02;
        oci.A03(view, z2, z3, z4);
        oci.A03(owc.A0N, z2, z3, z4);
        C71104Oci.A01(view, i, n2o.A00, z2);
        C71104Oci.A02(view, i, z);
        float f = -4.0f;
        if (i % 2 == 0) {
            f = 4.0f;
        }
        view.setRotation(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bd, code lost:
        if (r0 != null) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.OZK r8, X.C68070Mzb r9, X.C68148N2o r10) {
        /*
            boolean r2 = r10.A02
            java.util.List r7 = r9.A04
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            X.OWC r0 = (X.OWC) r0
            X.0eM r0 = r0.A0O
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r2 == 0) goto L_0x001c
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
        L_0x001c:
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
            X.Gdm r5 = new X.Gdm
            r5.<init>(r0)
            int r0 = X.AnonymousClass7TE.A0H(r1)
            float r4 = (float) r0
            int r3 = r7.size()
        L_0x002e:
            if (r6 >= r3) goto L_0x004d
            java.lang.Object r0 = r7.get(r6)
            X.OWC r0 = (X.OWC) r0
            android.view.View r2 = r0.A00
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = X.DbT.A02(r7, r6)
            int r0 = r0 + -1
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r4
            r2.setElevation(r0)
            r2.setOutlineProvider(r5)
            int r6 = r6 + 1
            goto L_0x002e
        L_0x004d:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0084
            android.view.View r0 = r9.itemView
            android.content.res.Resources r0 = r0.getResources()
            int r1 = X.AnonymousClass7TE.A0C(r0)
            android.view.View r0 = X.JTO.A0F(r9)
            X.0nA.A0e(r0, r1)
            android.view.View r0 = X.JTO.A0F(r9)
            X.0nA.A0T(r0, r1)
            com.instagram.common.session.UserSession r0 = r8.A01
            boolean r2 = X.C70867OPg.A01(r0)
            r1 = 8
            X.3oV r0 = r9.A03
            if (r2 == 0) goto L_0x007f
            android.view.View r0 = r0.E2D()
            if (r0 == 0) goto L_0x007e
        L_0x007b:
            r0.setVisibility(r1)
        L_0x007e:
            return
        L_0x007f:
            android.view.View r0 = r0.getView()
            goto L_0x007b
        L_0x0084:
            X.0eM r0 = r9.A06
            java.lang.Object r0 = r0.getValue()
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r3 = X.JTO.A0F(r0)
            int r1 = r10.A00
            boolean r0 = r10.A04
            r2 = 0
            X.C71104Oci.A01(r3, r2, r1, r0)
            android.view.View r1 = X.JTO.A0F(r9)
            boolean r0 = r10.A01
            X.C71104Oci.A02(r1, r2, r0)
            android.view.View r0 = X.JTO.A0F(r9)
            X.0nA.A0e(r0, r2)
            android.view.View r0 = X.JTO.A0F(r9)
            X.0nA.A0T(r0, r2)
            com.instagram.common.session.UserSession r0 = r8.A01
            boolean r1 = X.C70867OPg.A01(r0)
            X.3oV r0 = r9.A03
            if (r1 == 0) goto L_0x00de
            android.view.View r0 = r0.E2D()
            if (r0 == 0) goto L_0x00cd
        L_0x00bf:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00cd
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x00cd
            int r2 = r1.topMargin
        L_0x00cd:
            android.view.View r1 = r9.A01
            android.view.View r0 = r9.itemView
            android.content.res.Resources r0 = r0.getResources()
            int r0 = X.AnonymousClass7TE.A0F(r0)
            int r2 = r2 + r0
            X.0nA.A0X(r1, r2)
            return
        L_0x00de:
            android.view.View r0 = r0.getView()
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZK.A01(X.OZK, X.Mzb, X.N2o):void");
    }
}
