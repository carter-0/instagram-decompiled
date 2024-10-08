package X;

import com.google.common.collect.CompactHashMap;

/* renamed from: X.42P  reason: invalid class name */
public final class AnonymousClass42P extends AnonymousClass42Q {
    public int A00;
    public final Object A01;
    public final /* synthetic */ CompactHashMap A02;

    public AnonymousClass42P(CompactHashMap compactHashMap, int i) {
        this.A02 = compactHashMap;
        Object[] objArr = compactHashMap.keys;
        objArr.getClass();
        this.A01 = objArr[i];
        this.A00 = i;
    }

    public static void A00(AnonymousClass42P r4) {
        int i = r4.A00;
        if (i != -1) {
            CompactHashMap compactHashMap = r4.A02;
            if (i < compactHashMap.size()) {
                Object obj = r4.A01;
                int i2 = r4.A00;
                Object[] objArr = compactHashMap.keys;
                objArr.getClass();
                if (2PP.A00(obj, objArr[i2])) {
                    return;
                }
            }
        }
        r4.A00 = CompactHashMap.A00(r4.A02, r4.A01);
    }
}
