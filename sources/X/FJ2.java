package X;

import android.content.DialogInterface;

public final class FJ2 implements DialogInterface.OnClickListener {
    public static final FJ2 A00 = new FJ2();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
