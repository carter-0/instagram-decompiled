package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class UB2 extends C249403jg {
    public int A00 = -1;
    public boolean A01;
    public final C228432lf A02;
    public final C307786Rm A03;
    public final C276544tV A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UB2 ub2 = (UB2) obj;
            return this.A02 == ub2.A02 && this.A04.A03 == ub2.A04.A03;
        }
        return false;
    }

    public static void A00(C307786Rm r3, C276544tV r4, int i, boolean z) {
        C308276Tl r1;
        C277014uI A0A = r4.A0A(97);
        if (A0A != null) {
            r1 = new C308276Tl();
            r1.A01(Integer.valueOf(i));
            r1.A02(Boolean.valueOf(z));
            r1.A03(r3, 2);
        } else {
            A0A = r4.A0A(51);
            if (A0A != null) {
                r1 = new C308276Tl();
                r1.A01(Integer.valueOf(i));
                r1.A02(r3);
            } else {
                return;
            }
        }
        DbT.A1R(r3, r4, r1, A0A);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A02) + this.A04.A03;
    }

    public UB2(C228432lf r2, C307786Rm r3, C276544tV r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C252553pI r1;
        View A032;
        int A033;
        int A034 = AnonymousClass0fD.A03(1016989187);
        boolean z = true;
        if (i != 1) {
            if (i == 0 && (r1 = recyclerView.A0D) != null && (A032 = this.A02.A03(r1)) != null && ((A033 = RecyclerView.A03(A032)) != this.A00 || this.A01)) {
                A00(this.A03, this.A04, A033, this.A01);
                this.A00 = A033;
                z = false;
            }
            AnonymousClass0fD.A0A(623014885, A034);
        }
        this.A01 = z;
        AnonymousClass0fD.A0A(623014885, A034);
    }
}
