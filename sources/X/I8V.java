package X;

import android.content.DialogInterface;

public final class I8V implements DialogInterface.OnClickListener {
    public static final I8V A00 = new I8V();

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
