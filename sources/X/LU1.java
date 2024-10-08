package X;

import android.content.DialogInterface;

public final class LU1 implements DialogInterface.OnClickListener {
    public final int A00;

    public LU1(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 2:
                return;
            case 3:
                break;
            default:
                dialogInterface.getClass();
                break;
        }
        dialogInterface.dismiss();
    }
}
