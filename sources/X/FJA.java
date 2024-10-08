package X;

import android.content.DialogInterface;

public final class FJA implements DialogInterface.OnClickListener {
    public static final FJA A00 = new FJA();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
