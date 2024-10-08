package X;

import android.content.DialogInterface;

public final class FJM implements DialogInterface.OnClickListener {
    public static final FJM A00 = new FJM();

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
