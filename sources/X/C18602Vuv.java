package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Vuv  reason: case insensitive filesystem */
public final class C18602Vuv {
    public static final C18602Vuv A02 = new C18602Vuv();
    public static final AtomicLong A03 = new AtomicLong(0);
    public final 02m A00;
    public final C19854WgZ A01;

    public final void A00(C17941ViW viW, Integer num) {
        ExecutorService BsU;
        0qQ.A0B(viW, 0);
        Integer num2 = num;
        int intValue = num.intValue();
        if (intValue == 1) {
            viW.A03 = this.A00.currentMonotonicTimestamp();
        } else if (intValue == 3) {
            viW.A01 = this.A00.currentMonotonicTimestamp();
        } else if (intValue == 4) {
            viW.A00 = this.A00.currentMonotonicTimestamp();
        } else if (intValue == 2) {
            viW.A02 = this.A00.currentMonotonicTimestamp();
        }
        C19854WgZ wgZ = this.A01;
        C17705Vca A002 = viW.A00();
        C16403UuL uuL = wgZ.A00;
        long currentMonotonicTimestampNanos = ((C16404UuM) uuL.A00).A00.currentMonotonicTimestampNanos();
        if (!uuL.A01.CCO() || (BsU = uuL.A02.BsU()) == null) {
            C16403UuL.A00(A002, uuL, num);
        } else {
            BsU.execute(new C20330WpR(A002, uuL, num2, currentMonotonicTimestampNanos));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C17941ViW r18, java.lang.Integer r19) {
        /*
            r17 = this;
            r0 = 0
            r2 = r18
            X.0qQ.A0B(r2, r0)
            r0 = 1
            r6 = r19
            int r1 = r6.intValue()
            r3 = r17
            if (r1 == r0) goto L_0x007a
            r0 = 2
            if (r1 != r0) goto L_0x001c
            X.02m r0 = r3.A00
            long r0 = r0.currentMonotonicTimestamp()
            r2.A04 = r0
        L_0x001c:
            X.WgZ r0 = r3.A01
            X.Vca r4 = r2.A00()
            X.UuL r5 = r0.A00
            X.Wga r3 = r5.A01
            boolean r0 = r3.BO9()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r4.A09
            if (r0 == 0) goto L_0x0072
            int r9 = r0.hashCode()
            java.lang.Object r1 = r4.A07
            boolean r0 = r1 instanceof com.facebook.common.callercontext.CallerContext
            if (r0 == 0) goto L_0x0078
            com.facebook.common.callercontext.CallerContext r1 = (com.facebook.common.callercontext.CallerContext) r1
        L_0x003c:
            r7 = 0
            if (r1 == 0) goto L_0x0073
            com.facebook.common.callercontext.ContextChain r2 = r1.A00
            if (r2 == 0) goto L_0x0074
            java.util.Map r0 = r2.A01
            if (r0 == 0) goto L_0x0074
            java.lang.String r7 = r0.toString()
        L_0x004b:
            java.lang.String r1 = "feed_unit_id"
            java.util.Map r0 = r2.A01
            r8 = 0
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x005c
            java.lang.String r8 = java.lang.String.valueOf(r0)
        L_0x005c:
            boolean r0 = r3.CCO()
            if (r0 == 0) goto L_0x0083
            X.Wga r0 = r5.A02
            java.util.concurrent.ExecutorService r0 = r0.BsU()
            if (r0 == 0) goto L_0x0083
            X.Wpn r3 = new X.Wpn
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.execute(r3)
        L_0x0072:
            return
        L_0x0073:
            r2 = r7
        L_0x0074:
            if (r2 != 0) goto L_0x004b
            r8 = r7
            goto L_0x005c
        L_0x0078:
            r1 = 0
            goto L_0x003c
        L_0x007a:
            X.02m r0 = r3.A00
            long r0 = r0.currentMonotonicTimestamp()
            r2.A05 = r0
            goto L_0x001c
        L_0x0083:
            int r15 = r3.getMarkerId()
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
            r16 = r9
            X.C16403UuL.A01(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18602Vuv.A01(X.ViW, java.lang.Integer):void");
    }

    public C18602Vuv() {
        02m r0 = 02m.A0p;
        this.A00 = r0;
        0qQ.A07(r0);
        this.A01 = new C19854WgZ(new C16404UuM(r0));
    }
}
