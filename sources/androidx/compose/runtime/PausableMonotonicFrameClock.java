package androidx.compose.runtime;

import X.0qQ;
import X.0sL;
import X.AnonymousClass199;
import X.AnonymousClass5PR;
import X.AnonymousClass5PU;
import X.C262084Cb;
import X.C262094Cc;
import X.C634312c;

public final class PausableMonotonicFrameClock implements AnonymousClass5PR {
    public final AnonymousClass5PU A00 = new AnonymousClass5PU();
    public final AnonymousClass5PR A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r0 == r5) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object FNV(X.AnonymousClass4D7 r9, X.0sP r10) {
        /*
            r8 = this;
            r4 = 2
            boolean r0 = X.C376709Ja.A00(r4, r9)
            if (r0 == 0) goto L_0x0081
            r3 = r9
            X.9Ja r3 = (X.C376709Ja) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r3.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r7 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r7) goto L_0x0026
            if (r0 != r4) goto L_0x0087
            X.0eS.A00(r1)
        L_0x0025:
            return r1
        L_0x0026:
            java.lang.Object r10 = r3.A02
            X.0sP r10 = (X.0sP) r10
            java.lang.Object r0 = r3.A01
            androidx.compose.runtime.PausableMonotonicFrameClock r0 = (androidx.compose.runtime.PausableMonotonicFrameClock) r0
            X.0eS.A00(r1)
            goto L_0x0071
        L_0x0032:
            X.0eS.A00(r1)
            X.5PU r6 = r8.A00
            r3.A01 = r8
            r3.A02 = r10
            r3.A00 = r7
            java.lang.Object r1 = r6.A03
            monitor-enter(r1)
            boolean r0 = r6.A02     // Catch:{ all -> 0x008f }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x005a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1IW.A02
            X.4D7 r0 = X.1Ey.A02(r3)
            X.1IW r2 = new X.1IW
            r2.<init>(r7, r0)
            r2.A0I()
            monitor-enter(r1)
            java.util.List r0 = r6.A00     // Catch:{ all -> 0x008f }
            r0.add(r2)     // Catch:{ all -> 0x008f }
            goto L_0x005d
        L_0x005a:
            X.0gF r0 = X.C60340gF.A00
            goto L_0x006e
        L_0x005d:
            monitor-exit(r1)
            r1 = 46
            X.J6U r0 = new X.J6U
            r0.<init>(r1, r2, r6)
            r2.CO0(r0)
            java.lang.Object r0 = r2.A0E()
            if (r0 != r5) goto L_0x005a
        L_0x006e:
            if (r0 == r5) goto L_0x0080
            r0 = r8
        L_0x0071:
            X.5PR r1 = r0.A01
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A00 = r4
            java.lang.Object r1 = r1.FNV(r3, r10)
            if (r1 != r5) goto L_0x0025
        L_0x0080:
            return r5
        L_0x0081:
            X.9Ja r3 = new X.9Ja
            r3.<init>(r8, r9, r4)
            goto L_0x0015
        L_0x0087:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x008f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.FNV(X.4D7, X.0sP):java.lang.Object");
    }

    public final Object fold(Object obj, 0sL r3) {
        0qQ.A0B(r3, 2);
        return r3.invoke(obj, this);
    }

    public final /* synthetic */ C634312c getKey() {
        return AnonymousClass5PR.A00;
    }

    public PausableMonotonicFrameClock(AnonymousClass5PR r2) {
        this.A01 = r2;
    }

    public final C262084Cb get(C634312c r2) {
        return AnonymousClass199.A00(this, r2);
    }

    public final C262094Cc minusKey(C634312c r2) {
        return AnonymousClass199.A01(this, r2);
    }

    public final C262094Cc plus(C262094Cc r2) {
        return AnonymousClass199.A02(this, r2);
    }
}
