package X;

import android.content.DialogInterface;

public final class I8Y implements DialogInterface.OnClickListener {
    public static final I8Y A00 = new I8Y();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
