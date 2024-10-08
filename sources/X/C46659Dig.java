package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.Dig  reason: case insensitive filesystem */
public final class C46659Dig extends Dialog {
    public DialogInterface.OnShowListener A00;
    public final DialogInterface.OnShowListener A01 = new C50038FJx(this, 3);

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.A00 = onShowListener;
        super.setOnShowListener(this.A01);
    }

    public C46659Dig(Context context, int i) {
        super(context, i);
    }
}
