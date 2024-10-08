package X;

import com.google.common.collect.HashBiMap;
import java.util.Map;

/* renamed from: X.Qzy  reason: case insensitive filesystem */
public final class C8682Qzy<K, V> extends TSE<K, V, Map.Entry<V, K>> {
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        HashBiMap hashBiMap = this.A00;
        int A0B = hashBiMap.A0B(key, 1J7.A02(key));
        if (A0B == -1 || !2PP.A00(hashBiMap.A0B[A0B], value)) {
            return false;
        }
        return true;
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int A02 = 1J7.A02(key);
        HashBiMap hashBiMap = this.A00;
        int A0B = hashBiMap.A0B(key, A02);
        if (A0B == -1 || !2PP.A00(hashBiMap.A0B[A0B], value)) {
            return false;
        }
        hashBiMap.A0F(A0B, A02);
        return true;
    }
}
