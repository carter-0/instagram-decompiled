package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.Sk2  reason: case insensitive filesystem */
public final class C11986Sk2 implements C13768Tgg {
    public final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public final void onDestroy() {
        Iterator A0m = Pxi.A0m(this.A00);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onDestroy();
        }
    }

    public final void onStart() {
        Iterator A0m = Pxi.A0m(this.A00);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStart();
        }
    }

    public final void onStop() {
        Iterator A0m = Pxi.A0m(this.A00);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStop();
        }
    }
}
