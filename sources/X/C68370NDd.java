package X;

import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;

/* renamed from: X.NDd  reason: case insensitive filesystem */
public final class C68370NDd extends ScreenShareProxy {
    public final /* synthetic */ OZU A00;

    public final void setApi(ScreenShareApi screenShareApi) {
        0qQ.A0B(screenShareApi, 0);
        this.A00.A00 = screenShareApi;
    }

    public final void setScreenShareFrameCaptureRate(int i) {
    }

    public C68370NDd(OZU ozu) {
        this.A00 = ozu;
    }

    public final void setScreenShareAvailability(int i) {
        ScreenShareApi screenShareApi = this.A00.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(false, 0);
        }
    }

    public final void setScreenShareStopSharing() {
        ScreenShareApi screenShareApi = this.A00.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(false, 0);
        }
    }
}
