package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class XDL extends AtomicReferenceArray implements YCO {
    public static final Integer A05 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public long A00;
    public final int A01;
    public final int A02 = (length() - 1);
    public final AtomicLong A03 = new AtomicLong();
    public final AtomicLong A04 = new AtomicLong();

    public XDL(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.A01 = Math.min(i / 4, A05.intValue());
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q((this.A04.get() > this.A03.get() ? 1 : (this.A04.get() == this.A03.get() ? 0 : -1)));
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            int i = this.A02;
            AtomicLong atomicLong = this.A04;
            long j = atomicLong.get();
            int i2 = ((int) j) & i;
            if (j >= this.A00) {
                long j2 = ((long) this.A01) + j;
                if (get(((int) j2) & i) == null) {
                    this.A00 = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        throw AnonymousClass7TE.A11(C273654mx.A00(490));
    }

    public final Object poll() {
        AtomicLong atomicLong = this.A03;
        long j = atomicLong.get();
        int i = this.A02 & ((int) j);
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, (Object) null);
        return obj;
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }
}
