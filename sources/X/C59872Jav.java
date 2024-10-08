package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jav  reason: case insensitive filesystem */
public final class C59872Jav implements MUU {
    public C59796JYp A00;
    public final C59873Jaw A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final void A00() {
        C59873Jaw jaw = this.A01;
        C59796JYp A012 = jaw.A01();
        if (A012 != null) {
            if (A012.A07 != null) {
                0nY.A00().ATE(new 0wS(A012.A07));
            }
            boolean remove = jaw.A01.remove(A012);
            C59874Jax jax = jaw.A00;
            if (remove && jax != null) {
                jax.A00(A012);
                return;
            }
            return;
        }
        0KC.A0D("ClipStackManager", "Attempted to delete a non-existent clip");
    }

    public final boolean A01() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((C59796JYp) it.next()).A05 != AnonymousClass05K.A00) {
                return true;
            }
        }
        return false;
    }

    public final void D3S(C59796JYp jYp, long j) {
        List<C66523MVb> list = this.A02;
        for (C66523MVb D3R : list) {
            D3R.D3R(jYp);
        }
        if (60000 - this.A01.A00() < 300) {
            for (C66523MVb D3X : list) {
                D3X.D3X();
            }
        }
    }

    public final void D3Y(C59796JYp jYp, Integer num) {
        for (C66523MVb D3Q : this.A02) {
            D3Q.D3Q(jYp, num);
        }
    }

    public C59872Jav() {
        C59873Jaw jaw = new C59873Jaw();
        this.A01 = jaw;
        jaw.A00 = new C59874Jax(this);
    }
}
