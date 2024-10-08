package X;

import com.instagram.comments.mvvm.data.network.MediaParentCommentNetworkFetcherKt;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.9Jh  reason: invalid class name and case insensitive filesystem */
public final class C376779Jh extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376779Jh(ClipsDraftRepository clipsDraftRepository, AnonymousClass4D7 r3) {
        super(r3);
        this.A06 = clipsDraftRepository;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.9Jh, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        if (this.A08 != 0) {
            this.A05 = obj;
            this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
            return ((ClipsDraftRepository) this.A06).A0A((B2W) null, (C293505kq) null, this);
        }
        this.A06 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return MediaParentCommentNetworkFetcherKt.A00((C46255DSk) null, (C333817aC) null, (UserSession) null, (String) null, (String) null, this, (0sP) null, false);
    }

    public C376779Jh(AnonymousClass4D7 r2) {
        super(r2);
    }
}
