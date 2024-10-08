package X;

import android.content.DialogInterface;

public final class LU2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C17744VdD A00;

    public LU2(C17744VdD vdD) {
        this.A00 = vdD;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C46656Dib A04 = C46447Df9.A02().A04("profile");
        C17744VdD vdD = this.A00;
        DbY.A14(A04, vdD.A02, vdD.A08);
    }
}
