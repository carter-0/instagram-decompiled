package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class QzM extends AnonymousClass42L implements C13958TmL {
    public final 1UV A00;
    public final C257513xW A01;

    public static Collection A00(1UV r3, Collection collection) {
        if (collection instanceof Set) {
            return C281945Ae.A03(r3, (Set) collection);
        }
        if (collection instanceof C13238TRe) {
            C13238TRe tRe = (C13238TRe) collection;
            return new C13238TRe(C9734Rfs.A00(tRe.A00, r3), tRe.A01);
        }
        collection.getClass();
        r3.getClass();
        return new C13238TRe(r3, collection);
    }

    public final Collection A04() {
        if (this instanceof Qzf) {
            return C281945Ae.A03(this.A00, ((AnonymousClass42M) this.A01).ASo());
        }
        return A00(this.A00, this.A01.ASn());
    }

    public final Map A06() {
        return new R0u(this);
    }

    public final boolean A08(1UV r8) {
        Iterator A0u = AnonymousClass7TF.A0u(this.A01.ACX());
        boolean z = false;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Collection A002 = A00(new C12610Szu(this, key), Pxe.A18(A1J));
            if (!A002.isEmpty() && Pxi.A1V(r8, key, A002)) {
                if (A002.size() == Pxe.A18(A1J).size()) {
                    A0u.remove();
                } else {
                    A002.clear();
                }
                z = true;
            }
        }
        return z;
    }

    public Collection AXL(Object obj) {
        return A00(new C12610Szu(this, obj), this.A01.AXL(obj));
    }

    public QzM(1UV r1, C257513xW r2) {
        r2.getClass();
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Iterator A05() {
        throw Pxe.A0e("should never be called");
    }

    public final Set A07() {
        return ACX().keySet();
    }

    public Collection EDC(Object obj) {
        Object emptyList;
        Object remove = ACX().remove(obj);
        if (this.A01 instanceof AnonymousClass42M) {
            emptyList = Collections.emptySet();
        } else {
            emptyList = Collections.emptyList();
        }
        if (remove == null) {
            if (emptyList != null) {
                remove = emptyList;
            } else {
                throw AnonymousClass7TE.A11("Both parameters are null");
            }
        }
        return (Collection) remove;
    }

    public final void clear() {
        ASn().clear();
    }

    public final boolean containsKey(Object obj) {
        return AnonymousClass7TF.A1V(ACX().get(obj));
    }

    public final int size() {
        return ASn().size();
    }
}
