package X;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.Set;

public final class QCF extends Fragment {
    public Sk4 A00;
    public QCF A01;
    public final C11985Sk0 A02;
    public final TZq A03 = new C11989Sk8(this);
    public final Set A04 = AnonymousClass7TE.A1F();

    public QCF() {
        C11985Sk0 sk0 = new C11985Sk0();
        this.A02 = sk0;
    }

    public final void onAttach(Context context) {
        QCF.super.onAttach(context);
        QCF qcf = this;
        while (qcf.mParentFragment != null) {
            qcf = qcf.mParentFragment;
        }
        0hq r4 = qcf.mFragmentManager;
        if (r4 != null) {
            try {
                Context context2 = getContext();
                QCF qcf2 = this.A01;
                if (qcf2 != null) {
                    qcf2.A04.remove(this);
                    this.A01 = null;
                }
                QCF A022 = C11458SVw.A02(r4, SUv.A00(context2).A05);
                this.A01 = A022;
                if (!equals(A022)) {
                    this.A01.A04.add(this);
                }
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1812280972);
        QCF.super.onDestroy();
        this.A02.A00();
        QCF qcf = this.A01;
        if (qcf != null) {
            qcf.A04.remove(this);
            this.A01 = null;
        }
        AnonymousClass0fD.A09(-136973099, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(806206852);
        QCF.super.onDetach();
        QCF qcf = this.A01;
        if (qcf != null) {
            qcf.A04.remove(this);
            this.A01 = null;
        }
        AnonymousClass0fD.A09(-244001966, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(285770725);
        QCF.super.onStart();
        C11985Sk0 sk0 = this.A02;
        sk0.A00 = true;
        Iterator A0m = Pxi.A0m(sk0.A02);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStart();
        }
        AnonymousClass0fD.A09(1633551320, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1948325020);
        QCF.super.onStop();
        C11985Sk0 sk0 = this.A02;
        sk0.A00 = false;
        Iterator A0m = Pxi.A0m(sk0.A02);
        while (A0m.hasNext()) {
            ((C13768Tgg) A0m.next()).onStop();
        }
        AnonymousClass0fD.A09(2120980408, A022);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(QCF.super.toString());
        A1A.append("{parent=");
        Fragment fragment = this.mParentFragment;
        if (fragment == null) {
            fragment = null;
        }
        return C66582MXn.A0v(fragment, A1A);
    }
}
