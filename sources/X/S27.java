package X;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class S27 {
    public final /* synthetic */ C10286Rpk A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ AtomicBoolean A02;

    public S27(C10286Rpk rpk, List list, AtomicBoolean atomicBoolean) {
        this.A01 = list;
        this.A02 = atomicBoolean;
        this.A00 = rpk;
    }

    public final void A00() {
        View view;
        Object obj;
        C13666Tea tea = null;
        for (C13666Tea tea2 : this.A01) {
            S1O BzA = tea2.BzA();
            0qQ.A07(BzA);
            boolean z = BzA instanceof C8755R8g;
            if (z) {
                view = ((C8755R8g) BzA).A00.A00;
            } else {
                view = ((C8754R8f) BzA).A00.A00;
            }
            if (view != null) {
                boolean z2 = this.A02.get();
                if (BzA.A01) {
                    if (z) {
                        obj = ((C8755R8g) BzA).A00.A00;
                    } else {
                        obj = ((C8754R8f) BzA).A00.A00;
                    }
                    if (obj != null) {
                        boolean z3 = BzA instanceof C8754R8f;
                        if (!z2 ? !z3 : z3) {
                            if (tea == null) {
                                this.A00.A00.execute(new TDY(view));
                                tea = tea2;
                            }
                        }
                    }
                }
                this.A00.A00.execute(new TDX(view));
            }
        }
    }
}
