package X;

import android.content.DialogInterface;

public final class I9H implements DialogInterface.OnDismissListener {
    public static final I9H A00 = new I9H();

    public final void onDismiss(DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
