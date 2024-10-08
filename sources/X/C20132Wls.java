package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Wls  reason: case insensitive filesystem */
public final /* synthetic */ class C20132Wls implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ View A01;

    public /* synthetic */ C20132Wls(Drawable drawable, View view) {
        this.A01 = view;
        this.A00 = drawable;
    }

    public final void run() {
        View view = this.A01;
        view.getOverlay().remove(this.A00);
    }
}
