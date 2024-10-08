package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import com.instagram.uxlogging.navigation.NavigationObserver$start$1;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl;
import com.instagram.wellbeing.respectfulcommentnudge.data.RespectfulNudgeApi;
import com.instagram.zero.dogfooding.state.IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2;
import java.util.List;
import java.util.Map;

/* renamed from: X.9JW  reason: invalid class name */
public final class AnonymousClass9JW extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JW(AnonymousClass4D7 r2) {
        super(r2);
        this.A04 = 10;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof AnonymousClass9JW) || ((AnonymousClass9JW) obj).A04 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7, X.9JW] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A04) {
            case 0:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CXPNoticeStateRepository) this.A03).A01((Map) null, this);
            case 1:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CXPNoticeStateRepository) this.A03).A02((Map) null, this);
            case 2:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((CLNoticeApi) this.A03).A02((UserSession) null, (CXPNoticeStateRepository) null, (C367198qL) null, this);
            case 3:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((NavigationObserver$start$1.AnonymousClass2) this.A03).emit((1Jn) null, this);
            case 4:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgLiveBroadcastInfoManager) this.A03).A02((String) null, this);
            case 5:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgLiveHeartbeatManager) this.A03).A01(this, false);
            case 6:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RepositoryImpl) this.A03).A01((UserSession) null, (String) null, this);
            case 7:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RespectfulNudgeApi) this.A03).A01((UserSession) null, (String) null, this);
            case 8:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((RespectfulNudgeApi) this.A03).A00((UserSession) null, (1Xj) null, (String) null, (String) null, (List) null, this, false);
            case 9:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return ((IgZeroDogfoodingKt$collectWithZeroErrorBoundary$2) this.A03).emit((Object) null, this);
            case 10:
                this.A03 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return C239083Et.A00(this, (C62320sa) null, (C252683pV) null);
            default:
                this.A02 = obj;
                this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
                return 1Wm.A02(this, (1Wm) this.A03);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9JW(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A03 = obj;
    }
}
