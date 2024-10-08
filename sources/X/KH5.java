package X;

import java.io.File;
import java.util.List;

public final class KH5 extends 2Cl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ JX1 A02;
    public final /* synthetic */ AnonymousClass3Q2 A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ List A05;

    public final int getRunnableId() {
        return 542;
    }

    public KH5(JX1 jx1, AnonymousClass3Q2 r2, AnonymousClass3Q2 r3, List list, int i, int i2) {
        this.A02 = jx1;
        this.A01 = i;
        this.A04 = r2;
        this.A00 = i2;
        this.A03 = r3;
        this.A05 = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        File A012 = AnonymousClass457.A01();
        int A042 = DbS.A04(0Tu.A05, this.A02.A09, 36609382108632931L);
        if (A042 == 0) {
            A042 = LTE.A00(this.A01);
        }
        AnonymousClass3Q2 r2 = this.A04;
        C64188LSv.A02(r2, A012, this.A01, this.A00, A042);
        r2.A33 = A012.getAbsolutePath();
        return null;
    }

    public final void onFinish() {
        KH5.super.onFinish();
        JX1.A04(this.A02, this.A03, this.A05);
    }
}
