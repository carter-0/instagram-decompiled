package X;

import android.content.DialogInterface;

public final class FIM implements DialogInterface.OnClickListener {
    public final DialogInterface.OnClickListener A00;
    public final AnonymousClass0aP A01;
    public final 1Q0 A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        FGI.A03(this.A02.A02(this.A01), C46634DiE.ACCESS_DIALOG);
        this.A00.onClick(dialogInterface, i);
    }

    public FIM(DialogInterface.OnClickListener onClickListener, AnonymousClass0aP r2, 1Q0 r3) {
        this.A01 = r2;
        this.A00 = onClickListener;
        this.A02 = r3;
    }
}
