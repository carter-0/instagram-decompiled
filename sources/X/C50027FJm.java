package X;

import android.content.DialogInterface;

/* renamed from: X.FJm  reason: case insensitive filesystem */
public final class C50027FJm implements DialogInterface.OnDismissListener {
    public final int A00;

    public C50027FJm(int i) {
        this.A00 = i;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.A00 == 0) {
            C49839F9e.A00 = false;
        }
    }
}
