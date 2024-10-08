package X;

import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8Z1  reason: invalid class name */
public class AnonymousClass8Z1 implements Closeable {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r5.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C252733pa A00(java.lang.Class r4, X.C62320sa r5) {
        /*
            r3 = this;
            java.util.concurrent.ConcurrentHashMap r2 = r3.A00
            java.lang.Object r1 = r2.get(r4)
            if (r1 != 0) goto L_0x0013
            java.lang.Object r0 = r5.invoke()
            java.lang.Object r1 = r2.putIfAbsent(r4, r0)
            if (r1 != 0) goto L_0x0013
            r1 = r0
        L_0x0013:
            java.lang.String r0 = "null cannot be cast to non-null type R of com.instagram.repository.common.IgRepositoryStore.getOrPut"
            X.0qQ.A0C(r1, r0)
            X.3pa r1 = (X.C252733pa) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Z1.A00(java.lang.Class, X.0sa):X.3pa");
    }

    public final void close() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            ((C252733pa) value.getValue()).close();
        }
        concurrentHashMap.clear();
    }
}
