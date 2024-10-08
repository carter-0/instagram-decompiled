package X;

import android.content.DialogInterface;

public final class FJV implements DialogInterface.OnClickListener {
    public static final FJV A00 = new FJV();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
