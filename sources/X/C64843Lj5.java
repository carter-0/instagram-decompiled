package X;

import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import com.instagram.mainfeed.network.FeedCacheCoordinator;

/* renamed from: X.Lj5  reason: case insensitive filesystem */
public final class C64843Lj5 implements AnonymousClass11X {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C64843Lj5(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final String getName() {
        return "save_flash_feed_item";
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public final void run() {
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            FeedCacheCoordinator.A06((FeedCacheCoordinator) obj, this.A01);
        } else {
            MainFeedLocalDataSource.A03((MainFeedLocalDataSource) obj, this.A01);
        }
    }

    public final int getRunnableId() {
        return 117128848;
    }
}
