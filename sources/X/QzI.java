package X;

import com.google.common.collect.HashBiMap;

public final class QzI extends AnonymousClass42Q {
    public int A00;
    public final Object A01;
    public final /* synthetic */ HashBiMap A02;

    public QzI(HashBiMap hashBiMap, int i) {
        this.A02 = hashBiMap;
        this.A01 = hashBiMap.A0B[i];
        this.A00 = i;
    }

    public final void A00() {
        int i = this.A00;
        if (i != -1) {
            HashBiMap hashBiMap = this.A02;
            if (i <= hashBiMap.A02 && 2PP.A00(hashBiMap.A0B[i], this.A01)) {
                return;
            }
        }
        HashBiMap hashBiMap2 = this.A02;
        Object obj = this.A01;
        this.A00 = hashBiMap2.A0A(obj, 1J7.A02(obj));
    }

    public final Object getKey() {
        return this.A01;
    }

    public final Object getValue() {
        A00();
        int i = this.A00;
        if (i == -1) {
            return null;
        }
        return this.A02.A0C[i];
    }

    public final Object setValue(Object obj) {
        A00();
        int i = this.A00;
        HashBiMap hashBiMap = this.A02;
        if (i == -1) {
            hashBiMap.put(this.A01, obj);
            return null;
        }
        Object obj2 = hashBiMap.A0C[i];
        if (2PP.A00(obj2, obj)) {
            return obj;
        }
        HashBiMap.A09(hashBiMap, obj, this.A00, false);
        return obj2;
    }
}
