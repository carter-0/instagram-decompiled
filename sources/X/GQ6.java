package X;

import androidx.compose.foundation.lazy.LazyListState;

public final class GQ6 implements MVZ {
    public final /* synthetic */ LazyListState A00;

    public GQ6(LazyListState lazyListState) {
        this.A00 = lazyListState;
    }

    public final int B6I() {
        return this.A00.A00();
    }

    public final long B6K() {
        LazyListState lazyListState = this.A00;
        int A01 = lazyListState.A01();
        return (((long) lazyListState.A00()) & 4294967295L) | (((long) A01) << 32);
    }

    public final int BLP() {
        AnonymousClass6JM r0 = (AnonymousClass6JM) 00k.A0L(((C305076Gk) this.A00.A02()).A0D);
        if (r0 != null) {
            return ((AnonymousClass6JK) r0).A07;
        }
        return -1;
    }

    public final AnonymousClass6Gj BYs() {
        return ((C305076Gk) this.A00.A02()).A0A;
    }

    public final boolean CbH() {
        return this.A00.CbH();
    }

    public final int getItemCount() {
        return ((C305076Gk) this.A00.A02()).A06;
    }
}
