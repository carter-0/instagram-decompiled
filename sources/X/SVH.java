package X;

import android.content.DialogInterface;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

public final class SVH implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
    public boolean A00 = false;
    public final Callback A01;
    public final /* synthetic */ DialogModule A02;

    public SVH(Callback callback, DialogModule dialogModule) {
        this.A02 = dialogModule;
        this.A01 = callback;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (!this.A00 && Pxe.A0T(this.A02).A0F()) {
            this.A01.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.A00 = true;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.A00 && Pxe.A0T(this.A02).A0F()) {
            Pxh.A1E(this.A01, DialogModule.ACTION_DISMISSED);
            this.A00 = true;
        }
    }
}
