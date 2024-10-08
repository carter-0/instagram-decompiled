package X;

import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import java.util.List;

/* renamed from: X.MDm  reason: case insensitive filesystem */
public final class C66134MDm extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66134MDm(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }

    public static Object A00(Object obj, C66134MDm mDm) {
        mDm.A04 = obj;
        mDm.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return mDm.A07;
    }

    public static boolean A01(int i, Object obj) {
        if (!(obj instanceof C66134MDm) || ((C66134MDm) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.MDm] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                return ((FollowRequestsRepository) A00(obj, this)).A02((List) null, this, false);
            case 1:
                return C64185LSs.A00(A00(obj, this), this);
            case 2:
                return IgLiveCommentsRepository.A02((IgLiveCommentsRepository) A00(obj, this), (List) null, this, false);
            case 3:
                return ((IgLiveCommentsRepository) A00(obj, this)).A0C((M0V) null, (String) null, this);
            default:
                return ((IgLiveExploreRepository) A00(obj, this)).A01((UpcomingEvent) null, this, false);
        }
    }
}
