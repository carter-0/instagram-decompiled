package X;

import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.JeP  reason: case insensitive filesystem */
public final class C60057JeP extends FrameLayout {
    public final KHW A00;
    public final C66576MXh A01;
    public final C61846KOl A02;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            C61846KOl kOl = this.A02;
            GAX A002 = C61846KOl.A00(kOl, kOl.A06(), false);
            if (A002 != null) {
                this.A01.EvB(A002, (C62320sa) null);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final C66576MXh getPublishScreenDelegate() {
        return this.A01;
    }

    public final KHW getRowView() {
        return this.A00;
    }

    public final C61846KOl getUseCase() {
        return this.A02;
    }

    public C60057JeP(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C61846KOl kOl) {
        super(r2.requireContext());
        this.A02 = kOl;
        this.A01 = mXh;
        KHW khw = new KHW(r2, userSession);
        this.A00 = khw;
        addView(khw);
    }
}
