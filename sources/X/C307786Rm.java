package X;

import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Rm  reason: invalid class name and case insensitive filesystem */
public final class C307786Rm implements C307796Rn {
    public final Context A00;
    public final SparseArray A01;
    public final C229392nJ A02;
    public final Map A03 = Collections.synchronizedMap(new HashMap(4));
    public final Map A04 = new HashMap(4);
    public final boolean A05;

    public final Object A00(int i) {
        Object obj = this.A01.get(i);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(002.A0R("Null value associated with key: ", this.A00.getResources().getResourceEntryName(i)));
    }

    public final Object A01(C276574tY r6, C276544tV r7, int i) {
        Integer valueOf;
        Object obj;
        Object obj2;
        int i2 = r7.A03;
        synchronized (this) {
            Map map = this.A04;
            valueOf = Integer.valueOf(i2);
            obj = map.get(valueOf);
            if (obj == null) {
                obj = new Object();
                map.put(valueOf, obj);
            }
        }
        synchronized (obj) {
            Map map2 = this.A03;
            SparseArray sparseArray = (SparseArray) map2.get(valueOf);
            if (sparseArray == null) {
                sparseArray = new SparseArray(2);
                map2.put(valueOf, sparseArray);
            }
            obj2 = sparseArray.get(i);
            if (obj2 == null) {
                obj2 = r6.CrD(this, r7);
            }
            sparseArray.put(i, obj2);
        }
        return obj2;
    }

    public final boolean CRA() {
        return this.A05;
    }

    public C307786Rm(Context context, SparseArray sparseArray, C229392nJ r5) {
        this.A00 = context;
        this.A02 = r5;
        this.A05 = r5.AgE().AEv(context);
        this.A01 = sparseArray;
    }
}
