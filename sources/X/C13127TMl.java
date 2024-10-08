package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.TMl  reason: case insensitive filesystem */
public final class C13127TMl implements ListIterator {
    public int A00;
    public int A01;
    public QzH A02;
    public QzH A03;
    public QzH A04;
    public final /* synthetic */ LinkedListMultimap A05;

    public C13127TMl(LinkedListMultimap linkedListMultimap, int i) {
        this.A05 = linkedListMultimap;
        this.A00 = linkedListMultimap.A00;
        int i2 = linkedListMultimap.A01;
        17k.A02(i, i2);
        if (i < i2 / 2) {
            this.A03 = linkedListMultimap.A02;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                A00();
                QzH qzH = this.A03;
                if (qzH != null) {
                    this.A02 = qzH;
                    this.A04 = qzH;
                    this.A03 = qzH.A00;
                    this.A01++;
                    i = i3;
                } else {
                    throw Pxe.A1C();
                }
            }
        } else {
            this.A04 = linkedListMultimap.A03;
            this.A01 = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                A00();
                QzH qzH2 = this.A04;
                if (qzH2 != null) {
                    this.A02 = qzH2;
                    this.A03 = qzH2;
                    this.A04 = qzH2.A02;
                    this.A01--;
                    i = i4;
                } else {
                    throw Pxe.A1C();
                }
            }
        }
        this.A02 = null;
    }

    private void A00() {
        if (this.A05.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    public final int nextIndex() {
        return this.A01;
    }

    public final int previousIndex() {
        return this.A01 - 1;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw C66580MXl.A11();
    }

    public final boolean hasNext() {
        A00();
        return AnonymousClass7TF.A1V(this.A03);
    }

    public final boolean hasPrevious() {
        A00();
        return AnonymousClass7TF.A1V(this.A04);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        A00();
        QzH qzH = this.A03;
        if (qzH != null) {
            this.A02 = qzH;
            this.A04 = qzH;
            this.A03 = qzH.A00;
            this.A01++;
            return qzH;
        }
        throw Pxe.A1C();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        A00();
        QzH qzH = this.A04;
        if (qzH != null) {
            this.A02 = qzH;
            this.A03 = qzH;
            this.A04 = qzH.A02;
            this.A01--;
            return qzH;
        }
        throw Pxe.A1C();
    }

    public final void remove() {
        A00();
        Pxh.A1T(AnonymousClass7TF.A1V(this.A02));
        QzH qzH = this.A02;
        if (qzH != this.A03) {
            this.A04 = qzH.A02;
            this.A01--;
        } else {
            this.A03 = qzH.A00;
        }
        LinkedListMultimap linkedListMultimap = this.A05;
        LinkedListMultimap.A01(qzH, linkedListMultimap);
        this.A02 = null;
        this.A00 = linkedListMultimap.A00;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw C66580MXl.A11();
    }
}
