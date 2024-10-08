package X;

import com.google.common.collect.ImmutableMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.42L  reason: invalid class name */
public abstract class AnonymousClass42L implements C257513xW {
    public transient Collection A00;
    public transient Map A01;
    public transient Set A02;

    public Collection A04() {
        return new ImmutableMultimap.EntryCollection((ImmutableMultimap) this);
    }

    public Iterator A05() {
        return new R1T((ImmutableMultimap) this);
    }

    public Map A06() {
        throw new AssertionError(Pxd.A00(103));
    }

    public Set A07() {
        throw new AssertionError("unreachable");
    }

    public final Map ACX() {
        if (this instanceof ImmutableMultimap) {
            return ((ImmutableMultimap) this).A01;
        }
        Map map = this.A01;
        if (map != null) {
            return map;
        }
        Map A06 = A06();
        this.A01 = A06;
        return A06;
    }

    public Collection ASn() {
        Collection collection = this.A00;
        if (collection != null) {
            return collection;
        }
        Collection A04 = A04();
        this.A00 = A04;
        return A04;
    }

    public boolean E5L(Object obj, Object obj2) {
        if (!(this instanceof ImmutableMultimap)) {
            return AXL(obj).add(obj2);
        }
        throw new UnsupportedOperationException();
    }

    public final boolean E5Q(C257513xW r5) {
        if (this instanceof ImmutableMultimap) {
            throw new UnsupportedOperationException();
        }
        boolean z = false;
        for (Map.Entry entry : r5.ASn()) {
            z |= E5L(entry.getKey(), entry.getValue());
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C257513xW) {
            return ACX().equals(((C257513xW) obj).ACX());
        }
        return false;
    }

    public final Set keySet() {
        if (this instanceof ImmutableMultimap) {
            return ((ImmutableMultimap) this).A01.keySet();
        }
        Set set = this.A02;
        if (set != null) {
            return set;
        }
        Set A07 = A07();
        this.A02 = A07;
        return A07;
    }

    public final boolean remove(Object obj, Object obj2) {
        if (this instanceof ImmutableMultimap) {
            throw new UnsupportedOperationException();
        }
        Collection collection = (Collection) ACX().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }

    public final boolean AJa(Object obj, Object obj2) {
        Collection collection = (Collection) ACX().get(obj);
        if (collection == null || !collection.contains(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ACX().hashCode();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return ACX().toString();
    }
}
