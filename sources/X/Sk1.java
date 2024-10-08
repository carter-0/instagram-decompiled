package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.util.Iterator;
import java.util.Set;

public final class Sk1 implements C13700TfI, AnonymousClass07Y {
    public final AnonymousClass07V A00;
    public final Set A01 = AnonymousClass7TE.A1F();

    public final void A8t(C13768Tgg tgg) {
        this.A01.add(tgg);
        AnonymousClass07V r2 = this.A00;
        if (r2.A07() == 07U.A02) {
            tgg.onDestroy();
        } else if (r2.A07().compareTo(07U.A05) >= 0) {
            tgg.onStart();
        } else {
            tgg.onStop();
        }
    }

    public final void EDq(C13768Tgg tgg) {
        this.A01.remove(tgg);
    }

    @OnLifecycleEvent(07T.ON_DESTROY)
    public void onDestroy(AnonymousClass07Z r3) {
        Iterator A0m = Pxi.A0m(this.A01);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onDestroy();
        }
        r3.getLifecycle().A0A(this);
    }

    @OnLifecycleEvent(07T.ON_START)
    public void onStart(AnonymousClass07Z r3) {
        Iterator A0m = Pxi.A0m(this.A01);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStart();
        }
    }

    @OnLifecycleEvent(07T.ON_STOP)
    public void onStop(AnonymousClass07Z r3) {
        Iterator A0m = Pxi.A0m(this.A01);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStop();
        }
    }

    public Sk1(AnonymousClass07V r2) {
        this.A00 = r2;
        r2.A09(this);
    }
}
