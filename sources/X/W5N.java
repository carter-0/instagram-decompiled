package X;

import android.content.DialogInterface;

public final class W5N implements DialogInterface.OnClickListener {
    public static final W5N A00 = new W5N();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
