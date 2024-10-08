package X;

import android.content.DialogInterface;

public final class FJE implements DialogInterface.OnClickListener {
    public static final FJE A00 = new FJE();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
