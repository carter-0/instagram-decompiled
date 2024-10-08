package X;

import com.google.common.collect.MapMakerInternalMap$AbstractSerializationProxy;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class Qzu<K, V> extends AnonymousClass28y implements Map<K, V> {
    public final Map A01() {
        if (!(this instanceof C8679Qzn)) {
            return ((C8678Qzl) this).A00;
        }
        C8679Qzn qzn = (C8679Qzn) this;
        if (qzn instanceof MapMakerInternalMap$AbstractSerializationProxy) {
            return ((MapMakerInternalMap$AbstractSerializationProxy) qzn).A00;
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean containsValue(Object obj) {
        if (!(this instanceof C8678Qzl)) {
            return A01().containsValue(obj);
        }
        R1L r1l = new R1L(AnonymousClass7TF.A0u(this), 1);
        if (obj == null) {
            while (r1l.hasNext()) {
                if (r1l.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (r1l.hasNext()) {
            if (obj.equals(r1l.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this || A01().equals(obj)) {
            return true;
        }
        return false;
    }

    public final void clear() {
        A01().clear();
    }

    public boolean containsKey(Object obj) {
        return A01().containsKey(obj);
    }

    public Set entrySet() {
        return A01().entrySet();
    }

    public Object get(Object obj) {
        return A01().get(obj);
    }

    public int hashCode() {
        return A01().hashCode();
    }

    public boolean isEmpty() {
        return A01().isEmpty();
    }

    public Set keySet() {
        return A01().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return A01().put(obj, obj2);
    }

    public final void putAll(Map map) {
        A01().putAll(map);
    }

    public final Object remove(Object obj) {
        return A01().remove(obj);
    }

    public int size() {
        return A01().size();
    }

    public final Collection values() {
        return A01().values();
    }
}
