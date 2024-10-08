package X;

import com.google.common.collect.LinkedListMultimap;
import java.util.ListIterator;

/* renamed from: X.TMm  reason: case insensitive filesystem */
public final class C13128TMm implements ListIterator {
    public int A00;
    public QzH A01;
    public QzH A02;
    public QzH A03;
    public final Object A04;
    public final /* synthetic */ LinkedListMultimap A05;

    public C13128TMm(LinkedListMultimap linkedListMultimap, Object obj, int i) {
        int i2;
        QzH qzH;
        QzH qzH2;
        this.A05 = linkedListMultimap;
        C9131RQf rQf = (C9131RQf) linkedListMultimap.A04.get(obj);
        if (rQf == null) {
            i2 = 0;
        } else {
            i2 = rQf.A00;
        }
        17k.A02(i, i2);
        if (i < i2 / 2) {
            if (rQf == null) {
                qzH = null;
            } else {
                qzH = rQf.A01;
            }
            this.A02 = qzH;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            if (rQf == null) {
                qzH2 = null;
            } else {
                qzH2 = rQf.A02;
            }
            this.A03 = qzH2;
            this.A00 = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.A04 = obj;
        this.A01 = null;
    }

    public final void add(Object obj) {
        this.A03 = LinkedListMultimap.A00(this.A02, this.A05, this.A04, obj);
        this.A00++;
        this.A01 = null;
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1V(this.A02);
    }

    public final boolean hasPrevious() {
        return AnonymousClass7TF.A1V(this.A03);
    }

    public final Object next() {
        QzH qzH = this.A02;
        if (qzH != null) {
            this.A01 = qzH;
            this.A03 = qzH;
            this.A02 = qzH.A01;
            this.A00++;
            return qzH.A04;
        }
        throw Pxe.A1C();
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final Object previous() {
        QzH qzH = this.A03;
        if (qzH != null) {
            this.A01 = qzH;
            this.A02 = qzH;
            this.A03 = qzH.A03;
            this.A00--;
            return qzH.A04;
        }
        throw Pxe.A1C();
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public final void remove() {
        Pxh.A1T(AnonymousClass7TF.A1V(this.A01));
        QzH qzH = this.A01;
        if (qzH != this.A02) {
            this.A03 = qzH.A03;
            this.A00--;
        } else {
            this.A02 = qzH.A01;
        }
        LinkedListMultimap.A01(qzH, this.A05);
        this.A01 = null;
    }

    public final void set(Object obj) {
        QzH qzH = this.A01;
        17k.A0F(AnonymousClass7TF.A1V(qzH));
        qzH.A04 = obj;
    }

    public C13128TMm(LinkedListMultimap linkedListMultimap, Object obj) {
        QzH qzH;
        this.A05 = linkedListMultimap;
        this.A04 = obj;
        C9131RQf rQf = (C9131RQf) linkedListMultimap.A04.get(obj);
        if (rQf == null) {
            qzH = null;
        } else {
            qzH = rQf.A01;
        }
        this.A02 = qzH;
    }
}
