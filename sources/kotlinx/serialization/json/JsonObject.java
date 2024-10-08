package kotlinx.serialization.json;

import X.00k;
import X.0qQ;
import X.C255463uA;
import X.C276384tF;
import X.C62650uo;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonObjectSerializer.class)
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, C62650uo {
    public static final Companion Companion = new Object();
    public final Map A00;

    public final class Companion {
        public final C255463uA serializer() {
            return JsonObjectSerializer.A01;
        }
    }

    public JsonObject(Map map) {
        0qQ.A0B(map, 1);
        this.A00 = map;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        0qQ.A0B(obj, 0);
        return this.A00.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        0qQ.A0B(obj, 0);
        return this.A00.containsValue(obj);
    }

    public final /* bridge */ Set entrySet() {
        return this.A00.entrySet();
    }

    public final boolean equals(Object obj) {
        return 0qQ.A0K(this.A00, obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        0qQ.A0B(obj, 0);
        return this.A00.get(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ Set keySet() {
        return this.A00.keySet();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final String toString() {
        return 00k.A0P(",", "{", "}", this.A00.entrySet(), new C276384tF());
    }

    public final /* bridge */ Collection values() {
        return this.A00.values();
    }
}
