package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3w4  reason: invalid class name */
public final class AnonymousClass3w4 {
    public static final AnonymousClass3w4 A03 = new AnonymousClass3w4();
    public final Map A00 = new HashMap();
    public final Set A01 = new HashSet();
    public final AtomicInteger A02 = new AtomicInteger(0);

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0019, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:14:0x0042=Splitter:B:14:0x0042, B:23:0x006e=Splitter:B:23:0x006e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r2 = 1
            if (r7 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A02     // Catch:{ all -> 0x008f }
            int r0 = r1.get()     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x008d
            r1.set(r2)     // Catch:{ all -> 0x008f }
            java.util.Set r0 = r6.A01     // Catch:{ all -> 0x008f }
            java.util.Map r5 = r6.A00     // Catch:{ all -> 0x008f }
            r4 = 19
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x008f }
        L_0x0019:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x008f }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x008f }
            int r2 = r0.intValue()     // Catch:{ all -> 0x008f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008f }
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x0019
            int r0 = android.os.Process.getThreadPriority(r2)     // Catch:{ IllegalArgumentException -> 0x0042, Exception -> 0x0019 }
            android.os.Process.setThreadPriority(r2, r4)     // Catch:{ IllegalArgumentException -> 0x0042, Exception -> 0x0019 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0042, Exception -> 0x0019 }
            r5.put(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0042, Exception -> 0x0019 }
            goto L_0x0019
        L_0x0042:
            r3.remove()     // Catch:{ all -> 0x008f }
            goto L_0x0019
        L_0x0046:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.A02     // Catch:{ all -> 0x008f }
            int r0 = r1.get()     // Catch:{ all -> 0x008f }
            if (r0 != r2) goto L_0x008d
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x008f }
            java.util.Set r4 = r6.A01     // Catch:{ all -> 0x008f }
            java.util.Map r3 = r6.A00     // Catch:{ all -> 0x008f }
            java.util.Set r0 = r3.keySet()     // Catch:{ all -> 0x008f }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x008f }
        L_0x005e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x008f }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x008f }
            int r1 = r0.intValue()     // Catch:{ all -> 0x008f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0082, Exception -> 0x005e }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ IllegalArgumentException -> 0x0082, Exception -> 0x005e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalArgumentException -> 0x0082, Exception -> 0x005e }
            if (r0 == 0) goto L_0x005e
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0082, Exception -> 0x005e }
            android.os.Process.setThreadPriority(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0082, Exception -> 0x005e }
            goto L_0x005e
        L_0x0082:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008f }
            r4.remove(r0)     // Catch:{ all -> 0x008f }
            goto L_0x005e
        L_0x008a:
            r3.clear()     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r6)
            return
        L_0x008f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3w4.A00(boolean):void");
    }
}
