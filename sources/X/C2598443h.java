package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.43h  reason: invalid class name and case insensitive filesystem */
public final class C2598443h extends LinkedHashMap<String, C2598643j> {
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C2598643j)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        0qQ.A0B(str, 0);
        0qQ.A0B(obj2, 1);
        if (!containsKey(str)) {
            return super.put(str, obj2);
        }
        throw new IllegalArgumentException(002.A0R("Processor already exists for provided template: ", str));
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return super.remove(obj);
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof C2598643j)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
