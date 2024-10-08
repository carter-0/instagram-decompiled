package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.4G8  reason: invalid class name */
public final class AnonymousClass4G8 extends BaseAdapter {
    public AnonymousClass3TS A00;
    public AnonymousClass4GA A01;
    public AnonymousClass4GL A02;
    public AnonymousClass4GP A03;
    public AnonymousClass4GF A04;
    public AnonymousClass3W1 A05;
    public AnonymousClass2xS A06;
    public int A07;
    public Integer A08;
    public final UserSession A09;
    public final AnonymousClass3TA A0A;
    public final 1Xj A0B;
    public final 0Pl A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new AnonymousClass9LW(this, 2));
    public final Context A0E;
    public final C229382nI A0F;
    public final ReboundViewPager A0G;
    public final AnonymousClass4G9 A0H;
    public final AnonymousClass4DU A0I;
    public final Float A0J;
    public final boolean A0K;
    public final boolean A0L;

    public AnonymousClass4G8(Context context, C229382nI r12, AnonymousClass3TS r13, UserSession userSession, ReboundViewPager reboundViewPager, AnonymousClass3TA r16, 1Xj r17, AnonymousClass4DU r18, AnonymousClass3W1 r19, 0Pl r20, AnonymousClass2xS r21, Float f, Integer num, int i, boolean z, boolean z2) {
        this.A0E = context;
        this.A0C = r20;
        this.A0K = z;
        this.A0B = r17;
        AnonymousClass3TA r5 = r16;
        this.A0A = r5;
        this.A09 = userSession;
        this.A0L = z2;
        this.A0I = r18;
        this.A0F = r12;
        this.A08 = num;
        this.A0J = f;
        this.A0G = reboundViewPager;
        this.A0H = new AnonymousClass4G9(context, userSession);
        A03(r13, userSession, r5, r19, r21, this.A08, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v3, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r13v6 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04bf, code lost:
        if (r1 != null) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0233, code lost:
        if (r0 != false) goto L_0x01df;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x020d A[LOOP:0: B:61:0x0207->B:63:0x020d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0321  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.view.View r46, int r47) {
        /*
            r45 = this;
            r13 = 0
            r16 = 0
            r0 = r45
            X.1Xj r2 = r0.A0B
            X.1Xy r1 = r2.A0C
            java.util.List r3 = r1.Alu()
            r8 = r47
            X.1Xj r1 = r2.A1c(r8)
            if (r1 == 0) goto L_0x0028
            X.3W1 r6 = r0.A02()
            int r5 = r1.A0y()
            int r4 = r1.A0x()
            X.4Gd r1 = new X.4Gd
            r1.<init>(r5, r4)
            r6.A0j = r1
        L_0x0028:
            if (r3 == 0) goto L_0x0484
            int r1 = r3.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r3.get(r1)
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x0484
            X.1Xy r1 = r1.A0C
            X.4qi r36 = r1.BH3()
        L_0x003e:
            int r4 = r0.getItemViewType(r8)
            java.lang.Integer r18 = X.AnonymousClass05K.A00
            r1 = 1
            r35 = r46
            if (r4 != r1) goto L_0x00ad
            if (r3 == 0) goto L_0x00ac
            int r1 = r3.size()
            if (r1 <= r8) goto L_0x00ac
            X.4GB r33 = X.AnonymousClass4GA.A01
            X.0eM r1 = r0.A0D
            java.lang.Object r14 = r1.getValue()
            X.4nl r14 = (X.C274134nl) r14
            X.3W1 r18 = r0.A02()
            int r7 = r0.A07
            boolean r6 = r0.A0L
            boolean r5 = r0.A0K
            java.lang.Integer r4 = r0.A08
            java.lang.Float r1 = r0.A0J
            android.content.Context r15 = r0.A0E
            X.4DU r9 = r0.A0I
            r27 = 0
            java.util.HashMap r22 = r2.A3M()
            java.util.HashMap r23 = r2.A3L()
            java.util.HashMap r24 = r2.A3N()
            r20 = r4
            r21 = r3
            r25 = r7
            r26 = r8
            r28 = r6
            r29 = r5
            r30 = r27
            r16 = r2
            r17 = r9
            r19 = r1
            X.4nn r40 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.3W1 r43 = r0.A02()
            com.instagram.common.session.UserSession r1 = r0.A09
            X.3TA r0 = r0.A0A
            X.4nj r39 = r0.Alp()
            r34 = r15
            r37 = r1
            r38 = r13
            r41 = r9
            r42 = r9
            r33.A02(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
        L_0x00ac:
            return
        L_0x00ad:
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            r1 = 2
            if (r4 != r1) goto L_0x015d
            X.3W1 r1 = r0.A02()
            int r4 = r1.A02
            X.1Xj r1 = r2.A1c(r4)
            if (r3 == 0) goto L_0x013c
            if (r1 == 0) goto L_0x013c
            X.3TA r10 = r0.A0A
            X.4GD r6 = r10.AmC()
            com.instagram.common.session.UserSession r3 = r0.A09
            X.0Pl r5 = r0.A0C
            X.4y4 r14 = new X.4y4
            r14.<init>(r3, r6, r5)
            X.4GG r33 = X.AnonymousClass4GF.A06
            X.3W1 r19 = r0.A02()
            int r9 = r0.A07
            X.2xS r5 = r0.A06
            if (r5 == 0) goto L_0x0520
            X.3TO r21 = r5.A02(r1)
            X.2xS r5 = r0.A06
            if (r5 == 0) goto L_0x0520
            X.3da r20 = r5.A01(r1)
            java.lang.Integer r7 = r0.A08
            java.lang.Float r6 = r0.A0J
            android.content.Context r15 = r0.A0E
            X.4DU r11 = r0.A0I
            r30 = 0
            X.1Xj r17 = r2.A1c(r8)
            if (r17 != 0) goto L_0x00f9
            r17 = r2
        L_0x00f9:
            X.1Xy r5 = r2.A0C
            java.util.List r24 = r5.Alu()
            java.util.HashMap r25 = r2.A3M()
            java.util.HashMap r26 = r2.A3L()
            java.util.HashMap r27 = r2.A3N()
            r22 = r6
            r23 = r7
            r28 = r8
            r29 = r9
            r16 = r2
            r18 = r11
            X.4y5 r39 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.3W1 r42 = r0.A02()
            X.3TS r6 = r0.A00
            if (r6 == 0) goto L_0x0488
            boolean r5 = r0.A0K
            boolean r2 = r0.A0L
            X.4GD r40 = r10.AmC()
            r34 = r15
            r36 = r6
            r37 = r3
            r38 = r13
            r41 = r11
            r43 = r5
            r44 = r2
            r33.A02(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
        L_0x013c:
            if (r8 != r4) goto L_0x00ac
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r2 = r35.getTag()
            if (r2 == 0) goto L_0x00ac
            X.2xS r4 = r0.A06
            if (r4 == 0) goto L_0x0520
            java.lang.Object r3 = r35.getTag()
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.video.holder.FeedVideoViewHolder"
            X.0qQ.A0C(r3, r2)
            X.3V3 r3 = (X.AnonymousClass3V3) r3
            X.3W1 r0 = r0.A02()
            r4.A07(r1, r3, r0)
            return
        L_0x015d:
            r6 = 3
            if (r4 != r6) goto L_0x024a
            X.4GL r7 = r0.A02
            if (r7 == 0) goto L_0x050e
            X.3W1 r12 = r0.A02()
            int r14 = r0.A07
            java.lang.Integer r5 = r0.A08
            java.lang.Object r9 = r35.getTag()
            r9.getClass()
            X.HnD r9 = (X.C55778HnD) r9
            X.1Xj r8 = r2.A1c(r8)
            com.instagram.common.session.UserSession r6 = r7.A01
            r11 = 0
            X.0qQ.A0B(r9, r11)
            boolean r0 = X.C262574Fa.A00(r6, r2)
            r10 = -1
            com.instagram.ui.widget.framelayout.MediaFrameLayout r4 = r9.A03
            if (r0 == 0) goto L_0x023d
            android.content.Context r3 = r4.getContext()
            X.0Tu r15 = X.0Tu.A05
            r0 = 36612259736590649(0x8212a800061939, double:3.217078710932117E-306)
            long r0 = X.182.A01(r15, r6, r0)
            float r15 = (float) r0
            X.0qQ.A0A(r3)
            float r1 = X.C61380mr.A00(r3, r15)
            r0 = 1
            r4.A04 = r0
            r4.A01 = r1
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r5 == 0) goto L_0x01ae
            int r10 = r5.intValue()
        L_0x01ae:
            r0.width = r10
            com.instagram.maps.ui.IgStaticMapView r10 = r9.A02
            r0 = 1
            r10.setEnabled(r0)
            if (r8 == 0) goto L_0x023b
            X.1Xy r0 = r8.A0C
            X.DUs r1 = r0.Bzu()
            if (r1 == 0) goto L_0x0239
            float r0 = r1.BLU()
            java.lang.Float r13 = java.lang.Float.valueOf(r0)
            float r0 = r1.BNU()
            java.lang.Float r16 = java.lang.Float.valueOf(r0)
            r0 = 1
        L_0x01d1:
            com.facebook.android.maps.StaticMapView$StaticMapOptions r5 = X.AnonymousClass4GL.A04
            r5.A00()
            if (r0 == 0) goto L_0x0231
            if (r13 == 0) goto L_0x0231
            float r0 = r13.floatValue()
            double r3 = (double) r0
        L_0x01df:
            if (r16 == 0) goto L_0x0236
            float r0 = r16.floatValue()
            double r0 = (double) r0
        L_0x01e6:
            r5.A01(r3, r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r8 == 0) goto L_0x04c5
            X.1Xy r0 = r8.A0C
            java.util.List r1 = r0.Bzt()
            if (r1 == 0) goto L_0x04c5
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x0207:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x048c
            java.lang.Object r1 = r16.next()
            X.DUs r1 = (X.C46315DUs) r1
            X.0qQ.A0B(r1, r11)
            float r0 = r1.BLU()
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            float r0 = r1.BNU()
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r1 = 25
            X.N4R r0 = new X.N4R
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4)
            r15.add(r0)
            goto L_0x0207
        L_0x0231:
            r3 = 0
            if (r0 == 0) goto L_0x0236
            goto L_0x01df
        L_0x0236:
            r0 = 0
            goto L_0x01e6
        L_0x0239:
            r0 = 0
            goto L_0x01d1
        L_0x023b:
            r0 = 0
            goto L_0x01d1
        L_0x023d:
            r4.A04 = r11
            r0 = 0
            r4.A01 = r0
            r4.A02 = r13
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            goto L_0x01ae
        L_0x024a:
            if (r3 == 0) goto L_0x00ac
            com.instagram.common.session.UserSession r4 = r0.A09
            X.3TA r1 = r0.A0A
            X.4GN r1 = r1.Am6()
            X.HnE r5 = new X.HnE
            r5.<init>(r4, r1)
            X.4GP r1 = r0.A03
            if (r1 == 0) goto L_0x051d
            X.3W1 r9 = r0.A02()
            int r14 = r0.A07
            boolean r12 = r0.A0K
            android.content.Context r10 = r0.A0E
            X.4DU r4 = r0.A0I
            r0 = 6
            X.0qQ.A0B(r10, r0)
            r0 = 7
            X.0qQ.A0B(r4, r0)
            java.lang.Object r7 = r3.get(r8)
            X.1Xj r7 = (X.1Xj) r7
            int r30 = r3.size()
            X.2kQ r4 = X.C227942kP.A00(r4)
            float r29 = X.AnonymousClass4FX.A00(r3)
            X.1Xy r0 = r7.A0C
            X.3xj r0 = r0.AsQ()
            r27 = 0
            if (r0 == 0) goto L_0x0480
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r0 = r0.BwB()
            if (r0 == 0) goto L_0x0480
            X.GVk r22 = X.B7C.A00(r0)
        L_0x0297:
            X.1Xy r0 = r7.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 == 0) goto L_0x02a3
            com.instagram.model.showreel.IgShowreelComposition r27 = r0.Bw9()
        L_0x02a3:
            X.1Xy r0 = r7.A0C
            X.3yJ r0 = r0.CCN()
            if (r0 == 0) goto L_0x046e
            X.DHD r3 = new X.DHD
            r3.<init>(r0)
        L_0x02b0:
            X.DQz r3 = (X.C46218DQz) r3
        L_0x02b2:
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            X.3fS r0 = (X.C246923fS) r0
            X.3fX r25 = r0.A00(r10, r7)
            com.instagram.common.session.UserSession r11 = r5.A00
            X.3eZ r0 = X.C246413eY.A00(r11)
            boolean r34 = r0.A02(r4, r7, r2)
            X.0eM r0 = r5.A03
            java.lang.Object r0 = r0.getValue()
            X.3fg r0 = (X.C247043fg) r0
            X.3fk r28 = r0.A00(r7, r9)
            X.JJS r0 = new X.JJS
            r0.<init>(r6, r5, r7)
            r7 = 28
            X.Inr r6 = new X.Inr
            r6.<init>(r7, r5, r2)
            r38 = 9
            X.J6a r10 = new X.J6a
            r36 = r10
            r37 = r14
            r39 = r2
            r40 = r9
            r41 = r5
            r36.<init>((int) r37, (int) r38, (java.lang.Object) r39, (java.lang.Object) r40, (java.lang.Object) r41)
            r5 = 40
            X.JwM r7 = new X.JwM
            r7.<init>((int) r5, (java.lang.Object) r10, (java.lang.Object) r6, (java.lang.Object) r0)
            X.3Ye r5 = new X.3Ye
            r5.<init>(r11)
            java.lang.String r0 = "cta_extension_tap_on_media"
            X.9J3 r20 = r5.A00(r2, r4, r9, r0)
            X.GmC r0 = new X.GmC
            r19 = r0
            r21 = r7
            r23 = r3
            r24 = r2
            r26 = r9
            r31 = r8
            r32 = r14
            r33 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r7 = 0
            java.lang.Object r6 = r35.getTag()
            java.lang.String r5 = "Required value was null."
            if (r6 == 0) goto L_0x0517
            X.3s3 r6 = (X.C254173s3) r6
            com.instagram.ui.widget.framelayout.MediaFrameLayout r8 = r6.A09
            com.instagram.common.session.UserSession r4 = r1.A02
            X.IDO r2 = new X.IDO
            r2.<init>(r4, r0, r6)
            r8.setOnTouchListener(r2)
            X.0Tu r9 = X.0Tu.A05
            r2 = 2342156244737656658(0x208102b2000d0752, double:4.059850178372156E-152)
            boolean r2 = X.182.A06(r9, r4, r2)
            if (r2 == 0) goto L_0x0366
            X.3W1 r11 = r0.A0A
            com.instagram.feed.widget.IgProgressImageView r10 = r6.A04
            r9 = 2131435565(0x7f0b202d, float:1.8492976E38)
            X.IUx r2 = new X.IUx
            r2.<init>(r0, r6, r11)
            r10.A0A(r2, r9)
            X.3gz r2 = new X.3gz
            r2.<init>()
            r10.setProgressiveImageConfig(r2)
            X.IUz r3 = new X.IUz
            r3.<init>(r11)
            android.util.SparseArray r2 = r10.A0D
            r2.put(r9, r3)
            r11.A0U = r7
            X.3fX r3 = r0.A09
            X.4DU r2 = r1.A04
            X.C247843h0.A00(r2, r3, r10)
        L_0x0366:
            float r2 = r0.A00
            r8.A00 = r2
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r8 = r6.A06
            r2 = 8
            r8.setVisibility(r2)
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r12 = r6.A05
            r12.setVisibility(r2)
            X.DQz r10 = r0.A07
            com.instagram.model.showreel.IgShowreelComposition r11 = r0.A0B
            X.6L7 r9 = r0.A06
            X.JwM r2 = r0.A05
            java.lang.Object r2 = r2.A01
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r14 = r2.invoke()
            X.6Q7 r14 = (X.AnonymousClass6Q7) r14
            int r2 = r0.A03
            r16 = r2
            int r15 = r0.A02
            int r2 = r0.A01
            X.6Nn r3 = new X.6Nn
            r19 = r3
            r20 = r14
            r21 = r16
            r22 = r15
            r23 = r2
            r24 = r7
            r19.<init>(r20, r21, r22, r23, r24)
            if (r10 == 0) goto L_0x0443
            java.lang.Integer r14 = r10.Bly()
            r2 = r17
            if (r14 != r2) goto L_0x0408
            X.2nI r14 = r1.A01
            if (r14 == 0) goto L_0x0443
            java.lang.String r11 = r10.Anf()
            java.lang.String r9 = r10.Bm0()
            java.lang.String r8 = r10.C4Z()
            if (r11 == 0) goto L_0x03cc
            if (r9 == 0) goto L_0x03cc
            if (r8 == 0) goto L_0x03cc
            com.instagram.model.showreel.IgShowreelCompositionImpl r2 = new com.instagram.model.showreel.IgShowreelCompositionImpl
            r2.<init>(r11, r9, r8, r13)
            r12.setShowreelAnimation(r4, r2, r3, r14)
            r12.setVisibility(r7)
        L_0x03cc:
            X.3W1 r7 = r0.A0A
            r6.A00 = r7
            X.3VF r2 = r6.A07
            X.3VD r9 = r2.A04
            if (r9 == 0) goto L_0x0511
            X.3fk r8 = r0.A0C
            boolean r5 = r0.A0E
            boolean r3 = r0.A0D
            X.4GN r2 = r1.A03
            X.47O r15 = r2.BR2()
            r16 = r8
            r17 = r9
            r18 = r5
            r19 = r3
            r14 = r4
            X.AnonymousClass4H3.A00(r14, r15, r16, r17, r18, r19)
            X.3v9 r5 = r6.A03
            X.9J3 r3 = r0.A04
            android.content.Context r2 = r1.A00
            X.4DU r1 = r1.A04
            java.lang.String r1 = r1.getModuleName()
            X.1Xj r0 = r0.A08
            if (r3 == 0) goto L_0x0400
            java.lang.String r13 = r3.A03
        L_0x0400:
            int r0 = X.C256073vB.A00(r2, r4, r0, r1, r13)
            X.C256083vC.A00(r3, r5, r7, r0)
            return
        L_0x0408:
            r2 = r18
            if (r14 != r2) goto L_0x0443
            java.lang.String r14 = r10.Anf()
            java.lang.String r15 = r10.Bm0()
            java.lang.String r16 = r10.C4Z()
            if (r14 == 0) goto L_0x03cc
            if (r15 == 0) goto L_0x03cc
            if (r16 == 0) goto L_0x03cc
            X.GVk r10 = new X.GVk
            r11 = r13
            r12 = r13
            r17 = r13
            r18 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r2)
            X.4DU r2 = r1.A04
            java.lang.String r18 = r2.getModuleName()
            r14 = r8
            r15 = r10
            r16 = r4
            r17 = r3
            r19 = r7
            r14.A08(r15, r16, r17, r18, r19)
            r8.setVisibility(r7)
            goto L_0x03cc
        L_0x0443:
            if (r11 == 0) goto L_0x0451
            X.2nI r2 = r1.A01
            if (r2 == 0) goto L_0x0451
            r12.setShowreelAnimation(r4, r11, r3, r2)
            r12.setVisibility(r7)
            goto L_0x03cc
        L_0x0451:
            if (r9 == 0) goto L_0x03cc
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r2)
            X.4DU r2 = r1.A04
            java.lang.String r18 = r2.getModuleName()
            r14 = r8
            r15 = r9
            r16 = r4
            r17 = r3
            r19 = r7
            r14.A08(r15, r16, r17, r18, r19)
            r8.setVisibility(r7)
            goto L_0x03cc
        L_0x046e:
            X.1Xy r0 = r7.A0C
            X.DUQ r0 = r0.CCM()
            if (r0 == 0) goto L_0x047d
            X.DHE r3 = new X.DHE
            r3.<init>(r0)
            goto L_0x02b0
        L_0x047d:
            r3 = 0
            goto L_0x02b2
        L_0x0480:
            r22 = r13
            goto L_0x0297
        L_0x0484:
            r36 = 0
            goto L_0x003e
        L_0x0488:
            java.lang.String r0 = "mSlideInAndOutIconHolder"
            goto L_0x0522
        L_0x048c:
            java.util.Iterator r15 = r15.iterator()
        L_0x0490:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x04c5
            java.lang.Object r1 = r15.next()
            X.N4R r1 = (X.N4R) r1
            if (r1 == 0) goto L_0x04bd
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x04bd
            float r0 = r0.floatValue()
            double r3 = (double) r0
        L_0x04a9:
            java.lang.Object r0 = r1.A02
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x04c2
            float r0 = r0.floatValue()
            double r0 = (double) r0
        L_0x04b4:
            com.facebook.android.maps.model.LatLng r11 = new com.facebook.android.maps.model.LatLng
            r11.<init>(r3, r0)
            r13.add(r11)
            goto L_0x0490
        L_0x04bd:
            r3 = 0
            if (r1 == 0) goto L_0x04c2
            goto L_0x04a9
        L_0x04c2:
            r0 = 0
            goto L_0x04b4
        L_0x04c5:
            r5.A05(r13)
            if (r8 == 0) goto L_0x050c
            X.1Xy r0 = r8.A0C
            java.lang.Integer r0 = r0.Bzv()
            if (r0 == 0) goto L_0x050c
            int r0 = r0.intValue()
        L_0x04d6:
            r5.A03(r0)
            r10.setMapOptions(r5)
            X.IDb r0 = new X.IDb
            r15 = r0
            r16 = r9
            r17 = r7
            r18 = r2
            r19 = r12
            r20 = r14
            r15.<init>(r16, r17, r18, r19, r20)
            r10.setOnTouchListener(r0)
            X.3v9 r5 = r9.A01
            X.3Ye r1 = new X.3Ye
            r1.<init>(r6)
            X.4DU r0 = r7.A03
            java.lang.String r4 = "cta_extension_tap_on_media"
            X.9J3 r3 = r1.A00(r2, r0, r12, r4)
            android.content.Context r1 = r7.A00
            java.lang.String r0 = r0.getModuleName()
            int r0 = X.C256073vB.A00(r1, r6, r2, r0, r4)
            X.C256083vC.A00(r3, r5, r12, r0)
            return
        L_0x050c:
            r0 = 0
            goto L_0x04d6
        L_0x050e:
            java.lang.String r0 = "carouselMapViewBinder"
            goto L_0x0522
        L_0x0511:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0517:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x051d:
            java.lang.String r0 = "carouselSponsoredContentViewBinder"
            goto L_0x0522
        L_0x0520:
            java.lang.String r0 = "carouselVideoDelegate"
        L_0x0522:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4G8.A01(android.view.View, int):void");
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        if (view == null) {
            view = A00(i, viewGroup);
        }
        try {
            A01(view, i);
        } catch (ClassCastException unused) {
            view = A00(i, viewGroup);
            A01(view, i);
        }
        this.A0A.ECH(view, this.A0B, A02(), i);
        return view;
    }

    public final int getViewTypeCount() {
        return 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        if (r0 != null) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.View A00(int r16, android.view.ViewGroup r17) {
        /*
            r15 = this;
            r0 = r16
            int r1 = r15.getItemViewType(r0)
            r0 = 1
            r8 = r17
            if (r1 != r0) goto L_0x0031
            X.4GA r5 = r15.A01
            if (r5 == 0) goto L_0x012e
            android.content.Context r0 = r15.A0E
            X.4G9 r4 = r15.A0H
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r15.A0G
            r2 = 0
            X.0qQ.A0B(r0, r2)
            r1 = 2131629063(0x7f0e1407, float:1.8885436E38)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r0.inflate(r1, r8, r2)
            X.0qQ.A0A(r0)
            com.instagram.common.session.UserSession r1 = r5.A00
            X.4Gb r2 = X.AnonymousClass4GB.A00(r0, r1, r3, r4)
        L_0x002d:
            r0.setTag(r2)
            return r0
        L_0x0031:
            r0 = 2
            if (r1 != r0) goto L_0x005a
            X.4GF r6 = r15.A04
            if (r6 == 0) goto L_0x0134
            android.content.Context r5 = r15.A0E
            X.4G9 r4 = r15.A0H
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r15.A0G
            r2 = 0
            X.0qQ.A0B(r5, r2)
            r1 = 2131629065(0x7f0e1409, float:1.888544E38)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
            android.view.View r0 = r0.inflate(r1, r8, r2)
            X.0qQ.A0A(r0)
            com.instagram.common.session.UserSession r1 = r6.A01
            X.4y1 r1 = X.AnonymousClass4GG.A00(r5, r0, r1, r3, r4)
            r0.setTag(r1)
            return r0
        L_0x005a:
            r0 = 3
            if (r1 != r0) goto L_0x0071
            android.content.Context r0 = r15.A0E
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131629061(0x7f0e1405, float:1.8885432E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r8, r0)
            X.HnD r2 = new X.HnD
            r2.<init>(r0)
            goto L_0x002d
        L_0x0071:
            X.4GP r2 = r15.A03
            if (r2 == 0) goto L_0x0131
            android.content.Context r7 = r15.A0E
            r6 = 0
            X.0qQ.A0B(r7, r6)
            X.XQr r1 = X.C21246XQr.FEED_SPONSORED_CONTENT_SHOWREEL
            java.util.Map r0 = X.XmL.A00
            java.lang.Object r5 = r0.get(r1)
            X.XnB r5 = (X.XnB) r5
            if (r5 == 0) goto L_0x0121
            java.util.Queue r4 = r5.A03
            java.lang.Object r0 = r4.poll()
            X.Xa9 r3 = r5.A02
            boolean r1 = r3.A01
            if (r1 == 0) goto L_0x0096
            X.XnB.A00(r3, r5, r4)
        L_0x0096:
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0121
        L_0x009a:
            X.0qQ.A0A(r0)
            com.instagram.common.session.UserSession r5 = r2.A02
            r1 = 2131441602(0x7f0b37c2, float:1.850522E38)
            android.view.View r3 = r0.requireViewById(r1)
            X.0qQ.A07(r3)
            r1 = 2131435808(0x7f0b2120, float:1.8493469E38)
            android.view.View r14 = r0.requireViewById(r1)
            X.0qQ.A07(r14)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r14 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r14
            r1 = 2131438596(0x7f0b2c04, float:1.8499123E38)
            android.view.View r8 = r0.requireViewById(r1)
            X.0qQ.A07(r8)
            com.instagram.feed.widget.IgProgressImageView r8 = (com.instagram.feed.widget.IgProgressImageView) r8
            r1 = 2131441363(0x7f0b36d3, float:1.8504736E38)
            android.view.View r10 = r0.requireViewById(r1)
            X.0qQ.A07(r10)
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r10 = (com.instagram.showreelnative.ui.common.ShowreelNativeMediaView) r10
            r1 = 2131441358(0x7f0b36ce, float:1.8504725E38)
            android.view.View r9 = r0.requireViewById(r1)
            X.0qQ.A07(r9)
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r9 = (com.instagram.showreel.composition.ui.IgShowreelCompositionView) r9
            r1 = 2131441601(0x7f0b37c1, float:1.8505218E38)
            android.view.View r13 = r0.requireViewById(r1)
            X.0qQ.A07(r13)
            com.instagram.ui.mediaactions.LikeActionView r13 = (com.instagram.ui.mediaactions.LikeActionView) r13
            r1 = 2131441603(0x7f0b37c3, float:1.8505222E38)
            android.view.View r6 = r0.requireViewById(r1)
            X.0qQ.A07(r6)
            com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer r6 = (com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer) r6
            r1 = 2131440207(0x7f0b324f, float:1.850239E38)
            android.view.View r12 = r0.requireViewById(r1)
            X.0qQ.A07(r12)
            com.instagram.tagging.widget.TagsLayout r12 = (com.instagram.tagging.widget.TagsLayout) r12
            r1 = 2131440203(0x7f0b324b, float:1.8502383E38)
            android.view.View r11 = r0.requireViewById(r1)
            X.0qQ.A07(r11)
            com.instagram.tagging.widget.MediaTagHintsLayout r11 = (com.instagram.tagging.widget.MediaTagHintsLayout) r11
            r1 = 2131435159(0x7f0b1e97, float:1.8492152E38)
            android.view.View r1 = r0.requireViewById(r1)
            X.0qQ.A07(r1)
            X.3v9 r7 = new X.3v9
            r7.<init>(r1)
            X.4DU r4 = r2.A04
            X.3s3 r2 = new X.3s3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x002d
        L_0x0121:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131629449(0x7f0e1589, float:1.888622E38)
            android.view.View r0 = r1.inflate(r0, r8, r6)
            goto L_0x009a
        L_0x012e:
            java.lang.String r0 = "carouselImageViewBinder"
            goto L_0x0136
        L_0x0131:
            java.lang.String r0 = "carouselSponsoredContentViewBinder"
            goto L_0x0136
        L_0x0134:
            java.lang.String r0 = "carouselVideoViewBinder"
        L_0x0136:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4G8.A00(int, android.view.ViewGroup):android.view.View");
    }

    public final AnonymousClass3W1 A02() {
        AnonymousClass3W1 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("mediaState");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03(AnonymousClass3TS r11, UserSession userSession, AnonymousClass3TA r13, AnonymousClass3W1 r14, AnonymousClass2xS r15, Integer num, int i) {
        this.A05 = r14;
        this.A07 = i;
        this.A08 = num;
        this.A01 = new AnonymousClass4GA(userSession);
        Context context = this.A0E;
        this.A04 = new AnonymousClass4GF(context, userSession, (C282555Dn) null, r13.AmC(), this.A0K, this.A0L);
        AnonymousClass4DU r9 = this.A0I;
        this.A02 = new AnonymousClass4GL(context, userSession, r13.Alt(), r9);
        Context context2 = context;
        this.A03 = new AnonymousClass4GP(context2, this.A0F, userSession, r13.Am6(), r9);
        this.A06 = r15;
        this.A00 = r11;
    }

    public final int getCount() {
        return this.A0B.A0o();
    }

    public final Object getItem(int i) {
        return this.A0B.A1c(i);
    }

    public final long getItemId(int i) {
        int i2;
        Object item = getItem(i);
        if (item != null) {
            i2 = item.hashCode();
        } else {
            i2 = -1;
        }
        return (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        if (r2 != null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r6) {
        /*
            r5 = this;
            java.lang.Object r2 = r5.getItem(r6)
            X.1Xj r2 = (X.1Xj) r2
            com.instagram.common.session.UserSession r4 = r5.A09
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325768237823183(0x810e18000234cf, double:3.035900333502901E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0082
            if (r2 == 0) goto L_0x007f
        L_0x0017:
            X.1iA r1 = r2.BR7()
            X.1Xj r0 = r5.A0B
            boolean r0 = X.AnonymousClass4GV.A00(r4, r0, r1)
            if (r0 == 0) goto L_0x002e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0025:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0090;
                case 2: goto L_0x008e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = 4
            return r0
        L_0x002e:
            X.1iA r0 = X.1iA.A04
            if (r1 != r0) goto L_0x0035
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x0025
        L_0x0035:
            X.1iA r0 = X.1iA.A0Q
            if (r1 == r0) goto L_0x003d
            X.1iA r0 = X.1iA.A0V
            if (r1 != r0) goto L_0x007f
        L_0x003d:
            X.1Xy r0 = r2.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 != 0) goto L_0x0055
            X.1Xy r0 = r2.A0C
            X.DUQ r0 = r0.CCM()
            if (r0 != 0) goto L_0x0055
            X.1Xy r0 = r2.A0C
            X.3yJ r0 = r0.CCN()
            if (r0 == 0) goto L_0x007f
        L_0x0055:
            r0 = 36313235523766095(0x8102b2000a074f, double:3.02797459466801E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x007f
            r4 = 817890849(0x30c00621, float:1.3971581E-9)
            r3 = 0
            java.lang.String r2 = r2.getId()
            if (r2 != 0) goto L_0x006c
            java.lang.String r2 = ""
        L_0x006c:
            java.lang.String r1 = "media_id"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            java.util.Map r1 = X.0se.A0M(r0)
            java.lang.String r0 = "Feed Carousel ShowReel Native Card Rendering"
            X.0kD.A0J(r0, r3, r1, r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0025
        L_0x007f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0025
        L_0x0082:
            if (r2 != 0) goto L_0x0017
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            r0 = 1
            return r0
        L_0x008e:
            r0 = 3
            return r0
        L_0x0090:
            r0 = 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4G8.getItemViewType(int):int");
    }
}
