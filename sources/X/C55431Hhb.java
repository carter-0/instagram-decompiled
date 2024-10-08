package X;

import android.content.Context;
import android.widget.PopupWindow;

/* renamed from: X.Hhb  reason: case insensitive filesystem */
public final class C55431Hhb {
    public final PopupWindow A00;

    public C55431Hhb(Context context) {
        PopupWindow popupWindow = new PopupWindow(context);
        this.A00 = popupWindow;
        popupWindow.setBackgroundDrawable(C51965G9l.A0D(0));
        popupWindow.setContentView(new C299025uS(context));
        popupWindow.setInputMethodMode(1);
    }
}
