package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.Lac  reason: case insensitive filesystem */
public final class C64360Lac implements C312396eM {
    public final /* synthetic */ C63797L7d A00;

    public final void DlR(SliderConfiguration sliderConfiguration, String str) {
    }

    public C64360Lac(C63797L7d l7d) {
        this.A00 = l7d;
    }

    public final void DCR(B11 b11) {
        if (b11 != null) {
            L9T l9t = this.A00.A01;
            l9t.A02 = true;
            AnonymousClass7TF.A1O(l9t.A05, true);
            l9t.A01.A0F = new C65781LzZ(b11);
        }
    }

    public final void DDV() {
        L9T l9t = this.A00.A01;
        l9t.A02 = false;
        AnonymousClass7TF.A1O(l9t.A05, false);
    }

    public final void DlQ(float f) {
        L9T l9t = this.A00.A01;
        float f2 = l9t.A00;
        if (l9t.A04.AJZ(Float.valueOf(f)) && f2 != f) {
            l9t.A01.setProgress(f);
            f2 = f;
        }
        l9t.A00 = f2;
    }
}
