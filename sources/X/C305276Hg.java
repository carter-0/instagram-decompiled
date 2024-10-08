package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.6Hg  reason: invalid class name and case insensitive filesystem */
public final class C305276Hg implements C305286Hh {
    public final int A00;
    public final LazyListState A01;

    public final int B67() {
        return Math.max(0, this.A01.A00() - this.A00);
    }

    public final boolean BCT() {
        return !((C305076Gk) this.A01.A02()).A0D.isEmpty();
    }

    public final void ECv() {
        AnonymousClass5R7 r0 = this.A01.A03;
        if (r0 != null) {
            r0.AWL();
        }
    }

    public final int getItemCount() {
        return ((C305076Gk) this.A01.A02()).A06;
    }

    public C305276Hg(LazyListState lazyListState, int i) {
        this.A01 = lazyListState;
        this.A00 = i;
    }

    public final int BLE() {
        return Math.min(getItemCount() - 1, ((AnonymousClass6JK) ((AnonymousClass6JM) 00k.A0K(((C305076Gk) this.A01.A02()).A0D))).A07 + this.A00);
    }
}
