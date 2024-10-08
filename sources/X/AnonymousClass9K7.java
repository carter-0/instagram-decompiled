package X;

import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9K7  reason: invalid class name */
public final class AnonymousClass9K7 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K7(Object obj, Object obj2, AnonymousClass4D7 r4, int i, int i2) {
        super(2, r4);
        this.A01 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9K7, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A04;
        Object obj3 = this.A03;
        int i3 = this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new AnonymousClass9K7(obj2, obj3, r8, i3, i);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9K7) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.9K7, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = obj;
        int i = this.A01;
        Object obj3 = 1Hj.A02;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 != 0) {
                0eS.A00(obj2);
            } else {
                0eS.A00(obj2);
                FeedCacheCoordinator feedCacheCoordinator = (FeedCacheCoordinator) this.A04;
                FlashFeedCache flashFeedCache = feedCacheCoordinator.A09;
                int i3 = feedCacheCoordinator.A00;
                long A012 = 1Uh.A01(feedCacheCoordinator.A07);
                ArrayList A032 = FeedCacheCoordinator.A03(feedCacheCoordinator, AnonymousClass05K.A0C, false);
                this.A00 = 1;
                obj2 = flashFeedCache.A04((Integer) null, (Integer) null, A032, this, i3, A012, true, true, true);
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            02m r5 = (02m) this.A03;
            int i4 = this.A02;
            List list = (List) obj2;
            1UO r1 = ((FeedCacheCoordinator) this.A04).A01;
            if (r1 != null) {
                r1.DTz(AnonymousClass05K.A0C, list);
            }
            r5.markerAnnotate(974459630, i4, AnonymousClass000.A00(4368), list.size());
            r5.markerEnd(974459630, i4, 2);
        } else if (i2 != 0) {
            0eS.A00(obj2);
        } else {
            0eS.A00(obj2);
            0V2 r2 = ((AnonymousClass8RL) this.A04).A01;
            Object obj4 = this.A03;
            if (obj4 == null) {
                if (this.A02 <= 3) {
                    obj4 = AnonymousClass8RM.A09;
                } else {
                    obj4 = AnonymousClass8RM.A0C;
                }
            }
            this.A00 = 1;
            if (r2.emit(obj4, this) == obj3) {
                return obj3;
            }
        }
        return C60340gF.A00;
    }
}
