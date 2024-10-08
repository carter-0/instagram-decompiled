package X;

import android.content.DialogInterface;

public final class FJB implements DialogInterface.OnClickListener {
    public static final FJB A00 = new FJB();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
