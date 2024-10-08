package X;

public final class ECY extends 1P0 {
    public final /* synthetic */ 0lg A00;
    public final /* synthetic */ C330317Mh A01;
    public final /* synthetic */ AnonymousClass441 A02;
    public final /* synthetic */ String A03;

    public ECY(0lg r1, C330317Mh r2, AnonymousClass441 r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(1648578244);
        C330317Mh r0 = this.A01;
        if (r0 != null) {
            r0.onFail(r3);
        }
        AnonymousClass0fD.A0A(-259710450, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-562159813);
        this.A02.A01.remove(this.A03);
        AnonymousClass0fD.A0A(-603587886, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(863863808);
        DvP dvP = (DvP) obj;
        int A033 = AnonymousClass0fD.A03(-1187414877);
        AnonymousClass1Nd.A00(this.A00).A00(new FWT(dvP.A00));
        C330317Mh r1 = this.A01;
        if (r1 != null) {
            r1.onSuccess(dvP.A00);
        }
        AnonymousClass0fD.A0A(-627035808, A033);
        AnonymousClass0fD.A0A(1044783312, A032);
    }
}
