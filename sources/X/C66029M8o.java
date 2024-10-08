package X;

import android.view.TextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

/* renamed from: X.M8o  reason: case insensitive filesystem */
public final class C66029M8o implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ K5W A02;

    public C66029M8o(K5W k5w, int i, int i2) {
        this.A02 = k5w;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        K5W k5w = this.A02;
        TextureView textureView = k5w.A06;
        if (textureView != null) {
            int A002 = AnonymousClass81W.A00(K5W.A00(k5w));
            int height = ((NineSixteenLayoutConfigImpl) K5W.A00(k5w)).A0K.getHeight();
            int i = this.A01;
            int i2 = this.A00;
            C394669yU.A00(textureView, A002, height, i, i2, false, true);
            ((C353488Hv) k5w.A0V.getValue()).A01(i, i2, AnonymousClass81W.A00(K5W.A00(k5w)), ((NineSixteenLayoutConfigImpl) K5W.A00(k5w)).A0K.getHeight());
            C380359Xr r0 = k5w.A0H;
            if (r0 != null) {
                r0.A01();
            }
        }
    }
}
