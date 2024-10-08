package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.88R  reason: invalid class name */
public final class AnonymousClass88R extends 2YL implements C312396eM {
    public SliderConfiguration A00;
    public B11 A01;
    public final C3504584s A02;
    public final C3495780x A03;
    public final 05G A04 = new 02z(AnonymousClass88T.FLAT);
    public final 05G A05 = new 02z(false);
    public final 05G A06 = new 02z(true);
    public final 05G A07 = new 02z(Float.valueOf(0.0f));

    public AnonymousClass88R(C3504584s r6, C3495780x r7) {
        0qQ.A0B(r6, 2);
        this.A03 = r7;
        this.A02 = r6;
        C318136oS A002 = C318116oQ.A00(this);
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 25);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }

    public final void DDV() {
        this.A01 = null;
        this.A05.Epw(false);
    }

    public final void DCR(B11 b11) {
        this.A01 = b11;
        this.A05.Epw(true);
    }

    public final void DlQ(float f) {
        this.A07.Epw(Float.valueOf(f));
    }

    public final void DlR(SliderConfiguration sliderConfiguration, String str) {
        this.A00 = sliderConfiguration;
    }
}
