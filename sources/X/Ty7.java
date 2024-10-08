package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class Ty7 implements C13668Tec {
    public static final ViewGroup.MarginLayoutParams A09;
    public AnonymousClass52V A00;
    public final C14114Tq9 A01;
    public final C14544Ty5 A02;
    public final C17181VLl A03;
    public volatile AnonymousClass3AQ A04;
    public volatile C228432lf A05;
    public volatile C14811UAh A06;
    public volatile Integer A07;
    public volatile List A08;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A09 = marginLayoutParams;
    }

    public Ty7(C14114Tq9 tq9, C14544Ty5 ty5, C17181VLl vLl) {
        this.A02 = ty5;
        this.A03 = vLl;
        this.A01 = tq9;
    }

    public final void A00(int i, int i2, boolean z) {
        if (C245983dn.A03()) {
            C14544Ty5 ty5 = this.A02;
            RecyclerView recyclerView = ty5.A07;
            if (recyclerView == null) {
                ty5.A01 = i;
                ty5.A02 = i2;
                ty5.A0B = z;
            } else if (z) {
                recyclerView.A0u(i, i2);
            } else {
                recyclerView.scrollBy(i, i2);
            }
        } else {
            throw new RuntimeException("Cannot doScrollBy off the main thread!");
        }
    }

    public final void A01(int i, boolean z) {
        if (C245983dn.A03()) {
            C14544Ty5 ty5 = this.A02;
            RecyclerView recyclerView = ty5.A07;
            if (recyclerView == null) {
                ty5.A00 = i;
                ty5.A0A = z;
            } else if (z) {
                recyclerView.A0p(i);
            } else {
                recyclerView.A0o(i);
                C14114Tq9 tq9 = this.A01;
                C276544tV r2 = tq9.A00;
                C277014uI A0A = r2.A0A(51);
                C277014uI A0A2 = r2.A0A(97);
                if (A0A != null || A0A2 != null) {
                    UB2.A00(tq9.A02, r2, i, false);
                }
            }
        } else {
            throw new RuntimeException("Cannot doScrollTo off the main thread!");
        }
    }

    public final boolean isScrolledToTop() {
        if (C245983dn.A03()) {
            RecyclerView recyclerView = this.A02.A07;
            if (recyclerView != null) {
                return !JTP.A1Y(recyclerView);
            }
            return true;
        }
        throw new RuntimeException("Cannot isScrolledToTop off the main thread!");
    }
}
