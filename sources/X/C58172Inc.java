package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;

/* renamed from: X.Inc  reason: case insensitive filesystem */
public final class C58172Inc extends 0Yg implements C62320sa {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58172Inc(int i) {
        super(0);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            return new LazyStaggeredGridState(new int[]{0}, new int[]{0});
        }
        C286015Tp r0 = LazyGridState.A0L;
        return new LazyGridState(new IF8(2), 0, 0);
    }
}
