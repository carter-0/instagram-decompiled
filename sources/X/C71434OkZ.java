package X;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.OkZ  reason: case insensitive filesystem */
public final class C71434OkZ implements View.OnTouchListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C71434OkZ(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Drawable drawable;
        if (this.A00 != 0) {
            TextView textView = (TextView) this.A02;
            Object tag = textView.getTag();
            if (!(tag instanceof Boolean)) {
                tag = null;
            }
            if (!AnonymousClass7TF.A1Y(tag, true)) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                C17920ViB viB = (C17920ViB) this.A03;
                textView.setTextColor(viB.A02);
                if (this.A01 + 1 == viB.A07.size()) {
                    return false;
                }
                drawable = viB.A05;
            } else if (action != 1 && action != 3) {
                return false;
            } else {
                C17920ViB viB2 = (C17920ViB) this.A03;
                textView.setTextColor(viB2.A01);
                if (this.A01 + 1 == viB2.A07.size()) {
                    return false;
                }
                drawable = viB2.A04;
            }
            textView.setBackground(drawable);
            return false;
        }
        0qQ.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C71091OcD ocD = (C71091OcD) this.A03;
            ocD.A0I.Dsf(((OFN) ocD.A0K.get(this.A01)).A00, (View) this.A02);
            return false;
        } else if (actionMasked != 1 && actionMasked != 3) {
            return false;
        } else {
            ((C71091OcD) this.A03).A0I.DsT((View) this.A02);
            return false;
        }
    }
}
