package X;

/* renamed from: X.Wdb  reason: case insensitive filesystem */
public final class C19673Wdb implements C315616kD {
    public final int A00;
    public final Object A01;

    public C19673Wdb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01d2, code lost:
        X.0mq.A04(r2, (int) (r1 * ((float) r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01d8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01d9, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01e0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DaF(X.C294975nL r18, float r19) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x01c2;
                case 1: goto L_0x0146;
                case 2: goto L_0x0134;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c1
            java.lang.Object r0 = r1.A01
            X.Wps r0 = (X.C20353Wps) r0
            X.WJp r9 = r0.A06
            boolean r0 = r9.A09
            if (r0 != 0) goto L_0x01c1
            r4 = 1
            r9.A09 = r4
            X.VaI r8 = r9.A03
            if (r8 != 0) goto L_0x00a9
            android.view.ViewGroup r2 = r9.A00
            r2.getClass()
            r1 = 2131231454(0x7f0802de, float:1.807899E38)
            r0 = 2131231455(0x7f0802df, float:1.8078991E38)
            int[] r0 = new int[]{r1, r0}
            X.VaI r8 = new X.VaI
            r8.<init>(r2, r0)
            r2 = 1031127695(0x3d75c28f, float:0.06)
            r1 = 1036831949(0x3dcccccd, float:0.1)
            android.view.ViewGroup r0 = r8.A02
            android.content.Context r12 = r0.getContext()
            float r3 = X.0nA.A00(r12, r2)
            float r2 = X.0nA.A00(r12, r1)
            java.util.ArrayList r11 = r8.A03
            java.util.Iterator r1 = r11.iterator()
        L_0x004d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.Vct r0 = (X.C17724Vct) r0
            r0.A05 = r3
            r0.A04 = r2
            goto L_0x004d
        L_0x005e:
            r10 = 921362827(0x36eae18b, float:7.0E-6)
            java.util.Iterator r14 = r11.iterator()
        L_0x0065:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r7 = r14.next()
            X.Vct r7 = (X.C17724Vct) r7
            float r2 = X.0nA.A00(r12, r10)
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r0 = X.C13989Tnp.A00(r0)
            float r5 = (float) r0
            double r2 = (double) r2
            double r5 = (double) r5
            double r0 = java.lang.Math.cos(r5)
            double r0 = r0 * r2
            float r13 = (float) r0
            r7.A00 = r13
            double r0 = java.lang.Math.sin(r5)
            double r2 = r2 * r0
            float r0 = (float) r2
            r7.A01 = r0
            goto L_0x0065
        L_0x0092:
            r2 = 2000(0x7d0, float:2.803E-42)
            java.util.Iterator r1 = r11.iterator()
        L_0x0098:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r0 = r1.next()
            X.Vct r0 = (X.C17724Vct) r0
            r0.A09 = r2
            goto L_0x0098
        L_0x00a7:
            r9.A03 = r8
        L_0x00a9:
            android.view.ViewGroup r3 = r9.A00
            r3.getClass()
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r7 = 2
            int[] r2 = new int[r7]
            r3.getLocationInWindow(r2)
            r6 = 0
            r16 = r2[r6]
            int r0 = r3.getWidth()
            int r0 = r0 / r7
            int r16 = r16 + r0
            int[] r1 = r8.A05
            r0 = r1[r6]
            int r16 = r16 - r0
            r15 = r2[r4]
            int r0 = r3.getHeight()
            int r0 = r0 / r7
            int r15 = r15 + r0
            r0 = r1[r4]
            int r15 = r15 - r0
            java.util.ArrayList r11 = r8.A03
            java.util.Iterator r14 = r11.iterator()
        L_0x00da:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r10 = r14.next()
            X.Vct r10 = (X.C17724Vct) r10
            java.util.Random r2 = r8.A04
            android.graphics.Bitmap r1 = r10.A0C
            int r0 = r1.getWidth()
            int r0 = r0 / 2
            int r0 = r16 - r0
            r10.A0A = r0
            int r0 = r1.getHeight()
            int r0 = r0 / 2
            int r1 = r15 - r0
            r10.A0B = r1
            int r0 = r10.A0A
            float r0 = (float) r0
            r10.A02 = r0
            float r0 = (float) r1
            r10.A03 = r0
            r0 = 255(0xff, float:3.57E-43)
            r10.A08 = r0
            float r3 = r2.nextFloat()
            float r1 = r10.A04
            float r0 = r10.A05
            float r1 = r1 - r0
            float r3 = r3 * r1
            float r3 = r3 + r0
            r0 = 360(0x168, float:5.04E-43)
            int r0 = r2.nextInt(r0)
            double r0 = (double) r0
            double r0 = X.C13989Tnp.A00(r0)
            float r2 = (float) r0
            double r4 = (double) r3
            double r2 = (double) r2
            double r0 = java.lang.Math.cos(r2)
            double r0 = r0 * r4
            float r13 = (float) r0
            r10.A06 = r13
            double r0 = java.lang.Math.sin(r2)
            double r4 = r4 * r0
            float r0 = (float) r4
            r10.A07 = r0
            goto L_0x00da
        L_0x0134:
            java.lang.Object r2 = r1.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            float r1 = r2.getAlpha()
            int r0 = r2.getShadowColor()
            int r0 = android.graphics.Color.alpha(r0)
            goto L_0x01d2
        L_0x0146:
            java.lang.Object r3 = r1.A01
            X.Uh3 r3 = (X.C15697Uh3) r3
            java.lang.Integer r0 = r3.A09
            int r2 = r0.intValue()
            java.lang.String r1 = "rootView"
            r0 = 1
            if (r2 == r0) goto L_0x016f
            r0 = 2
            if (r2 != r0) goto L_0x01c1
            boolean r0 = r3.A0U
            if (r0 != 0) goto L_0x01c1
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r3.A07
            if (r2 == 0) goto L_0x01d9
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r19
            r0 = 1132462080(0x43800000, float:256.0)
            float r4 = r1 * r0
        L_0x0168:
            int r0 = (int) r4
            int r0 = r0 << 24
            r2.setBackgroundColor(r0)
            return
        L_0x016f:
            boolean r0 = r3.A0U
            if (r0 != 0) goto L_0x01c1
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r3.A07
            if (r2 == 0) goto L_0x01d9
            r0 = 1132462080(0x43800000, float:256.0)
            float r4 = r19 * r0
            goto L_0x0168
        L_0x017c:
            android.view.ViewGroup r2 = r8.A02
            android.content.Context r1 = r2.getContext()
            X.U37 r0 = new X.U37
            r0.<init>(r1, r8, r11)
            r8.A01 = r0
            r2.addView(r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r2 = 2000(0x7d0, float:2.803E-42)
            int[] r2 = new int[]{r6, r2}
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            r8.A00 = r2
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r8.A00
            r0 = 10
            X.W4Q.A00(r1, r8, r0)
            android.animation.ValueAnimator r1 = r8.A00
            X.W3z r0 = new X.W3z
            r0.<init>(r8, r7)
            r1.addListener(r0)
            android.animation.ValueAnimator r0 = r8.A00
            r0.setInterpolator(r12)
            android.animation.ValueAnimator r0 = r8.A00
            r0.start()
            android.view.ViewGroup r1 = r9.A00
            r1.getClass()
            r0 = 4
            r1.setVisibility(r0)
        L_0x01c1:
            return
        L_0x01c2:
            java.lang.Object r0 = r1.A01
            X.W2i r0 = (X.W2i) r0
            android.widget.TextView r2 = r0.A03
            java.lang.String r1 = "instructionTextView"
            if (r2 == 0) goto L_0x01d9
            float r1 = r2.getAlpha()
            int r0 = r0.A00
        L_0x01d2:
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            X.0mq.A04(r2, r0)
            return
        L_0x01d9:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19673Wdb.DaF(X.5nL, float):void");
    }
}
