package X;

import android.content.DialogInterface;

public final class LUE implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ LPH A01;

    public LUE(DialogInterface.OnClickListener onClickListener, LPH lph) {
        this.A01 = lph;
        this.A00 = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LPH lph = this.A01;
        if (lph != null) {
            lph.A08(AnonymousClass05K.A0H, AnonymousClass05K.A0Y);
        }
        DialogInterface.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
