package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* renamed from: X.KIn  reason: case insensitive filesystem */
public final class C61697KIn extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FeedCacheCoordinator A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61697KIn(FeedCacheCoordinator feedCacheCoordinator, int i) {
        super(117128848, i, false, false);
        this.A00 = i;
        this.A01 = feedCacheCoordinator;
    }

    public final void run() {
        FeedCacheCoordinator.A06(this.A01, this.A00);
    }
}
