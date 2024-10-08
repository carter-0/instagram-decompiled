package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* renamed from: X.4dz  reason: invalid class name and case insensitive filesystem */
public final class C268784dz extends 0vM {
    public final /* synthetic */ FeedCacheCoordinator A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C268784dz(FeedCacheCoordinator feedCacheCoordinator) {
        super("flashFeedRecsLoad", 1179135489);
        this.A00 = feedCacheCoordinator;
    }

    public final void loggedRun() {
        FeedCacheCoordinator feedCacheCoordinator = this.A00;
        02m r5 = 02m.A0p;
        int incrementAndGet = FeedCacheCoordinator.A0F.incrementAndGet();
        r5.markerStart(974459630, incrementAndGet);
        r5.markerAnnotate(974459630, incrementAndGet, "CACHE_NAME", "RECS");
        if (feedCacheCoordinator.A09 != null) {
            C262224Cq r2 = feedCacheCoordinator.A0B;
            AnonymousClass9K7 r3 = new AnonymousClass9K7(feedCacheCoordinator, r5, (AnonymousClass4D7) null, incrementAndGet, 1);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, r2);
        }
    }
}
