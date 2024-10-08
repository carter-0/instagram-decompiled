package X;

import com.google.common.collect.HashBiMap;

public final class R00 extends TSE<K, V, K> {
    public final /* synthetic */ HashBiMap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R00(HashBiMap hashBiMap) {
        super(hashBiMap);
        this.A00 = hashBiMap;
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int A02 = 1J7.A02(obj);
        HashBiMap hashBiMap = this.A00;
        int A0A = hashBiMap.A0A(obj, A02);
        if (A0A == -1) {
            return false;
        }
        HashBiMap.A07(hashBiMap, A0A, A02, 1J7.A02(hashBiMap.A0C[A0A]));
        return true;
    }
}
