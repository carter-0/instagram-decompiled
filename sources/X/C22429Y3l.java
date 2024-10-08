package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Y3l  reason: case insensitive filesystem */
public abstract class C22429Y3l implements Iterator {
    public int A00;
    public AnonymousClass54c A01 = null;
    public AnonymousClass54c A02;
    public final /* synthetic */ C2807854a A03;

    public C22429Y3l(C2807854a r2) {
        this.A03 = r2;
        this.A02 = r2.A05.A02;
        this.A00 = r2.A00;
    }

    public final AnonymousClass54c A00() {
        AnonymousClass54c r2 = this.A02;
        C2807854a r1 = this.A03;
        if (r2 == r1.A05) {
            throw new NoSuchElementException();
        } else if (r1.A00 == this.A00) {
            this.A02 = r2.A02;
            this.A01 = r2;
            return r2;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return C51969G9p.A1a(this.A02, this.A03.A05);
    }

    public final void remove() {
        AnonymousClass54c r2 = this.A01;
        if (r2 != null) {
            C2807854a r1 = this.A03;
            r1.A05(r2, true);
            this.A01 = null;
            this.A00 = r1.A00;
            return;
        }
        throw Pxe.A0i();
    }
}
