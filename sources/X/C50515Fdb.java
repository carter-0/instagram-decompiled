package X;

import android.app.Dialog;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fdb  reason: case insensitive filesystem */
public class C50515Fdb implements G8H {
    public final FragmentActivity A00;

    public final void Cta(String str, String str2) {
    }

    public final void DOw() {
    }

    public final void DTb() {
    }

    public final void DjB() {
    }

    public final void DjC() {
    }

    public final void DjD() {
    }

    public final void DmU(C49708F2t f2t) {
    }

    public final /* synthetic */ void Dme() {
    }

    public final /* synthetic */ void DPh(F2Z f2z) {
        boolean z;
        Dialog dialog;
        if (this instanceof EMN) {
            EMN emn = (EMN) this;
            C358248ab A0Y = DbS.A0Y(emn.A01);
            A0Y.A08(2131972634);
            A0Y.A06();
            Dialog A02 = A0Y.A02();
            emn.A00 = A02;
            if (A02 != null) {
                A02.setOnDismissListener(new C50036FJv(emn, 2));
            }
            if (emn.A02.getLifecycle().A07().compareTo(07U.A04) >= 0 && (dialog = emn.A00) != null) {
                EMN.A00(dialog, emn);
            }
            z = true;
        } else {
            z = false;
        }
        f2z.A00(z);
    }

    public final void Dmd(AnonymousClass0aP r3, C47361Dvv dvv) {
        new Handler().post(new C51455FuP(r3, dvv, this));
    }

    public C50515Fdb(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }
}
