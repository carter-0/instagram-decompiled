package X;

import java.util.concurrent.Callable;

/* renamed from: X.Ars  reason: case insensitive filesystem */
public final /* synthetic */ class C41312Ars implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C340597lW A01;

    public /* synthetic */ C41312Ars(C340597lW r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c4, code lost:
        if (r0 >= 0) goto L_0x00c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r15 = this;
            X.7lW r4 = r15.A01
            int r2 = r15.A00
            boolean r0 = r4.isConnected()
            if (r0 == 0) goto L_0x00c8
            X.7lu r3 = r4.A0R
            X.7lr r1 = r3.A0J
            java.lang.String r0 = "Can only check if the prepared on the Optic thread"
            r1.A01(r0)
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x00c8
            X.7ou r8 = r4.A07
            if (r8 == 0) goto L_0x00c8
            X.7p0 r1 = r8.A08
            X.7p2 r0 = r8.A06
            X.7p5 r10 = r8.A07
            android.graphics.Rect r7 = r8.A05
            android.graphics.Rect r6 = r8.A04
            java.util.List r9 = r8.A0A
            if (r0 == 0) goto L_0x0037
            if (r10 == 0) goto L_0x0037
            if (r1 == 0) goto L_0x0037
            if (r9 == 0) goto L_0x0037
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0042
            java.util.List r0 = r8.A09
            if (r0 != 0) goto L_0x0042
        L_0x0037:
            X.7ou r0 = r4.A07
            int r0 = r0.A07()
        L_0x003d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0042:
            if (r6 == 0) goto L_0x0037
            if (r7 == 0) goto L_0x0037
            int r0 = r8.A03
            int r1 = java.lang.Math.max(r2, r0)
            int r0 = r8.A02
            int r5 = java.lang.Math.min(r1, r0)
            int r0 = r8.A07()
            if (r5 == r0) goto L_0x0037
            float r11 = (float) r5
            int r0 = r8.A03
            float r12 = (float) r0
            int r0 = r8.A02
            float r0 = (float) r0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = X.C342627ou.A01(r11, r12, r0, r2, r1)
            float r13 = r8.A05()
            float r12 = r8.A01
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bd
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00bd
            r13 = 1
        L_0x0076:
            int r0 = r8.A03
            float r12 = (float) r0
            int r0 = r8.A02
            float r0 = (float) r0
            float r11 = X.C342627ou.A01(r11, r12, r0, r2, r1)
            X.7p4 r2 = X.C342717p3.A11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.7p7 r0 = r10.A00
            r0.A01(r2, r1)
            r10.A00()
            X.7p4 r2 = X.C342717p3.A0t
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            X.7p7 r0 = r10.A00
            r0.A01(r2, r1)
            r10.A00()
            boolean r0 = r8.A0B
            if (r0 != 0) goto L_0x00aa
            float r1 = X.AnonymousClass7TG.A00(r9, r5)
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            X.C342627ou.A02(r7, r6, r1)
        L_0x00aa:
            android.os.Handler r2 = r8.A0E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0 = 1
            android.os.Message r0 = r2.obtainMessage(r0, r5, r0, r1)
            r2.sendMessage(r0)
            X.C342627ou.A03(r4, r3)
            goto L_0x0037
        L_0x00bd:
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00c6
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            r13 = 2
            if (r0 < 0) goto L_0x0076
        L_0x00c6:
            r13 = 0
            goto L_0x0076
        L_0x00c8:
            r0 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41312Ars.call():java.lang.Object");
    }
}
