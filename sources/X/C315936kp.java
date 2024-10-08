package X;

import android.content.Context;

/* renamed from: X.6kp  reason: invalid class name and case insensitive filesystem */
public final class C315936kp {
    public C315966ks A00;
    public C315956kr A01;
    public Integer A02;
    public final C315886kk A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r13 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r11 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r9 != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0096, code lost:
        if (r11 != false) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.view.MotionEvent r18) {
        /*
            r17 = this;
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5 = r17
            r5.A02 = r0
            X.6ks r6 = r5.A00
            if (r6 == 0) goto L_0x0055
            r3 = r18
            r3.getEventTime()
            int r8 = r3.getActionMasked()
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x001c
            android.view.GestureDetector r0 = r6.A08
            r0.onTouchEvent(r3)
        L_0x001c:
            int r2 = r3.getPointerCount()
            int r0 = r3.getButtonState()
            r0 = r0 & 32
            r7 = 1
            r10 = 0
            r13 = 0
            if (r0 == 0) goto L_0x002c
            r13 = 1
        L_0x002c:
            int r12 = r6.A05
            r4 = 2
            if (r12 != r4) goto L_0x0034
            r11 = 1
            if (r13 == 0) goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            if (r8 == r7) goto L_0x003d
            r0 = 3
            if (r8 == r0) goto L_0x003d
            r9 = 0
            if (r11 == 0) goto L_0x003e
        L_0x003d:
            r9 = 1
        L_0x003e:
            r1 = 0
            if (r8 == 0) goto L_0x0043
            if (r9 == 0) goto L_0x0070
        L_0x0043:
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0065
            X.6kr r0 = r6.A0D
            r0.A00()
            r6.A09 = r10
            r6.A04 = r1
            r6.A05 = r10
            r12 = 0
        L_0x0053:
            if (r9 == 0) goto L_0x0070
        L_0x0055:
            java.lang.Integer r0 = r5.A02
            if (r0 == 0) goto L_0x0063
            int r1 = r0.intValue()
            r2 = 1
            if (r1 == r2) goto L_0x0064
            r0 = 2
            if (r1 == r0) goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            return r2
        L_0x0065:
            if (r12 == 0) goto L_0x0053
            if (r9 == 0) goto L_0x0070
            r6.A09 = r10
            r6.A04 = r1
            r6.A05 = r10
            goto L_0x0055
        L_0x0070:
            boolean r0 = r6.A09
            if (r0 != 0) goto L_0x008c
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x008c
            if (r12 != 0) goto L_0x008c
            if (r13 == 0) goto L_0x008c
            float r0 = r3.getX()
            r6.A00 = r0
            float r0 = r3.getY()
            r6.A01 = r0
            r6.A05 = r4
            r6.A04 = r1
        L_0x008c:
            r9 = 6
            if (r8 == 0) goto L_0x0098
            if (r8 == r9) goto L_0x0098
            r0 = 5
            if (r8 == r0) goto L_0x0098
            r16 = 0
            if (r11 == 0) goto L_0x009a
        L_0x0098:
            r16 = 1
        L_0x009a:
            if (r8 != r9) goto L_0x00e2
            int r14 = r3.getActionIndex()
            int r13 = r2 + -1
        L_0x00a2:
            int r0 = r6.A05
            if (r0 == 0) goto L_0x00ca
            float r12 = r6.A00
            float r11 = r6.A01
            r3.getY()
        L_0x00ad:
            r9 = 0
            r15 = 0
        L_0x00af:
            if (r15 >= r2) goto L_0x00e5
            if (r14 == r15) goto L_0x00c7
            float r0 = r3.getX(r15)
            float r0 = r0 - r12
            float r0 = java.lang.Math.abs(r0)
            float r1 = r1 + r0
            float r0 = r3.getY(r15)
            float r0 = r0 - r11
            float r0 = java.lang.Math.abs(r0)
            float r9 = r9 + r0
        L_0x00c7:
            int r15 = r15 + 1
            goto L_0x00af
        L_0x00ca:
            r9 = 0
            r12 = 0
            r11 = 0
        L_0x00cd:
            if (r9 >= r2) goto L_0x00de
            if (r14 == r9) goto L_0x00db
            float r0 = r3.getX(r9)
            float r12 = r12 + r0
            float r0 = r3.getY(r9)
            float r11 = r11 + r0
        L_0x00db:
            int r9 = r9 + 1
            goto L_0x00cd
        L_0x00de:
            float r0 = (float) r13
            float r12 = r12 / r0
            float r11 = r11 / r0
            goto L_0x00ad
        L_0x00e2:
            r14 = -1
            r13 = r2
            goto L_0x00a2
        L_0x00e5:
            float r0 = (float) r13
            float r1 = r1 / r0
            float r9 = r9 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            float r9 = r9 * r0
            int r0 = r6.A05
            if (r0 == 0) goto L_0x019a
            r13 = 1
        L_0x00f1:
            boolean r1 = r6.A09
            r2 = r1
            r6.A02 = r12
            r6.A03 = r11
            if (r13 != 0) goto L_0x010f
            if (r1 == 0) goto L_0x010f
            int r0 = r6.A06
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0105
            if (r16 == 0) goto L_0x0113
        L_0x0105:
            X.6kr r0 = r6.A0D
            r0.A00()
            r6.A09 = r10
            r2 = 0
            r6.A04 = r9
        L_0x010f:
            if (r16 == 0) goto L_0x0113
            r6.A04 = r9
        L_0x0113:
            int r0 = r6.A05
            if (r0 == 0) goto L_0x0197
            int r0 = r6.A07
        L_0x0119:
            if (r2 != 0) goto L_0x016d
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x016d
            if (r1 != 0) goto L_0x0130
            float r0 = r6.A04
            float r9 = r9 - r0
            float r1 = java.lang.Math.abs(r9)
            int r0 = r6.A07
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x016d
        L_0x0130:
            X.6kr r0 = r6.A0D
            X.6kp r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A02 = r0
            X.6kk r11 = r1.A03
            float r10 = r6.A02
            float r9 = r6.A03
            X.6kj r0 = r11.A07
            X.6kZ r3 = r0.A00
            X.RBw r12 = r3.A04
            if (r12 == 0) goto L_0x0166
            X.6kY r0 = r3.A0L
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r0.A00
            android.view.ViewParent r0 = r0.getParent()
            r0.requestDisallowInterceptTouchEvent(r7)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r1 = 0
            X.Rwp r0 = new X.Rwp
            r0.<init>(r2, r1, r1, r1)
            r12.A05(r0)
            X.6kT r0 = r3.A06
            if (r0 == 0) goto L_0x0166
            boolean r0 = r3.A0G
            if (r0 != 0) goto L_0x0166
            r3.A0G = r7
        L_0x0166:
            r11.A00 = r10
            r11.A01 = r9
            r6.A09 = r7
            r2 = 1
        L_0x016d:
            if (r8 != r4) goto L_0x0055
            if (r2 == 0) goto L_0x0055
            X.6kr r0 = r6.A0D
            X.6kp r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r1.A02 = r0
            X.6kk r4 = r1.A03
            float r3 = r6.A02
            float r2 = r6.A03
            float r0 = r4.A00
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x018d
            float r0 = r4.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0191
        L_0x018d:
            r4.A00 = r3
            r4.A01 = r2
        L_0x0191:
            r4.A00 = r3
            r4.A01 = r2
            goto L_0x0055
        L_0x0197:
            int r0 = r6.A06
            goto L_0x0119
        L_0x019a:
            r13 = 0
            double r2 = (double) r1
            double r0 = (double) r9
            double r0 = java.lang.Math.hypot(r2, r0)
            float r9 = (float) r0
            goto L_0x00f1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315936kp.A00(android.view.MotionEvent):boolean");
    }

    public C315936kp(Context context, C315886kk r3) {
        this.A03 = r3;
        11Z.A02(new C315946kq(context, this));
    }
}
