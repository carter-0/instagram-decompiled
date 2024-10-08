package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.33U  reason: invalid class name */
public final class AnonymousClass33U implements AnonymousClass0m6 {
    public final /* synthetic */ AnonymousClass0m6 A00;
    public final /* synthetic */ AnonymousClass33Q A01;

    public AnonymousClass33U(AnonymousClass0m6 r1, AnonymousClass33Q r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DKT(ViewGroup viewGroup, View view, int i) {
        0qQ.A0B(view, 0);
        AnonymousClass33Q r0 = this.A01;
        C241383Oz r02 = new C241383Oz(view, r0.A00, r0.A01, r0.A02);
        r02.A00();
        view.setTag(r02);
        this.A00.DKT(viewGroup, view, i);
    }
}
