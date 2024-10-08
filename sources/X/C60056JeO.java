package X;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.JeO  reason: case insensitive filesystem */
public final class C60056JeO extends FrameLayout {
    public final KHW A00;
    public final UserSession A01;
    public final KOX A02;
    public final C66576MXh A03;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 1) {
            C59847JaN.A00(this.A01).A04("AUDIENCE_CONTROLS_TAPPED");
            GAX A0A = this.A02.A0A(C62915KoT.A00);
            if (A0A != null) {
                this.A03.EvB(A0A, (C62320sa) null);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public C60056JeO(AnonymousClass4DH r2, UserSession userSession, KOX kox, C66576MXh mXh) {
        super(r2.requireContext());
        this.A01 = userSession;
        this.A02 = kox;
        this.A03 = mXh;
        KHW khw = new KHW(r2, userSession);
        this.A00 = khw;
        addView(khw);
    }
}
