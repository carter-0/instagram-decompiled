package X;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;

public final class SVI implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
    public boolean A00 = false;
    public final Callback A01;
    public final Callback A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!this.A00) {
            this.A01.invoke(AnonymousClass7TF.A1b(i));
            this.A00 = true;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A00) {
            this.A02.invoke(Pxe.A1b());
            this.A00 = true;
        }
    }

    public SVI(Callback callback, Callback callback2) {
        this.A01 = callback;
        this.A02 = callback2;
    }
}
