package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.8E1  reason: invalid class name */
public final class AnonymousClass8E1 implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C3497981v A01;

    public AnonymousClass8E1(Drawable drawable, C3497981v r2) {
        this.A01 = r2;
        this.A00 = drawable;
    }

    public final void run() {
        View view = this.A01.getView();
        0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) view).setImageDrawable(this.A00);
    }
}
