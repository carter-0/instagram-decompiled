package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7oV  reason: invalid class name and case insensitive filesystem */
public final class C342387oV implements View.OnTouchListener {
    public Rect A00;
    public final View A01;
    public final C342367oT A02;
    public final /* synthetic */ C342377oU A03;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        0qQ.A0B(motionEvent, 1);
        C342377oU r3 = this.A03;
        boolean z = false;
        r3.A00 = false;
        if (motionEvent.getActionMasked() == 0 && this.A02.CRO() && (view2 = this.A01) != null) {
            if (this.A00 == null) {
                Rect rect = new Rect();
                this.A00 = rect;
                view2.getHitRect(rect);
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                Rect rect2 = this.A00;
                if (rect2 != null) {
                    rect2.offset(iArr[0], iArr[1]);
                }
            }
            Rect rect3 = this.A00;
            if (rect3 != null) {
                z = rect3.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            r3.A00 = z;
        }
        return z;
    }

    public C342387oV(View view, C342367oT r2, C342377oU r3) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = view;
    }
}
