package X;

import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.Arrays;

/* renamed from: X.Lbu  reason: case insensitive filesystem */
public final class C64439Lbu implements OverlayConfigLayerInterface {
    public final C63579KzS A00;

    public C64439Lbu(C63579KzS kzS) {
        0qQ.A0B(kzS, 1);
        this.A00 = kzS;
    }

    public final /* synthetic */ int[] getUpdatedValues() {
        return new int[0];
    }

    public final void logExposure(int i) {
    }

    public final int getLayerSource() {
        return 45;
    }

    public final int[] getValues() {
        int[] copyOf = Arrays.copyOf(this.A00.A00, 4662);
        0qQ.A07(copyOf);
        return copyOf;
    }
}
