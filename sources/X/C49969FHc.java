package X;

import android.content.DialogInterface;

/* renamed from: X.FHc  reason: case insensitive filesystem */
public final class C49969FHc implements DialogInterface.OnClickListener {
    public final int A00;

    public C49969FHc(int i) {
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
                if (dialogInterface == null) {
                    return;
                }
                break;
            case 3:
            case 5:
            case 6:
                break;
            case 7:
                0qQ.A0B(dialogInterface, 0);
                return;
            case 11:
            case 13:
                return;
            default:
                0qQ.A0B(dialogInterface, 0);
                break;
        }
        dialogInterface.dismiss();
    }
}
