package X;

import android.view.TextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

/* renamed from: X.AqC  reason: case insensitive filesystem */
public final class C41214AqC implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C59767JXi A02;
    public final /* synthetic */ boolean A03;

    public C41214AqC(C59767JXi jXi, int i, int i2, boolean z) {
        this.A02 = jXi;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    public final void run() {
        0eP r6;
        float f;
        C59767JXi jXi = this.A02;
        TextureView textureView = jXi.A07;
        if (textureView != null) {
            AnonymousClass81W r2 = ((NineSixteenLayoutConfigImpl) jXi.A0S).A0K;
            int width = r2.getWidth();
            int height = r2.getHeight();
            int i = this.A01;
            int i2 = this.A00;
            boolean z = this.A03;
            0eP A002 = C394669yU.A00(textureView, width, height, i, i2, z, C59767JXi.A0D(jXi));
            if (C59767JXi.A0D(jXi)) {
                float f2 = (float) i;
                float f3 = (float) i2;
                float width2 = (float) r2.getWidth();
                float height2 = (float) r2.getHeight();
                boolean z2 = false;
                if (f2 / f3 <= 0.5625f) {
                    z2 = true;
                }
                if (!z || z2) {
                    f = width2 / f2;
                } else {
                    f = height2 / f3;
                }
                float f4 = (f2 / width2) * f;
                float f5 = (f3 / height2) * f;
                float max = Math.max(f4, f5);
                r6 = AnonymousClass7TE.A1L(Float.valueOf(f4 / max), Float.valueOf(f5 / max));
            } else {
                Float valueOf = Float.valueOf(1.0f);
                r6 = new 0eP(valueOf, valueOf);
            }
            C353488Hv r5 = jXi.A0b;
            r5.A01(i, i2, r2.getWidth(), r2.getHeight());
            float A04 = AnonymousClass7TE.A04(A002.A00);
            float A042 = AnonymousClass7TE.A04(A002.A01);
            float A043 = AnonymousClass7TE.A04(r6.A00);
            float A044 = AnonymousClass7TE.A04(r6.A01);
            r5.A00 = A04;
            r5.A01 = A042;
            r5.A02 = A04;
            r5.A03 = A042;
            r5.A04 = A043;
            r5.A05 = A044;
            r5.A0C = z;
            C380359Xr r0 = jXi.A0C;
            if (r0 != null) {
                r0.A01();
            }
        }
    }
}
