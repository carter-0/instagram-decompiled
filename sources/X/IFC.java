package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;

public final class IFC implements C305286Hh {
    public final LazyGridState A00;

    public final int B67() {
        return this.A00.A09.A03.BI6();
    }

    public final boolean BCT() {
        return AnonymousClass7TE.A1b(C51975G9x.A0C(this.A00).A0C);
    }

    public final int BLE() {
        return ((IFG) ((MW2) 00k.A0K(C51975G9x.A0C(this.A00).A0C))).A08;
    }

    public final void ECv() {
        AnonymousClass5R7 r0 = this.A00.A01;
        if (r0 != null) {
            r0.AWL();
        }
    }

    public final int getItemCount() {
        return C51975G9x.A0C(this.A00).A06;
    }

    public IFC(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }
}
