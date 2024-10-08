package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.TMw  reason: case insensitive filesystem */
public final class C13138TMw implements Map, Serializable {
    public static final C13138TMw A05 = new C13138TMw(new Object[0], 0);
    public transient C13242TRi A00;
    public transient C8513Qw9 A01;
    public transient C8513Qw9 A02;
    public final transient int A03;
    public final transient Object[] A04;

    public C13138TMw() {
    }

    public final int size() {
        return this.A03;
    }

    public final boolean containsValue(Object obj) {
        C13242TRi tRi = this.A00;
        if (tRi == null) {
            tRi = new C8516QwC(this.A04, 1, this.A03);
            this.A00 = tRi;
        }
        return tRi.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        C8513Qw9 qw9 = this.A01;
        if (qw9 != null) {
            return qw9;
        }
        C8520QwG qwG = new C8520QwG(this, this.A04, this.A03);
        this.A01 = qwG;
        return qwG;
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
        C8513Qw9<Object> qw9 = this.A01;
        if (qw9 == null) {
            qw9 = new C8520QwG(this, this.A04, this.A03);
            this.A01 = qw9;
        }
        int i = 0;
        for (Object A0E : qw9) {
            i += C51971G9r.A0E(A0E);
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        C8513Qw9 qw9 = this.A02;
        if (qw9 != null) {
            return qw9;
        }
        C8519QwF qwF = new C8519QwF(new C8516QwC(this.A04, 0, this.A03), this);
        this.A02 = qwF;
        return qwF;
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        C13242TRi tRi = this.A00;
        if (tRi != null) {
            return tRi;
        }
        C8516QwC qwC = new C8516QwC(this.A04, 1, this.A03);
        this.A00 = qwC;
        return qwC;
    }

    public C13138TMw(Object[] objArr, int i) {
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
