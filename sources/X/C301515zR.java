package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView;

/* renamed from: X.5zR  reason: invalid class name and case insensitive filesystem */
public abstract class C301515zR implements C301525zS {
    public void D1n(MotionEvent motionEvent, View view) {
    }

    public void DKQ(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
    }

    public void DhI(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
    }

    public void DhW(C301495zP r1, C301495zP r2, ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public void Dqc(View view, int i) {
        if (this instanceof C301505zQ) {
            C301505zQ r1 = (C301505zQ) this;
            r1.DsU(r1.A00.A06);
        }
    }

    public void DsU(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        if (this instanceof C301505zQ) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = ((C301505zQ) this).A00;
            legacyCameraDestinationScrollView.A02 = false;
            LegacyCameraDestinationScrollView.A01(legacyCameraDestinationScrollView, legacyCameraDestinationScrollView.A00);
        }
    }

    public void Dse(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        if (this instanceof C301505zQ) {
            LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = ((C301505zQ) this).A00;
            legacyCameraDestinationScrollView.A02 = true;
            LegacyCameraDestinationScrollView.A01(legacyCameraDestinationScrollView, legacyCameraDestinationScrollView.A00);
        }
    }
}
