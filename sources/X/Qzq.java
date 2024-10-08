package X;

import com.google.common.collect.BoundType;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public final class Qzq extends C8677Qzj implements C13959TmM {
    public transient Comparator A00;
    public transient NavigableSet A01;
    public transient Set A02;
    public final /* synthetic */ QzO A03;

    public Qzq(QzO qzO) {
        this.A03 = qzO;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ Collection A01() {
        return this.A03;
    }

    public final C13959TmM AOl() {
        return this.A03;
    }

    /* renamed from: ARC */
    public final NavigableSet ARD() {
        NavigableSet navigableSet = this.A01;
        if (navigableSet != null) {
            return navigableSet;
        }
        R13 r13 = new R13(this);
        this.A01 = r13;
        return r13;
    }

    public final S79 AVj() {
        return this.A03.CfO();
    }

    public final C13959TmM CL8(BoundType boundType, Object obj) {
        return this.A03.EzU(boundType, obj).AOl();
    }

    public final S79 CfO() {
        return this.A03.AVj();
    }

    public final S79 E2x() {
        return this.A03.E2y();
    }

    public final S79 E2y() {
        return this.A03.E2x();
    }

    public final C13959TmM Eyh(BoundType boundType, BoundType boundType2, Object obj, Object obj2) {
        return this.A03.Eyh(boundType2, boundType, obj2, obj).AOl();
    }

    public final C13959TmM EzU(BoundType boundType, Object obj) {
        return this.A03.CL8(boundType, obj).AOl();
    }

    public final Comparator comparator() {
        Comparator comparator = this.A00;
        if (comparator != null) {
            return comparator;
        }
        C264654Qt A012 = C264654Qt.A00(this.A03.comparator).A01();
        this.A00 = A012;
        return A012;
    }

    public final Set entrySet() {
        Set set = this.A02;
        if (set != null) {
            return set;
        }
        R15 r15 = new R15(this);
        this.A02 = r15;
        return r15;
    }

    public final Iterator iterator() {
        C13959TmM AOl = this.A03.AOl();
        return new TMR(AOl, AOl.entrySet().iterator());
    }

    public final Object[] toArray(Object[] objArr) {
        return 1Kw.A01(this, objArr);
    }

    public final String toString() {
        return entrySet().toString();
    }

    public Qzq() {
    }

    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
