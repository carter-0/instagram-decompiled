package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import java.util.List;

/* renamed from: X.MvN  reason: case insensitive filesystem */
public final class C67819MvN extends AnonymousClass3AS {
    public final TimeInterpolator A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final OmniGridLayoutManager A02;
    public final List A03 = AnonymousClass7TE.A1C();

    public final boolean A0D(C241463Ph r2, C241463Ph r3, C249703kE r4) {
        return A01(r4, false);
    }

    public final boolean A0E(C241463Ph r2, C241463Ph r3, C249703kE r4) {
        return A01(r4, false);
    }

    public final boolean A0F(C241463Ph r2, C241463Ph r3, C249703kE r4) {
        return A01(r4, true);
    }

    public final boolean A0G(C241463Ph r2, C241463Ph r3, C249703kE r4, C249703kE r5) {
        return A01(r4, false);
    }

    public final boolean A0H(C249703kE r2) {
        return true;
    }

    private final void A00(C70642OEo oEo) {
        C68056MzN mzN;
        C53389GnL gnL = oEo.A03;
        C249703kE r2 = oEo.A02;
        View A0F = JTO.A0F(r2);
        if (gnL.A07) {
            A0F.setElevation(0.0f);
        }
        gnL.A00(A0F, true);
        if ((r2 instanceof C68056MzN) && (mzN = (C68056MzN) r2) != null) {
            mzN.A01(AnonymousClass05K.A01);
        }
        A0C(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a1, code lost:
        if (r2 <= 1.618d) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(X.C249703kE r26, boolean r27) {
        /*
            r25 = this;
            r24 = r25
            r0 = r24
            com.facebook.rtc.views.omnigrid.OmniGridLayoutManager r8 = r0.A02
            r1 = r26
            long r2 = r1.mItemId
            java.lang.String r4 = "OmniGridLayoutManager.gridItemAnimationFor"
            r0 = -79429704(0xfffffffffb43ffb8, float:-1.0176845E36)
            X.0fh.A01(r4, r0)
            X.N48 r0 = r8.A07     // Catch:{ all -> 0x01f7 }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x01f7 }
            X.N2s r7 = X.OOZ.A01(r0, r2)     // Catch:{ all -> 0x01f7 }
            X.N48 r0 = r8.A08     // Catch:{ all -> 0x01f7 }
            java.util.List r0 = r0.A09     // Catch:{ all -> 0x01f7 }
            X.N2s r5 = X.OOZ.A01(r0, r2)     // Catch:{ all -> 0x01f7 }
            java.util.Map r4 = r8.A0B     // Catch:{ all -> 0x01f7 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x01f7 }
            java.lang.Object r6 = r4.get(r0)     // Catch:{ all -> 0x01f7 }
            X.0eP r6 = (X.0eP) r6     // Catch:{ all -> 0x01f7 }
            r0 = 0
            if (r6 == 0) goto L_0x005c
            java.lang.Object r11 = r6.A00     // Catch:{ all -> 0x01f7 }
            X.ULb r11 = (X.C15048ULb) r11     // Catch:{ all -> 0x01f7 }
            r9 = 0
            X.0qQ.A0B(r11, r9)     // Catch:{ all -> 0x01f7 }
            X.ULb r3 = r8.A1a()     // Catch:{ all -> 0x01f7 }
            int r10 = r11.A01     // Catch:{ all -> 0x01f7 }
            int r2 = r3.A01     // Catch:{ all -> 0x01f7 }
            int r12 = r10 + r2
            int r4 = r11.A03     // Catch:{ all -> 0x01f7 }
            int r2 = r3.A03     // Catch:{ all -> 0x01f7 }
            int r13 = r4 + r2
            int r3 = r11.A02     // Catch:{ all -> 0x01f7 }
            int r3 = r3 - r10
            int r3 = r3 + r12
            int r2 = r11.A00     // Catch:{ all -> 0x01f7 }
            int r2 = r2 - r4
            int r2 = r2 + r13
            X.ULb r4 = new X.ULb     // Catch:{ all -> 0x01f7 }
            r11 = r4
            r14 = r3
            r15 = r2
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01f7 }
            goto L_0x0062
        L_0x005c:
            if (r5 == 0) goto L_0x0061
            X.ULb r4 = r5.A02     // Catch:{ all -> 0x01f7 }
            goto L_0x0062
        L_0x0061:
            r4 = r0
        L_0x0062:
            if (r7 == 0) goto L_0x00ab
            if (r4 == 0) goto L_0x009c
            X.ULb r3 = r7.A02     // Catch:{ all -> 0x01f7 }
            int r13 = r8.A00     // Catch:{ all -> 0x01f7 }
            int r2 = r8.A02     // Catch:{ all -> 0x01f7 }
            int r13 = r13 - r2
            int r12 = r8.A01     // Catch:{ all -> 0x01f7 }
            int r2 = r8.A03     // Catch:{ all -> 0x01f7 }
            int r12 = r12 - r2
            r11 = r4
            if (r27 == 0) goto L_0x0077
            r11 = r3
            r3 = r4
        L_0x0077:
            int r14 = r3.A02     // Catch:{ all -> 0x01f7 }
            int r4 = r3.A01     // Catch:{ all -> 0x01f7 }
            int r10 = r14 - r4
            r15 = 0
            if (r10 <= 0) goto L_0x00ea
            int r9 = r3.A00     // Catch:{ all -> 0x01f7 }
            int r8 = r3.A03     // Catch:{ all -> 0x01f7 }
            int r7 = r9 - r8
            if (r7 <= 0) goto L_0x00ea
            int r5 = r11.A01     // Catch:{ all -> 0x01f7 }
            int r3 = r11.A02     // Catch:{ all -> 0x01f7 }
            int r2 = r5 + r3
            int r2 = r2 >> 1
            int r4 = r4 + r14
            int r4 = r4 >> 1
            int r2 = r2 - r4
            float r4 = (float) r2     // Catch:{ all -> 0x01f7 }
            float r2 = (float) r13     // Catch:{ all -> 0x01f7 }
            float r4 = r4 + r2
            int r2 = r11.A03     // Catch:{ all -> 0x01f7 }
            int r11 = r11.A00     // Catch:{ all -> 0x01f7 }
            goto L_0x00c0
        L_0x009c:
            X.N48 r0 = r8.A07     // Catch:{ all -> 0x01f7 }
            int r3 = r0.A03     // Catch:{ all -> 0x01f7 }
            int r2 = r0.A02     // Catch:{ all -> 0x01f7 }
            r0 = 1
            X.GnL r0 = X.OOZ.A00(r7, r3, r2, r0)     // Catch:{ all -> 0x01f7 }
            r2 = 1205819913(0x47df5a09, float:114356.07)
            goto L_0x00ed
        L_0x00ab:
            if (r5 == 0) goto L_0x00bc
            X.N48 r0 = r8.A08     // Catch:{ all -> 0x01f7 }
            int r3 = r0.A03     // Catch:{ all -> 0x01f7 }
            int r2 = r0.A02     // Catch:{ all -> 0x01f7 }
            r0 = 0
            X.GnL r0 = X.OOZ.A00(r5, r3, r2, r0)     // Catch:{ all -> 0x01f7 }
            r2 = -372321722(0xffffffffe9ced246, float:-3.1253963E25)
            goto L_0x00ed
        L_0x00bc:
            r2 = 1396555322(0x533dbe3a, float:8.1494029E11)
            goto L_0x00ed
        L_0x00c0:
            int r13 = r2 + r11
            int r13 = r13 >> 1
            int r8 = r8 + r9
            int r8 = r8 >> 1
            int r13 = r13 - r8
            float r8 = (float) r13
            float r9 = (float) r12
            float r8 = r8 + r9
            int r3 = r3 - r5
            float r5 = (float) r3
            float r3 = (float) r10
            float r5 = r5 / r3
            int r11 = r11 - r2
            float r9 = (float) r11
            float r2 = (float) r7
            float r9 = r9 / r2
            r13 = 0
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            boolean r2 = X.AnonymousClass7TF.A1Q(r2)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0184
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0184
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0184
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0184
        L_0x00ea:
            r2 = -33136591(0xfffffffffe066031, float:-4.4654E37)
        L_0x00ed:
            X.0fh.A00(r2)
            r8 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            if (r0 == 0) goto L_0x01f1
            android.view.View r2 = r1.itemView
            android.view.ViewPropertyAnimator r3 = r2.animate()
            r2 = r24
            android.animation.TimeInterpolator r2 = r2.A00
            r3.setInterpolator(r2)
            r2 = r24
            r2.A0K(r1)
            android.view.View r3 = X.JTO.A0F(r1)
            boolean r6 = r0.A07
            if (r6 == 0) goto L_0x0116
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setElevation(r2)
        L_0x0116:
            r2 = r6 ^ 1
            r0.A00(r3, r2)
            boolean r2 = r1 instanceof X.C68056MzN
            if (r2 == 0) goto L_0x012a
            r4 = r1
            X.MzN r4 = (X.C68056MzN) r4
            if (r4 == 0) goto L_0x012a
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r2 = -1
            r4.A02(r3, r3, r2, r2)
        L_0x012a:
            boolean r2 = r0.A08
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            X.0eP r4 = X.C66581MXm.A14(r2, r6)
            r8 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r5, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0163
            long r12 = r24.A06()
            r4 = 0
            long r6 = r24.A09()
            long r2 = r12 - r6
            long r14 = java.lang.Math.max(r4, r2)
        L_0x0153:
            X.OEo r2 = new X.OEo
            r9 = r2
            r10 = r1
            r11 = r0
            r9.<init>(r10, r11, r12, r14)
            r0 = r24
            java.util.List r0 = r0.A03
            r0.add(r2)
            return r8
        L_0x0163:
            X.0eP r2 = X.AnonymousClass7TE.A1L(r3, r5)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0174
            long r12 = r24.A09()
        L_0x0171:
            r14 = 0
            goto L_0x0153
        L_0x0174:
            X.0eP r2 = new X.0eP
            r2.<init>(r3, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x01e6
            long r12 = r24.A08()
            goto L_0x0171
        L_0x0184:
            if (r6 != 0) goto L_0x01a3
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x01a3
            int r2 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x00ea
            float r2 = r5 / r9
            double r2 = (double) r2
            r10 = 4603741668684706349(0x3fe3c6a7ef9db22d, double:0.618)
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 > 0) goto L_0x00ea
            r10 = 4609965643369732375(0x3ff9e353f7ced917, double:1.618)
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x00ea
        L_0x01a3:
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x01cd
            r16 = r0
        L_0x01a9:
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x01c8
            r17 = r0
        L_0x01af:
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x01c3
            r18 = r0
        L_0x01b5:
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x01be
            r19 = r0
        L_0x01bb:
            if (r6 == 0) goto L_0x01d6
            goto L_0x01d2
        L_0x01be:
            java.lang.Float r19 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x01f7 }
            goto L_0x01bb
        L_0x01c3:
            java.lang.Float r18 = java.lang.Float.valueOf(r5)     // Catch:{ all -> 0x01f7 }
            goto L_0x01b5
        L_0x01c8:
            java.lang.Float r17 = java.lang.Float.valueOf(r8)     // Catch:{ all -> 0x01f7 }
            goto L_0x01af
        L_0x01cd:
            java.lang.Float r16 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x01f7 }
            goto L_0x01a9
        L_0x01d2:
            java.lang.Object r15 = r6.A01     // Catch:{ all -> 0x01f7 }
            X.GnR r15 = (X.C53394GnR) r15     // Catch:{ all -> 0x01f7 }
        L_0x01d6:
            r22 = 1
            r23 = r27 ^ 1
            r21 = 16
            X.GnL r14 = new X.GnL     // Catch:{ all -> 0x01f7 }
            r20 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x01f7 }
            r0 = r14
            goto L_0x00ea
        L_0x01e6:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Invalid "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r0, r1, r2)
            throw r0
        L_0x01f1:
            r0 = r24
            r0.A0C(r1)
            return r8
        L_0x01f7:
            r1 = move-exception
            r0 = 7215815(0x6e1ac7, float:1.011151E-38)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67819MvN.A01(X.3kE, boolean):boolean");
    }

    public final void A0I() {
        List list = this.A03;
        for (C70642OEo A002 : 00k.A0a(list)) {
            A00(A002);
        }
        list.clear();
        List list2 = this.A01;
        for (C70642OEo oEo : 00k.A0a(list2)) {
            C66580MXl.A1A(oEo.A02.itemView);
        }
        list2.clear();
        A0A();
    }

    public final void A0J() {
        List<C70642OEo> list = this.A03;
        for (C70642OEo oEo : list) {
            C249703kE r8 = oEo.A02;
            C53389GnL gnL = oEo.A03;
            ViewPropertyAnimator animate = JTO.A0F(r8).animate();
            this.A01.add(oEo);
            C53394GnR gnR = (C53394GnR) gnL.A02;
            if (gnR != null) {
                animate.setDuration(gnR.A00);
                animate.setStartDelay(0);
                TimeInterpolator timeInterpolator = (TimeInterpolator) gnR.A01;
                if (timeInterpolator != null) {
                    animate.setInterpolator(timeInterpolator);
                }
            } else {
                animate.setDuration(oEo.A01);
                animate.setStartDelay(oEo.A00);
            }
            boolean z = gnL.A07;
            Number number = (Number) gnL.A05;
            float f = 0.0f;
            if (number != null) {
                float floatValue = number.floatValue();
                if (z) {
                    floatValue = 0.0f;
                }
                animate.translationX(floatValue);
            }
            Number number2 = (Number) gnL.A06;
            if (number2 != null) {
                float floatValue2 = number2.floatValue();
                if (!z) {
                    f = floatValue2;
                }
                animate.translationY(f);
            }
            Number number3 = (Number) gnL.A03;
            float f2 = 1.0f;
            if (number3 != null) {
                float floatValue3 = number3.floatValue();
                if (z) {
                    floatValue3 = 1.0f;
                }
                animate.scaleX(floatValue3);
            }
            Number number4 = (Number) gnL.A04;
            if (number4 != null) {
                float floatValue4 = number4.floatValue();
                if (z) {
                    floatValue4 = 1.0f;
                }
                animate.scaleY(floatValue4);
            }
            Number number5 = (Number) gnL.A01;
            if (number5 != null) {
                float floatValue5 = number5.floatValue();
                if (!z) {
                    f2 = floatValue5;
                }
                animate.alpha(f2);
            }
            animate.setListener(new C52778GcV(0, animate, r8, gnL, oEo, this)).start();
        }
        list.clear();
    }

    public final void A0K(C249703kE r5) {
        C66580MXl.A1A(r5.itemView);
        List list = this.A03;
        for (C70642OEo oEo : 00k.A0a(list)) {
            if (r5.equals(oEo.A02)) {
                A00(oEo);
                list.remove(oEo);
            }
        }
        if (!A0L()) {
            A0A();
        }
    }

    public final boolean A0L() {
        if (!(!this.A03.isEmpty()) || !AnonymousClass7TE.A1b(this.A01)) {
            return false;
        }
        return true;
    }

    public C67819MvN(OmniGridLayoutManager omniGridLayoutManager) {
        this.A02 = omniGridLayoutManager;
        TimeInterpolator interpolator = new ValueAnimator().getInterpolator();
        0qQ.A07(interpolator);
        this.A00 = interpolator;
    }
}
