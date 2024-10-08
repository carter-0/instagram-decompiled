package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

public final /* synthetic */ class IDM implements View.OnTouchListener {
    public final /* synthetic */ C275794rx A00;

    public /* synthetic */ IDM(C275794rx r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        C275794rx r3 = this.A00;
        if (C275794rx.A0M) {
            1Jk.A03(motionEvent);
        }
        View.OnTouchListener onTouchListener = r3.A0I.A00;
        if (onTouchListener != null && onTouchListener.onTouch(view, motionEvent)) {
            return true;
        }
        C60064Jem jem = r3.A0G;
        Rect rect = r3.A09;
        jem.getGlobalVisibleRect(rect);
        boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        boolean z = false;
        if (contains) {
            z = r3.A0B.onTouchEvent(motionEvent);
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            r3.A0D.A03();
            if (r3.A0L) {
                r3.A03(false);
            }
        }
        WeakReference weakReference = r3.A05;
        if (weakReference == null || (view2 = (View) weakReference.get()) == null || view2.getWindowToken() == null || z) {
            return z;
        }
        motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        return view2.getRootView().dispatchTouchEvent(motionEvent);
    }
}
