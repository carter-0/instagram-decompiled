package X;

import android.content.DialogInterface;

public final class FJX implements DialogInterface.OnClickListener {
    public static final FJX A00 = new FJX();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
