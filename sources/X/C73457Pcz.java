package X;

import com.instagram.android.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.Pcz  reason: case insensitive filesystem */
public final class C73457Pcz implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public C73457Pcz(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A00.A07;
        if (touchInterceptorFrameLayout != null) {
            return touchInterceptorFrameLayout.getRootView().findViewById(R.id.thread_background_view_overlay);
        }
        throw AnonymousClass7TE.A0y();
    }
}
