package X;

import android.content.DialogInterface;

public final class FJW implements DialogInterface.OnClickListener {
    public static final FJW A00 = new FJW();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
