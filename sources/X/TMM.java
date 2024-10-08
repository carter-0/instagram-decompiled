package X;

import java.util.Iterator;

public final class TMM implements Iterator {
    public int A00 = -1;
    public Iterator A01;
    public boolean A02;
    public final /* synthetic */ TS4 A03;

    public final /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        TS4 ts4 = this.A03;
        if (i < ts4.A00.size()) {
            return ts4.A00.get(this.A00);
        }
        Iterator it = this.A01;
        if (it == null) {
            it = AnonymousClass7TF.A0u(ts4.A01);
            this.A01 = it;
        }
        return it.next();
    }

    public TMM(TS4 ts4) {
        this.A03 = ts4;
    }

    public final boolean hasNext() {
        int i = this.A00 + 1;
        TS4 ts4 = this.A03;
        if (i >= ts4.A00.size()) {
            if (ts4.A01.isEmpty()) {
                return false;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass7TF.A0u(ts4.A01);
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
            TS4 ts4 = this.A03;
            TS4.A03(ts4);
            if (this.A00 < ts4.A00.size()) {
                int i = this.A00;
                this.A00 = i - 1;
                TS4.A01(ts4, i);
                return;
            }
            Iterator it = this.A01;
            if (it == null) {
                it = AnonymousClass7TF.A0u(ts4.A01);
                this.A01 = it;
            }
            it.remove();
            return;
        }
        throw AnonymousClass7TE.A0z("remove() was called before next()");
    }
}
