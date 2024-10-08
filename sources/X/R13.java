package X;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public final class R13 extends R1H implements NavigableSet, SortedSet {
    public final C13959TmM A00;

    public final Object ceiling(Object obj) {
        S79 AVj = this.A00.EzU(BoundType.CLOSED, obj).AVj();
        if (AVj == null) {
            return null;
        }
        return AVj.A01();
    }

    public final Comparator comparator() {
        return this.A00.comparator();
    }

    public final NavigableSet descendingSet() {
        return new R13(this.A00.AOl());
    }

    public final Object first() {
        S79 AVj = this.A00.AVj();
        if (AVj != null) {
            return AVj.A01();
        }
        throw Pxe.A1C();
    }

    public final Object floor(Object obj) {
        S79 CfO = this.A00.CL8(BoundType.CLOSED, obj).CfO();
        if (CfO == null) {
            return null;
        }
        return CfO.A01();
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        BoundType boundType;
        C13959TmM tmM = this.A00;
        if (z) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        return new R13(tmM.CL8(boundType, obj));
    }

    public final Object higher(Object obj) {
        S79 AVj = this.A00.EzU(BoundType.OPEN, obj).AVj();
        if (AVj == null) {
            return null;
        }
        return AVj.A01();
    }

    public final Iterator iterator() {
        return new R1L(this.A00.entrySet().iterator(), 2);
    }

    public final Object last() {
        S79 CfO = this.A00.CfO();
        if (CfO != null) {
            return CfO.A01();
        }
        throw Pxe.A1C();
    }

    public final Object lower(Object obj) {
        S79 CfO = this.A00.CL8(BoundType.OPEN, obj).CfO();
        if (CfO == null) {
            return null;
        }
        return CfO.A01();
    }

    public final Object pollFirst() {
        S79 E2x = this.A00.E2x();
        if (E2x == null) {
            return null;
        }
        return E2x.A01();
    }

    public final Object pollLast() {
        S79 E2y = this.A00.E2y();
        if (E2y == null) {
            return null;
        }
        return E2y.A01();
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return this.A00.Eyh(BoundType.CLOSED, BoundType.OPEN, obj, obj2).ARC();
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        BoundType boundType;
        C13959TmM tmM = this.A00;
        if (z) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        return new R13(tmM.EzU(boundType, obj));
    }

    public R13(C13959TmM tmM) {
        this.A00 = tmM;
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final SortedSet headSet(Object obj) {
        return this.A00.CL8(BoundType.OPEN, obj).ARC();
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        BoundType boundType;
        BoundType boundType2;
        C13959TmM tmM = this.A00;
        if (z) {
            boundType = BoundType.CLOSED;
        } else {
            boundType = BoundType.OPEN;
        }
        if (z2) {
            boundType2 = BoundType.CLOSED;
        } else {
            boundType2 = BoundType.OPEN;
        }
        return new R13(tmM.Eyh(boundType, boundType2, obj, obj2));
    }

    public final SortedSet tailSet(Object obj) {
        return this.A00.EzU(BoundType.CLOSED, obj).ARC();
    }
}
