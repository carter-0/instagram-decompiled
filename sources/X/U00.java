package X;

import java.lang.ref.WeakReference;

public final class U00 implements Runnable {
    public final WeakReference A00;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (r1 >= 20.0f) goto L_0x0087;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.A00
            java.lang.Object r4 = r0.get()
            X.WFX r4 = (X.WFX) r4
            if (r4 == 0) goto L_0x00a9
            X.VLc r0 = r4.A08
            android.view.View r8 = r4.A06
            android.graphics.Rect r7 = r0.A00
            boolean r0 = r8.getGlobalVisibleRect(r7)
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L_0x00b1
            int r0 = r7.height()
            long r5 = (long) r0
            int r0 = r7.width()
            long r0 = (long) r0
            long r5 = r5 * r0
            int r0 = r8.getHeight()
            long r2 = (long) r0
            int r0 = r8.getWidth()
            long r0 = (long) r0
            long r2 = r2 * r0
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            boolean r10 = X.AnonymousClass7TF.A1R(r0)
            r0 = 100
            long r5 = r5 * r0
            float r9 = (float) r5
            r1 = 1103626240(0x41c80000, float:25.0)
            float r0 = (float) r2
            float r0 = r0 * r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            boolean r0 = X.Pxf.A1R(r0)
            if (r10 == 0) goto L_0x00b1
            if (r0 == 0) goto L_0x00b1
            r8.getGlobalVisibleRect(r7)
            int r1 = r7.width()
            r8.getHitRect(r7)
            int r0 = r7.width()
            int r1 = r1 / r0
            float r1 = (float) r1
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r3
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0066
            r1 = 0
        L_0x0066:
            r2 = 1101004800(0x41a00000, float:20.0)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            r8.getGlobalVisibleRect(r7)
            int r1 = r7.height()
            r8.getHitRect(r7)
            int r0 = r7.height()
            int r1 = r1 / r0
            float r1 = (float) r1
            float r1 = r1 * r3
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x00b1
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00b1
        L_0x0087:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
        L_0x0089:
            java.lang.Integer r0 = r4.A02
            if (r0 == r5) goto L_0x00a0
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.V3J r0 = r4.A0A
            com.facebook.quicklog.reliability.UserFlowLogger r3 = r0.A01
            if (r5 != r1) goto L_0x00aa
            if (r3 == 0) goto L_0x009e
            long r1 = r0.A00
            java.lang.String r0 = "map_visible"
        L_0x009b:
            r3.flowMarkPoint(r1, r0)
        L_0x009e:
            r4.A02 = r5
        L_0x00a0:
            android.os.Handler r3 = r4.A05
            X.U00 r2 = r4.A07
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x00a9:
            return
        L_0x00aa:
            if (r3 == 0) goto L_0x009e
            long r1 = r0.A00
            java.lang.String r0 = "map_invisible"
            goto L_0x009b
        L_0x00b1:
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U00.run():void");
    }

    public U00(WFX wfx) {
        this.A00 = new WeakReference(wfx);
    }
}
