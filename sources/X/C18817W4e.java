package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.W4e  reason: case insensitive filesystem */
public final class C18817W4e implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass3GD A00;

    public C18817W4e(AnonymousClass3GD r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass3GD r1 = this.A00;
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Dialog dialog = r1.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
