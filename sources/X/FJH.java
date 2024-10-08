package X;

import android.content.DialogInterface;

public final class FJH implements DialogInterface.OnClickListener {
    public static final FJH A00 = new FJH();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
