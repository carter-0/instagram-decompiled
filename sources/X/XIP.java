package X;

import java.util.Iterator;

public final class XIP extends Y40 implements Iterator {
    public final /* synthetic */ Y44 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XIP(Y44 y44) {
        super(y44);
        this.A00 = y44;
    }

    public final Object next() {
        A00();
        return getKey();
    }
}
