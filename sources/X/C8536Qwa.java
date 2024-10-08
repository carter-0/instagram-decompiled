package X;

import java.util.Iterator;

/* renamed from: X.Qwa  reason: case insensitive filesystem */
public final class C8536Qwa extends C8538Qwc {
    public final transient C8535QwZ A00;
    public final transient C13139TMx A01;

    public final boolean contains(Object obj) {
        return AnonymousClass7TF.A1V(this.A01.get(obj));
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    public final int size() {
        return this.A01.size();
    }

    public C8536Qwa(C8535QwZ qwZ, C13139TMx tMx) {
        this.A01 = tMx;
        this.A00 = qwZ;
    }
}
