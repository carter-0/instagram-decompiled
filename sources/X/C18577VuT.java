package X;

/* renamed from: X.VuT  reason: case insensitive filesystem */
public final class C18577VuT {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public boolean A05;
    public final boolean A06;
    public final /* synthetic */ C19870Wgx A07;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r7 <= r2) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A01(long r7, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            long r2 = r6.A01     // Catch:{ all -> 0x0018 }
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x000e
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0011
        L_0x000e:
            r0 = 1
            r6.A02 = r9     // Catch:{ all -> 0x0018 }
        L_0x0011:
            r6.A03 = r7     // Catch:{ all -> 0x0018 }
            A00(r6)     // Catch:{ all -> 0x0018 }
            monitor-exit(r6)
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18577VuT.A01(long, long):boolean");
    }

    public C18577VuT(C19870Wgx wgx, boolean z) {
        this.A07 = wgx;
        this.A06 = z;
    }

    public static void A00(C18577VuT vuT) {
        if (!vuT.A05) {
            long j = vuT.A00;
            if (j < 0) {
                long j2 = vuT.A01;
                if (j2 >= 0 && vuT.A03 >= j2) {
                    j = vuT.A02;
                    if (j >= 0) {
                        vuT.A00 = j;
                    }
                    vuT.A07.A0N.post(new C19906Whb(vuT));
                    vuT.A05 = true;
                }
            }
            if (j < 0 || j > vuT.A04) {
                return;
            }
            vuT.A07.A0N.post(new C19906Whb(vuT));
            vuT.A05 = true;
        }
    }
}
