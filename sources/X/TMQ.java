package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class TMQ implements Iterator {
    public int A00;
    public QzH A01;
    public QzH A02;
    public final Set A03;
    public final /* synthetic */ LinkedListMultimap A04;

    public TMQ(LinkedListMultimap linkedListMultimap) {
        this.A04 = linkedListMultimap;
        this.A03 = C281945Ae.A01(linkedListMultimap.keySet().size());
        this.A02 = linkedListMultimap.A02;
        this.A00 = linkedListMultimap.A00;
    }

    public final boolean hasNext() {
        if (this.A04.A00 == this.A00) {
            return AnonymousClass7TF.A1V(this.A02);
        }
        throw new ConcurrentModificationException();
    }

    public final Object next() {
        QzH qzH;
        if (this.A04.A00 == this.A00) {
            QzH qzH2 = this.A02;
            if (qzH2 != null) {
                this.A01 = qzH2;
                Set set = this.A03;
                set.add(qzH2.A05);
                do {
                    qzH = this.A02.A00;
                    this.A02 = qzH;
                    if (qzH == null || set.add(qzH.A05)) {
                    }
                    qzH = this.A02.A00;
                    this.A02 = qzH;
                    break;
                } while (set.add(qzH.A05));
                return this.A01.A05;
            }
            throw Pxe.A1C();
        }
        throw new ConcurrentModificationException();
    }

    public final void remove() {
        LinkedListMultimap linkedListMultimap = this.A04;
        if (linkedListMultimap.A00 == this.A00) {
            Pxh.A1T(AnonymousClass7TF.A1V(this.A01));
            LinkedListMultimap.A02(linkedListMultimap, this.A01.A05);
            this.A01 = null;
            this.A00 = linkedListMultimap.A00;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
