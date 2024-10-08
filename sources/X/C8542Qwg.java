package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Qwg  reason: case insensitive filesystem */
public final class C8542Qwg extends TSC {
    public final /* synthetic */ TS3 A00;

    public C8542Qwg(TS3 ts3) {
        this.A00 = ts3;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.A00.A02.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return new TMD(this.A00);
    }

    public final int size() {
        return this.A00.size();
    }

    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        C8528QwS qwS = this.A00.A03;
        Object key = entry.getKey();
        Map map = qwS.A01;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        qwS.A00 -= size;
        return true;
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return C9717Rfa.A00(collection, this);
        } catch (UnsupportedOperationException unused) {
            boolean z = false;
            for (Object remove : collection) {
                z |= remove(remove);
            }
            return z;
        }
    }

    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i = size + 1;
                } else {
                    StringBuilder A14 = Pxe.A14("expectedSize".length() + 40);
                    A14.append("expectedSize");
                    throw AnonymousClass7TE.A0w(Pxg.A0t(" cannot be negative but was: ", A14, size));
                }
            } else if (size < 1073741824) {
                i = (int) ((((float) size) / 0.75f) + 1.0f);
            } else {
                i = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            C8528QwS qwS = this.A00.A03;
            Set set = qwS.A01;
            if (set == null) {
                set = new C8541Qwf(qwS, qwS.A01);
                qwS.A01 = set;
            }
            return set.retainAll(hashSet);
        }
    }

    public C8542Qwg() {
    }
}
