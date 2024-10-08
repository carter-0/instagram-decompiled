package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TMv  reason: case insensitive filesystem */
public final class C13137TMv implements Map, Serializable {
    public static final C13137TMv A05 = new C13137TMv(new Object[0], 0);
    public transient C13241TRh A00;
    public transient C8501Qvx A01;
    public transient C8501Qvx A02;
    public final transient int A03;
    public final transient Object[] A04;

    public C13137TMv() {
    }

    public final int size() {
        return this.A03;
    }

    public final boolean containsValue(Object obj) {
        C13241TRh tRh = this.A00;
        if (tRh == null) {
            tRh = new C8503Qvz(this.A04, 1, this.A03);
            this.A00 = tRh;
        }
        return tRh.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        C8501Qvx qvx = this.A01;
        if (qvx != null) {
            return qvx;
        }
        C8500Qvw qvw = new C8500Qvw(this, this.A04, this.A03);
        this.A01 = qvw;
        return qvw;
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
        C8501Qvx<Object> qvx = this.A01;
        if (qvx == null) {
            qvx = new C8500Qvw(this, this.A04, this.A03);
            this.A01 = qvx;
        }
        int i = 0;
        for (Object A0E : qvx) {
            i += C51971G9r.A0E(A0E);
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C8501Qvx qvx = this.A02;
        if (qvx != null) {
            return qvx;
        }
        C8504Qw0 qw0 = new C8504Qw0(new C8503Qvz(this.A04, 0, this.A03), this);
        this.A02 = qw0;
        return qw0;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        C13241TRh tRh = this.A00;
        if (tRh != null) {
            return tRh;
        }
        C8503Qvz qvz = new C8503Qvz(this.A04, 1, this.A03);
        this.A00 = qvz;
        return qvz;
    }

    public C13137TMv(Object[] objArr, int i) {
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
