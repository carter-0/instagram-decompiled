package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.JdI  reason: case insensitive filesystem */
public final class C60009JdI extends Handler {
    public final /* synthetic */ KB5 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60009JdI(Looper looper, KB5 kb5) {
        super(looper);
        this.A00 = kb5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r1 <= 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            int r0 = r7.what
            r3 = 1
            if (r0 == r3) goto L_0x0094
            r3 = 2
            if (r0 == r3) goto L_0x004a
            r2 = 3
            if (r0 != r2) goto L_0x0046
            X.KB5 r3 = r6.A00
            X.JdI r0 = r3.A0Q
            boolean r0 = r0.hasMessages(r2)
            if (r0 != 0) goto L_0x0046
            boolean r5 = X.LHq.A01(r3)
            float r4 = r3.A00
            boolean r0 = X.LHq.A01(r3)
            if (r0 == 0) goto L_0x0047
            X.MVz r0 = r3.A0R
            int r1 = r0.Atv()
        L_0x0027:
            int r0 = r3.A0M
            int r0 = r0 / 2
            float r0 = (float) r0
            float r4 = r4 - r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0035
            r0 = 1
            if (r1 > 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r5 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x0046
            int r0 = r3.A01
            int r0 = r0 + -1
            X.KB5.A0B(r3, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r6.sendEmptyMessageDelayed(r2, r0)
        L_0x0046:
            return
        L_0x0047:
            int r1 = r3.A01
            goto L_0x0027
        L_0x004a:
            X.KB5 r2 = r6.A00
            X.JdI r0 = r2.A0Q
            boolean r0 = r0.hasMessages(r3)
            if (r0 != 0) goto L_0x0046
            boolean r1 = X.LHq.A01(r2)
            float r0 = r2.A00
            boolean r0 = X.KB5.A0K(r2, r0)
            if (r1 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0046
            int r0 = r2.A01
            int r0 = r0 + 1
            X.KB5.A0B(r2, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            goto L_0x00a4
        L_0x006c:
            if (r0 == 0) goto L_0x007c
            X.MVz r1 = r3.A0R
            float r0 = r1.CDb()
            r1.EKk(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r6.sendEmptyMessageDelayed(r2, r0)
        L_0x007c:
            X.KB5.A08(r3)
            return
        L_0x0080:
            if (r0 == 0) goto L_0x0090
            X.MVz r1 = r2.A0R
            float r0 = r1.CDb()
            r1.EKe(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r6.sendEmptyMessageDelayed(r3, r0)
        L_0x0090:
            X.KB5.A08(r2)
            return
        L_0x0094:
            X.KB5 r2 = r6.A00
            X.MVz r0 = r2.A0R
            float r1 = r0.CDb()
            r0 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            r0 = 100
        L_0x00a4:
            r6.sendEmptyMessageDelayed(r3, r0)
            return
        L_0x00a8:
            r0 = 0
            r6.removeCallbacksAndMessages(r0)
            r2.A0L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60009JdI.handleMessage(android.os.Message):void");
    }
}
