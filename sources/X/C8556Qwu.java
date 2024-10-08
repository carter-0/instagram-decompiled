package X;

import java.util.Iterator;

/* renamed from: X.Qwu  reason: case insensitive filesystem */
public final class C8556Qwu extends C8554Qws {
    public final transient C8553Qwr A00;
    public final transient C13140TMy A01;

    public final boolean A07() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final C8553Qwr A09() {
        return this.A00;
    }

    public final int A08(Object[] objArr, int i) {
        return this.A00.A08(objArr, 0);
    }

    public final boolean contains(Object obj) {
        return AnonymousClass7TF.A1V(this.A01.get(obj));
    }

    public final /* synthetic */ Iterator iterator() {
        return this.A00.listIterator(0);
    }

    public final int size() {
        return this.A01.size();
    }

    public C8556Qwu(C8553Qwr qwr, C13140TMy tMy) {
        this.A01 = tMy;
        this.A00 = qwr;
    }
}
