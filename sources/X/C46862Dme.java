package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Dme  reason: case insensitive filesystem */
public final class C46862Dme extends C249403jg {
    public final C307786Rm A00;
    public final C276544tV A01;
    public final C277014uI A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C46862Dme)) {
            return false;
        }
        C46862Dme dme = (C46862Dme) obj;
        return dme.A02 == this.A02 && dme.A01.A03(53, 0) == this.A01.A03(53, 0);
    }

    public C46862Dme(C307786Rm r1, C276544tV r2, C277014uI r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        String str;
        int A03 = AnonymousClass0fD.A03(-189203120);
        C276544tV r3 = this.A01;
        int A032 = r3.A03(53, 0);
        if (A032 != 0) {
            if (recyclerView.canScrollVertically(A032)) {
                str = "can_scroll";
            } else {
                str = "cannot_scroll";
            }
            C308276Tl A0P = DbS.A0P();
            A0P.A03(str, 0);
            C307786Rm r2 = this.A00;
            C307886Rw.A03(r2, r3, DbT.A0V(A0P, r2), this.A02);
        }
        AnonymousClass0fD.A0A(1451509297, A03);
    }
}
