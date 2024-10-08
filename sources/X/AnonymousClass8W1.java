package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.8W1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8W1 implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ C356918Vs A00;

    public AnonymousClass8W1(C356918Vs r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C356918Vs.class, "launchSubFragment", "launchSubFragment(Landroidx/fragment/app/Fragment;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C356928Vt r0;
        String obj2;
        Fragment fragment = (Fragment) obj;
        0qQ.A0B(fragment, 0);
        C356918Vs r5 = this.A00;
        if (r5.A01 != C356928Vt.NONE) {
            obj2 = "Only one sub-fragment can be launched at a time";
        } else {
            AnonymousClass80U r2 = r5.A06;
            int ordinal = r2.Ats().ordinal();
            if (ordinal == 1) {
                r0 = C356928Vt.PRE_CAPTURE;
            } else if (ordinal != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Current state is ");
                sb.append(r2.Ats());
                sb.append(". Sub fragments can only be launched when quick-capture is in pre or post cap");
                obj2 = sb.toString();
            } else {
                r0 = C356928Vt.POST_CAPTURE;
            }
            r5.A01 = r0;
            ((AnonymousClass80T) r2).A02.A04(new Object());
            C356918Vs.A01(fragment, r5);
            C356918Vs.A00(fragment, r5.A03);
            return;
        }
        0kD.A07("QuickCaptureSubFragmentManager", obj2, (Throwable) null);
    }
}
