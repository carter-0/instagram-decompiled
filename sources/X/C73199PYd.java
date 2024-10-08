package X;

import android.graphics.drawable.ShapeDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.PYd  reason: case insensitive filesystem */
public final class C73199PYd implements Runnable {
    public final /* synthetic */ ShapeDrawable A00;
    public final /* synthetic */ ConstraintLayout A01;

    public C73199PYd(ShapeDrawable shapeDrawable, ConstraintLayout constraintLayout) {
        this.A01 = constraintLayout;
        this.A00 = shapeDrawable;
    }

    public final void run() {
        ConstraintLayout constraintLayout = this.A01;
        if (constraintLayout != null) {
            constraintLayout.setBackground(this.A00);
        }
    }
}
