package X;

import android.widget.PopupWindow;

/* renamed from: X.IfX  reason: case insensitive filesystem */
public final class C57730IfX implements Runnable {
    public final /* synthetic */ PopupWindow A00;

    public C57730IfX(PopupWindow popupWindow) {
        this.A00 = popupWindow;
    }

    public final void run() {
        this.A00.dismiss();
    }
}
