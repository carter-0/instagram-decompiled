package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GwV  reason: case insensitive filesystem */
public final class C53925GwV extends C251343mx {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final C54588HJx A03;
    public final Integer A04;
    public final String A05;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x005e: MOVE  (r1v11 int) = (r36v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0499  */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r62) {
        /*
            r61 = this;
            r9 = 0
            r0 = r62
            X.0qQ.A0B(r0, r9)
            r11 = r61
            com.instagram.common.session.UserSession r1 = r11.A02
            r40 = r1
            X.0Tu r38 = X.0Tu.A05
            r2 = 36326996598339695(0x810f360000386f, double:3.036677153639754E-306)
            r4 = r38
            boolean r1 = X.182.A06(r4, r1, r2)
            r30 = 0
            if (r1 == 0) goto L_0x04aa
            X.JRL r6 = X.C63504KyF.A00(r40)
            X.0qQ.A07(r6)
            X.HJx r2 = r11.A03
            X.2V5 r1 = r2.A05
            java.lang.Object r56 = X.C52149GGr.A00(r0, r1)
            X.2V5 r5 = r2.A03
            java.lang.Object r37 = X.C52149GGr.A00(r0, r5)
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r37 = r1
            X.4bN r1 = r2.A06
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x04aa
            X.1Xy r1 = r1.A0C
            java.util.List r1 = r1.AoC()
            if (r1 == 0) goto L_0x04aa
            java.lang.Object r3 = X.00k.A0J(r1)
            X.DTB r3 = (X.DTB) r3
            if (r3 == 0) goto L_0x04aa
            com.instagram.api.schemas.ClipsSpinSwappableElementType r2 = r3.B0Z()
            if (r2 == 0) goto L_0x04aa
            int r1 = r11.A01
            r36 = r1
            java.lang.Object r1 = r5.A00
            int r4 = X.DbS.A05(r1)
            r1 = r36
            if (r1 >= r4) goto L_0x04aa
            java.lang.Object r4 = r5.A00
            java.lang.Object r1 = X.C51966G9m.A19(r4, r1)
            X.Gmw r1 = (X.C53372Gmw) r1
            java.lang.Object r1 = r1.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = X.00k.A0J(r1)
            X.DTC r4 = (X.DTC) r4
            if (r4 == 0) goto L_0x04aa
            int r1 = r6.AZW()
            java.lang.String r22 = X.C244013aV.A0E(r0, r1)
            X.93T r1 = X.AnonymousClass93S.A00(r40)
            java.lang.String r1 = r1.A00
            r59 = r1
            r29 = 1
            java.lang.Object[] r7 = new java.lang.Object[]{r22}
            r6 = 43
            X.Phm r5 = new X.Phm
            r1 = r22
            r5.<init>(r0, r11, r1, r6)
            java.lang.Object r1 = X.AnonymousClass3Zw.A00(r0, r5, r7)
            float r27 = X.AnonymousClass7TE.A04(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r22}
            r1 = r29
            X.Iw1 r1 = X.C58692Iw1.A00(r0, r11, r1)
            java.lang.Object r1 = X.AnonymousClass3Zw.A00(r0, r1, r5)
            float r28 = X.AnonymousClass7TE.A04(r1)
            X.Iv5 r1 = X.C58634Iv5.A00
            X.2Wa r35 = X.C243643Zq.A00(r0, r1)
            X.Iv4 r1 = X.C58633Iv4.A00
            X.3Zt r6 = X.C243633Zp.A00(r0, r1)
            java.lang.Object[] r5 = X.C51966G9m.A1b()
            r1 = r35
            X.Iw1 r1 = X.C58692Iw1.A00(r6, r1, r9)
            X.C243773a4.A00(r0, r1, r5)
            com.instagram.api.schemas.ClipsSpinSwappableElementType r1 = com.instagram.api.schemas.ClipsSpinSwappableElementType.TEXT
            if (r1 != r2) goto L_0x04aa
            X.DV5 r26 = r3.C3R()
            if (r26 == 0) goto L_0x04aa
            X.DSH r34 = r4.C3S()
            if (r34 == 0) goto L_0x04aa
            java.lang.Float r1 = r26.BCt()
            if (r1 == 0) goto L_0x04aa
            float r12 = r1.floatValue()
            java.lang.Float r1 = r26.BXt()
            if (r1 == 0) goto L_0x04aa
            float r33 = r1.floatValue()
            java.lang.Float r1 = r26.BXv()
            if (r1 == 0) goto L_0x04aa
            float r32 = r1.floatValue()
            r10 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r10
            X.3XV r1 = X.2WX.A02
            java.lang.Integer r31 = X.AnonymousClass05K.A00
            r2 = r30
            r1 = r31
            X.2WX r1 = X.C51971G9r.A0X(r2, r1, r10, r9)
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            X.2WX r4 = X.C51971G9r.A0X(r1, r15, r10, r9)
            X.J5v r3 = X.C59088J5v.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A02
            r1 = 4
            X.2WX r25 = X.C51971G9r.A0Y(r4, r2, r3, r1)
            X.2V1 r1 = r0.A05
            r39 = r1
            X.2Wb r13 = X.AnonymousClass7TG.A0S(r39)
            java.lang.Float r1 = r26.BpV()
            if (r1 == 0) goto L_0x0212
            float r5 = r1.floatValue()
        L_0x0126:
            java.lang.Float r1 = r26.Boh()
            if (r1 == 0) goto L_0x020f
            float r1 = r1.floatValue()
        L_0x0130:
            double r1 = (double) r1
            double r3 = java.lang.Math.toRadians(r1)
            float r12 = r12 * r5
            r1 = 4618441417868443648(0x4018000000000000, double:6.0)
            int r1 = X.C51972G9s.A0C(r13, r1)
            float r1 = (float) r1
            float r2 = A04(r13, r11)
            float r1 = r1 / r2
            float r1 = r1 * r10
            float r24 = A00(r13)
            float r24 = r24 * r27
            float r24 = r24 / r10
            float r23 = A04(r13, r11)
            float r23 = r23 * r28
            float r23 = r23 / r10
            float r12 = r12 + r28
            float r12 = r12 + r1
            r1 = 1128792064(0x43480000, float:200.0)
            float r12 = r12 / r1
            float r1 = A04(r13, r11)
            float r12 = r12 * r1
            float r14 = -r12
            double r7 = java.lang.Math.sin(r3)
            float r1 = (float) r7
            float r14 = r14 * r1
            double r5 = java.lang.Math.cos(r3)
            float r1 = (float) r5
            float r12 = r12 * r1
            double r3 = (double) r14
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r20 * r7
            double r7 = r7 * r3
            double r1 = (double) r12
            double r16 = r1 * r5
            double r7 = r7 - r16
            double r18 = r18 * r7
            double r3 = r3 - r18
            double r20 = r20 * r5
            double r20 = r20 * r7
            double r1 = r1 + r20
            float r5 = (float) r3
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            float r3 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            X.0eP r2 = X.G9t.A1E(r14, r12)
            X.0eP r1 = X.AnonymousClass7TE.A1L(r4, r1)
            X.0eP[] r1 = new X.0eP[]{r2, r1}
            java.util.List r1 = X.0sr.A1P(r1)
            java.lang.Object r5 = X.00k.A0I(r1)
            X.0eP r5 = (X.0eP) r5
            java.util.Iterator r17 = r1.iterator()
            r16 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x01a7:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0216
            java.lang.Object r3 = r17.next()
            X.0eP r3 = (X.0eP) r3
            java.lang.Object r1 = r3.A00
            float r2 = X.AnonymousClass7TE.A04(r1)
            java.lang.Object r1 = r3.A01
            float r3 = X.AnonymousClass7TE.A04(r1)
            float r14 = A00(r13)
            float r14 = r14 * r33
            float r14 = r14 + r2
            r12 = 1073741824(0x40000000, float:2.0)
            float r1 = r24 / r12
            float r14 = r14 - r1
            float r2 = A04(r13, r11)
            float r2 = r2 * r32
            float r2 = r2 + r3
            float r1 = r23 / r12
            float r2 = r2 - r1
            float r1 = A00(r13)
            float r4 = r14 / r1
            float r4 = r4 * r10
            float r1 = A04(r13, r11)
            float r3 = r2 / r1
            float r3 = r3 * r10
            float r1 = A04(r13, r11)
            float r1 = r1 / r12
            float r1 = r1 - r2
            double r6 = (double) r1
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = java.lang.Math.pow(r6, r1)
            float r8 = (float) r6
            float r6 = A00(r13)
            float r6 = r6 / r12
            float r6 = r6 - r14
            double r6 = (double) r6
            double r1 = java.lang.Math.pow(r6, r1)
            float r6 = (float) r1
            float r8 = r8 + r6
            double r1 = (double) r8
            double r1 = java.lang.Math.sqrt(r1)
            float r6 = (float) r1
            int r1 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a7
            X.0eP r5 = X.G9t.A1E(r4, r3)
            r16 = r6
            goto L_0x01a7
        L_0x020f:
            r1 = 0
            goto L_0x0130
        L_0x0212:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0126
        L_0x0216:
            java.lang.Object r1 = r5.A00
            float r18 = X.AnonymousClass7TE.A04(r1)
            java.lang.Object r1 = r5.A01
            float r17 = X.AnonymousClass7TE.A04(r1)
            r1 = r35
            java.lang.Object r1 = r1.A03
            float r12 = X.AnonymousClass7TE.A04(r1)
            java.lang.Float r1 = r26.CGX()
            if (r1 == 0) goto L_0x04a6
            float r6 = r1.floatValue()
            java.lang.Float r1 = r26.BCt()
            if (r1 == 0) goto L_0x04a6
            float r7 = r1.floatValue()
            java.lang.Float r1 = r26.BXt()
            if (r1 == 0) goto L_0x04a6
            float r5 = r1.floatValue()
            java.lang.Float r1 = r26.BXv()
            if (r1 == 0) goto L_0x04a6
            float r4 = r1.floatValue()
            float r6 = r6 * r10
            float r7 = r7 * r10
            float r5 = r5 * r10
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r6 / r2
            float r5 = r5 - r1
            float r4 = r4 * r10
            float r1 = r7 / r2
            float r4 = r4 - r1
            android.content.Context r8 = X.C243803a8.A00(r0)
            java.lang.String r3 = r34.BW0()
            r2 = r26
            r1 = r40
            X.6Ly r3 = X.C39603A1t.A00(r8, r2, r1, r3)
            X.9JQ r7 = X.C51965G9l.A0b(r15, r7, r9)
            r2 = r30
            r1 = r31
            X.2WX r6 = X.C51973G9u.A0S(r2, r7, r1, r6, r9)
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            r1 = r29
            X.2WX r5 = X.C51971G9r.A0X(r6, r2, r5, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A05
            X.2WX r1 = X.C51971G9r.A0X(r5, r2, r4, r1)
            X.3b9 r8 = X.C244413b9.ABSOLUTE
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y
            r5 = 3
            X.2WX r2 = X.C51971G9r.A0Y(r1, r6, r8, r5)
            java.lang.Float r1 = r26.BpV()
            if (r1 == 0) goto L_0x04a2
            float r1 = r1.floatValue()
        L_0x029b:
            X.2WX r2 = X.IIV.A00(r2, r6, r1)
            java.lang.Float r1 = r26.Boh()
            if (r1 == 0) goto L_0x049f
            float r1 = r1.floatValue()
        L_0x02a9:
            X.2WX r7 = X.IIV.A00(r2, r15, r1)
            r4 = 46
            X.PmT r2 = new X.PmT
            r1 = r59
            r2.<init>(r11, r0, r1, r4)
            X.2WX r16 = X.C51972G9s.A0V(r7, r2)
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r39)
            r2 = r30
            r1 = r31
            X.2WX r1 = X.C51974G9v.A0O(r2, r15, r1, r10, r9)
            X.2WX r1 = X.C51971G9r.A0Y(r1, r6, r8, r5)
            X.2V1 r7 = r4.A00
            X.3gE r3 = X.C51974G9v.A0P(r3, r7, r1)
            r1 = r31
            X.2WX r1 = X.C51974G9v.A0O(r2, r15, r1, r10, r9)
            X.2WX r2 = X.C51971G9r.A0Y(r1, r6, r8, r5)
            java.lang.Float r1 = r26.BpV()
            if (r1 == 0) goto L_0x049b
            float r1 = r1.floatValue()
        L_0x02e4:
            X.2WX r1 = X.IIV.A00(r2, r6, r1)
            X.2WX r14 = X.C52112GFg.A01(r1, r12)
            r1 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r1 = X.C51972G9s.A0B(r0, r1)
            float r12 = (float) r1
            android.graphics.drawable.GradientDrawable$Orientation r8 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r6 = 2131100177(0x7f060211, float:1.7812728E38)
            r1 = r39
            X.2V4 r5 = r1.A0D
            int r2 = r5.A02(r6)
            r1 = 0
            int r5 = r5.A02(r6)
            android.graphics.drawable.GradientDrawable r6 = X.C51970G9q.A0O(r8, r2, r5)
            r6.setShape(r9)
            r5 = 8
            float[] r2 = new float[r5]
        L_0x0310:
            r2[r1] = r12
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x0310
            r6.setCornerRadii(r2)
            X.3gE r6 = X.C51974G9v.A0P(r6, r7, r14)
            if (r36 != 0) goto L_0x0341
            com.instagram.api.schemas.ClipsTextEmphasisMode r2 = r26.C56()
            com.instagram.api.schemas.ClipsTextEmphasisMode r1 = com.instagram.api.schemas.ClipsTextEmphasisMode.DEFAULT
            if (r2 == r1) goto L_0x0341
            com.instagram.api.schemas.ClipsTextEmphasisMode r2 = r26.C56()
            com.instagram.api.schemas.ClipsTextEmphasisMode r1 = com.instagram.api.schemas.ClipsTextEmphasisMode.INVERTED
            if (r2 == r1) goto L_0x0341
            r1 = 36326996598601843(0x810f3600043873, double:3.036677153805538E-306)
            r7 = r38
            r5 = r40
            boolean r1 = X.182.A06(r7, r5, r1)
            if (r1 == 0) goto L_0x0341
            r4.A00(r6)
        L_0x0341:
            r4.A00(r3)
            if (r36 != 0) goto L_0x03a2
            r1 = 36326996598601843(0x810f3600043873, double:3.036677153805538E-306)
            r7 = r38
            r5 = r40
            boolean r1 = X.182.A06(r7, r5, r1)
            if (r1 == 0) goto L_0x03a2
            com.instagram.api.schemas.ClipsTextEmphasisMode r2 = r26.C56()
            com.instagram.api.schemas.ClipsTextEmphasisMode r1 = com.instagram.api.schemas.ClipsTextEmphasisMode.DEFAULT
            if (r2 == r1) goto L_0x0366
            com.instagram.api.schemas.ClipsTextEmphasisMode r2 = r26.C56()
            com.instagram.api.schemas.ClipsTextEmphasisMode r1 = com.instagram.api.schemas.ClipsTextEmphasisMode.INVERTED
            if (r2 == r1) goto L_0x0366
            r3 = r6
        L_0x0366:
            r2 = r30
            r1 = r31
            X.2WX r7 = X.C51974G9v.A0O(r2, r15, r1, r10, r9)
            X.7du r8 = new X.7du
            r8.<init>()
            r2 = 2131100036(0x7f060184, float:1.7812442E38)
            X.2V4 r1 = r4.Bnf()
            int r1 = r1.A02(r2)
            X.3O5 r6 = r8.A00
            r6.A09 = r1
            r5 = 0
            r8.A02(r5)
            r6.A06 = r9
            int r1 = X.C55404HhA.A01
            r6.A0A = r1
            r1 = 1900(0x76c, double:9.387E-321)
            r8.A04(r1)
            r6.A03 = r5
            X.3O5 r2 = r8.A01()
            X.0qQ.A0A(r2)
            X.7dx r1 = new X.7dx
            r1.<init>(r3, r7, r2)
            r4.A00(r1)
        L_0x03a2:
            r1 = r16
            X.2Tl r1 = X.C243563Zg.A03(r4, r0, r1)
        L_0x03a8:
            r13.A00(r1)
            if (r37 == 0) goto L_0x0492
            r2 = r37
            r1 = r36
            java.lang.Object r3 = X.00k.A0O(r2, r1)
            X.Gmw r3 = (X.C53372Gmw) r3
            if (r3 == 0) goto L_0x0492
            r1 = 1096810496(0x41600000, float:14.0)
            long r51 = X.C51972G9s.A0G(r1)
            android.content.Context r32 = X.C243803a8.A00(r13)
            java.lang.String r2 = r11.A05
            java.lang.String r1 = "ClipsSpinnableSwipeElementOverlayComponent"
            java.lang.String r43 = X.002.A0R(r2, r1)
            java.lang.Object r3 = r3.A02
            java.util.List r3 = (java.util.List) r3
            r1 = 4629700416936869888(0x4040000000000000, double:32.0)
            int r45 = X.C51972G9s.A0C(r13, r1)
            r2 = 2131099940(0x7f060124, float:1.7812247E38)
            X.2V4 r1 = r13.Bnf()
            int r5 = r1.A02(r2)
            r2 = 2131100175(0x7f06020f, float:1.7812724E38)
            X.2V4 r1 = r13.Bnf()
            int r4 = r1.A02(r2)
            r1 = 2131238719(0x7f081f3f, float:1.8093725E38)
            android.graphics.drawable.Drawable r33 = X.C244013aV.A0D(r13, r1)
            r2 = 2131099939(0x7f060123, float:1.7812245E38)
            X.2V4 r1 = r13.Bnf()
            int r2 = r1.A02(r2)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            java.lang.Float r34 = java.lang.Float.valueOf(r1)
            r1 = 3
            java.lang.Integer r36 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r38 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r40 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r42 = java.lang.Integer.valueOf(r2)
            r35 = r31
            r37 = r30
            r39 = r30
            r41 = r30
            r44 = r3
            r46 = r9
            r47 = r9
            r48 = r9
            r49 = r29
            r50 = r29
            X.3b0 r46 = X.C244283aw.A03(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r2 = 4633359591634108416(0x404d000000000000, double:58.0)
            long r53 = java.lang.Double.doubleToRawLongBits(r2)
            r60 = 22
            X.IoE r49 = new X.IoE
            r55 = r49
            r57 = r11
            r58 = r13
            r55.<init>(r56, r57, r58, r59, r60)
            r7 = 23
            X.IoE r50 = new X.IoE
            r2 = r50
            r3 = r13
            r4 = r11
            r5 = r0
            r6 = r59
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Integer r5 = X.AnonymousClass05K.A04
            r4 = r18
            r3 = r30
            r2 = r29
            X.2WX r4 = X.C51971G9r.A0X(r3, r5, r4, r2)
            java.lang.Integer r5 = X.AnonymousClass05K.A05
            r3 = r17
            X.9JQ r3 = X.C51965G9l.A0b(r5, r3, r2)
            r2 = r28
            X.2WX r4 = X.C51973G9u.A0S(r4, r3, r15, r2, r9)
            r3 = r27
            r2 = r31
            X.2WX r4 = X.C51971G9r.A0X(r4, r2, r3, r9)
            X.3b9 r3 = X.C244413b9.ABSOLUTE
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.2WX r2 = X.C51971G9r.A0Y(r4, r2, r3, r1)
            java.lang.Float r1 = r26.Boh()
            if (r1 == 0) goto L_0x0499
            float r1 = r1.floatValue()
        L_0x0482:
            X.2WX r47 = X.IIV.A00(r2, r15, r1)
            X.Gv7 r1 = new X.Gv7
            r45 = r1
            r48 = r22
            r45.<init>(r46, r47, r48, r49, r50, r51, r53)
            r13.A00(r1)
        L_0x0492:
            r1 = r25
            X.2Tl r30 = X.C243563Zg.A03(r13, r0, r1)
            return r30
        L_0x0499:
            r1 = 0
            goto L_0x0482
        L_0x049b:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02e4
        L_0x049f:
            r1 = 0
            goto L_0x02a9
        L_0x04a2:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x029b
        L_0x04a6:
            r1 = r30
            goto L_0x03a8
        L_0x04aa:
            return r30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53925GwV.A0X(X.3Y5):X.3mp");
    }

    public static final float A04(C70832Wc r1, C53925GwV gwV) {
        int i;
        Integer num = gwV.A04;
        if (num != null) {
            i = num.intValue();
        } else {
            i = AnonymousClass7TF.A0E(r1.Aqq().A0C).heightPixels;
        }
        return (float) i;
    }

    public static final void A05(AnonymousClass3Y5 r8, C53925GwV gwV) {
        String A30;
        1Xj r0;
        List AoC;
        DTB dtb;
        String B0S;
        C267324bN r1 = gwV.A03.A06;
        1Xj r02 = r1.A02;
        if (r02 != null && (A30 = r02.A30()) != null && (r0 = r1.A02) != null && (AoC = r0.A0C.AoC()) != null && (dtb = (DTB) 00k.A0J(AoC)) != null && (B0S = dtb.B0S()) != null) {
            Activity A0J = C51969G9p.A0J(r8);
            Context A002 = C243803a8.A00(r8);
            UserSession userSession = gwV.A02;
            Bundle A0B = DbV.A0B(userSession, 2);
            A0B.putString("stripped_media_id", A30);
            A0B.putString("element_id", B0S);
            C54160H1e h1e = new C54160H1e();
            C331127Pr A0V = DbV.A0V(A0B, h1e, userSession);
            A0V.A0T = h1e;
            DbS.A1S(A0V, false);
            C51975G9x.A0z(A002, A0V);
            A0V.A0U = new C19687Wdp(A30, (Object) h1e, 3);
            C331157Pu A003 = A0V.A00();
            h1e.A00 = A003;
            A003.A02(A0J, h1e);
            C56516Hzn hzn = (C56516Hzn) h1e.A03.getValue();
            String str = (String) AnonymousClass7TE.A14(h1e.A01);
            0qQ.A0B(str, 1);
            C59728JVm A004 = AnonymousClass9PJ.A00(hzn.A01);
            28D r4 = 28D.A1a;
            C279294yP r3 = C279294yP.CLIPS_SPIN;
            A004.A06(r3, r4);
            0Aj A0e = AnonymousClass7TE.A0e(hzn.A00, AnonymousClass000.A00(3289));
            if (A0e.isSampled()) {
                C51965G9l.A1E(A0e, AnonymousClass7TE.A10(A30));
                DbY.A1C(A0e);
                DbS.A1F(r4, A0e);
                A0e.A8M(r3, "camera_destination");
                A0e.AAJ("camera_session_id", str);
                A0e.AAJ("device_fold_orientation", C254483sY.A00);
                A0e.AAJ("device_fold_state", C254493sZ.A00);
                A0e.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                A0e.AAJ("device_aspect_ratio_category", C254473sX.A00);
                A0e.Cgf();
            }
        }
    }

    public C53925GwV(UserSession userSession, C54588HJx hJx, Integer num, String str, int i, int i2) {
        C51972G9s.A1D(userSession, str);
        this.A01 = i;
        this.A03 = hJx;
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = num;
        this.A00 = i2;
    }

    public static final float A00(C70832Wc r0) {
        return (float) AnonymousClass7TF.A0E(r0.Aqq().A0C).widthPixels;
    }
}
