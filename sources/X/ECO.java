package X;

import com.instagram.reels.api.ReelsTrayQueryResponseImpl;

public final class ECO extends 1P0 {
    public final /* synthetic */ 1P0 A00;

    public ECO(1P0 r1) {
        this.A00 = r1;
    }

    public final void onFailInBackground(C268654dm r5) {
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl;
        int A0D = AnonymousClass7TG.A0D(r5, 1290594790);
        AnonymousClass3JC r0 = (AnonymousClass3JC) r5.A00();
        if (!(r0 == null || (reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) r0.A01) == null)) {
            1P0 r2 = this.A00;
            AnonymousClass3HO A002 = Co7.A00(reelsTrayQueryResponseImpl);
            r2.onFailInBackground(new C268674do(A002));
            onFinish();
            r2.onFail(new C268674do(A002));
        }
        AnonymousClass0fD.A0A(1653523122, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1982149838);
        ECO.super.onFinish();
        AnonymousClass0fD.A0A(-2044550310, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-56830991);
        AnonymousClass3JC r5 = (AnonymousClass3JC) obj;
        int A0D = AnonymousClass7TG.A0D(r5, -1950152553);
        ReelsTrayQueryResponseImpl reelsTrayQueryResponseImpl = (ReelsTrayQueryResponseImpl) r5.A01;
        if (reelsTrayQueryResponseImpl != null) {
            1P0 r1 = this.A00;
            AnonymousClass3HO A002 = Co7.A00(reelsTrayQueryResponseImpl);
            r1.onSuccessInBackground(A002);
            onFinish();
            r1.onSuccess(A002);
        }
        AnonymousClass0fD.A0A(-600971679, A0D);
        AnonymousClass0fD.A0A(344084892, A03);
    }
}
