package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Dmd  reason: case insensitive filesystem */
public final class C46861Dmd extends C249403jg {
    public final C307786Rm A00;
    public final C276544tV A01;
    public final C277014uI A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C46861Dmd)) {
            return false;
        }
        C46861Dmd dmd = (C46861Dmd) obj;
        return dmd.A02 == this.A02 && dmd.A01 == this.A01;
    }

    public C46861Dmd(C307786Rm r1, C276544tV r2, C277014uI r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(84679385);
        if (i == 0 && i2 == 0) {
            i3 = 2103881540;
        } else {
            C276544tV r3 = this.A01;
            C277014uI r2 = this.A02;
            C307886Rw.A03(this.A00, r3, DbU.A0T(r3).A00(), r2);
            i3 = -1058710327;
        }
        AnonymousClass0fD.A0A(i3, A03);
    }
}
