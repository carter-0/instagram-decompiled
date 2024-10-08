package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6iv  reason: invalid class name and case insensitive filesystem */
public final class C314836iv {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (X.182.A06(r4, r9, 36322473997969608L) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.182.A06(r4, r9, 36322473997838534L) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (X.182.A06(r4, r9, 36322473998035145L) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r17 = this;
            r2 = r17
            com.instagram.common.session.UserSession r9 = r2.A01
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318015822501632(0x81070b000c1700, double:3.0309976748370815E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 != 0) goto L_0x001e
            r0 = 36322473997838534(0x810b19000128c6, double:3.0338170428717695E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            r16 = 0
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r16 = 1
        L_0x0020:
            r0 = 36318015822567169(0x81070b000d1701, double:3.0309976748785274E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 != 0) goto L_0x0037
            r0 = 36322473998035145(0x810b19000428c9, double:3.033817042996107E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            r15 = 0
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r15 = 1
        L_0x0038:
            r0 = 36318015822632706(0x81070b000e1702, double:3.030997674919973E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            if (r0 != 0) goto L_0x004f
            r0 = 36322473997969608(0x810b19000328c8, double:3.033817042954661E-306)
            boolean r0 = X.182.A06(r4, r9, r0)
            r14 = 0
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r14 = 1
        L_0x0050:
            r0 = 36603948975592429(0x820b19001113ed, double:3.211822952212094E-306)
            long r12 = X.182.A01(r4, r9, r0)
            r0 = 36603948975920110(0x820b19001613ee, double:3.211822952419321E-306)
            long r10 = X.182.A01(r4, r9, r0)
            android.content.Context r0 = r2.A00
            X.0IC r1 = new X.0IC
            r1.<init>(r0)
            java.lang.String r0 = r0.getPackageName()
            X.0I6 r0 = X.0I7.A00(r1, r0)
            long r2 = r0.A00
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r0 = r0.getTimeInMillis()
            long r0 = r0 - r2
            long r6 = r8.toDays(r0)
            r5 = 0
            if (r16 == 0) goto L_0x0093
            r2 = 0
            r1 = 1
            if (r15 == 0) goto L_0x0094
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00bb
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0093
        L_0x0092:
            r5 = 1
        L_0x0093:
            return r5
        L_0x0094:
            if (r14 == 0) goto L_0x0093
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r0 = 36603948975461356(0x820b19000f13ec, double:3.211822952129203E-306)
            long r3 = X.182.A01(r4, r9, r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r0 = r0.getTimeInMillis()
            long r1 = r8.toSeconds(r0)
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0093
            r0 = 7
            long r3 = r3 * r0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0093
            goto L_0x0092
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314836iv.A00():boolean");
    }

    public C314836iv(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }
}
