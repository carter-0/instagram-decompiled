package X;

public final class J8X extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8X(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.A00 = i;
        this.A03 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = obj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03d9, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03dd, code lost:
        r9.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0402, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[LOOP:0: B:16:0x005b->B:17:0x005d, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31, java.lang.Object r32) {
        /*
            r30 = this;
            r0 = r30
            r10 = r32
            r9 = r31
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0078;
                case 1: goto L_0x00c4;
                case 2: goto L_0x010a;
                case 3: goto L_0x01eb;
                case 4: goto L_0x0273;
                case 5: goto L_0x02be;
                case 6: goto L_0x02ec;
                default: goto L_0x000b;
            }
        L_0x000b:
            com.meta.foa.accountswitcher.UserAccountInfo r9 = (com.meta.foa.accountswitcher.UserAccountInfo) r9
            boolean r13 = X.AnonymousClass7TE.A1a(r10)
            r4 = 0
            X.0qQ.A0B(r9, r4)
            java.lang.Object r2 = r0.A02
            com.meta.foa.accountswitcher.UserAccountInfo r2 = (com.meta.foa.accountswitcher.UserAccountInfo) r2
            if (r2 == 0) goto L_0x03e1
            if (r13 != 0) goto L_0x03e1
            java.lang.Object r1 = r0.A03
            boolean r1 = X.C51972G9s.A1a(r1)
            if (r1 == 0) goto L_0x03e1
            java.lang.String r8 = r2.A08
            java.lang.String r3 = r9.A00
            if (r3 == 0) goto L_0x03e1
            java.util.ArrayList r1 = X.C55024Hav.A00(r8)
            java.util.ArrayList r7 = X.00k.A0U(r1)
            int r2 = r7.indexOf(r3)
            r1 = -1
            if (r2 > r1) goto L_0x0047
            int r2 = r7.size()
            r1 = 3
            if (r2 < r1) goto L_0x004a
            int r1 = r7.size()
            int r2 = r1 + -1
        L_0x0047:
            r7.remove(r2)
        L_0x004a:
            r7.add(r4, r3)
            X.1An r1 = X.1An.A1U
            java.lang.String r1 = r1.toString()
            X.0tX r6 = X.0xn.A01(r1)
            int r5 = r7.size()
        L_0x005b:
            if (r4 >= r5) goto L_0x03e1
            X.0xY r3 = r6.AR4()
            java.lang.String r2 = "switcher_overflow_recent_search_"
            r1 = 95
            java.lang.String r2 = X.002.A0W(r2, r8, r1, r4)
            java.lang.Object r1 = r7.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r3.E5g(r2, r1)
            r3.commit()
            int r4 = r4 + 1
            goto L_0x005b
        L_0x0078:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0087
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x03dd
        L_0x0087:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0095
            r2 = 1810400071(0x6be88347, float:5.6218146E26)
            java.lang.String r1 = "com.instagram.creation.genai.contextualbackground.ui.ContextualBackgroundScreen.<anonymous>.<anonymous> (ContextualBackgroundScreen.kt:137)"
            X.0fL.A01(r2, r1)
        L_0x0095:
            java.lang.Object r1 = r0.A01
            X.5Oz r1 = (X.C284945Oz) r1
            boolean r1 = X.C51971G9r.A1W(r1)
            r2 = r1 ^ 1
            r1 = -1712537236(0xffffffff99ecc16c, float:-2.447995E-23)
            java.lang.Object r6 = r0.A05
            java.lang.Object r7 = r0.A04
            java.lang.Object r8 = r0.A02
            java.lang.Object r5 = r0.A03
            r4 = 6
            X.JJT r3 = new X.JJT
            r3.<init>(r4, r5, r6, r7, r8)
            X.5PJ r1 = X.AnonymousClass5PI.A01(r9, r3, r1)
            r0 = 48
            X.I7I.A07(r9, r1, r0, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0400
            r0 = -23588609(0xfffffffffe9810ff, float:-1.0106545E38)
            goto L_0x03d9
        L_0x00c4:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0C(r10)
            r1 = 2
            if (r2 != r1) goto L_0x00d3
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x03dd
        L_0x00d3:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00e1
            r2 = -1666246304(0xffffffff9caf1960, float:-1.1587088E-21)
            java.lang.String r1 = "com.instagram.creation.genai.magicmod.common.ui.MagicModImage.<anonymous>.<anonymous>.<anonymous> (MagicModImage.kt:52)"
            X.0fL.A01(r2, r1)
        L_0x00e1:
            java.lang.Object r2 = r0.A04
            com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform r2 = (com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform) r2
            r1 = -176672888(0xfffffffff5782f88, float:-3.1461271E32)
            java.lang.Object r8 = r0.A02
            java.lang.Object r6 = r0.A01
            java.lang.Object r7 = r0.A03
            java.lang.Object r5 = r0.A05
            r4 = 6
            X.J7t r3 = new X.J7t
            r3.<init>(r4, r5, r6, r7, r8)
            X.5PJ r1 = X.AnonymousClass5PI.A01(r9, r3, r1)
            r0 = 56
            X.HYK.A00(r9, r2, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0400
            r0 = 1602118866(0x5f7e64d2, float:1.8331007E19)
            goto L_0x03d9
        L_0x010a:
            android.view.View r9 = (android.view.View) r9
            X.3ha r10 = (X.C248203ha) r10
            r7 = 0
            boolean r23 = X.AnonymousClass7TF.A1U(r7, r9, r10)
            java.lang.Object r11 = r0.A05
            X.HqX r11 = (X.C55966HqX) r11
            java.lang.Object r13 = r0.A01
            X.4DU r13 = (X.AnonymousClass4DU) r13
            java.lang.Object r1 = r0.A04
            X.3kK r1 = (X.C249763kK) r1
            java.lang.Object r12 = r0.A02
            X.1Xj r12 = (X.1Xj) r12
            java.lang.Object r14 = r0.A03
            android.content.Context r8 = r9.getContext()
            com.instagram.common.session.UserSession r15 = r11.A00
            int r2 = r10.A00
            int r0 = r10.A01
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            java.lang.String r21 = "open_post_actions"
            r20 = 0
            r16 = r12
            r17 = r13
            r18 = r1
            r22 = r2
            X.C233822wX.A0Q(r15, r16, r17, r18, r19, r20, r21, r22)
            X.0qQ.A0A(r8)
            X.Dg1 r0 = new X.Dg1
            r0.<init>(r8, r15)
            X.0q2 r1 = r11.A02
            boolean r2 = r1.A0N(r12)
            r1 = 2131964931(0x7f133403, float:1.9566658E38)
            if (r2 == 0) goto L_0x0158
            r1 = 2131975945(0x7f135f09, float:1.9588997E38)
        L_0x0158:
            X.WAE r6 = new X.WAE
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A04(r6, r1)
            r2 = 2131956343(0x7f131277, float:1.954924E38)
            r16 = 4
            X.ICB r1 = new X.ICB
            r15 = r1
            r17 = r10
            r18 = r12
            r19 = r14
            r20 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            r0.A04(r1, r2)
            r2 = 2131973092(0x7f1353e4, float:1.958321E38)
            r16 = 5
            X.ICB r1 = new X.ICB
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r0.A04(r1, r2)
            X.2f5 r1 = r11.A03
            boolean r1 = r1.A0O(r12)
            r2 = 2131952388(0x7f130304, float:1.9541217E38)
            if (r1 == 0) goto L_0x0192
            r2 = 2131972043(0x7f134fcb, float:1.9581082E38)
        L_0x0192:
            X.ICZ r1 = new X.ICZ
            r22 = r1
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r14
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r0.A04(r1, r2)
            r2 = 2131972535(0x7f1351b7, float:1.958208E38)
            r16 = 6
            X.ICB r1 = new X.ICB
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r0.A04(r1, r2)
            r2 = 2131962347(0x7f1329eb, float:1.9561417E38)
            r16 = 7
            X.ICB r1 = new X.ICB
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r0.A04(r1, r2)
            java.lang.String r2 = r10.A03
            if (r2 == 0) goto L_0x01e4
            r1 = 2131952047(0x7f1301af, float:1.9540526E38)
            java.lang.String r1 = X.DbW.A0h(r8, r2, r1)
            r0.A08(r1)
        L_0x01d2:
            r2 = 2
            X.IVE r1 = new X.IVE
            r1.<init>(r9, r2)
            r0.A03 = r1
            X.FFy r1 = new X.FFy
            r1.<init>(r0)
            r1.A05(r8)
            goto L_0x0400
        L_0x01e4:
            r1 = 2131952046(0x7f1301ae, float:1.9540524E38)
            r0.A01(r1)
            goto L_0x01d2
        L_0x01eb:
            int r3 = X.AnonymousClass7TE.A0M(r9)
            int r4 = X.AnonymousClass7TE.A0M(r10)
            java.lang.Object r8 = r0.A01
            X.4Fy r8 = (X.C262774Fy) r8
            java.lang.Object r10 = r0.A04
            X.4Fw r10 = (X.C262754Fw) r10
            java.lang.Object r1 = r0.A03
            X.2Wb r1 = (X.2Wb) r1
            android.content.Context r9 = X.C51966G9m.A0O(r1)
            r8.A01(r9, r10, r4)
            java.lang.Object r6 = r0.A05
            X.Gve r6 = (X.C53873Gve) r6
            X.3TA r1 = r6.A04
            r8.A03(r10, r1, r4, r3)
            boolean r5 = X.C54979HaC.A00(r10, r4)
            X.HiZ r1 = r6.A03
            java.util.HashMap r7 = r1.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r7.get(r2)
            if (r5 == 0) goto L_0x0265
            if (r1 == 0) goto L_0x0265
            java.lang.Object r5 = r0.A02
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            java.lang.Object r2 = r7.get(r2)
            X.IUL r2 = (X.IUL) r2
            if (r2 == 0) goto L_0x0261
            com.instagram.common.session.UserSession r1 = r6.A01
            X.3OF r1 = X.AnonymousClass3OE.A00(r1)
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x0261
            X.2xS r1 = r6.A0A
            r8.A05(r10, r2, r1)
        L_0x0240:
            X.4DU r11 = r6.A05
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r13 = r0.A03
            if (r4 == 0) goto L_0x025e
            int r0 = r10.A02
            int r0 = r0 + -1
            if (r4 == r0) goto L_0x025b
            if (r4 > r3) goto L_0x025e
            if (r4 < r3) goto L_0x025b
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
        L_0x0256:
            r8.A02(r9, r10, r11, r12, r13)
            goto L_0x0400
        L_0x025b:
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            goto L_0x0256
        L_0x025e:
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            goto L_0x0256
        L_0x0261:
            r8.A06(r5)
            goto L_0x0240
        L_0x0265:
            boolean r1 = X.C54979HaC.A00(r10, r3)
            if (r1 == 0) goto L_0x0240
            X.2xS r2 = r6.A0A
            X.1Xj r1 = r10.A0D
            r2.A05(r1)
            goto L_0x0240
        L_0x0273:
            r1 = 0
            X.0qQ.A0B(r9, r1)
            java.lang.Object r3 = r0.A01
            X.3yx r3 = (X.C258403yx) r3
            java.lang.Object r6 = r0.A03
            X.1Xj r6 = (X.1Xj) r6
            r1 = 1
            X.0qQ.A0B(r6, r1)
            X.IrQ r1 = X.C58407IrQ.A00
            r3.A01(r1)
            X.02m r5 = r3.A00
            if (r5 == 0) goto L_0x029d
            r4 = 1056313521(0x3ef610b1, float:0.4805961)
            r5.markerStart(r4)
            java.lang.String r2 = "LITHO"
            r1 = 417(0x1a1, float:5.84E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r5.markerAnnotate(r4, r1, r2)
        L_0x029d:
            X.C258403yx.A00(r3, r6)
            java.lang.Object r2 = r0.A04
            X.5Ev r2 = (X.C282815Ev) r2
            X.5Eu r1 = r2.A00
            X.0sI r6 = r1.A0C
            java.lang.Object r1 = r0.A05
            X.GuK r1 = (X.C53791GuK) r1
            X.A4B r7 = r1.A01
            X.3W1 r8 = r2.A04
            java.lang.Object r1 = r0.A02
            r0 = 33
            X.Inr r11 = new X.Inr
            r11.<init>(r0, r1, r3)
            r6.invoke(r7, r8, r9, r10, r11)
            goto L_0x0400
        L_0x02be:
            X.30Y r9 = (X.AnonymousClass30Y) r9
            X.3oY r10 = (X.C252093oY) r10
            X.AnonymousClass7TG.A1N(r9, r10)
            java.lang.Object r2 = r0.A03
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r10.B9Y(r2, r9)
            java.lang.Object r1 = r0.A05
            X.5qj r1 = (X.C296845qj) r1
            X.2xS r3 = r1.A04
            java.lang.Object r5 = r0.A02
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r6 = r0.A04
            int r8 = r2.top
            int r1 = r2.left
            float r7 = r10.CFe(r9)
            java.lang.Object r0 = r0.A01
            X.3rq r0 = (X.C254043rq) r0
            android.view.View r4 = r0.A00
            r9 = r1
            r3.A03(r4, r5, r6, r7, r8, r9)
            goto L_0x0400
        L_0x02ec:
            X.5Wy r9 = (X.C286575Wy) r9
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x02fb
            boolean r1 = r9.Bwn()
            if (r1 != 0) goto L_0x03dd
        L_0x02fb:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0309
            r2 = 1885900428(0x70688e8c, float:2.878914E29)
            java.lang.String r1 = "com.instagram.wonderwall.ui.compose.screens.WallPostPreviewScreen.<anonymous> (WallPostPreviewScreen.kt:79)"
            X.0fL.A01(r2, r1)
        L_0x0309:
            X.5Zr r7 = X.C287215Zl.A00
            r1 = 2130383499(0x7efb128b, float:1.6686625E38)
            X.5Qk r4 = X.C51965G9l.A0K(r9, r1)
            androidx.compose.ui.Modifier r5 = X.C51966G9m.A0U(r4)
            java.lang.Object r1 = r0.A04
            X.GnH r1 = (X.C53385GnH) r1
            boolean r1 = r1.A0B
            java.lang.Object r6 = r0.A01
            X.5aT r6 = (X.C287605aT) r6
            java.lang.Object r3 = r0.A05
            if (r1 == 0) goto L_0x0348
            r1 = 807367195(0x301f721b, float:5.8006017E-10)
            boolean r1 = X.C51967G9n.A1Y(r9, r3, r1)
            java.lang.Object r2 = r9.ECw()
            if (r1 != 0) goto L_0x0335
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x033b
        L_0x0335:
            r1 = 11
            X.IwD r2 = X.C58704IwD.A00(r9, r3, r1)
        L_0x033b:
            X.0sa r2 = (X.C62320sa) r2
            X.C51965G9l.A1V(r9)
            androidx.compose.ui.Modifier r1 = X.C287635aW.A04(r6, r4, r2)
            androidx.compose.ui.Modifier r5 = r5.Ezh(r1)
        L_0x0348:
            r2 = r9
            X.5Wx r2 = (X.C286565Wx) r2
            r15 = 0
            X.C286565Wx.A0L(r2, r15)
            java.lang.Object r11 = r0.A02
            com.instagram.wonderwall.model.WallPostInfo r11 = (com.instagram.wonderwall.model.WallPostInfo) r11
            java.lang.Object r6 = r0.A03
            X.5Zx r0 = X.C287275Zs.A07
            X.5RD r1 = X.C291495hO.A00(r0, r9, r7)
            int r7 = X.C287425a7.A00(r9)
            X.5RM r0 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r9, r5)
            X.C51973G9u.A0y(r9, r2)
            X.C51971G9r.A12(r9, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x0379
            boolean r0 = X.C51972G9s.A1Q(r9, r7)
            if (r0 != 0) goto L_0x037c
        L_0x0379:
            X.C51971G9r.A13(r9, r1, r7)
        L_0x037c:
            X.C51965G9l.A18(r9, r5)
            r5 = 1103101952(0x41c00000, float:24.0)
            X.G9w.A15(r9, r4, r5)
            r0 = 1131413504(0x43700000, float:240.0)
            androidx.compose.ui.Modifier r17 = X.C287205Zk.A0D(r4, r0)
            r1 = 1494277752(0x5910de78, float:2.54856273E15)
            r0 = 33
            X.JG3 r0 = X.JG3.A00(r11, r3, r6, r0)
            X.5PJ r18 = X.AnonymousClass5PI.A01(r9, r0, r1)
            r20 = 24582(0x6006, float:3.4447E-41)
            r21 = 14
            r0 = 0
            r16 = r9
            r19 = r0
            r22 = r15
            r23 = r15
            X.C55194Hdk.A00(r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r4, r0, r5, r0, r0)
            r0 = 807418107(0x302038fb, float:5.8288635E-10)
            boolean r0 = X.C51967G9n.A1Y(r9, r3, r0)
            java.lang.Object r1 = r9.ECw()
            if (r0 != 0) goto L_0x03bc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x03c2
        L_0x03bc:
            r0 = 12
            X.IwD r1 = X.C58704IwD.A00(r9, r3, r0)
        L_0x03c2:
            X.0sa r12 = X.C51965G9l.A0y(r2, r1, r15)
            r13 = 27696(0x6c30, float:3.881E-41)
            r14 = 4
            r16 = r15
            r17 = r15
            X.C55197Hdn.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = X.C51967G9n.A1R(r9)
            if (r0 == 0) goto L_0x0400
            r0 = -123928649(0xfffffffff89cffb7, float:-2.5474526E34)
        L_0x03d9:
            X.0fL.A00(r0)
            goto L_0x0400
        L_0x03dd:
            r9.Evl()
            goto L_0x0400
        L_0x03e1:
            java.lang.Object r3 = r0.A01
            X.F3q r3 = (X.C49726F3q) r3
            androidx.fragment.app.Fragment r8 = r3.A00()
            java.lang.String r2 = r9.A02
            java.lang.String r1 = "INSTAGRAM"
            boolean r2 = X.0qQ.A0K(r2, r1)
            java.lang.Object r1 = r0.A05
            X.GtT r1 = (X.C53738GtT) r1
            com.meta.foa.session.FoaUserSession r10 = r1.A00
            java.lang.String r11 = r1.A01
            java.lang.String r12 = r1.A02
            if (r2 == 0) goto L_0x0403
            X.C49949FGe.A02(r8, r9, r10, r11, r12, r13)
        L_0x0400:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0403:
            java.lang.Object r0 = r0.A04
            android.content.Context r7 = X.C51966G9m.A0Q(r0)
            X.C49949FGe.A01(r7, r8, r9, r10, r11, r12)
            r0 = 0
            r3.A03(r0)
            goto L_0x0400
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J8X.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
