package X;

import java.util.Iterator;

public final class TMI implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ C7192Pyf A03;

    public final /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        C7192Pyf pyf = this.A03;
        if (i < pyf.A00.size()) {
            return pyf.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass7TF.A0u(pyf.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public TMI(C7192Pyf pyf) {
        this.A03 = pyf;
    }

    public final boolean hasNext() {
        int i = this.A00 + 1;
        C7192Pyf pyf = this.A03;
        if (i >= pyf.A00.size()) {
            if (pyf.A01.isEmpty()) {
                return false;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass7TF.A0u(pyf.A01);
                this.A01 = it;
            }
            if (it.hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void remove() {
        if (this.A02) {
            this.A02 = false;
            C7192Pyf pyf = this.A03;
            C7192Pyf.A03(pyf);
            if (this.A00 < pyf.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                C7192Pyf.A01(pyf, i);
                return;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass7TF.A0u(pyf.A01);
                this.A01 = it;
            }
            it.remove();
            return;
        }
        throw AnonymousClass7TE.A0z("remove() was called before next()");
    }
}
