package X;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: X.VlD  reason: case insensitive filesystem */
public abstract class C18083VlD {
    public static void A01(PopupWindow popupWindow) {
        popupWindow.setIsClippedToScreen(true);
    }

    public static void A00(Rect rect, PopupWindow popupWindow) {
        popupWindow.setEpicenterBounds(rect);
    }
}
