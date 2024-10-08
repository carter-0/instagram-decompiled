package X;

import java.util.Iterator;

public final class TMN implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ TS5 A03;

    public final /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        TS5 ts5 = this.A03;
        if (i < ts5.A00.size()) {
            return ts5.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass7TF.A0u(ts5.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public TMN(TS5 ts5) {
        this.A03 = ts5;
    }

    public final boolean hasNext() {
        int i = this.A00 + 1;
        TS5 ts5 = this.A03;
        if (i >= ts5.A00.size()) {
            if (ts5.A01.isEmpty()) {
                return false;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass7TF.A0u(ts5.A01);
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
            TS5 ts5 = this.A03;
            TS5.A03(ts5);
            if (this.A00 < ts5.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                TS5.A01(ts5, i);
                return;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass7TF.A0u(ts5.A01);
                this.A01 = it;
            }
            it.remove();
            return;
        }
        throw AnonymousClass7TE.A0z("remove() was called before next()");
    }
}
