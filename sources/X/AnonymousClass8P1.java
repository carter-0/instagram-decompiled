package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.colourwheel.ColourWheelView;

/* renamed from: X.8P1  reason: invalid class name */
public final class AnonymousClass8P1 implements AnonymousClass8P2 {
    public final /* synthetic */ C355048Oj A00;

    public AnonymousClass8P1(C355048Oj r1) {
        this.A00 = r1;
    }

    public final void DOy() {
        C355048Oj r3 = this.A00;
        AnonymousClass8GE r2 = r3.A0r;
        Drawable.ConstantState constantState = r2.A01().getConstantState();
        if (constantState != null && constantState.newDrawable() != null) {
            r3.A0q.A00.A0e = true;
            ColourWheelView colourWheelView = r3.A0v;
            colourWheelView.setBaseDrawable(r2.A01());
            colourWheelView.A04();
        }
    }
}
