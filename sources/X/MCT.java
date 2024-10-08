package X;

import androidx.compose.foundation.lazy.LazyListState;

public final class MCT implements 02o {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ LazyListState A02;
    public final /* synthetic */ C62320sa A03;

    public MCT(LazyListState lazyListState, C62320sa r2, int i, int i2) {
        this.A02 = lazyListState;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, AnonymousClass4D7 r5) {
        LazyListState lazyListState = this.A02;
        int A002 = lazyListState.A00();
        int i = this.A00;
        if (A002 < i || (lazyListState.A00() == i && lazyListState.A01() < this.A01)) {
            this.A03.invoke();
        }
        return C60340gF.A00;
    }
}
