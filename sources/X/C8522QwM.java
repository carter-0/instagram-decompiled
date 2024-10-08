package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.QwM  reason: case insensitive filesystem */
public final class C8522QwM extends C13117TMb implements ListIterator {
    public final /* synthetic */ C8524QwO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8522QwM(C8524QwO qwO, int i) {
        super(qwO, ((List) qwO.A00).listIterator(i));
        this.A00 = qwO;
    }

    public final void add(Object obj) {
        C8524QwO qwO = this.A00;
        boolean isEmpty = qwO.isEmpty();
        A00();
        ((ListIterator) this.A01).add(obj);
        qwO.A00.A00++;
        if (isEmpty) {
            qwO.A00();
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8522QwM(C8524QwO qwO) {
        super(qwO);
        this.A00 = qwO;
    }
}
