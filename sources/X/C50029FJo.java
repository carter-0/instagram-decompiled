package X;

import android.content.DialogInterface;

/* renamed from: X.FJo  reason: case insensitive filesystem */
public final class C50029FJo implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C315416jr A01;

    public C50029FJo(DialogInterface.OnDismissListener onDismissListener, C315416jr r2) {
        this.A01 = r2;
        this.A00 = onDismissListener;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        0qQ.A0B(dialogInterface, 0);
        C315416jr r1 = this.A01;
        r1.A00 = null;
        r1.A01 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
