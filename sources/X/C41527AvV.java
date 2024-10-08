package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.AvV  reason: case insensitive filesystem */
public class C41527AvV extends WeakReference implements C367948rp {
    public final int A00;
    public final C367948rp A01;
    public volatile C367718rS A02 = C367698rQ.A0L;

    public final long AXi() {
        if (this instanceof C383949gW) {
            return ((C383949gW) this).A04;
        }
        if (this instanceof C383929gU) {
            return ((C383929gU) this).A02;
        }
        throw new UnsupportedOperationException();
    }

    public final int BCU() {
        return this.A00;
    }

    public final C367948rp BW2() {
        return this.A01;
    }

    public final C367948rp BW9() {
        if (this instanceof C383949gW) {
            return ((C383949gW) this).A00;
        }
        if (this instanceof C383929gU) {
            return ((C383929gU) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    public final C367948rp BWA() {
        if (this instanceof C383939gV) {
            return ((C383939gV) this).A00;
        }
        if (this instanceof C383949gW) {
            return ((C383949gW) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    public final C367948rp BfD() {
        if (this instanceof C383949gW) {
            return ((C383949gW) this).A02;
        }
        if (this instanceof C383929gU) {
            return ((C383929gU) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    public final C367948rp BfE() {
        if (this instanceof C383939gV) {
            return ((C383939gV) this).A01;
        }
        if (this instanceof C383949gW) {
            return ((C383949gW) this).A03;
        }
        throw new UnsupportedOperationException();
    }

    public final C367718rS CDT() {
        return this.A02;
    }

    public final long CGr() {
        if (this instanceof C383939gV) {
            return ((C383939gV) this).A02;
        }
        if (this instanceof C383949gW) {
            return ((C383949gW) this).A05;
        }
        throw new UnsupportedOperationException();
    }

    public final void ENT(long j) {
        if (this instanceof C383949gW) {
            ((C383949gW) this).A04 = j;
        } else if (this instanceof C383929gU) {
            ((C383929gU) this).A02 = j;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void EeA(C367948rp r2) {
        if (this instanceof C383949gW) {
            ((C383949gW) this).A00 = r2;
        } else if (this instanceof C383929gU) {
            ((C383929gU) this).A00 = r2;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void EeB(C367948rp r2) {
        if (this instanceof C383939gV) {
            ((C383939gV) this).A00 = r2;
        } else if (this instanceof C383949gW) {
            ((C383949gW) this).A01 = r2;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void Egf(C367948rp r2) {
        if (this instanceof C383949gW) {
            ((C383949gW) this).A02 = r2;
        } else if (this instanceof C383929gU) {
            ((C383929gU) this).A01 = r2;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void Egg(C367948rp r2) {
        if (this instanceof C383939gV) {
            ((C383939gV) this).A01 = r2;
        } else if (this instanceof C383949gW) {
            ((C383949gW) this).A03 = r2;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void Er2(long j) {
        if (this instanceof C383939gV) {
            ((C383939gV) this).A02 = j;
        } else if (this instanceof C383949gW) {
            ((C383949gW) this).A05 = j;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public C41527AvV(C367948rp r2, Object obj, ReferenceQueue referenceQueue, int i) {
        super(obj, referenceQueue);
        this.A00 = i;
        this.A01 = r2;
    }

    public final Object getKey() {
        return get();
    }

    public final void Epz(C367718rS r1) {
        this.A02 = r1;
    }
}
