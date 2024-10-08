package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.5Uy  reason: invalid class name and case insensitive filesystem */
public final class C286345Uy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final C286335Ux A06 = new Object();
    public final HashMap A07;
    public final LinkedHashSet A08;

    public final int A00() {
        int i;
        synchronized (this.A06) {
            i = this.A01;
        }
        return i;
    }

    public final Object A01(Object obj) {
        synchronized (this.A06) {
            Object obj2 = this.A07.get(obj);
            if (obj2 != null) {
                LinkedHashSet linkedHashSet = this.A08;
                linkedHashSet.remove(obj);
                linkedHashSet.add(obj);
                this.A02++;
                return obj2;
            }
            this.A04++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r1 = new java.lang.IllegalStateException("inconsistent state");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00ab
            if (r10 == 0) goto L_0x00ab
            X.5Ux r3 = r8.A06
            monitor-enter(r3)
            int r0 = r8.A05     // Catch:{ all -> 0x00a8 }
            int r0 = r0 + 1
            r8.A05 = r0     // Catch:{ all -> 0x00a8 }
            int r0 = r8.A00()     // Catch:{ all -> 0x00a8 }
            int r0 = r0 + 1
            r8.A01 = r0     // Catch:{ all -> 0x00a8 }
            java.util.HashMap r5 = r8.A07     // Catch:{ all -> 0x00a8 }
            java.lang.Object r0 = r5.put(r9, r10)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0025
            int r1 = r8.A00()     // Catch:{ all -> 0x00a8 }
            r0 = 1
            int r1 = r1 - r0
            r8.A01 = r1     // Catch:{ all -> 0x00a8 }
        L_0x0025:
            java.util.LinkedHashSet r6 = r8.A08     // Catch:{ all -> 0x00a8 }
            boolean r0 = r6.contains(r9)     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0030
            r6.remove(r9)     // Catch:{ all -> 0x00a8 }
        L_0x0030:
            r6.add(r9)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r3)
            int r7 = r8.A03
        L_0x0036:
            monitor-enter(r3)
            int r0 = r8.A00()     // Catch:{ all -> 0x00a8 }
            if (r0 < 0) goto L_0x00a0
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x0049
            int r0 = r8.A00()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x00a0
        L_0x0049:
            boolean r1 = r5.isEmpty()     // Catch:{ all -> 0x00a8 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r1 != r0) goto L_0x00a0
            int r0 = r8.A00()     // Catch:{ all -> 0x00a8 }
            r4 = 0
            if (r0 <= r7) goto L_0x008a
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x008a
            java.lang.Object r4 = X.00k.A09(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r2 = r5.get(r4)     // Catch:{ all -> 0x00a8 }
            if (r2 == 0) goto L_0x0098
            java.util.Map r0 = X.0u4.A03(r5)     // Catch:{ all -> 0x00a8 }
            r0.remove(r4)     // Catch:{ all -> 0x00a8 }
            java.util.Collection r0 = X.0u4.A00(r6)     // Catch:{ all -> 0x00a8 }
            r0.remove(r4)     // Catch:{ all -> 0x00a8 }
            int r1 = r8.A00()     // Catch:{ all -> 0x00a8 }
            X.0qQ.A0A(r4)     // Catch:{ all -> 0x00a8 }
            r0 = 1
            int r1 = r1 - r0
            r8.A01 = r1     // Catch:{ all -> 0x00a8 }
            int r0 = r8.A00     // Catch:{ all -> 0x00a8 }
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x00a8 }
            goto L_0x008b
        L_0x008a:
            r2 = r4
        L_0x008b:
            monitor-exit(r3)
            if (r4 != 0) goto L_0x0091
            if (r2 != 0) goto L_0x0091
            return
        L_0x0091:
            X.0qQ.A0A(r4)
            X.0qQ.A0A(r2)
            goto L_0x0036
        L_0x0098:
            java.lang.String r0 = "inconsistent state"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x00a7
        L_0x00a0:
            java.lang.String r0 = "map/keySet size inconsistency"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a8 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a8 }
        L_0x00a7:
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ab:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286345Uy.A02(java.lang.Object, java.lang.Object):void");
    }

    public final String toString() {
        int i;
        String obj;
        synchronized (this.A06) {
            int i2 = this.A02;
            int i3 = this.A04;
            int i4 = i3 + i2;
            if (i4 != 0) {
                i = (i2 * 100) / i4;
            } else {
                i = 0;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("LruCache[maxSize=");
            sb.append(this.A03);
            sb.append(",hits=");
            sb.append(i2);
            sb.append(",misses=");
            sb.append(i3);
            sb.append(",hitRate=");
            sb.append(i);
            sb.append("%]");
            obj = sb.toString();
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5Ux] */
    public C286345Uy(int i) {
        this.A03 = i;
        this.A07 = new HashMap(0, 0.75f);
        this.A08 = new LinkedHashSet();
    }
}
