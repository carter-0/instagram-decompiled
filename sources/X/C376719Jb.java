package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.mainfeed.network.flashfeed.FeedCacheRoom;
import java.util.List;

/* renamed from: X.9Jb  reason: invalid class name and case insensitive filesystem */
public final class C376719Jb extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.9Jb, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        this.A04 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        Object obj2 = this.A06;
        if (i != 0) {
            return ((FeedCacheRoom) obj2).A02((Integer) null, (Integer) null, (List) null, this, 0, 0);
        }
        return FeedCacheCoordinator.A01((FeedCacheCoordinator) obj2, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376719Jb(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A06 = obj;
    }
}
