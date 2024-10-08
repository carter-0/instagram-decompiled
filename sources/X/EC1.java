package X;

import android.content.Context;

public final class EC1 extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C46521DgO A02;
    public final /* synthetic */ C283155Gi A03;

    public EC1(Context context, C46521DgO dgO, C283155Gi r3, int i) {
        this.A02 = dgO;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = context;
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(-715841242);
        C46521DgO dgO = this.A02;
        C283155Gi r3 = this.A03;
        int i = this.A00;
        C46521DgO.A04(dgO, r3, "delete_notification_failed", i);
        if (C46521DgO.A05(dgO)) {
            C358248ab A0Y = DbS.A0Y(this.A01);
            A0Y.A08(2131968333);
            A0Y.A04();
            DbT.A1V(A0Y);
        }
        dgO.A06.CNU(r3, i);
        AnonymousClass0fD.A0A(810103964, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1945652317);
        int A033 = AnonymousClass0fD.A03(-1525136955);
        C46521DgO.A04(this.A02, this.A03, "delete_notification_success", this.A00);
        AnonymousClass0fD.A0A(-1253618389, A033);
        AnonymousClass0fD.A0A(-990436935, A032);
    }
}
