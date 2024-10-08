package X;

import android.view.TextureView;

/* renamed from: X.Apk  reason: case insensitive filesystem */
public final class C41186Apk implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C355308Pm A02;

    public C41186Apk(C355308Pm r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        C355308Pm r4 = this.A02;
        AZG azg = r4.A0B;
        if (azg != null) {
            float f = r4.A00 - ((float) r4.A04);
            azg.A00 = f;
            TextureView textureView = azg.A05;
            if (textureView != null) {
                textureView.setTranslationX(-f);
            }
            AZG azg2 = r4.A0B;
            if (azg2 != null) {
                azg2.FLw(r4.getNumberOfFittingFrames(), this.A01, this.A00);
            }
            r4.invalidate();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
