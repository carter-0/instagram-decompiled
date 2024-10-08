package X;

import java.util.ListIterator;

/* renamed from: X.WqW  reason: case insensitive filesystem */
public final class C20390WqW implements ListIterator, AnonymousClass0s4 {
    public final /* synthetic */ C20388WqU A00;
    public final /* synthetic */ 0rk A01;

    public C20390WqW(C20388WqU wqU, 0rk r2) {
        this.A01 = r2;
        this.A00 = wqU;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public final boolean hasNext() {
        if (this.A01.A00 >= this.A00.size() - 1) {
            return false;
        }
        return true;
    }

    public final boolean hasPrevious() {
        return Pxf.A1R(this.A01.A00);
    }

    public final Object next() {
        0rk r3 = this.A01;
        int i = r3.A00 + 1;
        C20388WqU wqU = this.A00;
        C18284Vp7.A00(i, wqU.size());
        r3.A00 = i;
        return wqU.get(i);
    }

    public final int nextIndex() {
        return this.A01.A00 + 1;
    }

    public final Object previous() {
        0rk r3 = this.A01;
        int i = r3.A00;
        C20388WqU wqU = this.A00;
        C18284Vp7.A00(i, wqU.size());
        r3.A00 = i - 1;
        return wqU.get(i);
    }

    public final int previousIndex() {
        return this.A01.A00;
    }

    public final /* bridge */ /* synthetic */ void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
