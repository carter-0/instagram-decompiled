package X;

import android.content.DialogInterface;

public final class FJD implements DialogInterface.OnClickListener {
    public static final FJD A00 = new FJD();

    public final void onClick(DialogInterface dialogInterface, int i) {
        DbW.A0r(dialogInterface);
    }
}
