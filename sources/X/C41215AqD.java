package X;

import android.view.TextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

/* renamed from: X.AqD  reason: case insensitive filesystem */
public final class C41215AqD implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass8PZ A02;
    public final /* synthetic */ boolean A03;

    public C41215AqD(AnonymousClass8PZ r1, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    public final void run() {
        AnonymousClass8PZ r0 = this.A02;
        TextureView textureView = r0.A05;
        if (textureView != null) {
            int i = this.A01;
            int i2 = this.A00;
            boolean z = this.A03;
            AnonymousClass81W r02 = ((NineSixteenLayoutConfigImpl) r0.A0G).A0K;
            C394669yU.A00(textureView, r02.getWidth(), r02.getHeight(), i, i2, z, false);
        }
    }
}
