package X;

import android.content.DialogInterface;

public final class I8Z implements DialogInterface.OnClickListener {
    public static final I8Z A00 = new I8Z();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
