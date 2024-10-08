package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class GUE {
    public final Context A00;
    public final UserSession A01;
    public final JT4 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02c1, code lost:
        if (X.182.A06(r7, r8, 36329728197607719L) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r37, X.C231672s5 r38, X.C53331GmH r39, X.AnonymousClass3V2 r40, X.AnonymousClass4DU r41, X.AnonymousClass3W1 r42) {
        /*
            r36 = this;
            r2 = 0
            r5 = r39
            r4 = r40
            boolean r21 = X.AnonymousClass7TF.A1U(r2, r4, r5)
            r20 = 2
            r35 = r38
            r3 = r42
            r1 = r20
            r0 = r35
            X.AnonymousClass7TF.A1D(r3, r1, r0)
            r19 = 5
            r34 = r41
            r1 = r19
            r0 = r34
            X.0qQ.A0B(r0, r1)
            java.util.Map r0 = r4.A0G
            r33 = r0
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r33)
        L_0x0029:
            boolean r0 = r1.hasNext()
            r6 = 8
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r1.next()
            X.3V5 r0 = (X.AnonymousClass3V5) r0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r0.A01
            r0.setVisibility(r6)
            goto L_0x0029
        L_0x003d:
            com.instagram.common.ui.base.IgFrameLayout r1 = r4.A04
            r1.setVisibility(r6)
            X.3V6 r0 = r4.A05
            r32 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01
            r31 = r0
            r0.setVisibility(r6)
            boolean r0 = r5.A0E
            r17 = r0
            r6 = r36
            if (r0 == 0) goto L_0x02c4
            r0 = r31
            r0.setVisibility(r2)
        L_0x005a:
            X.Jvx r12 = r5.A04
            java.lang.Object r1 = r12.A04
            X.0sL r1 = (X.0sL) r1
            r22 = r37
            r0 = r22
            r1.invoke(r4, r0)
            X.3W1 r1 = r4.A00
            if (r1 == 0) goto L_0x0082
            if (r1 == r3) goto L_0x0082
            r0 = 0
            r1.A0M(r4, r0, r2)
            com.instagram.ui.mediaactions.LikeActionView r0 = r4.A0D
            r1.A0V(r0)
            r1.A0Y(r0)
            X.3TS r0 = r4.A03
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r0.A01()
            r1.A0S(r0)
        L_0x0082:
            r4.A00 = r3
            r18 = 0
            r0 = r18
            r3.A0L(r4, r0, r2)
            com.instagram.ui.mediaactions.LikeActionView r0 = r4.A0D
            r0.A00()
            r3.A0T(r0)
            r3.A0X(r0)
            X.3TO r13 = r5.A0A
            X.3da r0 = r5.A06
            r16 = r0
            com.instagram.feed.widget.IgProgressImageView r11 = r4.A0A
            r11.setVisibility(r2)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r10 = r4.A0F
            float r9 = r5.A00
            double r0 = (double) r9
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x028f
            boolean r7 = r5.A0F
            if (r7 == 0) goto L_0x028f
            com.instagram.common.session.UserSession r15 = r6.A01
            X.0Tu r14 = X.0Tu.A06
            r7 = 36325905676973419(0x810e380005356b, double:3.0359872505749336E-306)
            boolean r7 = X.182.A06(r14, r15, r7)
            if (r7 != 0) goto L_0x028f
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x00c1:
            r10.A00 = r9
            r7 = 2131435565(0x7f0b202d, float:1.8492976E38)
            X.PGN r0 = new X.PGN
            r0.<init>(r2, r6, r3)
            r11.A0A(r0, r7)
            X.IV0 r1 = new X.IV0
            r1.<init>(r3)
            android.util.SparseArray r0 = r11.A0D
            r0.put(r7, r1)
            r0 = r35
            r11.setPostProcessor(r0)
            X.3gz r0 = new X.3gz
            r0.<init>()
            r11.setProgressiveImageConfig(r0)
            r3.A0U = r2
            X.3fX r1 = r5.A05
            r0 = r34
            X.C247843h0.A00(r0, r1, r11)
            com.instagram.ui.mediaactions.MediaActionsView r1 = r4.A0E
            X.9IB r0 = r5.A01
            X.AnonymousClass4Je.A00(r0, r3, r11, r1, r13)
            java.lang.Object r1 = r12.A01
            X.0sP r1 = (X.0sP) r1
            android.content.Context r0 = r6.A00
            java.lang.Object r0 = r1.invoke(r0)
            X.C56815IDm.A00(r10, r2, r0)
            X.3TW r7 = r4.A06
            X.9J0 r1 = r5.A03
            com.instagram.common.session.UserSession r0 = r6.A01
            r30 = r0
            X.JT4 r0 = r6.A02
            r29 = r0
            X.4G1 r27 = r29.Aow()
            r23 = r1
            r24 = r30
            r25 = r34
            r26 = r7
            r28 = r3
            X.AnonymousClass4G2.A00(r22, r23, r24, r25, r26, r27, r28)
            X.3TS r1 = r4.A03
            X.9IQ r0 = r5.A02
            X.C250563lf.A0f(r0, r1, r3)
            X.3V4 r1 = r4.A08
            X.IUN r0 = new X.IUN
            r0.<init>(r5)
            r22 = r34
            r23 = r30
            r24 = r0
            r25 = r1
            r26 = r16
            r27 = r2
            X.AnonymousClass4Jq.A01(r22, r23, r24, r25, r26, r27)
            java.lang.Object r0 = r12.A06
            X.C51965G9l.A1W(r0, r10)
            X.3aa r0 = X.C244063aa.MEDIA
            X.C244083ac.A05(r10, r0)
            if (r17 == 0) goto L_0x021e
            java.util.List r11 = r5.A0C
            X.JPN r14 = r29.Aos()
            r0 = r20
            X.0qQ.A0B(r11, r0)
            r0 = r19
            X.0qQ.A0B(r14, r0)
            X.Gi2 r10 = new X.Gi2
            r0 = r30
            r10.<init>(r0)
            java.lang.Object r0 = X.00k.A0O(r11, r2)
            X.GlF r0 = (X.C53267GlF) r0
            if (r0 == 0) goto L_0x021a
            float r15 = r0.A00
        L_0x0169:
            r0 = r32
            double r8 = r0.A00
            int r13 = X.AnonymousClass3V6.A00(r32)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r31)
            int r6 = X.AnonymousClass0nB.A01(r0)
            double r16 = java.lang.Math.floor(r8)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r16 = r16 + r0
            double r6 = (double) r6
            double r0 = (double) r13
            double r16 = r16 * r0
            double r6 = r6 - r16
            double r6 = r6 / r8
            double r0 = (double) r15
            double r6 = r6 / r0
            int r0 = r13 * 2
            double r0 = (double) r0
            double r6 = r6 + r0
            int r1 = (int) r6
            r0 = r31
            X.0nA.A0V(r0, r1)
            r0.setAdapter(r10)
            com.instagram.common.session.UserSession r7 = r10.A01
            X.HqY r6 = new X.HqY
            r1 = r35
            r0 = r34
            r6.<init>(r7, r1, r14, r0)
            r10.A00 = r6
            java.util.List r0 = r10.A02
            r0.clear()
            r0.addAll(r11)
        L_0x01ac:
            X.3VF r7 = r4.A0C
            X.3VE r0 = r7.A05
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x03ab
            r0.A00()
            X.3V9 r9 = r4.A0B
            X.4Gh r8 = r29.BR1()
            java.lang.Object r1 = r12.A02
            X.0sL r1 = (X.0sL) r1
            X.4Gh r0 = r29.BR1()
            java.lang.Object r6 = r1.invoke(r9, r0)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            X.4Fv r1 = r5.A08
            r0 = r18
            X.C262954Gq.A00(r6, r8, r1, r0, r9)
            boolean r6 = r5.A0D
            if (r6 == 0) goto L_0x0212
            X.50X r3 = r5.A07
            X.3VC r1 = r7.A00
            if (r1 == 0) goto L_0x03a1
            r0 = r21
            X.AnonymousClass4H2.A01(r3, r1, r0)
        L_0x01e1:
            X.3VD r1 = r7.A04
            if (r1 == 0) goto L_0x039c
            X.3fk r0 = r5.A09
            X.47O r14 = r29.BR2()
            r13 = r30
            r15 = r0
            r16 = r1
            r17 = r6
            r18 = r2
            X.AnonymousClass4H3.A00(r13, r14, r15, r16, r17, r18)
            X.3Ux r3 = r4.A09
            java.lang.Object r1 = r12.A03
            X.0sP r1 = (X.0sP) r1
            X.339 r0 = r29.CGA()
            java.lang.Object r1 = r1.invoke(r0)
            X.3fb r1 = (X.C246993fb) r1
            X.0qQ.A0B(r3, r2)
            r0 = r21
            X.0qQ.A0B(r1, r0)
            r3.A00 = r1
            return
        L_0x0212:
            X.3VC r0 = r7.A00
            if (r0 == 0) goto L_0x03a6
            X.AnonymousClass4H2.A00(r3, r0, r2)
            goto L_0x01e1
        L_0x021a:
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0169
        L_0x021e:
            X.JPN r7 = r29.Aos()
            X.HqY r10 = new X.HqY
            r6 = r30
            r1 = r35
            r0 = r34
            r10.<init>(r6, r1, r7, r0)
            java.util.Collection r0 = r33.values()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x0239:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r1 = r6.next()
            r0 = r1
            X.3V5 r0 = (X.AnonymousClass3V5) r0
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r0.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0239
            r14.add(r1)
            goto L_0x0239
        L_0x0252:
            r13 = 0
            java.util.List r11 = r5.A0C
            int r1 = r11.size()
            int r0 = r14.size()
            int r9 = java.lang.Math.min(r1, r0)
        L_0x0261:
            if (r13 >= r9) goto L_0x01ac
            java.lang.Object r8 = r14.get(r13)
            X.3V5 r8 = (X.AnonymousClass3V5) r8
            java.lang.Object r7 = r11.get(r13)
            X.GlF r7 = (X.C53267GlF) r7
            boolean r6 = r5.A0G
            X.0qQ.A0B(r8, r2)
            r0 = r21
            X.0qQ.A0B(r7, r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r8.A01
            com.instagram.feed.widget.IgProgressImageView r0 = r8.A00
            r22 = r10
            r23 = r7
            r24 = r0
            r25 = r1
            r26 = r13
            r27 = r6
            r22.A00(r23, r24, r25, r26, r27)
            int r13 = r13 + 1
            goto L_0x0261
        L_0x028f:
            boolean r7 = r5.A0F
            r14 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            if (r7 == 0) goto L_0x02a1
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x02a1
        L_0x029c:
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x00c1
        L_0x02a1:
            boolean r7 = r5.A0G
            if (r7 == 0) goto L_0x00c1
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x00c1
            com.instagram.common.session.UserSession r8 = r6.A01
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329728197542182(0x8111b200004126, double:3.038404627974674E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 != 0) goto L_0x029c
            r0 = 36329728197607719(0x8111b200014127, double:3.03840462801612E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x00c1
            goto L_0x029c
        L_0x02c4:
            r1.setVisibility(r2)
            java.lang.Integer r0 = r5.A0B
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x0342
            r0 = r21
            if (r1 != r0) goto L_0x03b0
            r10 = 2131430428(0x7f0b0c1c, float:1.8482557E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r9 = 2131430429(0x7f0b0c1d, float:1.8482559E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r8 = 2131430430(0x7f0b0c1e, float:1.848256E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r7, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x02f4:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x005a
            int r7 = X.AnonymousClass7TG.A0F(r16)
            android.content.Context r0 = r6.A00
            r18 = r0
            com.instagram.common.session.UserSession r14 = r6.A01
            r0 = r33
            java.lang.Object r0 = X.C51968G9o.A10(r0, r7)
            X.3V5 r0 = (X.AnonymousClass3V5) r0
            if (r0 == 0) goto L_0x02f4
            com.instagram.ui.widget.framelayout.MediaFrameLayout r12 = r0.A01
            r12.setVisibility(r2)
            android.view.ViewGroup$MarginLayoutParams r11 = X.DbX.A0G(r12)
            r13 = 16
            X.0Tu r15 = X.0Tu.A05
            r0 = 36323105358228321(0x810bac00042b61, double:3.034216317724555E-306)
            boolean r0 = X.182.A06(r15, r14, r0)
            if (r0 == 0) goto L_0x0331
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r13 = r1.getDimensionPixelSize(r0)
        L_0x0331:
            if (r7 != r10) goto L_0x033a
            r11.setMargins(r13, r13, r13, r13)
        L_0x0336:
            r12.setLayoutParams(r11)
            goto L_0x02f4
        L_0x033a:
            if (r7 == r9) goto L_0x033e
            if (r7 != r8) goto L_0x0336
        L_0x033e:
            r11.setMargins(r2, r13, r13, r13)
            goto L_0x0336
        L_0x0342:
            r0 = 2131430409(0x7f0b0c09, float:1.8482518E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 2131430413(0x7f0b0c0d, float:1.8482526E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 2131430417(0x7f0b0c11, float:1.8482534E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 2131430421(0x7f0b0c15, float:1.8482542E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = 2131430424(0x7f0b0c18, float:1.8482549E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 2131430426(0x7f0b0c1a, float:1.8482553E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r7, r8, r9, r10, r11, r12}
            java.util.List r1 = X.0sr.A1P(r0)
            java.util.List r0 = r5.A0C
            int r0 = r0.size()
            java.util.List r0 = X.00k.A0d(r1, r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0382:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x005a
            int r1 = X.AnonymousClass7TG.A0F(r7)
            r0 = r33
            java.lang.Object r0 = X.C51968G9o.A10(r0, r1)
            X.3V5 r0 = (X.AnonymousClass3V5) r0
            if (r0 == 0) goto L_0x0382
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r0.A01
            r0.setVisibility(r2)
            goto L_0x0382
        L_0x039c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x03a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x03a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x03ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x03b0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GUE.A00(android.app.Activity, X.2s5, X.GmH, X.3V2, X.4DU, X.3W1):void");
    }

    public GUE(Context context, UserSession userSession, JT4 jt4) {
        AnonymousClass7TG.A1U(context, userSession, jt4);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = jt4;
    }
}
