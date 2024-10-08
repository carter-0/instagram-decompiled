package X;

import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

public final class AUE implements C341027mD {
    public final /* synthetic */ IgLiteCameraProxy A00;

    public AUE(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }

    public final void DVh(int i, int i2, int i3, int i4, boolean z) {
        AD4 ad4;
        float f;
        float f2;
        IgLiteCameraProxy igLiteCameraProxy = this.A00;
        float f3 = ((float) i) / ((float) i2);
        C343047pa r1 = new C343047pa(i, i2);
        if (!r1.equals(igLiteCameraProxy.A03)) {
            igLiteCameraProxy.A03 = r1;
            IgLiteCameraProxy.A00(igLiteCameraProxy);
        }
        C71004OWb oWb = C71004OWb.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("onOutputSizeChanged width=");
        A1A.append(i);
        A1A.append(" height=");
        A1A.append(i2);
        A1A.append(" ratio=");
        A1A.append(f3);
        oWb.A00("IgLiteCameraProxy", A1A.toString());
        if (((double) f3) >= 0.85d) {
            ad4 = igLiteCameraProxy.A0B;
            f = (float) ((i / 16) * 16);
            f2 = (float) ((i2 / 16) * 16);
        } else {
            ad4 = igLiteCameraProxy.A0B;
            f = 368.0f;
            f2 = 640.0f;
        }
        float f4 = f / f2;
        if (!Float.isNaN(f4) && ad4.A00 != f4) {
            AD4.A00(ad4, f4, ad4.A01);
            ad4.A00 = f4;
        }
    }
}
