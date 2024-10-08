package X;

/* renamed from: X.8W0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8W0 implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ C356918Vs A00;

    public AnonymousClass8W0(C356918Vs r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C356918Vs.class, "closeSubFragment", "closeSubFragment(Lcom/instagram/creation/capture/quickcapture/fragment/subfragment/QuickCaptureSubFragmentManager$Destination;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C356928Vt r5 = (C356928Vt) obj;
        0qQ.A0B(r5, 0);
        C356918Vs r2 = this.A00;
        r2.A00 = r5;
        C356928Vt r1 = C356928Vt.NONE;
        C3499482o r0 = r2.A04;
        if (r5 != r1) {
            r0.A01.A0U = false;
        } else {
            r0.A01.A03 = null;
        }
        r2.A03.A0y("QuickCaptureSubFragmentManager", 1);
    }
}
