package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7GO  reason: invalid class name */
public final class AnonymousClass7GO {
    public final Map A00 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.instagram.model.direct.messageid.DirectMessageIdentifier A00(X.AnonymousClass7GO r6, com.instagram.model.direct.messageid.DirectMessageIdentifier r7) {
        /*
            monitor-enter(r6)
            java.util.Map r4 = r6.A00     // Catch:{ all -> 0x006b }
            boolean r0 = r4.containsKey(r7)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x006b }
            r5.<init>()     // Catch:{ all -> 0x006b }
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x006b }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x006b }
            r2 = r7
        L_0x0019:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x006b }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r1 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r1     // Catch:{ all -> 0x006b }
            boolean r0 = r7.A02(r1)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0019
            r5.add(r1)     // Catch:{ all -> 0x006b }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r2 = r2.A01(r1)     // Catch:{ all -> 0x006b }
            goto L_0x0019
        L_0x0033:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0069
            boolean r0 = r4.containsKey(r2)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0069
            r0 = 0
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0061
            r4.put(r2, r0)     // Catch:{ all -> 0x006b }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x006b }
        L_0x0051:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x006b }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r0     // Catch:{ all -> 0x006b }
            r4.remove(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0051
        L_0x0061:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006b }
            r0.<init>(r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r6)
            return r2
        L_0x006b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7GO.A00(X.7GO, com.instagram.model.direct.messageid.DirectMessageIdentifier):com.instagram.model.direct.messageid.DirectMessageIdentifier");
    }

    public final synchronized Object A01(DirectMessageIdentifier directMessageIdentifier) {
        Object obj;
        if (directMessageIdentifier != null) {
            obj = this.A00.get(A00(this, directMessageIdentifier));
        } else {
            obj = null;
        }
        return obj;
    }

    public final synchronized void A02(DirectMessageIdentifier directMessageIdentifier, Object obj) {
        0qQ.A0B(directMessageIdentifier, 0);
        this.A00.put(A00(this, directMessageIdentifier), obj);
    }
}
