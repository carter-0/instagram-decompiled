package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.8FY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8FY implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8FU A00;

    public /* synthetic */ AnonymousClass8FY(AnonymousClass8FU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8FU r7 = this.A00;
        float floatValue = ((Number) obj).floatValue();
        SliderConfiguration sliderConfiguration = r7.A05.A00;
        if (sliderConfiguration != r7.A00) {
            r7.A00 = sliderConfiguration;
            if (sliderConfiguration != null) {
                r7.A06.A04(sliderConfiguration.mSliderType, sliderConfiguration.mSteps, sliderConfiguration.mColorSamplerRGBAData, sliderConfiguration.mImageData);
            }
        }
        r7.A06.setProgress(floatValue);
    }
}
