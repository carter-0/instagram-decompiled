package X;

import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.ITw  reason: case insensitive filesystem */
public final class C57235ITw implements JOE {
    public final C234342xi A00;

    public final void Dgp(1Xj r9, AnonymousClass3W1 r10, C253913rc r11, MediaFrameLayout mediaFrameLayout, int i) {
        1Xj r4 = r9;
        C253913rc r5 = r11;
        AnonymousClass7TG.A1N(r11, r9);
        MediaFrameLayout mediaFrameLayout2 = mediaFrameLayout;
        0qQ.A0B(mediaFrameLayout, 4);
        C234342xi r1 = this.A00;
        if (!r1.A02() && (mediaFrameLayout.getParent() instanceof C253723rH)) {
            ViewParent parent = mediaFrameLayout.getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type com.instagram.common.ui.widget.zoomcontainer.ZoomableViewContainer");
            r1.A01(mediaFrameLayout2, (C253723rH) parent, r4, r5, r10.A03, i);
        }
    }

    public C57235ITw(C234342xi r1) {
        this.A00 = r1;
    }
}
