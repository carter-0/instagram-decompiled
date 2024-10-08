package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IWy  reason: case insensitive filesystem */
public final class C57315IWy implements JOS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C255783ui A04;
    public final /* synthetic */ C309426Yf A05;
    public final /* synthetic */ C309686Zf A06;
    public final /* synthetic */ HDT A07;

    public C57315IWy(View view, UserSession userSession, C255773uh r3, C255783ui r4, C309426Yf r5, C309686Zf r6, HDT hdt, int i) {
        this.A03 = r3;
        this.A05 = r5;
        this.A02 = userSession;
        this.A07 = hdt;
        this.A04 = r4;
        this.A06 = r6;
        this.A01 = view;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r0.A5n() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D2i(android.view.MotionEvent r15) {
        /*
            r14 = this;
            X.3uh r6 = r14.A03
            X.6Yf r2 = r14.A05
            com.instagram.common.session.UserSession r5 = r14.A02
            boolean r0 = r6.A1I()
            if (r0 != 0) goto L_0x002a
            boolean r0 = r6.A1M()
            if (r0 != 0) goto L_0x002a
        L_0x0012:
            X.3ui r2 = r14.A04
            float r0 = r15.getRawX()
            r2.A03 = r0
            float r1 = r15.getRawY()
            int r0 = r14.A00
            float r0 = (float) r0
            float r1 = r1 - r0
            r2.A04 = r1
            X.6Zf r0 = r14.A06
            r0.DL3(r2)
            return
        L_0x002a:
            boolean r0 = r6.A1O()
            if (r0 != 0) goto L_0x0012
            X.3mL r1 = r6.A0e
            X.3mL r0 = X.C250963mL.MEDIA
            if (r1 != r0) goto L_0x0042
            X.1Xj r0 = r6.A0b
            r0.getClass()
            boolean r0 = r0.A5n()
            if (r0 == 0) goto L_0x0042
            goto L_0x0012
        L_0x0042:
            X.0Tu r4 = X.0Tu.A06
            r0 = 36328538491796896(0x81109d00033da0, double:3.037652253270795E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0012
            boolean r0 = r6.A1I()
            if (r0 == 0) goto L_0x00ec
            r0 = 36610013468432341(0x82109d000217d5, double:3.215658161903807E-306)
        L_0x005a:
            int r7 = X.DbS.A04(r4, r5, r0)
            if (r7 <= 0) goto L_0x0012
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r2.A0P
            long r0 = r0 - r2
            double r2 = (double) r0
            double r0 = (double) r7
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0012
            X.HDT r0 = r14.A07
            int r8 = r0.A01
            double r2 = r0.A00
            r7 = 1
            boolean r0 = r6.A1M()
            if (r0 == 0) goto L_0x00c0
            r0 = 36328538491862433(0x81109d00043da1, double:3.0376522533122406E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00c0
            r0 = 37172963422110283(0x84109d0006024b, double:3.571669979427253E-306)
            java.lang.Double r9 = X.C51968G9o.A0r(r4, r5, r0)
            r0 = 37172963422175820(0x84109d0007024c, double:3.571669979468699E-306)
        L_0x0093:
            java.lang.Double r0 = X.C51968G9o.A0r(r4, r5, r0)
            X.0eP r9 = X.AnonymousClass7TE.A1L(r9, r0)
        L_0x009b:
            double r0 = (double) r8
            double r12 = r0 - r2
            java.lang.Object r4 = r9.A00
            java.lang.Number r4 = (java.lang.Number) r4
            double r10 = r4.doubleValue()
            double r10 = r10 * r0
            java.lang.Object r4 = r9.A01
            java.lang.Number r4 = (java.lang.Number) r4
            double r8 = r4.doubleValue()
            double r8 = r8 * r0
            double r10 = r10 + r2
            float r0 = r15.getRawX()
            double r0 = (double) r0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x00f9
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x00f9
            goto L_0x0012
        L_0x00c0:
            boolean r0 = r6.A1I()
            if (r0 == 0) goto L_0x00e0
            r0 = 36328538491927970(0x81109d00053da2, double:3.0376522533536865E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00e0
            r0 = 37172963422241357(0x84109d0008024d, double:3.571669979510145E-306)
            java.lang.Double r9 = X.C51968G9o.A0r(r4, r5, r0)
            r0 = 37172963422306894(0x84109d0009024e, double:3.571669979551591E-306)
            goto L_0x0093
        L_0x00e0:
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            X.0eP r9 = new X.0eP
            r9.<init>(r0, r0)
            goto L_0x009b
        L_0x00ec:
            boolean r0 = r6.A1M()
            if (r0 == 0) goto L_0x0012
            r0 = 36610013468366804(0x82109d000117d4, double:3.215658161862361E-306)
            goto L_0x005a
        L_0x00f9:
            double r3 = r12 - r8
            float r0 = r15.getRawX()
            double r1 = (double) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x010a
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x010a
            goto L_0x0012
        L_0x010a:
            X.3ui r0 = r14.A04
            java.lang.Boolean r0 = r0.A1H
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0012
            X.6Zf r3 = r14.A06
            X.2EG r2 = X.2EG.A3x
            float r1 = r15.getRawX()
            float r0 = r15.getRawY()
            r3.DL4(r6, r2, r1, r0)
            X.3Dp r3 = X.C238833Dp.A00(r5)
            android.view.View r2 = r14.A01
            X.3Ds r1 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            java.lang.String r0 = r6.A0k
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r3.A07(r2, r1, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57315IWy.D2i(android.view.MotionEvent):void");
    }
}
