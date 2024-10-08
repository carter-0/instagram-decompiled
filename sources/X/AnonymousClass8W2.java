package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.8W2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8W2 implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ C356918Vs A00;

    public AnonymousClass8W2(C356918Vs r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C356918Vs.class, "launchQuickCaptureSubFragmentWithoutCaptureStateChange", "launchQuickCaptureSubFragmentWithoutCaptureStateChange(Landroidx/fragment/app/Fragment;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Fragment fragment = (Fragment) obj;
        0qQ.A0B(fragment, 0);
        C356918Vs r0 = this.A00;
        C356918Vs.A01(fragment, r0);
        C356918Vs.A00(fragment, r0.A03);
    }
}
