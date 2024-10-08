package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.6gR  reason: invalid class name and case insensitive filesystem */
public final class C313436gR extends Handler {
    public final /* synthetic */ C313416gP A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C313436gR(Looper looper, C313416gP r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        if (r0 > 0) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r15) {
        /*
            r14 = this;
            X.6gP r2 = r14.A00
            X.4MN r1 = r2.A0M
            if (r1 == 0) goto L_0x0066
            int r0 = r15.what
            r3 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r3) goto L_0x0066
            boolean r0 = r2.A0e
            if (r0 == 0) goto L_0x0066
            java.lang.Object r1 = r15.obj
            X.3uh r0 = r2.A0L
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.A0j
            boolean r0 = X.2PP.A00(r0, r1)
            if (r0 == 0) goto L_0x0066
            boolean r0 = r2.A0X
            if (r0 != 0) goto L_0x0066
            boolean r0 = r2.A0U
            if (r0 != 0) goto L_0x0066
            X.4MN r0 = r2.A0M
            X.4MM r0 = (X.AnonymousClass4MM) r0
            X.4Ms r0 = r0.A09
            X.4Mt r0 = r0.A0I
            long r0 = r0.A07()
            int r7 = (int) r0
            X.4MN r0 = r2.A0M
            X.4MM r0 = (X.AnonymousClass4MM) r0
            X.4Ms r0 = r0.A09
            int r8 = r0.A04()
            X.3uh r6 = r2.A0L
            boolean r0 = r6.A17()
            if (r0 == 0) goto L_0x0051
            X.4ME r4 = r2.A0u
            int r9 = r2.A0B
            X.4Nn r5 = X.C313416gP.A04(r2)
            r4.EH8(r5, r6, r7, r8, r9)
        L_0x0051:
            int r0 = r2.A0B
            int r0 = r0 + 1
            r2.A0B = r0
            android.os.Handler r1 = r2.A0s
            X.3uh r0 = r2.A0L
            java.lang.String r0 = r0.A0j
            android.os.Message r3 = android.os.Message.obtain(r1, r3, r0)
            long r0 = r2.A0p
            r14.sendMessageDelayed(r3, r0)
        L_0x0066:
            return
        L_0x0067:
            boolean r0 = r2.A0Y
            r8 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0071
            r2.A01 = r8
            r2.A0Y = r5
        L_0x0071:
            int r0 = r1.getCurrentPosition()
            float r4 = (float) r0
            r13 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r13
            int r0 = r2.A03
            float r0 = (float) r0
            float r4 = r4 / r0
            X.4MN r0 = r2.A0M
            X.4MM r0 = (X.AnonymousClass4MM) r0
            X.4Ms r0 = r0.A09
            X.4Mt r0 = r0.A0I
            boolean r0 = r0.A0X
            if (r0 != 0) goto L_0x008f
            float r0 = r2.A01
            float r4 = java.lang.Math.max(r0, r4)
        L_0x008f:
            long r6 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r2.A0X
            if (r0 != 0) goto L_0x00d4
            long r0 = r2.A0D
            long r11 = r6 - r0
            r9 = 1500(0x5dc, double:7.41E-321)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00d4
            r2.A0D = r6
            float r0 = r2.A01
            float r3 = r4 - r0
            r2.A01 = r4
            X.6l0 r0 = r2.A0O
            if (r0 == 0) goto L_0x00d4
            r1 = 1097859072(0x41700000, float:15.0)
            int r6 = r2.A03
            float r0 = (float) r6
            float r1 = r1 / r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00bc
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x00bd
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            r1 = 0
            if (r6 >= 0) goto L_0x00c1
            r1 = 1
        L_0x00c1:
            android.content.Context r0 = r2.A0q
            boolean r0 = X.2eO.A00(r0)
            if (r0 == 0) goto L_0x00e1
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x00e1
        L_0x00cd:
            X.6l0 r1 = r2.A0O
            r0 = 8
            r1.EqF(r0)
        L_0x00d4:
            X.3uh r1 = r2.A0L
            if (r1 == 0) goto L_0x00dd
            instagram.features.stories.fragment.ReelViewerFragment r0 = r2.A13
            r0.DaT(r1, r4)
        L_0x00dd:
            r14.sendEmptyMessage(r5)
            return
        L_0x00e1:
            if (r3 != 0) goto L_0x00e5
            if (r1 == 0) goto L_0x00cd
        L_0x00e5:
            X.6l0 r0 = r2.A0O
            r0.EqF(r5)
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313436gR.handleMessage(android.os.Message):void");
    }
}
