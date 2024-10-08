package X;

/* renamed from: X.4Zc  reason: invalid class name and case insensitive filesystem */
public final class C266494Zc extends 1P0 {
    public final /* synthetic */ C266484Zb A00;

    public C266494Zc(C266484Zb r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(1250256379);
        0qQ.A0B(r3, 0);
        C266484Zb r0 = this.A00;
        r0.A00 = r3;
        r0.A06.countDown();
        AnonymousClass0fD.A0A(-857949349, A03);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(825999570);
        0qQ.A0B(r3, 0);
        this.A00.A01 = r3;
        AnonymousClass0fD.A0A(1291006789, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1795721634);
        1XR r9 = (1XR) obj;
        int A032 = AnonymousClass0fD.A03(-64091544);
        0qQ.A0B(r9, 0);
        C266484Zb r0 = this.A00;
        r0.A02 = r9;
        if (r0.A06.getCount() > 0) {
            0wb.A03("HttpRequestConnectTask", "count down latch is not zero");
        }
        AnonymousClass0fD.A0A(1825582369, A032);
        AnonymousClass0fD.A0A(251144294, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(1338386186);
        1XR r4 = (1XR) obj;
        int A032 = AnonymousClass0fD.A03(716866618);
        0qQ.A0B(r4, 0);
        C266484Zb r0 = this.A00;
        r0.A03 = r4;
        r0.A02 = r4;
        r0.A06.countDown();
        AnonymousClass0fD.A0A(203120137, A032);
        AnonymousClass0fD.A0A(-1524108568, A03);
    }
}
