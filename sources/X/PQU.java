package X;

import android.view.ViewGroup;
import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

public final class PQU implements C315616kD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ProgressAnchorContainer A02;
    public final /* synthetic */ boolean A03;

    public PQU(ProgressAnchorContainer progressAnchorContainer, int i, int i2, boolean z) {
        this.A02 = progressAnchorContainer;
        this.A03 = z;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void DaF(C294975nL r11, float f) {
        float f2;
        float f3;
        int i;
        float f4;
        float translationX;
        float f5;
        ProgressAnchorContainer progressAnchorContainer = this.A02;
        SegmentedProgressBar segmentedProgressBar = progressAnchorContainer.A01;
        ViewGroup.LayoutParams layoutParams = segmentedProgressBar.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(6));
        int width = progressAnchorContainer.getWidth();
        boolean z = this.A03;
        if (z) {
            i = this.A01;
            f2 = ((float) (i * width)) * 0.8f;
            f4 = (float) width;
            f3 = f4;
        } else {
            f2 = (float) width;
            f3 = f2;
            i = this.A01;
            f4 = ((float) (i * width)) * 0.8f;
        }
        layoutParams.width = (int) (f2 + ((f4 - f2) * f));
        segmentedProgressBar.setLayoutParams(layoutParams);
        int i2 = 1;
        if (z) {
            f = 1.0f - f;
        }
        boolean z2 = progressAnchorContainer.A02;
        int i3 = -1;
        if (z2) {
            i3 = 1;
        }
        int i4 = this.A00;
        segmentedProgressBar.setTranslationX(((float) (i3 * width)) * 0.8f * f * ((float) i4));
        if (i4 == i - 1) {
            if (z2) {
                i2 = -1;
            }
            translationX = ((float) i2) * segmentedProgressBar.getTranslationX();
            f5 = 0.2f;
        } else if (i4 != 0) {
            if (z2) {
                i2 = -1;
            }
            translationX = ((float) i2) * segmentedProgressBar.getTranslationX();
            f5 = 0.1f;
        } else {
            return;
        }
        segmentedProgressBar.setTranslationX(translationX + (f3 * f5 * f));
    }
}
