package X;

import android.view.View;
import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.8FX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8FX implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8FU A00;

    public /* synthetic */ AnonymousClass8FX(AnonymousClass8FU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        AnonymousClass8FU r5 = this.A00;
        if (((Boolean) obj).booleanValue()) {
            if (!r5.A01) {
                r5.A01 = true;
                SliderConfiguration sliderConfiguration = r5.A05.A00;
                r5.A00 = sliderConfiguration;
                if (sliderConfiguration != null) {
                    r5.A06.A04(sliderConfiguration.mSliderType, sliderConfiguration.mSteps, sliderConfiguration.mColorSamplerRGBAData, sliderConfiguration.mImageData);
                }
                View[] viewArr = {r5.A06};
                C71392co r0 = C315596kB.A02;
                C294975nL.A04((C295005nO) null, viewArr, true);
            }
        } else if (r5.A01) {
            r5.A01 = false;
            C315596kB.A08(new View[]{r5.A06}, true);
            r5.A00 = null;
        }
    }
}
