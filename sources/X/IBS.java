package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public final class IBS implements View.OnClickListener {
    public final /* synthetic */ JR4 A00;
    public final /* synthetic */ C230662pz A01;
    public final /* synthetic */ String A02;

    public IBS(JR4 jr4, C230662pz r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = jr4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-545227393);
        C230662pz r0 = this.A01;
        String str = this.A02;
        AnonymousClass2rI r7 = (AnonymousClass2rI) r0.A02.getAdapter();
        AnonymousClass2rW r8 = (AnonymousClass2rW) r7.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator A1G = AnonymousClass7TE.A1G(r8.A02);
        while (A1G.hasNext()) {
            Object next = A1G.next();
            1Xg r2 = (1Xg) next;
            0qQ.A0B(r2, 0);
            if (r2.A06 != 1UQ.A07 || !0qQ.A0K(r2.A09, str)) {
                A1C2.add(next);
            } else {
                A1C.add(next);
            }
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            r8.A0C(it.next());
        }
        C51975G9x.A1C(r8, A1C2);
        r7.A0A(-1);
        this.A00.Chi();
        AnonymousClass0fD.A0C(1636289193, A05);
    }
}
