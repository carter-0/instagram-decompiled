package X;

public final class XQK extends Y5l {
    public Object A00;
    public final 1aL A01;

    public final int EHR(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void dispose() {
        set(4);
        this.A00 = null;
    }

    public final void clear() {
        lazySet(32);
        this.A00 = null;
    }

    public XQK(1aL r1) {
        this.A01 = r1;
    }

    public final boolean isEmpty() {
        return JTQ.A1O(get(), 16);
    }

    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.A00;
        this.A00 = null;
        lazySet(32);
        return obj;
    }
}
