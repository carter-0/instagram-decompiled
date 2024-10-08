package X;

import android.widget.PopupWindow;

public final class IEC implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C246813fH A00;

    public IEC(C246813fH r1) {
        this.A00 = r1;
    }

    public final void onDismiss() {
        C246813fH r1 = this.A00;
        r1.A00 = null;
        r1.A01 = null;
    }
}
