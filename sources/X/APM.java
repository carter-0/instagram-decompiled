package X;

import android.widget.PopupWindow;

public final class APM implements PopupWindow.OnDismissListener {
    public final /* synthetic */ C329457Iy A00;

    public APM(C329457Iy r1) {
        this.A00 = r1;
    }

    public final void onDismiss() {
        C329457Iy.A00(C329467Iz.CLOSED, this.A00);
    }
}
