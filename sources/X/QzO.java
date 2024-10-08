package X;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets$ImmutableEntry;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public abstract class QzO<E> extends AnonymousClass3W5<E> implements C13959TmM<E> {
    public transient C13959TmM A00;
    public final Comparator comparator;

    public final S79 CfO() {
        TMY tmy = new TMY((TreeMultiset) this, 2);
        if (tmy.hasNext()) {
            return (S79) tmy.next();
        }
        return null;
    }

    public final S79 E2y() {
        TMY tmy = new TMY((TreeMultiset) this, 2);
        if (!tmy.hasNext()) {
            return null;
        }
        S79 s79 = (S79) tmy.next();
        Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(s79.A01(), s79.A00());
        tmy.remove();
        return multisets$ImmutableEntry;
    }

    public final /* bridge */ /* synthetic */ Set A02() {
        return new R13(this);
    }

    public final C13959TmM AOl() {
        C13959TmM tmM = this.A00;
        if (tmM != null) {
            return tmM;
        }
        Qzq qzq = new Qzq(this);
        this.A00 = qzq;
        return qzq;
    }

    public final Comparator comparator() {
        return this.comparator;
    }

    public QzO(Comparator comparator2) {
        comparator2.getClass();
        this.comparator = comparator2;
    }

    /* renamed from: ARC */
    public final NavigableSet ARD() {
        return (NavigableSet) super.ARD();
    }

    public final S79 AVj() {
        Iterator A06 = A06();
        if (A06.hasNext()) {
            return (S79) A06.next();
        }
        return null;
    }

    public final S79 E2x() {
        Iterator A06 = A06();
        if (!A06.hasNext()) {
            return null;
        }
        S79 s79 = (S79) A06.next();
        Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(s79.A01(), s79.A00());
        A06.remove();
        return multisets$ImmutableEntry;
    }

    public final C13959TmM Eyh(BoundType boundType, BoundType boundType2, Object obj, Object obj2) {
        boundType.getClass();
        boundType2.getClass();
        return EzU(boundType, obj).CL8(boundType2, obj2);
    }

    public QzO() {
        this(NaturalOrdering.A00);
    }
}
