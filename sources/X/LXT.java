package X;

import android.view.View;

public final class LXT implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public LXT(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-1061480816);
                C65211LpH lpH = (C65211LpH) this.A01;
                lpH.A04.Dby(lpH.A01, this.A02, this.A03);
                i = 848025542;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(79335138);
                C65224LpU lpU = (C65224LpU) this.A01;
                lpU.A04.DNi(lpU.A01, this.A02, this.A03);
                i = -2102949536;
                break;
            default:
                A05 = AnonymousClass0fD.A05(1888585785);
                C65224LpU lpU2 = (C65224LpU) this.A01;
                lpU2.A04.Dv2(lpU2.A01, this.A02, this.A03);
                i = 853744234;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
