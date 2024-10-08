package X;

import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

public final class FTK implements 2IR {
    public final /* synthetic */ 1P0 A00;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        this.A00.onFail(new C268664dn(th));
    }

    public FTK(1P0 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass3JD r3 = (AnonymousClass3JD) obj;
        0qQ.A0B(r3, 0);
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) r3.Bny();
        if (reelsTrayQueryResponseImpl != null) {
            this.A00.onSuccess(Co7.A00(reelsTrayQueryResponseImpl));
        }
    }
}
