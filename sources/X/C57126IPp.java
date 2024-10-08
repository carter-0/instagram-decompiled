package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

/* renamed from: X.IPp  reason: case insensitive filesystem */
public final class C57126IPp implements MVZ {
    public final /* synthetic */ LazyGridState A00;

    public C57126IPp(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }

    public final int B6I() {
        return this.A00.A09.A03.BI6();
    }

    public final long B6K() {
        int BI6 = this.A00.A09.A04.BI6();
        return (((long) B6I()) & 4294967295L) | (((long) BI6) << 32);
    }

    public final int BLP() {
        MW2 mw2 = (MW2) 00k.A0L(C51975G9x.A0C(this.A00).A0C);
        if (mw2 != null) {
            return ((IFG) mw2).A08;
        }
        return -1;
    }

    public final AnonymousClass6Gj BYs() {
        return C51975G9x.A0C(this.A00).A09;
    }

    public final boolean CbH() {
        return this.A00.A04.CbH();
    }

    public final int getItemCount() {
        return C51975G9x.A0C(this.A00).A06;
    }
}
