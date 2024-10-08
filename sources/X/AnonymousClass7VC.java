package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7VC  reason: invalid class name */
public final class AnonymousClass7VC {
    public final Set A00 = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.instagram.model.direct.messageid.DirectMessageIdentifier A00(X.AnonymousClass7VC r6, com.instagram.model.direct.messageid.DirectMessageIdentifier r7) {
        /*
            monitor-enter(r6)
            java.util.Set r5 = r6.A00     // Catch:{ all -> 0x004e }
            boolean r0 = r5.contains(r7)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x004e }
            r2 = r7
        L_0x0015:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x002f
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x004e }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r1     // Catch:{ all -> 0x004e }
            boolean r0 = r7.A02(r1)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0015
            r4.add(r1)     // Catch:{ all -> 0x004e }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r2 = r2.A01(r1)     // Catch:{ all -> 0x004e }
            goto L_0x0015
        L_0x002f:
            boolean r0 = r5.contains(r2)     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x004c
            r5.add(r2)     // Catch:{ all -> 0x004e }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x004e }
        L_0x003c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x004e }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r0     // Catch:{ all -> 0x004e }
            r5.remove(r0)     // Catch:{ all -> 0x004e }
            goto L_0x003c
        L_0x004c:
            monitor-exit(r6)
            return r2
        L_0x004e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VC.A00(X.7VC, com.instagram.model.direct.messageid.DirectMessageIdentifier):com.instagram.model.direct.messageid.DirectMessageIdentifier");
    }
}
