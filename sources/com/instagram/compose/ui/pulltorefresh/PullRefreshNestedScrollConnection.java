package com.instagram.compose.ui.pulltorefresh;

import X.0sL;
import X.0sP;
import X.AnonymousClass4D7;
import X.AnonymousClass5WO;
import X.C289295dM;
import X.C289325dP;
import X.GQ9;

public final class PullRefreshNestedScrollConnection implements AnonymousClass5WO {
    public final 0sP A00;
    public final 0sL A01;

    public final long DYX(long j, long j2, int i) {
        if (i != 1) {
            return 0;
        }
        float A02 = C289295dM.A02(j2);
        if (A02 > 0.0f) {
            return C289325dP.A00(0.0f, ((Number) this.A00.invoke(Float.valueOf(A02))).floatValue());
        }
        return 0;
    }

    public final long DYf(long j, int i) {
        if (i != 1) {
            return 0;
        }
        float A02 = C289295dM.A02(j);
        if (A02 < 0.0f) {
            return C289325dP.A00(0.0f, ((Number) this.A00.invoke(Float.valueOf(A02))).floatValue());
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DYa(X.AnonymousClass4D7 r6, long r7) {
        /*
            r5 = this;
            r3 = 45
            boolean r0 = X.JUG.A03(r3, r6)
            if (r0 == 0) goto L_0x003f
            r4 = r6
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r2) goto L_0x0047
            X.0eS.A00(r1)
        L_0x0024:
            X.GQ9 r3 = X.GQ9.A04()
            return r3
        L_0x0029:
            X.0eS.A00(r1)
            X.0sL r1 = r5.A01
            float r0 = X.C51972G9s.A00(r7)
            java.lang.Float r0 = X.C51965G9l.A0q(r0)
            r4.A00 = r2
            java.lang.Object r0 = r1.invoke(r0, r4)
            if (r0 != r3) goto L_0x0024
            return r3
        L_0x003f:
            r0 = 42
            X.JUG r4 = new X.JUG
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.ui.pulltorefresh.PullRefreshNestedScrollConnection.DYa(X.4D7, long):java.lang.Object");
    }

    public PullRefreshNestedScrollConnection(0sP r1, 0sL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* synthetic */ Object DYV(AnonymousClass4D7 r2, long j, long j2) {
        return GQ9.A04();
    }
}
