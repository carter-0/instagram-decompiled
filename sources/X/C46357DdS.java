package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.DdS  reason: case insensitive filesystem */
public final class C46357DdS implements Runnable {
    public final /* synthetic */ DdD A00;

    public C46357DdS(DdD ddD) {
        this.A00 = ddD;
    }

    public final void run() {
        if (!C46399DeM.A06()) {
            DdD ddD = this.A00;
            Fragment fragment = ddD.A02;
            C46399DeM.A02(fragment.requireContext(), fragment, C46398DeL.A04, ddD.A03, AnonymousClass05K.A0C);
        }
    }
}
