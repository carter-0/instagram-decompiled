package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

public final class U6L extends ContentFrameLayout {
    public final /* synthetic */ 2X4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U6L(Context context, 2X4 r2) {
        super(context);
        this.A00 = r2;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A00.A0b(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                2X4 r2 = this.A00;
                r2.A0Y(r2.A0S(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C13990Tnq.A0E(this, i));
    }
}
