package X;

import android.view.GestureDetector;
import android.view.View;

/* renamed from: X.Oke  reason: case insensitive filesystem */
public final class C71439Oke implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C71439Oke(C68177N3s n3s, C68046MzD mzD) {
        this.A00 = 13;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        this.A01 = new GestureDetector(mzD.A04.getContext(), new C67675MsB(4, n3s, mzD));
    }

    public static double A00(2cs r5) {
        r5.A09(C70974OTv.A0D);
        double d = r5.A09.A00;
        return ((double) AnonymousClass1GB.A00(Math.abs(d))) * Math.signum(d);
    }

    public static void A01(View view, int i, Object obj) {
        view.setOnTouchListener(new C71439Oke(obj, i));
    }

    /* JADX WARNING: type inference failed for: r2v20, types: [X.Ps0, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0281, code lost:
        if (r12.getX() >= java.lang.Math.min(r5, r6 + r7)) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a7, code lost:
        if (r12.getX() > java.lang.Math.min((float) r11.getRight(), r5 + r7)) goto L_0x02a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03d2, code lost:
        r0.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        return r0.onTouchEvent(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (r3.A09.A0C() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r2 != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = (android.view.GestureDetector) r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0239, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0240, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x03be;
                case 4: goto L_0x03b1;
                case 5: goto L_0x03a0;
                case 6: goto L_0x022f;
                case 7: goto L_0x02df;
                case 8: goto L_0x02d4;
                case 9: goto L_0x0005;
                case 10: goto L_0x015a;
                case 11: goto L_0x001c;
                case 12: goto L_0x0015;
                case 13: goto L_0x000e;
                case 14: goto L_0x0138;
                case 15: goto L_0x0121;
                case 16: goto L_0x0109;
                case 17: goto L_0x0100;
                case 18: goto L_0x00f1;
                case 19: goto L_0x00c3;
                case 20: goto L_0x00b7;
                case 21: goto L_0x00f1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
        L_0x0009:
            boolean r9 = r0.onTouchEvent(r12)
        L_0x000d:
            return r9
        L_0x000e:
            X.AnonymousClass7TG.A1N(r11, r12)
            r11.performClick()
            goto L_0x0005
        L_0x0015:
            java.lang.Object r0 = r10.A01
            X.OCb r0 = (X.C70579OCb) r0
            android.view.GestureDetector r0 = r0.A00
            goto L_0x0009
        L_0x001c:
            r0 = 1
            X.0qQ.A0B(r12, r0)
            goto L_0x0005
        L_0x0021:
            if (r12 == 0) goto L_0x03d5
            java.lang.Object r3 = r10.A01
            X.OTv r3 = (X.C70974OTv) r3
            android.view.GestureDetector r0 = r3.A02
            boolean r9 = r0.onTouchEvent(r12)
            int r1 = r12.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L_0x003b
            int r1 = r12.getActionMasked()
            r0 = 3
            if (r1 != r0) goto L_0x000d
        L_0x003b:
            float r4 = r3.A00
            r8 = 0
            r7 = 1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0059
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r3.A01
            long r5 = r5 - r0
            r1 = 150(0x96, double:7.4E-322)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
            X.2cs r0 = r3.A09
            boolean r0 = r0.A0C()
            r2 = 1
            if (r0 != 0) goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            r1 = 1
            if (r2 == 0) goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x006b
            r7 = 0
        L_0x006b:
            if (r2 == 0) goto L_0x0093
            float r2 = r12.getRawX()
            android.view.View r0 = r3.A03
            float r1 = X.AnonymousClass7TE.A02(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            X.2cs r4 = r3.A09
            if (r0 >= 0) goto L_0x008b
            double r2 = A00(r4)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
        L_0x0087:
            r4.A06(r2)
            return r9
        L_0x008b:
            double r2 = A00(r4)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r0
            goto L_0x0087
        L_0x0093:
            if (r1 == 0) goto L_0x009c
            X.2cs r4 = r3.A09
            double r2 = A00(r4)
            goto L_0x0087
        L_0x009c:
            if (r7 == 0) goto L_0x000d
            X.2cs r2 = r3.A09
            X.2co r0 = X.C70974OTv.A0C
            r2.A09(r0)
            android.view.View r0 = r3.A03
            float r0 = X.AnonymousClass7TE.A02(r0)
            float r4 = r4 / r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = java.lang.Math.min(r4, r0)
            double r0 = (double) r0
            r2.A07(r0)
            return r9
        L_0x00b7:
            java.lang.Object r0 = r10.A01
            X.0sP r0 = (X.0sP) r0
            X.0qQ.A0A(r12)
            r0.invoke(r12)
            goto L_0x03d5
        L_0x00c3:
            java.lang.Object r2 = r10.A01
            X.Mep r2 = (X.C66906Mep) r2
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L_0x00ef
            float r0 = r0.getAlpha()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x00d3:
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = X.0qQ.A0I(r1, r0)
            if (r0 == 0) goto L_0x03d5
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x03d5
            r2.A0D()
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x03d5
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r2.A05
            X.0nA.A0N(r0)
            goto L_0x03d5
        L_0x00ef:
            r1 = 0
            goto L_0x00d3
        L_0x00f1:
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x03d5
            java.lang.Object r0 = r10.A01
            X.GME r0 = (X.GME) r0
            r0.A0D()
            goto L_0x03d5
        L_0x0100:
            java.lang.Object r0 = r10.A01
            X.7Gq r0 = (X.C328887Gq) r0
            r0.A01()
            goto L_0x03d5
        L_0x0109:
            if (r12 == 0) goto L_0x03d5
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x0118
            int r1 = r12.getAction()
            r0 = 2
            if (r1 != r0) goto L_0x03d5
        L_0x0118:
            java.lang.Object r0 = r10.A01
            X.Mzn r0 = (X.C68082Mzn) r0
            X.C68082Mzn.A00(r0)
            goto L_0x03d5
        L_0x0121:
            java.lang.Object r0 = r10.A01
            X.PMH r0 = (X.PMH) r0
            X.0eM r0 = r0.A08
            java.lang.Object r0 = r0.getValue()
            X.N1V r0 = (X.N1V) r0
            X.0qQ.A0A(r11)
            X.0qQ.A0A(r12)
            r0.onTouch(r11, r12)
            goto L_0x03d5
        L_0x0138:
            int r0 = r12.getAction()
            if (r0 != 0) goto L_0x03d5
            java.lang.Object r1 = r10.A01
            X.PMH r1 = (X.PMH) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x03d5
            X.OK6 r0 = r1.A00()
            X.Nee r0 = r0.A00
            X.Ocu r3 = r0.A04
            X.PMj r2 = new X.PMj
            r2.<init>()
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.A06(r2, r0)
            goto L_0x03d5
        L_0x015a:
            int r2 = r12.getAction()
            r8 = 0
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L_0x0249
            if (r2 == r1) goto L_0x02c8
            r0 = 2
            if (r2 == r0) goto L_0x016d
            r0 = 3
            if (r2 == r0) goto L_0x02c8
            goto L_0x03af
        L_0x016d:
            java.lang.Object r4 = r10.A01
            X.NIm r4 = (X.C68448NIm) r4
            com.instagram.direct.voice.view.VoiceMessageTrimFrame r0 = X.C68448NIm.A01(r4)
            android.graphics.RectF r6 = r0.A01
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x01b7
            float r1 = r12.getX()
            float r0 = r6.right
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b7
            com.instagram.direct.voice.view.VoiceMessageTrimFrame r3 = X.C68448NIm.A01(r4)
            X.0eM r5 = r4.A0D
            float r1 = X.C66582MXn.A00(r5)
            float r0 = r12.getX()
            float r2 = java.lang.Math.max(r1, r0)
            float r1 = r6.right
            android.graphics.RectF r0 = r3.A01
            r0.left = r2
            r0.right = r1
            r3.postInvalidateOnAnimation()
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r3 = X.C68448NIm.A00(r4)
            float r2 = r6.left
            float r0 = X.C66582MXn.A00(r5)
            float r2 = r2 - r0
            float r1 = r6.right
            float r0 = X.C66582MXn.A00(r5)
            float r1 = r1 - r0
            r3.A03(r2, r1)
        L_0x01b7:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x01fc
            float r1 = r12.getX()
            float r0 = r6.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fc
            com.instagram.direct.voice.view.VoiceMessageTrimFrame r3 = X.C68448NIm.A01(r4)
            float r2 = r6.left
            float r1 = X.AnonymousClass7TE.A02(r11)
            X.0eM r5 = r4.A0D
            float r0 = X.C66582MXn.A00(r5)
            float r1 = r1 - r0
            float r0 = r12.getX()
            float r1 = java.lang.Math.min(r1, r0)
            android.graphics.RectF r0 = r3.A01
            r0.left = r2
            r0.right = r1
            r3.postInvalidateOnAnimation()
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r3 = X.C68448NIm.A00(r4)
            float r2 = r6.left
            float r0 = X.C66582MXn.A00(r5)
            float r2 = r2 - r0
            float r1 = r6.right
            float r0 = X.C66582MXn.A00(r5)
            float r1 = r1 - r0
            r3.A03(r2, r1)
        L_0x01fc:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x03af
            float r1 = r12.getX()
            float r0 = X.AnonymousClass7TE.A02(r11)
            float r1 = r1 / r0
            float r1 = X.C229632nm.A01(r1)
            com.facebook.xapp.messaging.audio.waveforms.VoiceVisualizer r0 = X.C68448NIm.A00(r4)
            r0.setPlaybackPercentage(r1)
            X.7JO r2 = r4.A02
            java.lang.String r0 = "delegate"
            if (r2 == 0) goto L_0x0239
            X.L8d r0 = r2.A04
            if (r0 == 0) goto L_0x03af
            int r0 = r0.A00
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = X.AnonymousClass1GB.A01(r0)
            r2.A00 = r1
            X.7Pg r0 = r2.A08
            r0.A04(r1)
            goto L_0x03af
        L_0x022f:
            java.lang.Object r0 = r10.A01
            X.NIn r0 = (X.C68449NIn) r0
            com.instagram.common.ui.base.IgEditText r0 = r0.A0H
            if (r0 != 0) goto L_0x0241
            java.lang.String r0 = "noteEditText"
        L_0x0239:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0241:
            X.C69979NvJ.A00(r0)
            r11.performClick()
            goto L_0x03af
        L_0x0249:
            android.view.ViewParent r0 = r11.getParent()
            if (r0 == 0) goto L_0x0252
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0252:
            java.lang.Object r2 = r10.A01
            X.NIm r2 = (X.C68448NIm) r2
            com.instagram.direct.voice.view.VoiceMessageTrimFrame r0 = X.C68448NIm.A01(r2)
            android.graphics.RectF r4 = r0.A01
            float r6 = r4.left
            float r5 = r4.right
            X.0eM r0 = r2.A0D
            float r7 = X.C66582MXn.A00(r0)
            float r1 = r12.getX()
            float r0 = r6 - r7
            float r0 = java.lang.Math.max(r8, r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0283
            float r1 = r12.getX()
            float r0 = r6 + r7
            float r0 = java.lang.Math.min(r5, r0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0284
        L_0x0283:
            r0 = 0
        L_0x0284:
            r2.A05 = r0
            if (r0 != 0) goto L_0x02a9
            float r1 = r12.getX()
            float r0 = r5 - r7
            float r0 = java.lang.Math.max(r6, r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a9
            float r1 = r12.getX()
            int r0 = r11.getRight()
            float r0 = (float) r0
            float r5 = r5 + r7
            float r0 = java.lang.Math.min(r0, r5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x02aa
        L_0x02a9:
            r1 = 0
        L_0x02aa:
            r2.A06 = r1
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x02d0
            if (r1 != 0) goto L_0x02d0
            float r1 = r12.getX()
            float r0 = r4.left
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02d0
            float r1 = r12.getX()
            float r0 = r4.right
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d0
            r3 = 1
            goto L_0x02d0
        L_0x02c8:
            java.lang.Object r2 = r10.A01
            X.NIm r2 = (X.C68448NIm) r2
            r2.A05 = r3
            r2.A06 = r3
        L_0x02d0:
            r2.A07 = r3
            goto L_0x03af
        L_0x02d4:
            java.lang.Object r1 = r10.A01
            X.OMu r1 = (X.C70822OMu) r1
            X.0sn r0 = X.0sn.A00
            r1.A01(r0)
            goto L_0x03d5
        L_0x02df:
            int r1 = r12.getActionMasked()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0383
            r4 = 0
            if (r1 == r3) goto L_0x0362
            r0 = 2
            if (r1 == r0) goto L_0x02f2
            r0 = 3
            if (r1 == r0) goto L_0x0362
            goto L_0x03d5
        L_0x02f2:
            java.lang.Object r7 = r10.A01
            X.OcD r7 = (X.C71091OcD) r7
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x03d5
            float r1 = r7.A00
            float r0 = r12.getRawX()
            float r1 = r1 - r0
            int r0 = r7.A0A
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x03d5
            int r0 = r7.A01
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0360
            android.view.View r1 = r7.A04
            if (r1 == 0) goto L_0x0316
            r1.performClick()
        L_0x0316:
            r7.A07 = r2
            if (r1 == 0) goto L_0x031e
            r0 = 6
            r1.performHapticFeedback(r0)
        L_0x031e:
            com.instagram.common.session.UserSession r2 = r7.A0F
            X.1Av r1 = X.1Au.A00(r2)
            X.0s0 r0 = r1.A11
            X.0YZ[] r6 = X.1Av.A8a
            r5 = 159(0x9f, float:2.23E-43)
            int r1 = X.DbY.A03(r1, r0, r6, r5)
            r0 = 3
            if (r1 >= r0) goto L_0x0342
            X.1Av r3 = X.1Au.A00(r2)
            int r0 = r1 + 1
            X.0s0 r2 = r3.A11
            r1 = r6[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.Epx(r3, r0, r1)
        L_0x0342:
            int r0 = r7.A01
            float r0 = (float) r0
            float r3 = r0 + r4
            android.view.View r2 = r7.A04
            if (r2 == 0) goto L_0x03af
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r0
            float r1 = r1 - r4
            r2.setAlpha(r1)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = (int) r3
            r1.width = r0
            r2.setLayoutParams(r1)
            goto L_0x03af
        L_0x0360:
            r4 = r1
            goto L_0x0342
        L_0x0362:
            java.lang.Object r3 = r10.A01
            X.OcD r3 = (X.C71091OcD) r3
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x03d5
            r3.A07 = r2
            r3.A00 = r4
            android.view.View r2 = r3.A04
            if (r2 == 0) goto L_0x03d5
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r3.A01
            r1.width = r0
            r2.setLayoutParams(r1)
            goto L_0x03d5
        L_0x0383:
            java.lang.Object r1 = r10.A01
            X.OcD r1 = (X.C71091OcD) r1
            float r0 = r12.getRawX()
            r1.A00 = r0
            r1.A07 = r3
            int r0 = r1.A01
            if (r0 != 0) goto L_0x03d5
            android.view.View r0 = r1.A04
            if (r0 == 0) goto L_0x039e
            int r0 = r0.getWidth()
        L_0x039b:
            r1.A01 = r0
            goto L_0x03d5
        L_0x039e:
            r0 = 0
            goto L_0x039b
        L_0x03a0:
            r0 = 1
            X.0qQ.A0B(r12, r0)
            java.lang.Object r0 = r10.A01
            X.OG1 r0 = (X.OG1) r0
            android.view.GestureDetector r0 = r0.A00
            if (r0 == 0) goto L_0x03af
            r0.onTouchEvent(r12)
        L_0x03af:
            r9 = 1
            return r9
        L_0x03b1:
            java.lang.Object r1 = r10.A01
            X.NJZ r1 = (X.NJZ) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x03d5
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r1.A0A
            if (r0 == 0) goto L_0x03d5
            goto L_0x03d2
        L_0x03be:
            java.lang.Object r2 = r10.A01
            X.NJq r2 = (X.NJq) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x03d5
            int r1 = r12.getAction()
            r0 = 2
            if (r1 != r0) goto L_0x03d5
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r2.A0A
            r0.getClass()
        L_0x03d2:
            r0.A03()
        L_0x03d5:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71439Oke.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C71439Oke(N4t n4t, C68053MzK mzK, NQC nqc) {
        this.A00 = 11;
        this.A01 = new GestureDetector(DbS.A07(mzK), new C67673Ms9(1, nqc, mzK, n4t));
    }

    public C71439Oke(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
