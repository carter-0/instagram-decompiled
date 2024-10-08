package androidx.paging;

import X.AnonymousClass7TE;

public final class PagingConfig {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public PagingConfig(int i, int i2, int i3, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = z;
        this.A00 = i3;
        if (!z && i2 == 0) {
            throw AnonymousClass7TE.A0w("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
    }
}
