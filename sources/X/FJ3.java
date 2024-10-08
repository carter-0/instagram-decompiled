package X;

import android.content.DialogInterface;

public final class FJ3 implements DialogInterface.OnClickListener {
    public static final FJ3 A00 = new FJ3();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
