package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4bn  reason: invalid class name and case insensitive filesystem */
public final class C267584bn extends C267594bo<Map.Entry<K, V>> {
    public final /* synthetic */ MapMakerInternalMap A00;

    public C267584bn(MapMakerInternalMap mapMakerInternalMap) {
        this.A00 = mapMakerInternalMap;
    }

    public final void clear() {
        this.A00.clear();
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
            if (r0 == 0) goto L_0x0024
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r1 = r5.getKey()
            if (r1 == 0) goto L_0x0024
            com.google.common.collect.MapMakerInternalMap r0 = r4.A00
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L_0x0024
            X.17u r1 = r0.valueEquivalence()
            java.lang.Object r0 = r5.getValue()
            boolean r0 = r1.A01(r0, r2)
            if (r0 == 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267584bn.contains(java.lang.Object):boolean");
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new AnonymousClass58S(this.A00);
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
            com.google.common.collect.MapMakerInternalMap r1 = r4.A00
            java.lang.Object r0 = r5.getValue()
            boolean r0 = r1.remove(r2, r0)
            if (r0 == 0) goto L_0x001a
            r3 = 1
        L_0x001a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267584bn.remove(java.lang.Object):boolean");
    }

    public final int size() {
        return this.A00.size();
    }
}
