package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TMu  reason: case insensitive filesystem */
public abstract class C13136TMu implements Map, Serializable {
    public static final Map.Entry[] A01 = new Map.Entry[0];
    public transient C8443Quo A00;

    public final boolean containsValue(Object obj) {
        return ((C8449Quu) this).A00.contains(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r1 < 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = r4
            X.Quu r3 = (X.C8449Quu) r3
            X.Quy r0 = r3.A01
            r2 = -1
            if (r5 == 0) goto L_0x0012
            X.Qut r1 = r0.A01     // Catch:{ ClassCastException -> 0x0012 }
            java.util.Comparator r0 = r0.A02     // Catch:{ ClassCastException -> 0x0012 }
            int r1 = java.util.Collections.binarySearch(r1, r5, r0)     // Catch:{ ClassCastException -> 0x0012 }
            if (r1 >= 0) goto L_0x0013
        L_0x0012:
            r1 = -1
        L_0x0013:
            if (r1 != r2) goto L_0x0017
            r0 = 0
            return r0
        L_0x0017:
            X.Qut r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13136TMu.get(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return ((C8449Quu) this).A01;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return ((C8449Quu) this).A00;
    }

    /* renamed from: A02 */
    public final C8443Quo entrySet() {
        C8443Quo quo = this.A00;
        if (quo == null) {
            C8449Quu quu = (C8449Quu) this;
            if (quu.isEmpty()) {
                quo = C8452Qux.A05;
            } else {
                quo = new C8451Quw(quu);
            }
            this.A00 = quo;
        }
        return quo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Deprecated
    public final void clear() {
        throw C66580MXl.A11();
    }

    public final boolean containsKey(Object obj) {
        return AnonymousClass7TF.A1V(get(obj));
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        int i = 0;
        for (Object A0E : entrySet()) {
            i += C51971G9r.A0E(A0E);
        }
        return i;
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(size());
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw C66580MXl.A11();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw C66580MXl.A11();
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder A0J = Pxk.A0J(size);
            Iterator it = entrySet().iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                if (!z) {
                    Pxe.A1Y(A0J);
                }
                Pxj.A1O(A0J, A1J);
                z = false;
            }
            return Pxg.A0x(A0J);
        }
        throw DbW.A0a("size cannot be negative but was: ", size);
    }
}
