package X;

import android.content.DialogInterface;

public final class SV8 implements DialogInterface.OnClickListener {
    public static final SV8 A00 = new SV8();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
