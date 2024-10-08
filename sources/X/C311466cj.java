package X;

import android.content.DialogInterface;

/* renamed from: X.6cj  reason: invalid class name and case insensitive filesystem */
public final class C311466cj implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C311446ch A01;

    public C311466cj(DialogInterface.OnDismissListener onDismissListener, C311446ch r2) {
        this.A01 = r2;
        this.A00 = onDismissListener;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.A01.A00 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
