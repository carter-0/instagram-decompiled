package X;

import android.content.DialogInterface;

public final class FJI implements DialogInterface.OnClickListener {
    public static final FJI A00 = new FJI();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
