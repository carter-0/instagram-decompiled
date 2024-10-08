package X;

import com.google.common.collect.HashBiMap;

/* renamed from: X.QzJ  reason: case insensitive filesystem */
public final class C8673QzJ extends AnonymousClass42Q {
    public int A00;
    public final HashBiMap A01;
    public final Object A02;

    private void A00() {
        int i = this.A00;
        if (i != -1) {
            HashBiMap hashBiMap = this.A01;
            if (i <= hashBiMap.A02 && 2PP.A00(this.A02, hashBiMap.A0C[i])) {
                return;
            }
        }
        HashBiMap hashBiMap2 = this.A01;
        Object obj = this.A02;
        this.A00 = hashBiMap2.A0B(obj, 1J7.A02(obj));
    }

    public final Object getKey() {
        return this.A02;
    }

    public C8673QzJ(HashBiMap hashBiMap, int i) {
        this.A01 = hashBiMap;
        this.A02 = hashBiMap.A0C[i];
        this.A00 = i;
    }

    public final Object getValue() {
        A00();
        int i = this.A00;
        if (i == -1) {
            return null;
        }
        return this.A01.A0B[i];
    }

    public final Object setValue(Object obj) {
        A00();
        int i = this.A00;
        HashBiMap hashBiMap = this.A01;
        if (i == -1) {
            hashBiMap.A0C(this.A02, obj);
            return null;
        }
        Object obj2 = hashBiMap.A0B[i];
        if (2PP.A00(obj2, obj)) {
            return obj;
        }
        HashBiMap.A08(hashBiMap, obj, this.A00);
        return obj2;
    }
}
