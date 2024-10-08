package X;

import java.util.List;

/* renamed from: X.TIi  reason: case insensitive filesystem */
public final class C13026TIi implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ST3 A01;
    public final /* synthetic */ List A02;

    public C13026TIi(ST3 st3, List list, int i) {
        this.A01 = st3;
        this.A02 = list;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        X.ST3.A03(r4, X.C8889REg.SUBSCRIBE, X.C8947RGw.A00(r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.ST3 r4 = r8.A01
            java.util.List r7 = r8.A02
            int r6 = r8.A00
            X.ST3.A02(r4)     // Catch:{ all -> 0x0042 }
            java.lang.Integer r1 = r4.A0Y     // Catch:{ all -> 0x0042 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0042 }
            if (r1 != r0) goto L_0x004c
            X.SRA r5 = r4.A0E     // Catch:{ all -> 0x0042 }
            monitor-enter(r5)     // Catch:{ all -> 0x0042 }
            X.RFZ r0 = X.RFZ.SUBSCRIBE     // Catch:{ all -> 0x003f }
            X.SNX r3 = new X.SNX     // Catch:{ all -> 0x003f }
            r3.<init>(r0)     // Catch:{ all -> 0x003f }
            X.S0O r2 = new X.S0O     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            X.S0P r0 = new X.S0P     // Catch:{ all -> 0x003f }
            r0.<init>(r7)     // Catch:{ all -> 0x003f }
            X.Qc7 r1 = new X.Qc7     // Catch:{ all -> 0x003f }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x003f }
            X.RwG r0 = r5.A01     // Catch:{ all -> 0x003f }
            X.SRA.A02(r5, r1, r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            X.Rrs r2 = r4.A0X     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x004c
            X.ST9 r0 = r2.A01     // Catch:{ all -> 0x0042 }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x0042 }
            X.TCa r0 = new X.TCa     // Catch:{ all -> 0x0042 }
            r0.<init>(r2)     // Catch:{ all -> 0x0042 }
            r1.post(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r2 = move-exception
            X.RGw r1 = X.C8947RGw.A00(r2)
            X.REg r0 = X.C8889REg.SUBSCRIBE
            X.ST3.A03(r4, r0, r1, r2)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13026TIi.run():void");
    }
}
