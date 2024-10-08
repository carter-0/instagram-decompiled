package X;

import android.content.DialogInterface;

public final class SV7 implements DialogInterface.OnClickListener {
    public static final SV7 A00 = new SV7();

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
