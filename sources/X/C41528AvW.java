package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.AvW  reason: case insensitive filesystem */
public final class C41528AvW<K, V> extends AbstractQueue<C367948rp<K, V>> {
    public final C367948rp A00 = new C383879gP();

    public final void clear() {
        C367948rp r3 = this.A00;
        C367948rp BW9 = r3.BW9();
        while (BW9 != r3) {
            C367948rp BW92 = BW9.BW9();
            C368428sb r0 = C368428sb.A01;
            BW9.EeA(r0);
            BW9.Egf(r0);
            BW9 = BW92;
        }
        r3.EeA(r3);
        r3.Egf(r3);
    }

    public final boolean contains(Object obj) {
        if (((C367948rp) obj).BW9() != C368428sb.A01) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        C367948rp r1 = this.A00;
        return AnonymousClass7TF.A1W(r1.BW9(), r1);
    }

    public final Iterator iterator() {
        C367948rp r0 = this.A00;
        C367948rp BW9 = r0.BW9();
        if (BW9 == r0) {
            BW9 = null;
        }
        return new C383979gZ(this, BW9);
    }

    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        C367948rp r3 = (C367948rp) obj;
        C367948rp BfD = r3.BfD();
        C367948rp BW9 = r3.BW9();
        BfD.EeA(BW9);
        BW9.Egf(BfD);
        C367948rp r1 = this.A00;
        C367948rp BfD2 = r1.BfD();
        BfD2.EeA(r3);
        r3.Egf(BfD2);
        r3.EeA(r1);
        r1.Egf(r3);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object peek() {
        C367948rp r1 = this.A00;
        C367948rp BW9 = r1.BW9();
        if (BW9 == r1) {
            return null;
        }
        return BW9;
    }

    public final /* bridge */ /* synthetic */ Object poll() {
        C367948rp r1 = this.A00;
        C367948rp BW9 = r1.BW9();
        if (BW9 == r1) {
            return null;
        }
        remove(BW9);
        return BW9;
    }

    public final boolean remove(Object obj) {
        C367948rp r4 = (C367948rp) obj;
        C367948rp BfD = r4.BfD();
        C367948rp BW9 = r4.BW9();
        BfD.EeA(BW9);
        BW9.Egf(BfD);
        C368428sb r1 = C368428sb.A01;
        r4.EeA(r1);
        r4.Egf(r1);
        if (BW9 != r1) {
            return true;
        }
        return false;
    }

    public final int size() {
        C367948rp r2 = this.A00;
        int i = 0;
        for (C367948rp BW9 = r2.BW9(); BW9 != r2; BW9 = BW9.BW9()) {
            i++;
        }
        return i;
    }
}
