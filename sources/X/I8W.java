package X;

import android.content.DialogInterface;

public final class I8W implements DialogInterface.OnClickListener {
    public static final I8W A00 = new I8W();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
