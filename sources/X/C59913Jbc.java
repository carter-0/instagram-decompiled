package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.Jbc  reason: case insensitive filesystem */
public final class C59913Jbc implements View.OnTouchListener {
    public int A00 = -1;
    public final int A01;
    public final C62320sa A02;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        boolean A1U = AnonymousClass7TF.A1U(0, view, motionEvent);
        TextView textView = (TextView) this.A02.invoke();
        if (this.A00 == -1) {
            this.A00 = textView.getCurrentTextColor();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            i = this.A01;
        } else if (action != A1U && action != 3) {
            return false;
        } else {
            i = this.A00;
        }
        textView.setTextColor(i);
        return false;
    }

    public C59913Jbc(C62320sa r2, int i) {
        this.A02 = r2;
        this.A01 = i;
    }
}
