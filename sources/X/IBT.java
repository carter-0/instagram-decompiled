package X;

import android.view.View;

public final class IBT implements View.OnClickListener {
    public final /* synthetic */ JR4 A00;
    public final /* synthetic */ C230662pz A01;
    public final /* synthetic */ String A02;

    public IBT(JR4 jr4, C230662pz r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = jr4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(781415553);
        this.A01.A01(this.A02);
        this.A00.Chi();
        AnonymousClass0fD.A0C(-1409225229, A05);
    }
}
