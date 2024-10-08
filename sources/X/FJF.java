package X;

import android.content.DialogInterface;

public final class FJF implements DialogInterface.OnClickListener {
    public static final FJF A00 = new FJF();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
