package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class TS3 extends AbstractMap {
    public transient Collection A00;
    public transient Set A01;
    public final transient Map A02;
    public final /* synthetic */ C8528QwS A03;

    public TS3(C8528QwS qwS, Map map) {
        this.A03 = qwS;
        this.A02 = map;
    }

    public final void clear() {
        Map map = this.A02;
        C8528QwS qwS = this.A03;
        Map map2 = qwS.A01;
        if (map == map2) {
            Iterator A0v = AnonymousClass7TF.A0v(map2);
            while (A0v.hasNext()) {
                ((Collection) A0v.next()).clear();
            }
            map2.clear();
            qwS.A00 = 0;
            return;
        }
        TMD tmd = new TMD(this);
        while (tmd.hasNext()) {
            tmd.next();
            tmd.remove();
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.A02;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Set entrySet() {
        Set set = this.A01;
        if (set != null) {
            return set;
        }
        C8542Qwg qwg = new C8542Qwg(this);
        this.A01 = qwg;
        return qwg;
    }

    public final boolean equals(Object obj) {
        if (this == obj || this.A02.equals(obj)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2;
        Map map = this.A02;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.A03.A00(obj, collection);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final Set keySet() {
        C8528QwS qwS = this.A03;
        Set set = qwS.A01;
        if (set != null) {
            return set;
        }
        C8541Qwf qwf = new C8541Qwf(qwS, qwS.A01);
        qwS.A01 = qwf;
        return qwf;
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.A02.remove(obj);
        if (collection == null) {
            return null;
        }
        C8528QwS qwS = this.A03;
        ArrayList A0v = DbS.A0v(3);
        A0v.addAll(collection);
        qwS.A00 -= collection.size();
        collection.clear();
        return A0v;
    }

    public final int size() {
        return this.A02.size();
    }

    public final String toString() {
        return this.A02.toString();
    }

    public final Collection values() {
        Collection collection = this.A00;
        if (collection != null) {
            return collection;
        }
        C13236TRc tRc = new C13236TRc(this);
        this.A00 = tRc;
        return tRc;
    }

    public TS3() {
    }
}
