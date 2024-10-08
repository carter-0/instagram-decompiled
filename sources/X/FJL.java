package X;

import android.content.DialogInterface;

public final class FJL implements DialogInterface.OnClickListener {
    public static final FJL A00 = new FJL();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
