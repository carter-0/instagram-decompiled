package X;

/* renamed from: X.Iwv  reason: case insensitive filesystem */
public final class C58748Iwv extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58748Iwv(Object obj, Object obj2, float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.5af, java.lang.Object, X.5ae] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.5af, java.lang.Object, X.5ae] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x014c, code lost:
        r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0150, code lost:
        if (r0 == null) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0152, code lost:
        r0.EeJ(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0181, code lost:
        r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0185, code lost:
        if (r0 == null) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0187, code lost:
        r0.EeI(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0289, code lost:
        if (r3 > r2) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02c0, code lost:
        if (r3 < r2) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x031f, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r11 = r20
            int r1 = r0.A01
            switch(r1) {
                case 1: goto L_0x02c3;
                case 2: goto L_0x0278;
                case 3: goto L_0x0238;
                case 4: goto L_0x0213;
                case 5: goto L_0x01ee;
                case 6: goto L_0x018f;
                case 7: goto L_0x015a;
                case 8: goto L_0x0128;
                case 9: goto L_0x00f0;
                case 10: goto L_0x009f;
                case 11: goto L_0x0073;
                case 12: goto L_0x0051;
                case 13: goto L_0x002b;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r4 = X.AnonymousClass7TE.A0M(r11)
            java.lang.Object r2 = r0.A03
            X.GwY r2 = (X.C53928GwY) r2
            float r3 = r0.A00
            android.view.animation.OvershootInterpolator r1 = X.C53928GwY.A0r
            X.GZG r1 = r2.A04
            int r5 = r1.A02
            java.lang.Object r1 = r0.A02
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131100861(0x7f0604bd, float:1.7814115E38)
            int r6 = X.C244013aV.A02(r1, r0)
            r7 = 0
            r8 = r7
            android.graphics.drawable.LayerDrawable r0 = X.C53928GwY.A00(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x002b:
            X.2WE r5 = X.C51968G9o.A0f(r11)
            r4 = 1
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            java.lang.Object r2 = r0.A03
            float r1 = r0.A00
            X.J72 r0 = new X.J72
            r0.<init>(r2, r1, r4)
            r5.A02(r0, r3)
            X.2V5 r1 = X.C53979GxN.A08
            X.JJM r0 = X.JJM.A00
            X.C244463bE.A00(r1, r5, r0)
            X.2V5 r1 = X.C53979GxN.A07
            X.JJN r0 = X.JJN.A00
            X.C244463bE.A00(r1, r5, r0)
            goto L_0x031d
        L_0x0051:
            int r4 = X.AnonymousClass7TE.A0M(r11)
            java.lang.Object r2 = r0.A03
            X.GaK r2 = (X.C52646GaK) r2
            float r3 = r0.A00
            android.view.animation.OvershootInterpolator r1 = X.C52646GaK.A0u
            X.GZG r1 = r2.A04
            int r5 = r1.A02
            java.lang.Object r1 = r0.A02
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            r0 = 2131100861(0x7f0604bd, float:1.7814115E38)
            int r6 = X.C244013aV.A02(r1, r0)
            r7 = 0
            r8 = r7
            android.graphics.drawable.LayerDrawable r0 = X.C52646GaK.A00(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0073:
            X.6Gb r7 = X.C51968G9o.A0L(r11)
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r0.A03
            float r5 = r0.A00
            java.util.Iterator r4 = r1.iterator()
        L_0x0083:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x031d
            java.lang.Object r3 = r4.next()
            r2 = -1612185442(0xffffffff9fe8009e, float:-9.825684E-20)
            r1 = 1
            X.JGl r0 = new X.JGl
            r0.<init>(r6, r3, r5, r1)
            X.5PJ r1 = X.AnonymousClass5PI.A04(r0, r2, r1)
            r0 = 0
            r7.Cf4(r0, r1)
            goto L_0x0083
        L_0x009f:
            X.9IZ r11 = (X.AnonymousClass9IZ) r11
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r4 = r0.A03
            X.8bk r4 = (X.C358958bk) r4
            java.lang.Object r2 = r0.A02
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            float r3 = r0.A00
            float r7 = X.C358958bk.A00(r2, r11, r4)
            float r8 = X.C358958bk.A01(r2, r4)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r4.A02
            float r0 = r6.A0H(r2)
            double r0 = (double) r0
            double r9 = java.lang.Math.toRadians(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r4.A01
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r1 = r0.getHeight()
            android.graphics.Rect r0 = r2.getBounds()
            int r0 = r0.centerY()
            float r2 = (float) r0
            float r1 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r2 = r2 - r1
            float r2 = r2 + r3
            double r4 = (double) r2
            double r2 = java.lang.Math.cos(r9)
            double r0 = (double) r8
            double r2 = r2 * r0
            double r4 = r4 + r2
            double r2 = java.lang.Math.sin(r9)
            double r0 = (double) r7
            double r2 = r2 * r0
            double r4 = r4 + r2
            float r1 = (float) r4
            java.lang.Object r3 = r11.A03
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            goto L_0x014c
        L_0x00f0:
            X.9IZ r11 = (X.AnonymousClass9IZ) r11
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r3 = r0.A03
            X.8bk r3 = (X.C358958bk) r3
            java.lang.Object r1 = r0.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            float r2 = r0.A00
            float r10 = X.C358958bk.A00(r1, r11, r3)
            float r9 = X.C358958bk.A01(r1, r3)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r3.A02
            float r0 = r4.A0H(r1)
            double r0 = (double) r0
            double r7 = java.lang.Math.toRadians(r0)
            double r5 = (double) r2
            double r2 = java.lang.Math.cos(r7)
            double r0 = (double) r10
            double r2 = r2 * r0
            double r5 = r5 + r2
            double r2 = java.lang.Math.sin(r7)
            double r0 = (double) r9
            double r2 = r2 * r0
            double r5 = r5 - r2
            float r1 = (float) r5
            java.lang.Object r3 = r11.A03
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            goto L_0x0181
        L_0x0128:
            X.9br r11 = (X.C381499br) r11
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r1 = r0.A03
            X.ADh r1 = (X.C39885ADh) r1
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r6 = r1.A01
            java.lang.Object r1 = r0.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Float r1 = r6.A0R(r1)
            if (r1 == 0) goto L_0x0157
            float r3 = r1.floatValue()
        L_0x0142:
            int r1 = r11.A02
            float r2 = (float) r1
            float r3 = r3 * r2
            float r2 = r2 - r3
            android.graphics.drawable.Drawable r3 = r11.A03
            float r1 = r0.A00
            float r1 = r1 + r2
        L_0x014c:
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r3, r6)
            if (r0 == 0) goto L_0x031d
            r0.EeJ(r1)
            goto L_0x031d
        L_0x0157:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0142
        L_0x015a:
            X.9br r11 = (X.C381499br) r11
            r1 = 0
            X.0qQ.A0B(r11, r1)
            java.lang.Object r1 = r0.A03
            X.ADh r1 = (X.C39885ADh) r1
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r1.A01
            java.lang.Object r1 = r0.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            java.lang.Float r1 = r4.A0R(r1)
            if (r1 == 0) goto L_0x018c
            float r3 = r1.floatValue()
        L_0x0174:
            int r1 = r11.A02
            float r2 = (float) r1
            float r3 = r3 * r2
            float r2 = r2 - r3
            android.graphics.drawable.Drawable r3 = r11.A03
            float r1 = r0.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r0
            float r1 = r1 + r2
        L_0x0181:
            X.B3f r0 = com.instagram.ui.widget.interactive.InteractiveDrawableContainer.A00(r3, r4)
            if (r0 == 0) goto L_0x031d
            r0.EeI(r1)
            goto L_0x031d
        L_0x018c:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0174
        L_0x018f:
            java.lang.Object r1 = r0.A02
            X.HKo r1 = (X.C54605HKo) r1
            java.lang.Object r2 = r0.A03
            X.5VN r2 = (X.AnonymousClass5VN) r2
            float r4 = r0.A00
            boolean r0 = r1 instanceof X.H90
            if (r0 == 0) goto L_0x01b7
            r0 = 0
            X.0qQ.A0B(r2, r0)
            float r1 = r2.A02
            float r0 = r2.A03
            long r2 = X.C289325dP.A00(r1, r0)
            r0 = 0
            long r0 = X.C289325dP.A00(r4, r0)
        L_0x01ae:
            long r0 = X.C289295dM.A06(r2, r0)
        L_0x01b2:
            X.5d8 r0 = X.C51974G9v.A04(r0)
            return r0
        L_0x01b7:
            boolean r0 = r1 instanceof X.C54353H8z
            if (r0 == 0) goto L_0x01c8
            r0 = 0
            X.0qQ.A0B(r2, r0)
            float r1 = r2.A01
            float r0 = r2.A03
            long r0 = X.C289325dP.A00(r1, r0)
            goto L_0x01b2
        L_0x01c8:
            boolean r1 = r1 instanceof X.C54352H8y
            r0 = 0
            if (r1 == 0) goto L_0x01dd
            X.0qQ.A0B(r2, r0)
            float r1 = r2.A02
            float r0 = r2.A00
            long r2 = X.C289325dP.A00(r1, r0)
            long r0 = X.C289325dP.A00(r4, r4)
            goto L_0x01ae
        L_0x01dd:
            X.0qQ.A0B(r2, r0)
            float r1 = r2.A01
            float r0 = r2.A00
            long r2 = X.C289325dP.A00(r1, r0)
            r0 = 0
            long r0 = X.C289325dP.A00(r0, r4)
            goto L_0x01ae
        L_0x01ee:
            java.lang.Object r5 = r0.A02
            X.5b4 r5 = (X.AnonymousClass5b4) r5
            X.5Oz r1 = r5.A09
            float r1 = X.C51972G9s.A02(r1)
            float r4 = r0.A00
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x020c
            java.lang.Object r3 = r0.A03
            X.4Cq r3 = (X.C262224Cq) r3
            r2 = 0
            r1 = 7
            X.JUx r0 = new X.JUx
            r0.<init>(r5, r2, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x020c:
            r1 = 3
            X.Gc5 r0 = new X.Gc5
            r0.<init>(r1)
            return r0
        L_0x0213:
            X.6Gb r7 = X.C51968G9o.A0L(r11)
            java.lang.Object r6 = r0.A02
            java.util.List r6 = (java.util.List) r6
            float r5 = r0.A00
            java.lang.Object r4 = r0.A03
            X.0sL r4 = (X.0sL) r4
            X.J0U r3 = X.J0U.A00
            int r2 = r6.size()
            r0 = 32
            X.J6l r1 = new X.J6l
            r1.<init>((int) r0, (java.util.List) r6, (X.0sP) r3)
            X.JJX r0 = new X.JJX
            r0.<init>(r6, r4, r5)
            X.C51971G9r.A10(r7, r0, r1, r2)
            goto L_0x031d
        L_0x0238:
            X.5Q4 r11 = (X.AnonymousClass5Q4) r11
            r11.AQW()
            float r3 = r0.A00
            java.lang.Object r13 = r0.A03
            X.60f r13 = (X.C3018260f) r13
            java.lang.Object r12 = r0.A02
            X.5bW r12 = (X.C288195bW) r12
            X.5QD r7 = r11.Ayw()
            r2 = r7
            X.5QC r2 = (X.AnonymousClass5QC) r2
            X.5Q5 r0 = r2.A02
            X.5QB r6 = r0.A02
            long r0 = X.C51967G9n.A05(r6)
            X.5QF r5 = r2.A01     // Catch:{ all -> 0x0273 }
            r2 = 0
            r5.FHv(r3, r2)     // Catch:{ all -> 0x0273 }
            r4 = 1110704128(0x42340000, float:45.0)
            r2 = 0
            r5.EJR(r2, r4)     // Catch:{ all -> 0x0273 }
            r15 = 1065353216(0x3f800000, float:1.0)
            X.5dw r14 = X.C289635dw.A00     // Catch:{ all -> 0x0273 }
            r16 = 3
            r17 = r2
            r11.AQd(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0273 }
            X.C51968G9o.A1G(r6, r7, r0)
            goto L_0x031d
        L_0x0273:
            r2 = move-exception
            X.C51968G9o.A1G(r6, r7, r0)
            throw r2
        L_0x0278:
            X.64v r11 = (X.C3026764v) r11
            float r2 = r0.A00
            r3 = 0
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x02b4
            X.5Oz r1 = r11.A06
            float r3 = X.C51972G9s.A02(r1)
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x028c
        L_0x028b:
            r3 = r2
        L_0x028c:
            java.lang.Object r2 = r0.A03
            X.0rh r2 = (X.0rh) r2
            float r1 = r2.A00
            float r1 = r3 - r1
            java.lang.Object r0 = r0.A02
            X.6H1 r0 = (X.AnonymousClass6H1) r0
            float r0 = r0.EKW(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x02b0
            X.5Oz r0 = r11.A06
            float r0 = X.C51972G9s.A02(r0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x02b0
        L_0x02aa:
            float r0 = r2.A00
            float r0 = r0 + r1
            r2.A00 = r0
            goto L_0x031d
        L_0x02b0:
            r11.A00()
            goto L_0x02aa
        L_0x02b4:
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x028c
            X.5Oz r1 = r11.A06
            float r3 = X.C51972G9s.A02(r1)
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x028c
            goto L_0x028b
        L_0x02c3:
            long r1 = X.AnonymousClass7TE.A0R(r11)
            java.lang.Object r6 = r0.A03
            androidx.compose.foundation.gestures.UpdatableAnimationState r6 = (androidx.compose.foundation.gestures.UpdatableAnimationState) r6
            long r7 = r6.A01
            r4 = -9223372036854775808
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x02d6
            r6.A01 = r1
            r7 = r1
        L_0x02d6:
            float r4 = r6.A00
            X.5ae r10 = new X.5ae
            r10.<init>()
            r10.A00 = r4
            float r9 = r0.A00
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0320
            X.64i r7 = r6.A04
            X.5ae r5 = new X.5ae
            r5.<init>()
            r5.A00 = r4
            X.5ae r4 = androidx.compose.foundation.gestures.UpdatableAnimationState.A05
            X.5ae r3 = r6.A02
            long r13 = r7.AzR(r5, r4, r3)
        L_0x02f7:
            X.64i r9 = r6.A04
            X.5ae r11 = androidx.compose.foundation.gestures.UpdatableAnimationState.A05
            X.5ae r12 = r6.A02
            X.5af r3 = r9.CDS(r10, r11, r12, r13)
            X.5ae r3 = (X.C287715ae) r3
            float r4 = r3.A00
            X.5ae r12 = r6.A02
            X.5af r3 = r9.CDd(r10, r11, r12, r13)
            X.5ae r3 = (X.C287715ae) r3
            r6.A02 = r3
            r6.A01 = r1
            float r1 = r6.A00
            float r1 = r1 - r4
            r6.A00 = r4
            java.lang.Object r0 = r0.A02
            X.0sP r0 = (X.0sP) r0
            X.C51967G9n.A1Q(r0, r1)
        L_0x031d:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0320:
            long r4 = r1 - r7
            float r3 = (float) r4
            float r3 = r3 / r9
            double r3 = (double) r3
            long r13 = X.AnonymousClass1GB.A02(r3)
            goto L_0x02f7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58748Iwv.invoke(java.lang.Object):java.lang.Object");
    }
}
