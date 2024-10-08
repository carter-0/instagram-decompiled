package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Wlt  reason: case insensitive filesystem */
public final /* synthetic */ class C20133Wlt implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ View A01;

    public /* synthetic */ C20133Wlt(Drawable drawable, View view) {
        this.A00 = drawable;
        this.A01 = view;
    }

    public final void run() {
        Drawable drawable = this.A00;
        View view = this.A01;
        drawable.setBounds(0, 0, view.getWidth(), view.getHeight());
        view.getOverlay().add(drawable);
        view.postDelayed(new C20132Wls(drawable, view), 500);
    }
}
