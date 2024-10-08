package X;

import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.List;

/* renamed from: X.9Jf  reason: invalid class name and case insensitive filesystem */
public final class C376759Jf extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376759Jf(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C376759Jf) || ((C376759Jf) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9Jf, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A04 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return OnDemandSurfaceTriggerCache.A01((AnonymousClass42S) null, (OnDemandSurfaceTriggerCache) this.A07, (Object) null, this, false);
            case 1:
                return ((ClipsDraftLocalDataSource) this.A07).A01((B2W) null, (C293505kq) null, this, false);
            case 2:
                return ClipsCreationDraftViewModel.A05((ClipsCreationDraftViewModel) this.A07, (C2801950r) null, (PendingRecipient) null, this, false);
            case 3:
                return ((FlashFeedCache) this.A07).A05((List) null, this, false);
            default:
                return ((IgLiveBroadcastInfoManager) this.A07).A01((String) null, this);
        }
    }
}
