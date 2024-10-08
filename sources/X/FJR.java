package X;

import android.content.DialogInterface;

public final class FJR implements DialogInterface.OnClickListener {
    public static final FJR A00 = new FJR();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
