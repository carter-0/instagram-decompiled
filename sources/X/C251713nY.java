package X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.3nY  reason: invalid class name and case insensitive filesystem */
public final class C251713nY implements Iterator {
    public final /* synthetic */ C251683nV A00;
    public final /* synthetic */ Iterator A01;

    public C251713nY(C251683nV r1, Iterator it) {
        this.A00 = r1;
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C251683nV r3 = this.A00;
        File file = (File) this.A01.next();
        if (r3 instanceof C251823nj) {
            return new C251693nW(file);
        }
        if (r3 instanceof C251803nh) {
            C251683nV r1 = new C251683nV(file, r3.A02);
            r1.A00 = C251843nl.A00;
            return r1;
        } else if (r3 instanceof C251783nf) {
            C251683nV r12 = new C251683nV(file, r3.A02);
            r12.A00 = C251633nQ.A03;
            return r12;
        } else {
            boolean z = r3 instanceof C251673nU;
            boolean z2 = r3.A02;
            if (z) {
                C251683nV r13 = new C251683nV(file, z2);
                r13.A00 = C251633nQ.A03;
                return r13;
            }
            C251683nV r14 = new C251683nV(file, z2);
            r14.A00 = C251633nQ.A03;
            return r14;
        }
    }

    public final void remove() {
        this.A01.remove();
        throw null;
    }
}
