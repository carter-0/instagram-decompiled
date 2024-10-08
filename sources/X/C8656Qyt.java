package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Qyt  reason: case insensitive filesystem */
public final class C8656Qyt extends C367698rQ<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
    public final /* synthetic */ C367698rQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8656Qyt(C367698rQ r1) {
        super(r1);
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r5 = (java.util.Map.Entry) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map.Entry
            r3 = 0
            if (r0 == 0) goto L_0x0022
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r1 = r5.getKey()
            if (r1 == 0) goto L_0x0022
            X.8rQ r0 = r4.A00
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L_0x0022
            X.17u r1 = r0.A0A
            java.lang.Object r0 = r5.getValue()
            boolean r0 = r1.A01(r0, r2)
            if (r0 == 0) goto L_0x0022
            r3 = 1
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8656Qyt.contains(java.lang.Object):boolean");
    }

    public final Iterator iterator() {
        return new C41291ArX(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r5 = (java.util.Map.Entry) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.util.Map.Entry
            r3 = 0
            if (r0 == 0) goto L_0x001a
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            if (r2 == 0) goto L_0x001a
            X.8rQ r1 = r4.A00
            java.lang.Object r0 = r5.getValue()
            boolean r0 = r1.remove(r2, r0)
            if (r0 == 0) goto L_0x001a
            r3 = 1
        L_0x001a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8656Qyt.remove(java.lang.Object):boolean");
    }
}
