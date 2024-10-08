package X;

import com.google.android.exoplayer2.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.4Sw  reason: invalid class name and case insensitive filesystem */
public final class C265184Sw {
    public final int A00;
    public final C264874Rq A01;
    public final CopyOnWriteArrayList A02;

    public final void A00() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass5EO r0 = (AnonymousClass5EO) it.next();
            Util.A0E(r0.A00, new C22399Y2f(this, r0.A01));
        }
    }

    public final void A01() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass5EO r0 = (AnonymousClass5EO) it.next();
            Util.A0E(r0.A00, new Y2g(this, r0.A01));
        }
    }

    public final void A02() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass5EO r0 = (AnonymousClass5EO) it.next();
            Util.A0E(r0.A00, new C22398Y2e(this, r0.A01));
        }
    }

    public final void A03(int i) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass5EO r0 = (AnonymousClass5EO) it.next();
            Util.A0E(r0.A00, new Y3N(this, r0.A01, i));
        }
    }

    public final void A04(Exception exc) {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            AnonymousClass5EO r0 = (AnonymousClass5EO) it.next();
            Util.A0E(r0.A00, new Y3M(this, r0.A01, exc));
        }
    }

    public C265184Sw(C264874Rq r1, CopyOnWriteArrayList copyOnWriteArrayList, int i) {
        this.A02 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = r1;
    }

    public C265184Sw() {
        this((C264874Rq) null, new CopyOnWriteArrayList(), 0);
    }
}
