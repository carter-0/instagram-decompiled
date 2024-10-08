package com.google.common.collect;

import X.17k;
import X.AnonymousClass42L;
import X.AnonymousClass42M;
import X.C13240TRg;
import X.C8663Qz4;
import X.C8664Qz5;
import X.C8665Qz6;
import X.C8666Qz7;
import X.C8667Qz8;
import X.C8669QzA;
import X.C8670QzB;
import X.R0r;
import X.R0x;
import X.R0y;
import X.R1I;
import X.TMH;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

public abstract class AbstractMapBasedMultimap extends AnonymousClass42L implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient int A00;
    public transient Map A01;

    public final Collection A04() {
        if (this instanceof AnonymousClass42M) {
            return new R0y(this);
        }
        return new R0y(this);
    }

    public final Iterator A05() {
        if (this instanceof LinkedHashMultimap) {
            return new TMH((LinkedHashMultimap) this);
        }
        return new C8664Qz5(this);
    }

    public final Map A06() {
        boolean z = this instanceof Multimaps$CustomListMultimap;
        Map map = this.A01;
        if (!z) {
            return new R0x(this, map);
        }
        if (map instanceof NavigableMap) {
            return new C8666Qz7(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C8663Qz4(this, (SortedMap) map);
        }
        return new R0x(this, map);
    }

    public final Set A07() {
        boolean z = this instanceof Multimaps$CustomListMultimap;
        Map map = this.A01;
        if (!z) {
            return new R0r(this, map);
        }
        if (map instanceof NavigableMap) {
            return new C8667Qz8(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new C8665Qz6(this, (SortedMap) map);
        }
        return new R0r(this, map);
    }

    public Collection A08() {
        if (this instanceof ArrayListMultimap) {
            return new ArrayList(((ArrayListMultimap) this).expectedValuesPerKey);
        }
        if (this instanceof LinkedHashMultimap) {
            return new CompactHashSet(((LinkedHashMultimap) this).valueSetCapacity);
        }
        return (Collection) ((Multimaps$CustomListMultimap) this).A00.get();
    }

    public final Collection A09(Object obj, Collection collection) {
        if (this instanceof AbstractSetMultimap) {
            return new C8670QzB(this, obj, (Set) collection);
        }
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new C8669QzA((C13240TRg) null, this, obj, list);
        }
        return new C8669QzA((C13240TRg) null, this, obj, list);
    }

    public final void A0A(Map map) {
        this.A01 = map;
        this.A00 = 0;
        for (Collection collection : map.values()) {
            17k.A0E(!collection.isEmpty());
            this.A00 += collection.size();
        }
    }

    public Collection AXL(Object obj) {
        Collection collection = (Collection) this.A01.get(obj);
        if (collection == null) {
            if (this instanceof LinkedHashMultimap) {
                LinkedHashMultimap linkedHashMultimap = (LinkedHashMultimap) this;
                collection = new R1I(linkedHashMultimap, obj, linkedHashMultimap.valueSetCapacity);
            } else {
                collection = A08();
            }
        }
        return A09(obj, collection);
    }

    public final boolean E5L(Object obj, Object obj2) {
        Collection A08;
        Collection collection = (Collection) this.A01.get(obj);
        if (collection == null) {
            if (this instanceof LinkedHashMultimap) {
                LinkedHashMultimap linkedHashMultimap = (LinkedHashMultimap) this;
                A08 = new R1I(linkedHashMultimap, obj, linkedHashMultimap.valueSetCapacity);
            } else {
                A08 = A08();
            }
            if (A08.add(obj2)) {
                this.A00++;
                this.A01.put(obj, A08);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.A00++;
            return true;
        }
    }

    public Collection EDC(Object obj) {
        Collection collection = (Collection) this.A01.remove(obj);
        if (collection != null) {
            Collection A08 = A08();
            A08.addAll(collection);
            this.A00 -= collection.size();
            collection.clear();
            if (this instanceof AbstractSetMultimap) {
                return Collections.unmodifiableSet((Set) A08);
            }
            return Collections.unmodifiableList((List) A08);
        } else if (this instanceof AbstractSetMultimap) {
            return Collections.emptySet();
        } else {
            return Collections.emptyList();
        }
    }

    public void clear() {
        for (Collection clear : this.A01.values()) {
            clear.clear();
        }
        this.A01.clear();
        this.A00 = 0;
    }

    public final boolean containsKey(Object obj) {
        return this.A01.containsKey(obj);
    }

    public final int size() {
        return this.A00;
    }
}
