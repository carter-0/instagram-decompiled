package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

public final class IFD implements C305286Hh {
    public final LazyStaggeredGridState A00;

    public final int B67() {
        return this.A00.A0D.A05.BI6();
    }

    public final boolean BCT() {
        return AnonymousClass7TE.A1b(C51975G9x.A0D(this.A00.A0G).A0D);
    }

    public final int BLE() {
        return ((IFH) ((JLD) 00k.A0K(C51975G9x.A0D(this.A00.A0G).A0D))).A07;
    }

    public final void ECv() {
        AnonymousClass5R7 r0 = this.A00.A02;
        if (r0 != null) {
            r0.AWL();
        }
    }

    public final int getItemCount() {
        return C51975G9x.A0D(this.A00.A0G).A06;
    }

    public IFD(LazyStaggeredGridState lazyStaggeredGridState) {
        this.A00 = lazyStaggeredGridState;
    }
}
