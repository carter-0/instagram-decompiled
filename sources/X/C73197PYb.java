package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.PYb  reason: case insensitive filesystem */
public final class C73197PYb implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ AnonymousClass9H7 A01;

    public C73197PYb(Drawable drawable, AnonymousClass9H7 r2) {
        this.A01 = r2;
        this.A00 = drawable;
    }

    public final void run() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A01.A07;
        if (touchInterceptorFrameLayout != null) {
            View findViewById = touchInterceptorFrameLayout.getRootView().findViewById(R.id.thread_background_view);
            if (findViewById != null) {
                findViewById.setBackground(this.A00);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
