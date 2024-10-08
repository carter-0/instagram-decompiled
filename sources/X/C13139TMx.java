package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TMx  reason: case insensitive filesystem */
public final class C13139TMx implements Map, Serializable {
    public static final C13139TMx A05 = new C13139TMx(new Object[0], 0);
    public transient C13243TRj A00;
    public transient C8538Qwc A01;
    public transient C8538Qwc A02;
    public final transient int A03;
    public final transient Object[] A04;

    public C13139TMx() {
    }

    public final int size() {
        return this.A03;
    }

    public final boolean containsValue(Object obj) {
        C13243TRj tRj = this.A00;
        if (tRj == null) {
            tRj = new C8539Qwd(this.A04, 1, this.A03);
            this.A00 = tRj;
        }
        return tRj.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        C8538Qwc qwc = this.A01;
        if (qwc != null) {
            return qwc;
        }
        C8537Qwb qwb = new C8537Qwb(this, this.A04, this.A03);
        this.A01 = qwb;
        return qwb;
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

    public final Object get(Object obj) {
        return Pxk.A0G(obj, this.A04, this.A03);
    }

    public final int hashCode() {
        C8538Qwc<Object> qwc = this.A01;
        if (qwc == null) {
            qwc = new C8537Qwb(this, this.A04, this.A03);
            this.A01 = qwc;
        }
        int i = 0;
        for (Object A0E : qwc) {
            i += C51971G9r.A0E(A0E);
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C8538Qwc qwc = this.A02;
        if (qwc != null) {
            return qwc;
        }
        C8536Qwa qwa = new C8536Qwa(new C8539Qwd(this.A04, 0, this.A03), this);
        this.A02 = qwa;
        return qwa;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        C13243TRj tRj = this.A00;
        if (tRj != null) {
            return tRj;
        }
        C8539Qwd qwd = new C8539Qwd(this.A04, 1, this.A03);
        this.A00 = qwd;
        return qwd;
    }

    public C13139TMx(Object[] objArr, int i) {
        this.A04 = objArr;
        this.A03 = i;
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
        StringBuilder A0J = Pxk.A0J(size());
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
}
