package X;

import android.view.View;

public final class ICD implements View.OnClickListener {
    public final /* synthetic */ C262794Ga A00;
    public final /* synthetic */ C262994Gu A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ AnonymousClass3W1 A03;
    public final /* synthetic */ boolean A04;

    public ICD(C262794Ga r1, C262994Gu r2, 1Xj r3, AnonymousClass3W1 r4, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = z;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1331395186);
        this.A01.CuO(this.A02, this.A03, AnonymousClass05K.A01, (String) null, this.A04, false);
        AnonymousClass7TH.A06(this.A00.A03).setVisibility(8);
        AnonymousClass0fD.A0C(1077693498, A05);
    }
}
