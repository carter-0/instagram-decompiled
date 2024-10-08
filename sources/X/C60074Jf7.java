package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.Jf7  reason: case insensitive filesystem */
public final class C60074Jf7 extends ConstraintLayout {
    public final View A00;
    public final View A01;

    public final View getMainView() {
        return this.A00;
    }

    public C60074Jf7(Context context, View view, View view2) {
        super(context);
        this.A00 = view;
        this.A01 = view2;
        JTP.A13(view2);
        JTP.A13(view);
        C71492dQ r1 = new C71492dQ(-1, -2);
        r1.A0u = view.getId();
        r1.A0F = view.getId();
        view2.setLayoutParams(r1);
        addView(view2);
        addView(view);
    }
}
