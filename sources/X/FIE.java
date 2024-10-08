package X;

import android.content.DialogInterface;

public final class FIE implements DialogInterface.OnClickListener {
    public final /* synthetic */ EyK A00;
    public final /* synthetic */ AnonymousClass325 A01;

    public FIE(EyK eyK, AnonymousClass325 r2) {
        this.A00 = eyK;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.A00.A02;
        if (str != null && str.length() != 0) {
            0kR.A0F(this.A01.A00.requireContext(), 0cp.A03(str));
        }
    }
}
