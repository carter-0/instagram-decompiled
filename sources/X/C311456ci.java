package X;

import android.content.DialogInterface;

/* renamed from: X.6ci  reason: invalid class name and case insensitive filesystem */
public final class C311456ci implements DialogInterface.OnShowListener {
    public final /* synthetic */ DialogInterface.OnShowListener A00;
    public final /* synthetic */ C311446ch A01;

    public C311456ci(DialogInterface.OnShowListener onShowListener, C311446ch r2) {
        this.A01 = r2;
        this.A00 = onShowListener;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.A01.A00 = true;
        this.A00.onShow(dialogInterface);
    }
}
