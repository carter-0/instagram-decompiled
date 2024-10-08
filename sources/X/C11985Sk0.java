package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.Sk0  reason: case insensitive filesystem */
public final class C11985Sk0 implements C13700TfI {
    public boolean A00;
    public boolean A01;
    public final Set A02 = Collections.newSetFromMap(new WeakHashMap());

    public final void A00() {
        this.A01 = true;
        Iterator A0m = Pxi.A0m(this.A02);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onDestroy();
        }
    }

    public final void A8t(C13768Tgg tgg) {
        this.A02.add(tgg);
        if (this.A01) {
            tgg.onDestroy();
        } else if (this.A00) {
            tgg.onStart();
        } else {
            tgg.onStop();
        }
    }

    public final void EDq(C13768Tgg tgg) {
        this.A02.remove(tgg);
    }
}
