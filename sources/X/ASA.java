package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

public final class ASA implements C312396eM {
    public final /* synthetic */ AhY A00;

    public final void DCR(B11 b11) {
        0qQ.A0B(b11, 0);
        AhY ahY = this.A00;
        ahY.A01 = b11;
        AnonymousClass7TH.A0d(AnonymousClass05K.A0j, ahY.A09, AnonymousClass7TH.A0I());
    }

    public final void DlR(SliderConfiguration sliderConfiguration, String str) {
        0qQ.A0B(sliderConfiguration, 1);
        AnonymousClass7TH.A0f(this.A00.A09, new 0eP[]{AnonymousClass7TH.A0I(), AnonymousClass7TH.A0J(AnonymousClass05K.A0Y), AnonymousClass7TE.A1L("steps", Integer.valueOf(sliderConfiguration.mSteps)), AnonymousClass7TE.A1L("sliderType", Integer.valueOf(sliderConfiguration.mSliderType)), AnonymousClass7TE.A1L("colorSamplerRGBAData", sliderConfiguration.mColorSamplerRGBAData)});
    }

    public ASA(AhY ahY) {
        this.A00 = ahY;
    }

    public final void DDV() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A0u, this.A00.A09, AnonymousClass7TH.A0I());
    }

    public final void DlQ(float f) {
        AnonymousClass7TH.A0c("adjustmentValue", Float.valueOf(f), this.A00.A09, AnonymousClass7TH.A0I(), AnonymousClass7TH.A0J(AnonymousClass05K.A15));
    }
}
