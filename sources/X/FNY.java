package X;

import android.view.View;

public final class FNY implements View.OnClickListener {
    public final /* synthetic */ C316006kx A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public FNY(C316006kx r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-698527276);
        C317116mk r2 = this.A00.A0E;
        if (r2 != null) {
            r2.D0I(this.A01, this.A02);
            AnonymousClass0fD.A0C(-924455045, A05);
            return;
        }
        IllegalArgumentException A0h = DbU.A0h();
        AnonymousClass0fD.A0C(1999027247, A05);
        throw A0h;
    }
}
