package X;

/* renamed from: X.9L1  reason: invalid class name */
public final class AnonymousClass9L1 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9L1(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0190, code lost:
        return r0.A04().requireViewById(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a2, code lost:
        r3 = new int[2];
        r1.getLocationOnScreen(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a8, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c8, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0273, code lost:
        return new X.C305946Ke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b8, code lost:
        r3 = r1.requireViewById(r0);
        X.0qQ.A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bf, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x02c0;
                case 1: goto L_0x02ad;
                case 2: goto L_0x0280;
                case 3: goto L_0x0274;
                case 4: goto L_0x0268;
                case 5: goto L_0x025c;
                case 6: goto L_0x01fa;
                case 7: goto L_0x01f3;
                case 8: goto L_0x01e5;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01a9;
                case 11: goto L_0x019a;
                case 12: goto L_0x0191;
                case 13: goto L_0x0181;
                case 14: goto L_0x0179;
                case 15: goto L_0x0164;
                case 16: goto L_0x015c;
                case 17: goto L_0x0154;
                case 18: goto L_0x014c;
                case 19: goto L_0x0144;
                case 20: goto L_0x013c;
                case 21: goto L_0x0134;
                case 22: goto L_0x012c;
                case 23: goto L_0x0124;
                case 24: goto L_0x011c;
                case 25: goto L_0x0114;
                case 26: goto L_0x010c;
                case 27: goto L_0x0104;
                case 28: goto L_0x00fb;
                case 29: goto L_0x00f2;
                case 30: goto L_0x00e9;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00c2;
                case 34: goto L_0x00b0;
                case 35: goto L_0x00a2;
                case 36: goto L_0x0099;
                case 37: goto L_0x0090;
                case 38: goto L_0x0087;
                case 39: goto L_0x007e;
                case 40: goto L_0x0075;
                case 41: goto L_0x006c;
                case 42: goto L_0x0063;
                case 43: goto L_0x005a;
                case 44: goto L_0x0032;
                case 45: goto L_0x000f;
                case 46: goto L_0x0051;
                case 47: goto L_0x0048;
                case 48: goto L_0x0032;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6bM r3 = new X.6bM
            r3.<init>(r0)
        L_0x000e:
            return r3
        L_0x000f:
            java.lang.Object r0 = r9.A01
            X.6V8 r0 = (X.AnonymousClass6V8) r0
            android.view.View r3 = r0.A00
        L_0x0015:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x000e
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x000e
            android.view.ViewParent r3 = r3.getParent()
            r0 = 0
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            android.view.View r3 = (android.view.View) r3
            goto L_0x0015
        L_0x0032:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131437988(0x7f0b29a4, float:1.849789E38)
            android.view.ViewGroup r0 = r0.A04()
            android.view.View r0 = r0.requireViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r3 = r0.inflate()
            return r3
        L_0x0048:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442278(0x7f0b3a66, float:1.8506591E38)
            goto L_0x0188
        L_0x0051:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442277(0x7f0b3a65, float:1.850659E38)
            goto L_0x0188
        L_0x005a:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442276(0x7f0b3a64, float:1.8506587E38)
            goto L_0x0188
        L_0x0063:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442275(0x7f0b3a63, float:1.8506585E38)
            goto L_0x0188
        L_0x006c:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442464(0x7f0b3b20, float:1.8506969E38)
            goto L_0x0188
        L_0x0075:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442470(0x7f0b3b26, float:1.850698E38)
            goto L_0x0188
        L_0x007e:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442274(0x7f0b3a62, float:1.8506583E38)
            goto L_0x0188
        L_0x0087:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442463(0x7f0b3b1f, float:1.8506967E38)
            goto L_0x0188
        L_0x0090:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442273(0x7f0b3a61, float:1.8506581E38)
            goto L_0x0188
        L_0x0099:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442465(0x7f0b3b21, float:1.850697E38)
            goto L_0x0188
        L_0x00a2:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            android.view.ViewGroup r0 = r0.A04()
            X.6V8 r3 = new X.6V8
            r3.<init>(r0)
            return r3
        L_0x00b0:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            X.3oV r0 = r0.A07
            android.view.View r1 = r0.getView()
            r0 = 2131439586(0x7f0b2fe2, float:1.8501131E38)
            android.view.View r3 = r1.requireViewById(r0)
            return r3
        L_0x00c2:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            X.3oV r0 = r0.A07
            android.view.View r1 = r0.getView()
            r0 = 2131439705(0x7f0b3059, float:1.8501373E38)
            goto L_0x02b8
        L_0x00d1:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            X.3oV r0 = r0.A07
            android.view.View r1 = r0.getView()
            r0 = 2131435633(0x7f0b2071, float:1.8493114E38)
            goto L_0x02b8
        L_0x00e0:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442266(0x7f0b3a5a, float:1.8506567E38)
            goto L_0x0188
        L_0x00e9:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442265(0x7f0b3a59, float:1.8506565E38)
            goto L_0x0188
        L_0x00f2:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442264(0x7f0b3a58, float:1.8506563E38)
            goto L_0x0188
        L_0x00fb:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442263(0x7f0b3a57, float:1.850656E38)
            goto L_0x0188
        L_0x0104:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442261(0x7f0b3a55, float:1.8506557E38)
            goto L_0x0188
        L_0x010c:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442252(0x7f0b3a4c, float:1.8506539E38)
            goto L_0x0188
        L_0x0114:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442251(0x7f0b3a4b, float:1.8506537E38)
            goto L_0x0188
        L_0x011c:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442250(0x7f0b3a4a, float:1.8506535E38)
            goto L_0x0188
        L_0x0124:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442249(0x7f0b3a49, float:1.8506533E38)
            goto L_0x0188
        L_0x012c:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442240(0x7f0b3a40, float:1.8506514E38)
            goto L_0x0188
        L_0x0134:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442235(0x7f0b3a3b, float:1.8506504E38)
            goto L_0x0188
        L_0x013c:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442229(0x7f0b3a35, float:1.8506492E38)
            goto L_0x0188
        L_0x0144:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442228(0x7f0b3a34, float:1.850649E38)
            goto L_0x0188
        L_0x014c:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442227(0x7f0b3a33, float:1.8506488E38)
            goto L_0x0188
        L_0x0154:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442226(0x7f0b3a32, float:1.8506486E38)
            goto L_0x0188
        L_0x015c:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442225(0x7f0b3a31, float:1.8506484E38)
            goto L_0x0188
        L_0x0164:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            X.3oV r0 = r0.A07
            android.view.View r1 = r0.getView()
            r0 = 2131442224(0x7f0b3a30, float:1.8506482E38)
            android.view.View r3 = r1.requireViewById(r0)
            X.0qQ.A07(r3)
            return r3
        L_0x0179:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442222(0x7f0b3a2e, float:1.8506478E38)
            goto L_0x0188
        L_0x0181:
            java.lang.Object r0 = r9.A01
            X.6Uv r0 = (X.C308586Uv) r0
            r1 = 2131442217(0x7f0b3a29, float:1.8506468E38)
        L_0x0188:
            android.view.ViewGroup r0 = r0.A04()
            android.view.View r3 = r0.requireViewById(r1)
            return r3
        L_0x0191:
            java.lang.Object r0 = r9.A01
            X.6Ot r0 = (X.C307086Ot) r0
            android.widget.TextView r1 = r0.A01()
            goto L_0x01a2
        L_0x019a:
            java.lang.Object r0 = r9.A01
            X.6Ot r0 = (X.C307086Ot) r0
            android.widget.ImageView r1 = r0.A00()
        L_0x01a2:
            r0 = 2
            int[] r3 = new int[r0]
            r1.getLocationOnScreen(r3)
            return r3
        L_0x01a9:
            java.lang.Object r0 = r9.A01
            X.6ML r0 = (X.AnonymousClass6ML) r0
            X.A88 r0 = r0.A0E
            java.lang.String r1 = r0.A0A
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = X.0nH.A0C(r1, r0)
            goto L_0x01c4
        L_0x01b8:
            java.lang.Object r0 = r9.A01
            X.6ML r0 = (X.AnonymousClass6ML) r0
            X.A88 r1 = r0.A0E
            java.lang.String r0 = r1.A08
            r4 = -1
            if (r0 != 0) goto L_0x01c9
            r0 = -1
        L_0x01c4:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x01c9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r2 = r1.A09
            r1 = 1
            if (r2 == 0) goto L_0x01dc
            int r0 = r2.length()
            if (r0 == 0) goto L_0x01dc
            r3.insert(r1, r2)
        L_0x01dc:
            java.lang.String r0 = r3.toString()
            int r0 = X.0nH.A0C(r0, r4)
            goto L_0x01c4
        L_0x01e5:
            java.lang.Object r0 = r9.A01
            X.6Lb r0 = (X.C306166Lb) r0
            android.content.Context r1 = r0.A06
            android.view.GestureDetector$OnGestureListener r0 = r0.A08
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r1, r0)
            return r3
        L_0x01f3:
            java.lang.Object r0 = r9.A01
            X.6Pi r0 = (X.C307236Pi) r0
            X.6Ot r0 = r0.A09
            goto L_0x026e
        L_0x01fa:
            java.lang.Object r5 = r9.A01
            X.6Kg r5 = (X.C305966Kg) r5
            X.6Oy r8 = r5.A01
            X.3oV r0 = r8.A05
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x025a
            boolean r0 = r8.A06
            if (r0 == 0) goto L_0x025a
            r7 = 2
            float[] r0 = new float[r7]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r0)
            long r3 = r8.A03
            r6.setStartDelay(r3)
            r0 = 300(0x12c, double:1.48E-321)
            r6.setDuration(r0)
            r1 = 13
            X.AJX r0 = new X.AJX
            r0.<init>(r8, r1)
            r6.addUpdateListener(r0)
            int[] r0 = new int[r7]
            r0 = {0, 1} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r2.setStartDelay(r3)
            r0 = 0
            r2.setDuration(r0)
            X.AJV r0 = new X.AJV
            r0.<init>(r7, r2, r8)
            r2.addUpdateListener(r0)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.AnimatorSet$Builder r0 = r3.play(r6)
            r0.with(r2)
            r1 = 21
            X.U0N r0 = new X.U0N
            r0.<init>(r5, r1)
            r3.addListener(r0)
            return r3
        L_0x025a:
            r3 = 0
            return r3
        L_0x025c:
            java.lang.Object r0 = r9.A01
            X.6Os r0 = (X.C307076Os) r0
            X.6lB r0 = r0.A05
            X.Mfl r3 = new X.Mfl
            r3.<init>(r0)
            return r3
        L_0x0268:
            java.lang.Object r0 = r9.A01
            X.6Os r0 = (X.C307076Os) r0
            X.6Ot r0 = r0.A0A
        L_0x026e:
            X.6Ke r3 = new X.6Ke
            r3.<init>(r0)
            return r3
        L_0x0274:
            java.lang.Object r0 = r9.A01
            X.6Os r0 = (X.C307076Os) r0
            X.6Oy r0 = r0.A07
            X.6Kg r3 = new X.6Kg
            r3.<init>(r0)
            return r3
        L_0x0280:
            java.lang.Object r4 = r9.A01
            android.view.View r4 = (android.view.View) r4
            r3 = r4
            boolean r1 = r4 instanceof android.view.ViewGroup
            r0 = 0
            if (r1 != 0) goto L_0x028b
            r4 = r0
        L_0x028b:
            java.lang.String r2 = "e2e__test_last_reel_item"
            if (r4 == 0) goto L_0x0295
            android.view.View r0 = r4.findViewWithTag(r2)
            if (r0 != 0) goto L_0x02aa
        L_0x0295:
            if (r1 == 0) goto L_0x02aa
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x02aa
            android.content.Context r1 = r3.getContext()
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r1)
            r0.setTag(r2)
            r3.addView(r0)
        L_0x02aa:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x02ad:
            java.lang.Object r0 = r9.A01
            X.6mK r0 = (X.C316856mK) r0
            com.instagram.common.ui.base.IgFrameLayout r1 = r0.A00()
            r0 = 2131441814(0x7f0b3896, float:1.850565E38)
        L_0x02b8:
            android.view.View r3 = r1.requireViewById(r0)
            X.0qQ.A07(r3)
            return r3
        L_0x02c0:
            java.lang.Object r0 = r9.A01
            X.6mK r0 = (X.C316856mK) r0
            X.2eb r0 = r0.A01
            android.view.View r3 = r0.A01()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9L1.invoke():java.lang.Object");
    }
}
