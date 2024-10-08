package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.WqX  reason: case insensitive filesystem */
public final class C20391WqX implements ListIterator, AnonymousClass0s4 {
    public int A00;
    public int A01 = -1;
    public int A02;
    public final AnonymousClass6HD A03;

    private final void A00() {
        if (this.A03.A01() != this.A02) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        if (this.A00 >= this.A03.size() - 1) {
            return false;
        }
        return true;
    }

    public final boolean hasPrevious() {
        return Pxf.A1R(this.A00);
    }

    public final int nextIndex() {
        return this.A00 + 1;
    }

    public final int previousIndex() {
        return this.A00;
    }

    public C20391WqX(AnonymousClass6HD r2, int i) {
        this.A03 = r2;
        this.A00 = i - 1;
        this.A02 = r2.A01();
    }

    public final void add(Object obj) {
        A00();
        AnonymousClass6HD r1 = this.A03;
        r1.add(this.A00 + 1, obj);
        this.A01 = -1;
        this.A00++;
        this.A02 = r1.A01();
    }

    public final Object next() {
        A00();
        int i = this.A00 + 1;
        this.A01 = i;
        AnonymousClass6HD r1 = this.A03;
        C18284Vp7.A00(i, r1.size());
        Object obj = r1.get(i);
        this.A00 = i;
        return obj;
    }

    public final Object previous() {
        A00();
        int i = this.A00;
        AnonymousClass6HD r1 = this.A03;
        C18284Vp7.A00(i, r1.size());
        int i2 = this.A00;
        this.A01 = i2;
        this.A00--;
        return r1.get(i2);
    }

    public final void remove() {
        A00();
        AnonymousClass6HD r2 = this.A03;
        r2.remove(this.A00);
        this.A00--;
        this.A01 = -1;
        this.A02 = r2.A01();
    }

    public final void set(Object obj) {
        A00();
        int i = this.A01;
        if (i >= 0) {
            AnonymousClass6HD r0 = this.A03;
            r0.set(i, obj);
            this.A02 = r0.A01();
            return;
        }
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }
}
