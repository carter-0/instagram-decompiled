package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class XCy implements YCO {
    public static final int A08 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object A09 = Pxe.A0p();
    public int A00;
    public long A01;
    public AtomicReferenceArray A02;
    public AtomicReferenceArray A03;
    public final int A04;
    public final int A05;
    public final AtomicLong A06 = new AtomicLong();
    public final AtomicLong A07 = new AtomicLong();

    public final boolean isEmpty() {
        if (this.A07.get() == this.A06.get()) {
            return true;
        }
        return false;
    }

    public final boolean offer(Object obj) {
        long j;
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.A03;
            AtomicLong atomicLong = this.A07;
            long j2 = atomicLong.get();
            int i = this.A05;
            int i2 = ((int) j2) & i;
            if (j2 >= this.A01) {
                long j3 = ((long) this.A00) + j2;
                if (atomicReferenceArray.get(((int) j3) & i) == null) {
                    this.A01 = j3 - 1;
                } else {
                    j = 1 + j2;
                    if (atomicReferenceArray.get(((int) j) & i) != null) {
                        long j4 = (long) i;
                        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
                        this.A03 = atomicReferenceArray2;
                        this.A01 = (j4 + j2) - 1;
                        atomicReferenceArray2.lazySet(i2, obj);
                        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
                        atomicReferenceArray.lazySet(i2, A09);
                        atomicLong.lazySet(j);
                        return true;
                    }
                }
            }
            atomicReferenceArray.lazySet(i2, obj);
            j = j2 + 1;
            atomicLong.lazySet(j);
            return true;
        }
        throw new NullPointerException(C273654mx.A00(490));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object poll() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r10.A02
            java.util.concurrent.atomic.AtomicLong r8 = r10.A06
            long r2 = r8.get()
            int r7 = r10.A04
            int r6 = (int) r2
            r6 = r6 & r7
            java.lang.Object r5 = r9.get(r6)
            java.lang.Object r1 = A09
            r0 = 0
            if (r5 != r1) goto L_0x0016
            r0 = 1
        L_0x0016:
            r4 = 0
            if (r5 == 0) goto L_0x0025
            if (r0 != 0) goto L_0x0028
            r9.lazySet(r6, r4)
        L_0x001e:
            r0 = 1
            long r2 = r2 + r0
            r8.lazySet(r2)
        L_0x0024:
            return r5
        L_0x0025:
            if (r0 != 0) goto L_0x0028
            return r4
        L_0x0028:
            int r1 = r7 + 1
            java.lang.Object r0 = r9.get(r1)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = (java.util.concurrent.atomic.AtomicReferenceArray) r0
            r9.lazySet(r1, r4)
            r10.A02 = r0
            java.lang.Object r5 = r0.get(r6)
            if (r5 == 0) goto L_0x0024
            r0.lazySet(r6, r4)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XCy.poll():java.lang.Object");
    }

    public XCy(int i) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.A03 = atomicReferenceArray;
        this.A05 = i2;
        this.A00 = Math.min(numberOfLeadingZeros / 4, A08);
        this.A02 = atomicReferenceArray;
        this.A04 = i2;
        this.A01 = (long) (i2 - 1);
        this.A07.lazySet(0);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
