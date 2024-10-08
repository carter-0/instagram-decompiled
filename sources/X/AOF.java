package X;

import android.view.View;

public final class AOF implements View.OnClickListener {
    public final /* synthetic */ C59725JVj A00;
    public final /* synthetic */ C359448cq A01;
    public final /* synthetic */ LOZ A02;
    public final /* synthetic */ boolean A03;

    public AOF(C59725JVj jVj, C359448cq r2, LOZ loz, boolean z) {
        this.A01 = r2;
        this.A00 = jVj;
        this.A03 = z;
        this.A02 = loz;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2041045798);
        C359448cq r4 = this.A01;
        r4.A06.A1N(this.A00, AnonymousClass7TE.A0v(), AnonymousClass000.A00(232));
        if (this.A03) {
            C359448cq.A06(r4);
        }
        this.A02.A01();
        AnonymousClass0fD.A0C(6885172, A05);
    }
}
