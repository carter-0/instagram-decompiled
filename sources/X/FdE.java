package X;

import android.view.View;

public final class FdE implements MVB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9JH A01;
    public final /* synthetic */ C51152FpO A02;
    public final /* synthetic */ C46521DgO A03;
    public final /* synthetic */ C283155Gi A04;
    public final /* synthetic */ boolean A05;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdE(AnonymousClass9JH r1, C51152FpO fpO, C46521DgO dgO, C283155Gi r4, int i, boolean z) {
        this.A03 = dgO;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = fpO;
        this.A05 = z;
        this.A00 = i;
    }

    public final void onButtonClick(View view) {
        C46521DgO dgO = this.A03;
        int i = C46521DgO.A0A;
        C46529DgW dgW = dgO.A07;
        C283155Gi r2 = this.A04;
        int i2 = r2.A00;
        AnonymousClass9JH r5 = this.A01;
        String str = r5.A02;
        0qQ.A0B(str, 1);
        dgW.A00.remove(002.A0H(str, ':', i2));
        C51152FpO fpO = this.A02;
        if (!fpO.A01) {
            C46521DgO.A0B.removeCallbacks(fpO);
        }
        if (this.A05) {
            dgO.A06.CNU(r2, this.A00);
        }
        C46521DgO.A04(dgO, r2, 002.A0R(r5.A02, "_undo"), this.A00);
    }
}
