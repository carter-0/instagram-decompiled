package X;

import android.content.DialogInterface;

public final class FJG implements DialogInterface.OnClickListener {
    public static final FJG A00 = new FJG();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
