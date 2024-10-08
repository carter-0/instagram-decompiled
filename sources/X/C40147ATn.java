package X;

import java.util.List;

/* renamed from: X.ATn  reason: case insensitive filesystem */
public final class C40147ATn implements C345107sw {
    public int A00;
    public C345087su A01;
    public final C39776A8v A02;
    public final A39 A03;
    public final C361218fr A04;
    public final Object A05 = new Object();
    public final List A06;
    public final C344407ro A07;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(2:26|15)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0025 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C345137sz B82() {
        /*
            r7 = this;
            java.lang.Object r5 = r7.A05
            monitor-enter(r5)
            X.7su r1 = r7.A01     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x000c
            X.A8v r0 = r7.A02     // Catch:{ all -> 0x0057 }
            r0.A00(r1)     // Catch:{ all -> 0x0057 }
        L_0x000c:
            int r0 = r7.A00     // Catch:{ all -> 0x0057 }
            int r0 = r0 + -1
            r7.A00 = r0     // Catch:{ all -> 0x0057 }
        L_0x0012:
            java.util.List r2 = r7.A06     // Catch:{ all -> 0x0057 }
            boolean r0 = X.AnonymousClass7TE.A1b(r2)     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x002c
            r0 = 5000(0x1388, double:2.4703E-320)
            r5.wait(r0)     // Catch:{ InterruptedException -> 0x001f }
        L_0x001f:
            boolean r0 = X.AnonymousClass7TE.A1b(r2)     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "decoding took too long :("
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x0057 }
            goto L_0x0056
        L_0x002c:
            r6 = 0
            java.lang.Object r0 = r2.remove(r6)     // Catch:{ all -> 0x0057 }
            r0.getClass()     // Catch:{ all -> 0x0057 }
            X.7su r0 = (X.C345087su) r0     // Catch:{ all -> 0x0057 }
            r7.A01 = r0     // Catch:{ all -> 0x0057 }
            X.A39 r0 = r7.A03     // Catch:{ all -> 0x0057 }
            long r3 = r0.A00     // Catch:{ all -> 0x0057 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0050
            r0 = -1
            android.opengl.GLES30.glWaitSync(r3, r6, r0)     // Catch:{ all -> 0x0057 }
            X.7su r0 = r7.A01     // Catch:{ all -> 0x0057 }
            X.7sy r0 = r0.A0A     // Catch:{ all -> 0x0057 }
            r5.notifyAll()     // Catch:{ all -> 0x0057 }
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            return r0
        L_0x0050:
            java.lang.String r0 = "can't wait for non existing fence"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x0057 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40147ATn.B82():X.7sz");
    }

    public final /* synthetic */ int BHN() {
        return 0;
    }

    public final void EeQ(C346267ut r2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.A39] */
    public C40147ATn(C344407ro r2) {
        this.A07 = r2;
        this.A06 = AnonymousClass7TE.A1C();
        this.A02 = new C39776A8v(r2);
        this.A04 = new C361218fr(r2);
        this.A03 = new Object();
    }
}
