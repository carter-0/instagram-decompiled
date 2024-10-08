package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.8Gs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C353218Gs implements C3495480u {
    public final /* synthetic */ C352888Fl A00;

    public /* synthetic */ C353218Gs(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        View A05;
        C349317zw A002;
        ViewGroup viewGroup;
        C366978pz r0;
        C352888Fl r3 = this.A00;
        if (((Boolean) obj).booleanValue()) {
            AnonymousClass8E7 r2 = r3.A0z;
            AnonymousClass8E8 A003 = r2.A00();
            C358088aL r1 = C358088aL.A0o;
            AnonymousClass8EA r02 = A003.A00;
            if (r02 != null && (A05 = r02.A05(r1)) != null && (r3.A0g.A08.A00 instanceof AnonymousClass80M)) {
                A002 = r3.A1F.A00();
                viewGroup = r3.A0T;
                r0 = C366978pz.A0w;
            } else if (r3.A18.A00().CYz()) {
                AnonymousClass8E8 A004 = r2.A00();
                C358088aL r12 = C358088aL.A0g;
                AnonymousClass8EA r03 = A004.A00;
                if (r03 != null && (A05 = r03.A05(r12)) != null) {
                    A002 = r3.A1F.A00();
                    viewGroup = r3.A0T;
                    r0 = C366978pz.A0l;
                } else {
                    return;
                }
            } else {
                return;
            }
            A002.A01(viewGroup, A05, r0);
        }
    }
}
