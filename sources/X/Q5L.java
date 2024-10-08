package X;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

@Deprecated
public final class Q5L extends Fragment {
    public Sk4 A00;
    public Q5L A01;
    public final C11985Sk0 A02;
    public final TZq A03 = new Sk7(this);
    public final Set A04 = AnonymousClass7TE.A1F();

    public Q5L() {
        C11985Sk0 sk0 = new C11985Sk0();
        this.A02 = sk0;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            Q5L q5l = this.A01;
            if (q5l != null) {
                q5l.A04.remove(this);
                this.A01 = null;
            }
            Q5L A012 = C11458SVw.A01(activity.getFragmentManager(), SUv.A00(activity).A05);
            this.A01 = A012;
            if (!equals(A012)) {
                this.A01.A04.add(this);
            }
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.A02.A00();
        Q5L q5l = this.A01;
        if (q5l != null) {
            q5l.A04.remove(this);
            this.A01 = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        Q5L q5l = this.A01;
        if (q5l != null) {
            q5l.A04.remove(this);
            this.A01 = null;
        }
    }

    public final void onStart() {
        super.onStart();
        C11985Sk0 sk0 = this.A02;
        sk0.A00 = true;
        Iterator A0m = Pxi.A0m(sk0.A02);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        C11985Sk0 sk0 = this.A02;
        sk0.A00 = false;
        Iterator A0m = Pxi.A0m(sk0.A02);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStop();
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        return C66582MXn.A0v(parentFragment, A1A);
    }
}
