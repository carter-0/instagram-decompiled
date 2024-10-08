package X;

import android.content.DialogInterface;

public final class AKP implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C353498Hw A01;

    public AKP(C353498Hw r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C353498Hw r1 = this.A01;
        r1.A0p = true;
        C353498Hw.A0s(r1, this.A00);
    }
}
