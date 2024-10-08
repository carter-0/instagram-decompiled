package X;

import android.app.Dialog;

/* renamed from: X.Wjn  reason: case insensitive filesystem */
public final class C20027Wjn implements Runnable {
    public final /* synthetic */ AnonymousClass3GD A00;

    public C20027Wjn(AnonymousClass3GD r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3GD r1 = this.A00;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Dialog dialog = r1.A02;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
    }
}
