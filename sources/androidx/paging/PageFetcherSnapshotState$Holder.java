package androidx.paging;

import X.136;
import X.C60333Jjc;
import X.C62448Kfy;
import X.C63569KzI;
import X.LGA;

public final class PageFetcherSnapshotState$Holder {
    public final LGA A00;
    public final 136 A01 = new 136();
    public final PagingConfig A02;

    public static boolean A00(PageFetcherSnapshotState$Holder pageFetcherSnapshotState$Holder, 136 r4) {
        C63569KzI A002 = pageFetcherSnapshotState$Holder.A00.A03.A00(C62448Kfy.REFRESH);
        r4.A05((Object) null);
        return A002 instanceof C60333Jjc;
    }

    public PageFetcherSnapshotState$Holder(PagingConfig pagingConfig) {
        this.A02 = pagingConfig;
        this.A00 = new LGA(pagingConfig);
    }
}
