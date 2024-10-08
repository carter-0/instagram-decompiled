package X;

import java.util.ListIterator;

/* renamed from: X.Qz9  reason: case insensitive filesystem */
public final class C8668Qz9 extends C13119TMd implements ListIterator {
    public final /* synthetic */ C8669QzA A00;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.QzA, X.TRg] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8668Qz9(X.C8669QzA r2, int r3) {
        /*
            r1 = this;
            r1.A00 = r2
            java.util.Collection r0 = r2.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ListIterator r0 = r0.listIterator(r3)
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8668Qz9.<init>(X.QzA, int):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.AbstractCollection, X.QzA, X.TRg] */
    public final void add(Object obj) {
        ? r3 = this.A00;
        boolean isEmpty = r3.isEmpty();
        A00();
        ((ListIterator) this.A01).add(obj);
        r3.A00.A00++;
        if (isEmpty) {
            r3.A00();
        }
    }

    public final boolean hasPrevious() {
        A00();
        return ((ListIterator) this.A01).hasPrevious();
    }

    public final int nextIndex() {
        A00();
        return ((ListIterator) this.A01).nextIndex();
    }

    public final Object previous() {
        A00();
        return ((ListIterator) this.A01).previous();
    }

    public final int previousIndex() {
        A00();
        return ((ListIterator) this.A01).previousIndex();
    }

    public final void set(Object obj) {
        A00();
        ((ListIterator) this.A01).set(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.QzA, X.TRg] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8668Qz9(X.C8669QzA r1) {
        /*
            r0 = this;
            r0.A00 = r1
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8668Qz9.<init>(X.QzA):void");
    }
}
