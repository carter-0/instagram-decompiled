package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.audio.StackedAdjustHorizontalScrollView;

public final class M37 implements Runnable {
    public final /* synthetic */ StackedAdjustHorizontalScrollView A00;

    public M37(StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView) {
        this.A00 = stackedAdjustHorizontalScrollView;
    }

    public final void run() {
        StackedAdjustHorizontalScrollView stackedAdjustHorizontalScrollView = this.A00;
        if (stackedAdjustHorizontalScrollView.A00 - stackedAdjustHorizontalScrollView.getScrollX() == 0) {
            stackedAdjustHorizontalScrollView.A05 = false;
        }
        if (stackedAdjustHorizontalScrollView.A04 || stackedAdjustHorizontalScrollView.A05) {
            stackedAdjustHorizontalScrollView.A00 = stackedAdjustHorizontalScrollView.getScrollX();
            stackedAdjustHorizontalScrollView.postDelayed(stackedAdjustHorizontalScrollView.A02, stackedAdjustHorizontalScrollView.A06);
            return;
        }
        MQR mqr = stackedAdjustHorizontalScrollView.A01;
        if (mqr == null) {
            0qQ.A0F("onScrollStoppedListener");
            throw AnonymousClass00P.createAndThrow();
        }
        LEG leg = ((C65098LnL) mqr).A00;
        if (leg.A04.getVisibility() == 0) {
            L0P l0p = leg.A06;
            KMU.A03(l0p.A00, leg.A00());
        }
    }
}
