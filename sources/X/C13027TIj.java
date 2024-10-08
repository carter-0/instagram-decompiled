package X;

import java.util.List;

/* renamed from: X.TIj  reason: case insensitive filesystem */
public final class C13027TIj implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ST3 A01;
    public final /* synthetic */ List A02;

    public C13027TIj(ST3 st3, List list, int i) {
        this.A01 = st3;
        this.A02 = list;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        X.ST3.A03(r4, X.C8889REg.UNSUBSCRIBE, X.C8947RGw.A00(r2), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            X.ST3 r4 = r8.A01
            java.util.List r2 = r8.A02
            int r7 = r8.A00
            X.ST3.A02(r4)     // Catch:{ all -> 0x005c }
            java.lang.Integer r1 = r4.A0Y     // Catch:{ all -> 0x005c }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x005c }
            if (r1 != r0) goto L_0x0066
            X.SRA r6 = r4.A0E     // Catch:{ all -> 0x005c }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x005c }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x005c }
        L_0x0019:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x005c }
            com.facebook.rti.mqtt.protocol.messages.SubscribeTopic r0 = (com.facebook.rti.mqtt.protocol.messages.SubscribeTopic) r0     // Catch:{ all -> 0x005c }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x005c }
            r5.add(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0019
        L_0x002b:
            monitor-enter(r6)     // Catch:{ all -> 0x005c }
            X.RFZ r0 = X.RFZ.UNSUBSCRIBE     // Catch:{ all -> 0x0059 }
            X.SNX r3 = new X.SNX     // Catch:{ all -> 0x0059 }
            r3.<init>(r0)     // Catch:{ all -> 0x0059 }
            X.S0O r2 = new X.S0O     // Catch:{ all -> 0x0059 }
            r2.<init>(r7)     // Catch:{ all -> 0x0059 }
            X.S0Q r0 = new X.S0Q     // Catch:{ all -> 0x0059 }
            r0.<init>(r5)     // Catch:{ all -> 0x0059 }
            X.Qc9 r1 = new X.Qc9     // Catch:{ all -> 0x0059 }
            r1.<init>(r3, r2, r0)     // Catch:{ all -> 0x0059 }
            X.RwG r0 = r6.A01     // Catch:{ all -> 0x0059 }
            X.SRA.A02(r6, r1, r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r6)     // Catch:{ all -> 0x005c }
            X.Rrs r2 = r4.A0X     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0066
            X.ST9 r0 = r2.A01     // Catch:{ all -> 0x005c }
            android.os.Handler r1 = r0.A05     // Catch:{ all -> 0x005c }
            X.TCa r0 = new X.TCa     // Catch:{ all -> 0x005c }
            r0.<init>(r2)     // Catch:{ all -> 0x005c }
            r1.post(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r2 = move-exception
            X.RGw r1 = X.C8947RGw.A00(r2)
            X.REg r0 = X.C8889REg.UNSUBSCRIBE
            X.ST3.A03(r4, r0, r1, r2)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13027TIj.run():void");
    }
}
