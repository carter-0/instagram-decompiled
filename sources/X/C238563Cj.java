package X;

/* renamed from: X.3Cj  reason: invalid class name and case insensitive filesystem */
public final class C238563Cj extends 1P0 {
    public final /* synthetic */ AnonymousClass3CO A00;

    public C238563Cj(AnonymousClass3CO r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-321231180);
        0qQ.A0B(r4, 0);
        1PX r1 = this.A00.A01;
        r1.A00.onFail(r4);
        r1.A00 = r1.A09;
        r1.A01 = null;
        r1.A02 = null;
        AnonymousClass0fD.A0A(839009671, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(592943209);
        1PX r1 = this.A00.A01;
        r1.A05 = false;
        r1.A00.onFinish();
        AnonymousClass0fD.A0A(28758453, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-870916104);
        int A032 = AnonymousClass0fD.A03(698717235);
        0qQ.A0B(obj, 0);
        this.A00.A01.A00(obj);
        AnonymousClass0fD.A0A(-567912650, A032);
        AnonymousClass0fD.A0A(1842777342, A03);
    }
}
