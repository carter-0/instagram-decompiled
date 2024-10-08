package X;

import android.content.DialogInterface;

public final class FJY implements DialogInterface.OnClickListener {
    public static final FJY A00 = new FJY();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
