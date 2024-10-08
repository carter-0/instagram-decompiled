package com.google.common.collect;

import X.AnonymousClass7TE;
import X.C249803kO;
import X.R0I;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import java.io.Serializable;
import java.util.Map;

public class ImmutableMap$SerializedForm implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object keys;
    public final Object values;

    public final Object readResolve() {
        R0I r0i;
        R0I builder;
        Object obj = this.keys;
        if (!(obj instanceof ImmutableSet)) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) this.values;
            int length = objArr.length;
            if (this instanceof ImmutableSortedMap.SerializedForm) {
                r0i = new R0I(((ImmutableSortedMap.SerializedForm) this).comparator);
            } else if (this instanceof ImmutableBiMap.SerializedForm) {
                r0i = new ImmutableMap.Builder(length);
            } else {
                r0i = new ImmutableMap.Builder(length);
            }
            for (int i = 0; i < objArr.length; i++) {
                r0i.put(objArr[i], objArr2[i]);
            }
        } else {
            ImmutableCollection immutableCollection = (ImmutableCollection) obj;
            ImmutableCollection immutableCollection2 = (ImmutableCollection) this.values;
            int size = immutableCollection.size();
            if (this instanceof ImmutableSortedMap.SerializedForm) {
                builder = new R0I(((ImmutableSortedMap.SerializedForm) this).comparator);
            } else if (this instanceof ImmutableBiMap.SerializedForm) {
                builder = new ImmutableMap.Builder(size);
            } else {
                builder = new ImmutableMap.Builder(size);
            }
            C249803kO it = immutableCollection.iterator();
            C249803kO it2 = immutableCollection2.iterator();
            while (it.hasNext()) {
                r0i.put(it.next(), it2.next());
            }
        }
        return r0i.buildOrThrow();
    }

    public ImmutableMap$SerializedForm(ImmutableMap immutableMap) {
        Object[] objArr = new Object[immutableMap.size()];
        Object[] objArr2 = new Object[immutableMap.size()];
        C249803kO it = immutableMap.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(it);
            objArr[i] = A1J.getKey();
            objArr2[i] = A1J.getValue();
            i++;
        }
        this.keys = objArr;
        this.values = objArr2;
    }
}
