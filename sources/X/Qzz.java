package X;

import com.google.common.collect.HashBiMap;
import java.util.Map;

public final class Qzz extends TSE<K, V, Map.Entry<K, V>> {
    public final /* synthetic */ HashBiMap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Qzz(HashBiMap hashBiMap) {
        super(hashBiMap);
        this.A00 = hashBiMap;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        HashBiMap hashBiMap = this.A00;
        int A0A = hashBiMap.A0A(key, 1J7.A02(key));
        if (A0A == -1 || !2PP.A00(value, hashBiMap.A0C[A0A])) {
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
        int A0A = hashBiMap.A0A(key, A02);
        if (A0A == -1 || !2PP.A00(value, hashBiMap.A0C[A0A])) {
            return false;
        }
        HashBiMap.A07(hashBiMap, A0A, A02, 1J7.A02(hashBiMap.A0C[A0A]));
        return true;
    }
}
