package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.8W3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8W3 implements C61910qF, AnonymousClass2gO {
    public final /* synthetic */ C356918Vs A00;

    public AnonymousClass8W3(C356918Vs r1) {
        this.A00 = r1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2gO) || !(obj instanceof C61910qF)) {
            return false;
        }
        return 0qQ.A0K(getFunctionDelegate(), ((C61910qF) obj).getFunctionDelegate());
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        return new 03J(1, this.A00, C356918Vs.class, "openClipsShareSheetFromSubFragment", "openClipsShareSheetFromSubFragment(Lcom/instagram/util/mediacapture/Video;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C349307zv r4 = (C349307zv) obj;
        0qQ.A0B(r4, 0);
        C356918Vs r2 = this.A00;
        C3499482o r1 = r2.A04;
        List singletonList = Collections.singletonList(new C365798nh(r4));
        0qQ.A07(singletonList);
        r1.A09(singletonList);
        r2.A06.E3H(new Object());
    }
}
