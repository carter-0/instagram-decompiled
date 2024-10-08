package X;

import android.content.DialogInterface;

public final class FJK implements DialogInterface.OnClickListener {
    public static final FJK A00 = new FJK();

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
