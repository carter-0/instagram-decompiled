package androidx.compose.foundation.gestures;

import X.AnonymousClass4D7;
import X.AnonymousClass5WO;
import X.C305096Gn;
import X.GQ9;

public final class ScrollableNestedScrollConnection implements AnonymousClass5WO {
    public boolean A00;
    public final ScrollingLogic A01;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDF, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object DYV(X.AnonymousClass4D7 r6, long r7, long r9) {
        /*
            r5 = this;
            r3 = 0
            boolean r0 = r6 instanceof X.MDF
            if (r0 == 0) goto L_0x004c
            r4 = r6
            X.MDF r4 = (X.MDF) r4
            int r0 = r4.A03
            if (r0 != r3) goto L_0x004c
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r1) goto L_0x0052
            long r9 = r4.A01
            X.0eS.A00(r3)
        L_0x0027:
            X.GQ9 r3 = (X.GQ9) r3
            long r0 = r3.A00
            long r0 = X.GQ9.A02(r9, r0)
        L_0x002f:
            X.GQ9 r2 = new X.GQ9
            r2.<init>(r0)
            return r2
        L_0x0035:
            X.0eS.A00(r3)
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0049
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r5.A01
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r4, r9)
            if (r3 != r2) goto L_0x0027
            return r2
        L_0x0049:
            r0 = 0
            goto L_0x002f
        L_0x004c:
            X.MDF r4 = new X.MDF
            r4.<init>(r5, r6, r3)
            goto L_0x0017
        L_0x0052:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.DYV(X.4D7, long, long):java.lang.Object");
    }

    public final long DYX(long j, long j2, int i) {
        if (!this.A00) {
            return 0;
        }
        ScrollingLogic scrollingLogic = this.A01;
        if (scrollingLogic.A05.CbH()) {
            return 0;
        }
        C305096Gn r2 = scrollingLogic.A05;
        float A012 = scrollingLogic.A01(j2);
        if (scrollingLogic.A07) {
            A012 *= -1.0f;
        }
        float APi = r2.APi(A012);
        if (scrollingLogic.A07) {
            APi *= -1.0f;
        }
        return scrollingLogic.A02(APi);
    }

    public final /* synthetic */ Object DYa(AnonymousClass4D7 r4, long j) {
        return new GQ9(0);
    }

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean z) {
        this.A01 = scrollingLogic;
        this.A00 = z;
    }

    public final /* synthetic */ long DYf(long j, int i) {
        return 0;
    }
}
