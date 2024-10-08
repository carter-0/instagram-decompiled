package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Ik1  reason: case insensitive filesystem */
public abstract class C58008Ik1 implements Iterator {
    public C296935qt A00;
    public Iterator A01;
    public final C322186vO A02;

    public final C296935qt A00() {
        C296935qt r2;
        if (this instanceof HAJ) {
            if (this.A01 != null) {
                while (this.A01.hasNext()) {
                    try {
                        r2 = (C296935qt) this.A01.next();
                    } catch (AnonymousClass0fC | NoSuchElementException unused) {
                        r2 = null;
                    }
                    if ((r2 instanceof C296965qw) && this.A02.Esp(((C296965qw) r2).BPf())) {
                        return r2;
                    }
                }
            }
            return null;
        }
        boolean z = this instanceof HAL;
        Iterator it = this.A01;
        if (z) {
            if (it != null && it.hasNext()) {
                C296935qt r3 = (C296935qt) it.next();
                if (!(r3 instanceof HAX)) {
                    return r3;
                }
                HAX hax = (HAX) r3;
                C59558JOe jOe = hax.A02;
                if (!(jOe instanceof C57487Ibb) || this.A02.Esp(((C57487Ibb) jOe).A00)) {
                    return hax;
                }
            }
            return null;
        }
        if (it != null && it.hasNext()) {
            C296935qt r32 = (C296935qt) it.next();
            if (!(r32 instanceof HAW)) {
                return r32;
            }
            HAW haw = (HAW) r32;
            JOP jop = haw.A02;
            if (!(jop instanceof C65443LtR) || this.A02.Esp(((C65443LtR) jop).A00)) {
                return haw;
            }
        }
        return null;
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A01 != null) {
            C296935qt r1 = this.A00;
            if (r1 != null) {
                this.A00 = A00();
                return r1;
            }
            throw new NoSuchElementException();
        }
        throw new RuntimeException("Iterator should not be null when calling next()");
    }

    public C58008Ik1(C322186vO r1) {
        this.A02 = r1;
    }
}
