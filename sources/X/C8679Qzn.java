package X;

import com.google.common.collect.MapMakerInternalMap$AbstractSerializationProxy;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Qzn  reason: case insensitive filesystem */
public abstract class C8679Qzn<K, V> extends Qzu<K, V> implements ConcurrentMap<K, V> {
    public final Object putIfAbsent(Object obj, Object obj2) {
        return ((MapMakerInternalMap$AbstractSerializationProxy) this).A00.putIfAbsent(obj, obj2);
    }

    public final boolean remove(Object obj, Object obj2) {
        return ((MapMakerInternalMap$AbstractSerializationProxy) this).A00.remove(obj, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return ((MapMakerInternalMap$AbstractSerializationProxy) this).A00.replace(obj, obj2, obj3);
    }

    public final Object replace(Object obj, Object obj2) {
        return ((MapMakerInternalMap$AbstractSerializationProxy) this).A00.replace(obj, obj2);
    }
}
