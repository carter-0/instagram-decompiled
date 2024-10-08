package X;

import android.view.View;

/* renamed from: X.ANz  reason: case insensitive filesystem */
public final class C40017ANz implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C40017ANz(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A00 != 0) {
            A05 = AnonymousClass0fD.A05(508975552);
            C384959iA r2 = ((AnonymousClass9YN) this.A02).A00;
            int i2 = this.A01;
            C387529mM r0 = r2.A00;
            r0.getClass();
            r0.A00 = i2;
            r0.A0L();
            AnonymousClass37D A022 = AnonymousClass37D.A00.A02(r2.getContext());
            A022.getClass();
            A022.A0B();
            i = -1901806570;
        } else {
            A05 = AnonymousClass0fD.A05(573599742);
            C384969iB r3 = ((AnonymousClass9YO) this.A02).A00;
            int i3 = this.A01;
            r3.A00.getClass();
            C387509mK r1 = r3.A00;
            r1.A00 = i3;
            C387509mK.A00(AnonymousClass57C.CREATE_MODE_VIEW_ALL_SELECTION, r1);
            AnonymousClass37D A023 = AnonymousClass37D.A00.A02(r3.getContext());
            A023.getClass();
            A023.A0B();
            i = -383286014;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
