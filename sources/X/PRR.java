package X;

import com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer;

public final class PRR implements C74373Ptn {
    public final /* synthetic */ ProgressAnchorContainer A00;

    public PRR(ProgressAnchorContainer progressAnchorContainer) {
        this.A00 = progressAnchorContainer;
    }

    public final void Eg7(float f, float f2, float f3) {
        float max;
        float min;
        float f4;
        ProgressAnchorContainer progressAnchorContainer = this.A00;
        C67680MsG msG = progressAnchorContainer.A00;
        if (msG != null) {
            float translationX = progressAnchorContainer.A01.getTranslationX();
            float f5 = f + translationX;
            float f6 = f2 + translationX;
            float f7 = f3 + translationX;
            float A02 = AnonymousClass7TE.A02(msG);
            if (progressAnchorContainer.A02) {
                float f8 = A02 / 2.0f;
                min = Math.min(0.0f, ((float) (-progressAnchorContainer.getWidth())) + f7 + f8);
                max = Math.max(((float) (-progressAnchorContainer.getWidth())) + A02, ((float) (-progressAnchorContainer.getWidth())) + f6 + f8);
                f4 = ((float) (-progressAnchorContainer.getWidth())) + f5 + f8;
            } else {
                float f9 = A02 / 2.0f;
                max = Math.max(0.0f, f6 - f9);
                min = Math.min(AnonymousClass7TE.A02(progressAnchorContainer) - A02, f7 - f9);
                f4 = f5 - f9;
            }
            msG.setTranslationX(Math.max(max, Math.min(min, f4)));
        }
    }
}
