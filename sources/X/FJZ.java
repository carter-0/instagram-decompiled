package X;

import android.content.DialogInterface;

public final class FJZ implements DialogInterface.OnClickListener {
    public static final FJZ A00 = new FJZ();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
