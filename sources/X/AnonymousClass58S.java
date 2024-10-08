package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.58S  reason: invalid class name */
public abstract class AnonymousClass58S implements Iterator {
    public int A00;
    public int A01 = -1;
    public AnonymousClass17x A02;
    public MapMakerInternalMap.Segment A03;
    public AnonymousClass58T A04;
    public AnonymousClass58T A05;
    public AtomicReferenceArray A06;
    public final /* synthetic */ MapMakerInternalMap A07;

    /* JADX WARNING: CFG modification limit reached, blocks count: 130 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1 = r3.A06;
        r3.A01 = r2 - 1;
        r0 = (X.AnonymousClass17x) r1.get(r2);
        r3.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (A01(r0) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r0 = r0.BW3();
        r3.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (A01(r0) != false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r0 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r3 = this;
            r0 = 0
            r3.A05 = r0
            X.17x r0 = r3.A02
            if (r0 == 0) goto L_0x003a
        L_0x0007:
            X.17x r0 = r0.BW3()
            r3.A02 = r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L_0x0069
            X.17x r0 = r3.A02
            goto L_0x0007
        L_0x0018:
            int r2 = r3.A00
            if (r2 < 0) goto L_0x0069
            com.google.common.collect.MapMakerInternalMap r0 = r3.A07
            com.google.common.collect.MapMakerInternalMap$Segment[] r1 = r0.A06
            int r0 = r2 + -1
            r3.A00 = r0
            r0 = r1[r2]
            r3.A03 = r0
            int r0 = r0.count
            if (r0 == 0) goto L_0x0018
            com.google.common.collect.MapMakerInternalMap$Segment r0 = r3.A03
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.table
            r3.A06 = r0
            int r0 = r0.length()
            int r0 = r0 + -1
            r3.A01 = r0
        L_0x003a:
            int r2 = r3.A01
            if (r2 < 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.A06
            int r0 = r2 + -1
            r3.A01 = r0
            java.lang.Object r0 = r1.get(r2)
            X.17x r0 = (X.AnonymousClass17x) r0
            r3.A02 = r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L_0x0069
            X.17x r0 = r3.A02
            if (r0 == 0) goto L_0x003a
        L_0x0058:
            X.17x r0 = r0.BW3()
            r3.A02 = r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L_0x0069
            X.17x r0 = r3.A02
            goto L_0x0058
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58S.A00():void");
    }

    public AnonymousClass58S(MapMakerInternalMap mapMakerInternalMap) {
        this.A07 = mapMakerInternalMap;
        this.A00 = mapMakerInternalMap.A06.length - 1;
        A00();
    }

    public final boolean hasNext() {
        if (this.A05 != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        boolean z = this instanceof AnonymousClass58R;
        AnonymousClass58T r0 = this.A05;
        if (z) {
            if (r0 != null) {
                this.A04 = r0;
                A00();
                return this.A04;
            }
            throw new NoSuchElementException();
        } else if (r0 != null) {
            this.A04 = r0;
            A00();
            return this.A04.getValue();
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        17k.A0H(z, Pxd.A00(244));
        this.A07.remove(this.A04.getKey());
        this.A04 = null;
    }

    public final boolean A01(AnonymousClass17x r5) {
        boolean z;
        Object value;
        try {
            Object key = r5.getKey();
            MapMakerInternalMap mapMakerInternalMap = this.A07;
            if (r5.getKey() == null || (value = r5.getValue()) == null) {
                z = false;
            } else {
                this.A05 = new AnonymousClass58T(mapMakerInternalMap, key, value);
                z = true;
            }
            return z;
        } finally {
            this.A03.A05();
        }
    }
}
