package X;

import android.os.HandlerThread;
import java.util.Map;

public final class M9R implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ HandlerThread A01;
    public final /* synthetic */ C63891LAu A02;
    public final /* synthetic */ Map A03;

    public M9R(HandlerThread handlerThread, C63891LAu lAu, Map map, int i) {
        this.A03 = map;
        this.A02 = lAu;
        this.A00 = i;
        this.A01 = handlerThread;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0134, code lost:
        if (r2 != null) goto L_0x0136;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r37 = this;
            r11 = r37
            java.util.Map r0 = r11.A03
            java.util.Iterator r19 = X.AnonymousClass7TF.A0u(r0)
        L_0x0008:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r8 = X.C51971G9r.A0p(r19)
            java.util.List r8 = (java.util.List) r8
            X.LAu r7 = r11.A02
            int r10 = r11.A00
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r8.iterator()
        L_0x0020:
            boolean r0 = r4.hasNext()
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0041
            int r1 = X.AnonymousClass7TG.A0F(r4)
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.util.List r0 = r7.A08
            java.lang.Object r0 = r0.get(r1)
            double r0 = X.JTO.A00(r0)
            double r2 = r2 * r0
            long r0 = (long) r2
            X.AnonymousClass7TE.A1Y(r9, r0)
            goto L_0x0020
        L_0x0041:
            android.content.Context r0 = r7.A02
            r21 = r0
            com.instagram.common.session.UserSession r0 = r7.A03
            r28 = r0
            X.L7u r1 = r7.A04
            java.lang.String r0 = r1.A02
            java.io.File r18 = X.AnonymousClass7TE.A0t(r0)
            long r5 = r1.A01
            long r5 = r5 * r2
            X.Ml0 r15 = X.JYY.A00(r28)
            X.9Ta r12 = r7.A06
            r14 = 0
            r4 = 1
            r0 = 7
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r9.get(r14)
            long r2 = X.AnonymousClass7TE.A0R(r0)
            r16 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 - r16
            r0 = 0
            long r2 = java.lang.Math.max(r0, r2)
            int r0 = r9.size()
            int r0 = r0 - r4
            java.lang.Object r0 = r9.get(r0)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r0 = r0 + r16
            long r32 = java.lang.Math.min(r0, r5)
            X.M0n r0 = new X.M0n
            r0.<init>(r9, r2)
            com.instagram.common.session.UserSession r1 = r12.A00     // Catch:{ RuntimeException -> 0x00fb }
            r9 = r18
            com.instagram.pendingmedia.model.ClipInfo r13 = X.Q0X.A02(r1, r9, r5)     // Catch:{ RuntimeException -> 0x00fb }
            int r6 = r13.A09     // Catch:{ RuntimeException -> 0x00fb }
            int r5 = r13.A06     // Catch:{ RuntimeException -> 0x00fb }
            android.graphics.Point r12 = new android.graphics.Point     // Catch:{ RuntimeException -> 0x00fb }
            r12.<init>(r6, r5)     // Catch:{ RuntimeException -> 0x00fb }
            int r6 = r12.x     // Catch:{ RuntimeException -> 0x00fb }
            if (r6 <= r10) goto L_0x00a9
            int r5 = r12.y     // Catch:{ RuntimeException -> 0x00fb }
            int r5 = r5 * r10
            int r5 = r5 / r6
            android.graphics.Point r12 = new android.graphics.Point     // Catch:{ RuntimeException -> 0x00fb }
            r12.<init>(r10, r5)     // Catch:{ RuntimeException -> 0x00fb }
        L_0x00a9:
            int r6 = r13.A09     // Catch:{ RuntimeException -> 0x00fb }
            int r5 = r13.A06     // Catch:{ RuntimeException -> 0x00fb }
            android.graphics.Point r9 = new android.graphics.Point     // Catch:{ RuntimeException -> 0x00fb }
            r9.<init>(r6, r5)     // Catch:{ RuntimeException -> 0x00fb }
            int r6 = r9.x     // Catch:{ RuntimeException -> 0x00fb }
            if (r6 <= r10) goto L_0x00bf
            int r5 = r9.y     // Catch:{ RuntimeException -> 0x00fb }
            int r5 = r5 * r10
            int r5 = r5 / r6
            android.graphics.Point r9 = new android.graphics.Point     // Catch:{ RuntimeException -> 0x00fb }
            r9.<init>(r10, r5)     // Catch:{ RuntimeException -> 0x00fb }
        L_0x00bf:
            X.JYc r5 = X.C59784JYd.A00(r12, r9, r13)     // Catch:{ RuntimeException -> 0x00fb }
            r6 = r21
            com.instagram.filterkit.filter.VideoFilter r25 = X.AnonymousClass9SY.A00(r6, r1)     // Catch:{ RuntimeException -> 0x00fb }
            X.TtC r26 = X.C14279TtC.A01     // Catch:{ RuntimeException -> 0x00fb }
            X.Q0g r22 = new X.Q0g     // Catch:{ RuntimeException -> 0x00fb }
            r23 = r6
            r24 = r1
            r27 = r5
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ RuntimeException -> 0x00fb }
            android.graphics.Point r1 = r5.A03     // Catch:{ RuntimeException -> 0x00fb }
            int r5 = r1.x     // Catch:{ RuntimeException -> 0x00fb }
            int r1 = r1.y     // Catch:{ RuntimeException -> 0x00fb }
            X.0sn r27 = X.0sn.A00     // Catch:{ RuntimeException -> 0x00fb }
            X.Q0j r20 = new X.Q0j     // Catch:{ RuntimeException -> 0x00fb }
            r23 = r28
            r24 = r15
            r25 = r0
            r26 = r18
            r28 = r5
            r29 = r1
            r30 = r2
            r34 = r14
            r35 = r14
            r36 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r35, r36)     // Catch:{ RuntimeException -> 0x00fb }
            r20.A01()     // Catch:{ RuntimeException -> 0x00fb }
            goto L_0x0107
        L_0x00fb:
            r3 = move-exception
            r1 = 1057(0x421, float:1.481E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "extractMultipleFrames failed"
            X.0kD.A09(r2, r1, r3)
        L_0x0107:
            java.util.List r6 = r0.A00
            r5 = 0
            int r3 = r6.size()
        L_0x010e:
            if (r5 >= r3) goto L_0x0008
            java.lang.Object r2 = r6.get(r5)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L_0x0136
            int r0 = X.DbT.A02(r6, r5)
            r9 = 1
            int r0 = r0 - r4
            int r2 = java.lang.Math.max(r5, r0)
            if (r4 > r2) goto L_0x0156
        L_0x0124:
            int r1 = r5 - r9
            if (r1 < 0) goto L_0x0142
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x0142
        L_0x012e:
            java.lang.Object r2 = r6.get(r1)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x0156
        L_0x0136:
            X.LDw r1 = r7.A05
            int r0 = X.C51971G9r.A0I(r8, r5)
            r1.A00(r0, r2)
        L_0x013f:
            int r5 = r5 + 1
            goto L_0x010e
        L_0x0142:
            int r1 = r5 + r9
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x0151
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x0151
            goto L_0x012e
        L_0x0151:
            if (r9 == r2) goto L_0x0156
            int r9 = r9 + 1
            goto L_0x0124
        L_0x0156:
            java.lang.Object r0 = r8.get(r5)
            X.C51965G9l.A1U(r0)
            goto L_0x013f
        L_0x015e:
            android.os.HandlerThread r0 = r11.A01
            r0.quitSafely()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M9R.run():void");
    }
}
