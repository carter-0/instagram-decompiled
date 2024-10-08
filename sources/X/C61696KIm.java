package X;

import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;

/* renamed from: X.KIm  reason: case insensitive filesystem */
public final class C61696KIm extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MainFeedLocalDataSource A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61696KIm(MainFeedLocalDataSource mainFeedLocalDataSource, int i) {
        super(117128848, i, false, false);
        this.A00 = i;
        this.A01 = mainFeedLocalDataSource;
    }

    public final void run() {
        MainFeedLocalDataSource.A03(this.A01, this.A00);
    }
}
