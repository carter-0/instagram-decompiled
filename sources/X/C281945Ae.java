package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: X.5Ae  reason: invalid class name and case insensitive filesystem */
public abstract class C281945Ae {
    public static HashSet A01(int i) {
        int i2;
        if (i < 3) {
            1J2.A00(i, "expectedSize");
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) Math.ceil(((double) i) / 0.75d);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new HashSet(i2);
    }

    public static boolean A04(Object obj, Set set) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static HashSet A02(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet hashSet = new HashSet();
        C11307SKv.A02(hashSet, it);
        return hashSet;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Set, X.TRe] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.Set, X.TRe] */
    public static Set A03(C12615Szz szz, Set set) {
        Collection collection;
        if (set instanceof SortedSet) {
            Collection collection2 = (SortedSet) set;
            if (collection2 instanceof QzX) {
                C13238TRe tRe = (C13238TRe) collection2;
                szz = C9734Rfs.A00(tRe.A00, szz);
                collection2 = tRe.A01;
            } else {
                collection2.getClass();
                szz.getClass();
            }
            return new C13238TRe(szz, collection2);
        }
        if (set instanceof QzX) {
            C13238TRe tRe2 = (C13238TRe) set;
            szz = C9734Rfs.A00(tRe2.A00, szz);
            collection = tRe2.A01;
        } else {
            set.getClass();
            szz.getClass();
            collection = set;
        }
        return new C13238TRe(szz, collection);
    }

    public static int A00(Set set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    public static boolean A05(Collection<Object> collection, Set set) {
        boolean z;
        collection.getClass();
        if (collection instanceof AnonymousClass3W6) {
            collection = ((AnonymousClass3W6) collection).ARD();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            z = false;
            for (Object remove : collection) {
                z |= set.remove(remove);
            }
        } else {
            Iterator it = set.iterator();
            z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
