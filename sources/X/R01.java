package X;

import com.google.common.collect.HashBiMap;

public final class R01 extends TSE<K, V, V> {
    public final /* synthetic */ HashBiMap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R01(HashBiMap hashBiMap) {
        super(hashBiMap);
        this.A00 = hashBiMap;
    }

    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public final boolean remove(Object obj) {
        int A02 = 1J7.A02(obj);
        HashBiMap hashBiMap = this.A00;
        int A0B = hashBiMap.A0B(obj, A02);
        if (A0B == -1) {
            return false;
        }
        hashBiMap.A0F(A0B, A02);
        return true;
    }
}
