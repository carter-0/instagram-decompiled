package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.WBk  reason: case insensitive filesystem */
public final class C18893WBk implements View.OnTouchListener {
    public final /* synthetic */ WDV A00;

    public C18893WBk(WDV wdv) {
        this.A00 = wdv;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            WDV wdv = this.A00;
            PopupWindow popupWindow = wdv.A09;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= popupWindow.getWidth() || y < 0 || y >= popupWindow.getHeight()) {
                return false;
            }
            wdv.A0I.postDelayed(wdv.A0K, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            WDV wdv2 = this.A00;
            wdv2.A0I.removeCallbacks(wdv2.A0K);
            return false;
        }
    }
}
