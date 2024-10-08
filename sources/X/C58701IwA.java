package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IwA  reason: case insensitive filesystem */
public final class C58701IwA extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public static User A00(List list) {
        1Xj r0;
        C42102BHf bHf = (C42102BHf) 00k.A0O(list, 0);
        if (bHf == null || (r0 = bHf.A00) == null) {
            return null;
        }
        return r0.A0C.CCd();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58701IwA(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A06 = obj4;
        this.A05 = obj5;
        this.A03 = obj6;
        this.A07 = obj7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x051d, code lost:
        ((X.G9Z) r0.A03).Dk3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0526, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0198, code lost:
        return X.C51965G9l.A0V(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0413  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r32 = this;
            r0 = r32
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0549;
                case 1: goto L_0x0527;
                case 2: goto L_0x0502;
                case 3: goto L_0x04e6;
                case 4: goto L_0x041e;
                case 5: goto L_0x01e4;
                case 6: goto L_0x0119;
                case 7: goto L_0x0050;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A06
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            android.content.Context r7 = X.C51967G9n.A09(r1)
            android.app.Activity r6 = X.C51969G9p.A0J(r1)
            java.lang.Object r5 = r0.A07
            X.GFJ r5 = (X.GFJ) r5
            com.instagram.common.session.UserSession r11 = r5.A0A
            X.JTB r14 = r5.A0H
            X.4bN r8 = r5.A06
            X.JSx r9 = r5.A07
            java.lang.Object r15 = r0.A04
            X.Hjr r15 = (X.C55571Hjr) r15
            java.lang.Object r1 = r0.A02
            X.GPZ r1 = (X.GPZ) r1
            r3 = 0
            if (r1 == 0) goto L_0x004e
            java.lang.String r3 = r1.A02
            X.0sa r2 = r1.A03
        L_0x002e:
            java.lang.Object r4 = r0.A03
            X.GJ5 r1 = X.GJ5.AD
            boolean r19 = X.AnonymousClass7TF.A1W(r4, r1)
            X.GCs r1 = r5.A0P
            java.lang.Object r12 = r0.A05
            X.3W1 r12 = (X.AnonymousClass3W1) r12
            X.4DU r10 = r5.A0C
            java.lang.Object r13 = r0.A01
            X.S6e r13 = (X.S6e) r13
            X.GG0 r5 = new X.GG0
            r18 = r2
            r17 = r3
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
        L_0x004e:
            r2 = r3
            goto L_0x002e
        L_0x0050:
            java.lang.Object r11 = r0.A07
            X.GwY r11 = (X.C53928GwY) r11
            android.view.animation.OvershootInterpolator r1 = X.C53928GwY.A0r
            boolean r1 = r11.A0F
            if (r1 != 0) goto L_0x005e
            boolean r1 = r11.A0H
            if (r1 == 0) goto L_0x00c2
        L_0x005e:
            boolean r1 = r11.A0B
            r3 = 300(0x12c, double:1.48E-321)
            r10 = 2
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r11.A0A
            if (r1 == 0) goto L_0x00ce
            java.lang.Object r9 = r0.A03
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {0, 1117126656} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A04
            X.2V5 r7 = (X.2V5) r7
            java.lang.Object r6 = r0.A06
            X.2V5 r6 = (X.2V5) r6
            android.view.animation.OvershootInterpolator r5 = X.C53928GwY.A0r
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 21
            X.I83 r1 = new X.I83
            r1.<init>((X.2V5) r7, (X.2V5) r6, (int) r2)
            r8.addUpdateListener(r1)
            r1 = 15
            X.C56678I7i.A00(r8, r11, r1)
            r8.start()
            r9.A00(r8)
            java.lang.Object r9 = r0.A02
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A01
            java.lang.Object r6 = r0.A05
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 22
        L_0x00ba:
            X.I83 r1 = new X.I83
            r1.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r6)
            X.C51970G9q.A11(r1, r8, r9)
        L_0x00c2:
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A02
            r0 = 20
            X.Iw1 r3 = X.C58692Iw1.A00(r1, r2, r0)
            goto L_0x0194
        L_0x00ce:
            boolean r1 = r11.A0A
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r9 = r0.A03
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {1117126656, 0} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A04
            X.2V5 r7 = (X.2V5) r7
            java.lang.Object r6 = r0.A06
            X.2V5 r6 = (X.2V5) r6
            android.view.animation.OvershootInterpolator r5 = X.C53928GwY.A0r
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 23
            X.I83 r1 = new X.I83
            r1.<init>((X.2V5) r7, (X.2V5) r6, (int) r2)
            X.C51970G9q.A11(r1, r8, r9)
            java.lang.Object r9 = r0.A02
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A01
            java.lang.Object r6 = r0.A05
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 24
            goto L_0x00ba
        L_0x0119:
            java.lang.Object r11 = r0.A07
            X.GaK r11 = (X.C52646GaK) r11
            android.view.animation.OvershootInterpolator r1 = X.C52646GaK.A0u
            boolean r1 = r11.A0F
            if (r1 != 0) goto L_0x0127
            boolean r1 = r11.A0H
            if (r1 == 0) goto L_0x0189
        L_0x0127:
            boolean r1 = r11.A0B
            r3 = 300(0x12c, double:1.48E-321)
            r10 = 2
            if (r1 == 0) goto L_0x0199
            boolean r1 = r11.A0A
            if (r1 == 0) goto L_0x0199
            java.lang.Object r9 = r0.A03
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {0, 1117126656} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A04
            X.2V5 r7 = (X.2V5) r7
            java.lang.Object r6 = r0.A06
            X.2V5 r6 = (X.2V5) r6
            android.view.animation.OvershootInterpolator r5 = X.C52646GaK.A0u
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 9
            X.I83 r1 = new X.I83
            r1.<init>((X.2V5) r7, (X.2V5) r6, (int) r2)
            r8.addUpdateListener(r1)
            X.C56678I7i.A00(r8, r11, r2)
            r8.start()
            r9.A00(r8)
            java.lang.Object r9 = r0.A02
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A01
            java.lang.Object r6 = r0.A05
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 10
        L_0x0181:
            X.I83 r1 = new X.I83
            r1.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r6)
            X.C51970G9q.A11(r1, r8, r9)
        L_0x0189:
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A02
            r0 = 12
            X.Wvv r3 = new X.Wvv
            r3.<init>(r0, r1, r2)
        L_0x0194:
            X.3dj r5 = X.C51965G9l.A0V(r3)
            return r5
        L_0x0199:
            boolean r1 = r11.A0A
            if (r1 == 0) goto L_0x0189
            java.lang.Object r9 = r0.A03
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {1117126656, 0} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A04
            X.2V5 r7 = (X.2V5) r7
            java.lang.Object r6 = r0.A06
            X.2V5 r6 = (X.2V5) r6
            android.view.animation.OvershootInterpolator r5 = X.C52646GaK.A0u
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 11
            X.I83 r1 = new X.I83
            r1.<init>((X.2V5) r7, (X.2V5) r6, (int) r2)
            X.C51970G9q.A11(r1, r8, r9)
            java.lang.Object r9 = r0.A02
            X.3Zt r9 = (X.C243673Zt) r9
            X.C51973G9u.A18(r9)
            float[] r1 = new float[r10]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r1)
            java.lang.Object r7 = r0.A01
            java.lang.Object r6 = r0.A05
            r8.setInterpolator(r5)
            r8.setDuration(r3)
            r2 = 12
            goto L_0x0181
        L_0x01e4:
            java.lang.Object r11 = r0.A04
            X.6V6 r11 = (X.AnonymousClass6V6) r11
            X.0eM r1 = r11.A02
            java.lang.Object r1 = r1.getValue()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeAllViews()
            java.lang.Object r3 = r0.A05
            android.view.View r3 = (android.view.View) r3
            float r2 = X.AnonymousClass7TE.A03(r3)
            r1 = 1034525082(0x3da9999a, float:0.0828125)
            float r2 = r2 * r1
            int r4 = (int) r2
            float r2 = X.AnonymousClass7TE.A02(r3)
            r1 = 1051496478(0x3eac901e, float:0.33703703)
            float r2 = r2 * r1
            int r5 = (int) r2
            float r2 = X.AnonymousClass7TE.A03(r3)
            r1 = 1020613973(0x3cd55555, float:0.026041666)
            float r2 = r2 * r1
            int r2 = (int) r2
            int r1 = r4 + r2
            r3 = 1190(0x4a6, float:1.668E-42)
            int r1 = r1 * 5
            if (r1 < r3) goto L_0x0222
        L_0x021a:
            int r2 = r2 + -5
            int r1 = r4 + r2
            int r1 = r1 * 5
            if (r1 >= r3) goto L_0x021a
        L_0x0222:
            java.lang.Object r13 = r0.A02
            X.0iw r13 = (X.AnonymousClass0iw) r13
            r1 = 0
            X.0qQ.A0B(r13, r1)
            X.0eM r3 = r11.A01
            java.lang.Object r6 = r3.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r6 = (com.instagram.common.ui.widget.imageview.IgImageView) r6
            r3 = 2131237733(0x7f081b65, float:1.8091725E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r24 = 0
            r3 = 2193(0x891, float:3.073E-42)
            java.lang.String r26 = X.C273654mx.A00(r3)
            r27 = 112(0x70, float:1.57E-43)
            X.I05 r3 = new X.I05
            r21 = r3
            r22 = r13
            r23 = r6
            r28 = r1
            r29 = r1
            r21.<init>((X.AnonymousClass0iw) r22, (com.instagram.common.ui.widget.imageview.IgImageView) r23, (X.1Xj) r24, (java.lang.Integer) r25, (java.lang.String) r26, (int) r27, (boolean) r28, (boolean) r29)
            r11.A07(r3)
            java.lang.Object r3 = r0.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r14 = r0.A07
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            java.lang.Object r12 = r0.A03
            android.content.Context r12 = (android.content.Context) r12
            X.0qQ.A0A(r12)
            java.util.Iterator r9 = r3.iterator()
        L_0x0268:
            boolean r7 = r9.hasNext()
            r15 = 0
            r6 = 5309(0x14bd, float:7.44E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            if (r7 == 0) goto L_0x0410
            java.lang.Object r8 = r9.next()
            r7 = r8
            X.BHe r7 = (X.C42101BHe) r7
            java.lang.String r7 = r7.A04
            boolean r7 = X.0qQ.A0K(r7, r6)
            if (r7 == 0) goto L_0x0268
        L_0x0284:
            X.BHe r8 = (X.C42101BHe) r8
            if (r8 == 0) goto L_0x02b0
            java.util.List r8 = r8.A05
            if (r8 == 0) goto L_0x02b0
            java.lang.Object r7 = X.00k.A0O(r8, r1)
            X.BHf r7 = (X.C42102BHf) r7
            if (r7 == 0) goto L_0x0296
            X.1Xj r15 = r7.A00
        L_0x0296:
            com.instagram.user.model.User r16 = A00(r8)
            if (r15 == 0) goto L_0x02b0
            if (r16 == 0) goto L_0x02b0
            java.lang.String r17 = "Big heart"
            r22 = 2131627412(0x7f0e0d94, float:1.8882088E38)
            r23 = r1
            r19 = r4
            r20 = r2
            r21 = r5
            r18 = r6
            r11.A08(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x02b0:
            X.0qQ.A0A(r12)
            java.util.Iterator r9 = r3.iterator()
        L_0x02b7:
            boolean r7 = r9.hasNext()
            r15 = 0
            java.lang.String r6 = "most_tagged"
            if (r7 == 0) goto L_0x040d
            java.lang.Object r8 = r9.next()
            r7 = r8
            X.BHe r7 = (X.C42101BHe) r7
            java.lang.String r7 = r7.A04
            boolean r7 = X.0qQ.A0K(r7, r6)
            if (r7 == 0) goto L_0x02b7
        L_0x02cf:
            X.BHe r8 = (X.C42101BHe) r8
            if (r8 == 0) goto L_0x02fb
            java.util.List r8 = r8.A05
            if (r8 == 0) goto L_0x02fb
            java.lang.Object r7 = X.00k.A0O(r8, r1)
            X.BHf r7 = (X.C42102BHf) r7
            if (r7 == 0) goto L_0x02e1
            X.1Xj r15 = r7.A00
        L_0x02e1:
            com.instagram.user.model.User r16 = A00(r8)
            if (r15 == 0) goto L_0x02fb
            if (r16 == 0) goto L_0x02fb
            java.lang.String r17 = "Tag teammate"
            r22 = 2131627412(0x7f0e0d94, float:1.8882088E38)
            r23 = r1
            r19 = r4
            r20 = r2
            r21 = r5
            r18 = r6
            r11.A08(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x02fb:
            X.0qQ.A0A(r12)
            java.util.Iterator r9 = r3.iterator()
        L_0x0302:
            boolean r7 = r9.hasNext()
            r15 = 0
            java.lang.String r6 = "top_creator"
            if (r7 == 0) goto L_0x040a
            java.lang.Object r8 = r9.next()
            r7 = r8
            X.BHe r7 = (X.C42101BHe) r7
            java.lang.String r7 = r7.A04
            boolean r7 = X.0qQ.A0K(r7, r6)
            if (r7 == 0) goto L_0x0302
        L_0x031a:
            X.BHe r8 = (X.C42101BHe) r8
            if (r8 == 0) goto L_0x0346
            java.util.List r8 = r8.A05
            if (r8 == 0) goto L_0x0346
            java.lang.Object r7 = X.00k.A0O(r8, r1)
            X.BHf r7 = (X.C42102BHf) r7
            if (r7 == 0) goto L_0x032c
            X.1Xj r15 = r7.A00
        L_0x032c:
            com.instagram.user.model.User r16 = A00(r8)
            if (r15 == 0) goto L_0x0346
            if (r16 == 0) goto L_0x0346
            java.lang.String r17 = "Top account"
            r22 = 2131627412(0x7f0e0d94, float:1.8882088E38)
            r23 = r1
            r19 = r4
            r20 = r2
            r21 = r5
            r18 = r6
            r11.A08(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0346:
            X.0qQ.A0A(r12)
            java.util.Iterator r9 = r3.iterator()
        L_0x034d:
            boolean r7 = r9.hasNext()
            r15 = 0
            r6 = 5019(0x139b, float:7.033E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            if (r7 == 0) goto L_0x0407
            java.lang.Object r8 = r9.next()
            r7 = r8
            X.BHe r7 = (X.C42101BHe) r7
            java.lang.String r7 = r7.A04
            boolean r7 = X.0qQ.A0K(r7, r6)
            if (r7 == 0) goto L_0x034d
        L_0x0369:
            X.BHe r8 = (X.C42101BHe) r8
            if (r8 == 0) goto L_0x0395
            java.util.List r8 = r8.A05
            if (r8 == 0) goto L_0x0395
            java.lang.Object r7 = X.00k.A0O(r8, r1)
            X.BHf r7 = (X.C42102BHf) r7
            if (r7 == 0) goto L_0x037b
            X.1Xj r15 = r7.A00
        L_0x037b:
            com.instagram.user.model.User r16 = A00(r8)
            if (r15 == 0) goto L_0x0395
            if (r16 == 0) goto L_0x0395
            java.lang.String r17 = "Day one"
            r22 = 2131627412(0x7f0e0d94, float:1.8882088E38)
            r23 = r1
            r19 = r4
            r20 = r2
            r21 = r5
            r18 = r6
            r11.A08(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0395:
            X.0qQ.A0A(r12)
            java.util.Iterator r10 = r3.iterator()
        L_0x039c:
            boolean r9 = r10.hasNext()
            r8 = 0
            r6 = 5070(0x13ce, float:7.105E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r6)
            if (r9 == 0) goto L_0x03b8
            java.lang.Object r8 = r10.next()
            r6 = r8
            X.BHe r6 = (X.C42101BHe) r6
            java.lang.String r6 = r6.A04
            boolean r6 = X.0qQ.A0K(r6, r7)
            if (r6 == 0) goto L_0x039c
        L_0x03b8:
            X.BHe r8 = (X.C42101BHe) r8
            if (r8 == 0) goto L_0x03e8
            X.BHf r6 = r8.A00
            if (r6 == 0) goto L_0x03e8
            java.util.List r6 = r6.A03
            if (r6 == 0) goto L_0x03e8
            java.lang.Object r6 = X.00k.A0O(r6, r1)
            X.1Xj r6 = (X.1Xj) r6
            if (r6 == 0) goto L_0x03e8
            java.lang.String r25 = "Top post"
            r30 = 2131627413(0x7f0e0d95, float:1.888209E38)
            r31 = 1
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r6
            r26 = r7
            r27 = r4
            r28 = r2
            r29 = r5
            r19.A08(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x03e8:
            java.lang.Object r2 = r0.A06
            X.0Tu r0 = X.0Tu.A05
            r4 = 36319424571252116(0x81085300041d94, double:3.0318885732194635E-306)
            boolean r0 = X.182.A06(r0, r14, r4)
            if (r0 == 0) goto L_0x0413
            X.0eM r0 = r11.A03
            X.DbW.A1R(r0, r1)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 41
            X.ID2.A02(r1, r0, r3, r2)
            goto L_0x0524
        L_0x0407:
            r8 = r15
            goto L_0x0369
        L_0x040a:
            r8 = r15
            goto L_0x031a
        L_0x040d:
            r8 = r15
            goto L_0x02cf
        L_0x0410:
            r8 = r15
            goto L_0x0284
        L_0x0413:
            X.0eM r0 = r11.A03
            java.lang.Object r0 = r0.getValue()
            X.C51969G9p.A1M(r0)
            goto L_0x0524
        L_0x041e:
            java.lang.Object r8 = r0.A06
            X.N4P r8 = (X.N4P) r8
            int r2 = r8.A09
            r1 = 29
            if (r2 != r1) goto L_0x04a3
            java.lang.Object r1 = r0.A03
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r4 = r0.A07
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.AnonymousClass7TG.A1N(r1, r4)
            X.MiK r3 = new X.MiK
            r3.<init>(r1, r4)
            X.3sy r2 = r8.A08()
            java.lang.Integer r1 = X.AnonymousClass05K.A07
            r3.A03(r2, r1)
            java.lang.Object r0 = r0.A04
            X.JPL r0 = (X.JPL) r0
            r0.Cfo()
            X.6gx r1 = X.C313746gw.A00(r4)
            int r6 = r8.A06()
            X.3t3 r3 = r8.A0L
            java.lang.String r5 = X.C300965yF.A07(r3)
            java.lang.String r7 = r8.A0Q
            X.0wc r0 = r1.A03
            X.1Ln r2 = X.1Ln.A0E(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0490
            long r0 = r1.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            r0 = 936(0x3a8, float:1.312E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0l(r0)
            java.lang.String r0 = "tap"
            r2.A0k(r0)
            r0 = 69
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A0p(r0)
            java.lang.String r0 = "thread_details"
            java.lang.Long r0 = X.DbZ.A0b(r2, r0, r5, r7, r6)
            r2.A0i(r0)
            r2.Cgf()
        L_0x0490:
            X.IOe r2 = X.C54951HZh.A00(r4)
            java.lang.String r1 = X.C300965yF.A07(r3)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.HashSet r0 = r2.A00
            r0.remove(r1)
            goto L_0x0524
        L_0x04a3:
            X.3t3 r1 = r8.A0L
            X.3t0 r1 = X.C300965yF.A02(r1)
            if (r1 == 0) goto L_0x04be
            java.lang.String r3 = r1.A00
            if (r3 == 0) goto L_0x04be
            int r1 = r3.length()
            if (r1 == 0) goto L_0x04be
            X.Mfs r2 = X.C66959Mfs.A01
            java.lang.Object r1 = r0.A03
            android.content.Context r1 = (android.content.Context) r1
            r2.A00(r1, r3)
        L_0x04be:
            java.lang.Object r4 = r0.A05
            X.1a8 r4 = (X.1a8) r4
            java.lang.Object r1 = r0.A02
            X.Pv4 r1 = (X.C74449Pv4) r1
            X.7ZA r3 = r1.C62()
            X.3sy r2 = r8.A08()
            java.lang.Object r1 = r0.A03
            android.content.Context r1 = (android.content.Context) r1
            X.1aU r1 = r3.Cfq(r1, r2)
            java.lang.Object r9 = r0.A07
            java.lang.Object r10 = r0.A01
            java.lang.Object r7 = r0.A04
            r6 = 0
            X.FpA r5 = new X.FpA
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A02(r1, r5)
            goto L_0x0524
        L_0x04e6:
            java.lang.Object r3 = r0.A07
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r4 = r0.A04
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r6 = r0.A02
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r1 = r0.A06
            X.Dfd r1 = (X.C46475Dfd) r1
            java.lang.Object r5 = r0.A05
            X.HPj r5 = (X.C54704HPj) r5
            X.FC1.A01(r1, r2, r3, r4, r5, r6)
            goto L_0x051d
        L_0x0502:
            java.lang.Object r3 = r0.A07
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r4 = r0.A04
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r6 = r0.A02
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r1 = r0.A06
            X.Dfd r1 = (X.C46475Dfd) r1
            java.lang.Object r5 = r0.A05
            X.HPj r5 = (X.C54704HPj) r5
            X.F5Y.A01(r1, r2, r3, r4, r5, r6)
        L_0x051d:
            java.lang.Object r0 = r0.A03
            X.G9Z r0 = (X.G9Z) r0
            r0.Dk3()
        L_0x0524:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0527:
            java.lang.Object r6 = r0.A07
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r11 = r0.A02
            X.869 r11 = (X.AnonymousClass869) r11
            java.lang.Object r8 = r0.A05
            X.87i r8 = (X.C3510387i) r8
            java.lang.Object r10 = r0.A04
            X.85r r10 = (X.C3506685r) r10
            java.lang.Object r9 = r0.A03
            X.82p r9 = (X.C3499582p) r9
            java.lang.Object r12 = r0.A06
            X.0eK r12 = (X.AnonymousClass0eK) r12
            java.lang.Object r7 = r0.A01
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            X.8q5 r5 = new X.8q5
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x0549:
            java.lang.Object r6 = r0.A04
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r8 = r0.A01
            X.0iw r8 = (X.AnonymousClass0iw) r8
            java.lang.Object r10 = r0.A02
            X.8Yz r10 = (X.C357638Yz) r10
            java.lang.Object r12 = r0.A06
            X.80U r12 = (X.AnonymousClass80U) r12
            java.lang.Object r11 = r0.A05
            X.8AL r11 = (X.AnonymousClass8AL) r11
            java.lang.Object r7 = r0.A03
            X.82W r7 = (X.AnonymousClass82W) r7
            java.lang.Object r9 = r0.A07
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            X.8Hb r5 = new X.8Hb
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58701IwA.invoke():java.lang.Object");
    }
}
