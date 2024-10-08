package X;

import java.util.Iterator;

public final class TMR implements Iterator {
    public int A00;
    public int A01;
    public S79 A02;
    public boolean A03;
    public final AnonymousClass3W6 A04;
    public final Iterator A05;

    public final boolean hasNext() {
        if (this.A00 > 0 || this.A05.hasNext()) {
            return true;
        }
        return false;
    }

    public final void remove() {
        Pxh.A1T(this.A03);
        if (this.A01 == 1) {
            this.A05.remove();
        } else {
            AnonymousClass3W6 r1 = this.A04;
            S79 s79 = this.A02;
            s79.getClass();
            r1.remove(s79.A01());
        }
        this.A01--;
        this.A03 = false;
    }

    public TMR(AnonymousClass3W6 r1, Iterator it) {
        this.A04 = r1;
        this.A05 = it;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            if (i == 0) {
                S79 s79 = (S79) this.A05.next();
                this.A02 = s79;
                i = s79.A00();
                this.A00 = i;
                this.A01 = i;
            }
            this.A00 = i - 1;
            this.A03 = true;
            S79 s792 = this.A02;
            s792.getClass();
            return s792.A01();
        }
        throw Pxe.A1C();
    }
}
