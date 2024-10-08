package X;

import android.view.View;

public final class WA7 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1Av A01;
    public final /* synthetic */ AnonymousClass3NR A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public WA7(1Av r1, AnonymousClass3NR r2, String str, int i, boolean z) {
        this.A02 = r2;
        this.A04 = z;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1040847174);
        boolean z = this.A04;
        1Av r1 = this.A01;
        int i = this.A00 + 1;
        if (z) {
            0xY A0p = AnonymousClass7TE.A0p(r1);
            A0p.E5Z(C66579MXk.A00(183), i);
            A0p.apply();
        } else {
            r1.A0b(i);
        }
        AnonymousClass3NR r0 = this.A02;
        C230242pG r4 = r0.A06;
        String str = this.A03;
        int i2 = r0.A00;
        r4.Dca(r0.A05, (AnonymousClass3O9) null, (Integer) null, str, (String) null, r0.A07, i2, false);
        AnonymousClass0fD.A0C(1429478740, A05);
    }
}
