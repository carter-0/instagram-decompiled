package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.rtc.views.omnigridview.OmniGridView;

/* renamed from: X.Ms8  reason: case insensitive filesystem */
public final class C67672Ms8 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ OmniGridView A00;

    public C67672Ms8(OmniGridView omniGridView) {
        this.A00 = omniGridView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        OmniGridView omniGridView = this.A00;
        C74228PrH prH = omniGridView.A06;
        if (prH != null) {
            ((C71773OqZ) prH).A00.A00().A00.A04.A05(PO3.A00);
        }
        return AnonymousClass7TF.A1V(omniGridView.A06);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        OmniGridView omniGridView = this.A00;
        C74228PrH prH = omniGridView.A06;
        if (prH != null) {
            ((C71773OqZ) prH).A00.A00().A00.A04.A07(PMZ.A00);
        }
        return AnonymousClass7TF.A1V(omniGridView.A06);
    }
}
