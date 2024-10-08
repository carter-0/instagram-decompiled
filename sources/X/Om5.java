package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;
import java.util.Map;

public final class Om5 implements C41825B2g {
    public final /* synthetic */ IgLiteCameraProxy A00;

    public final void D07(Exception exc) {
        0qQ.A0B(exc, 0);
        C71004OWb.A00.A02("IgLiteCameraProxy", "onCameraError", exc);
        C69425NlA nlA = C69425NlA.A09;
        IgLiteCameraProxy igLiteCameraProxy = this.A00;
        OX3.A01(nlA, C56316HwT.A01(igLiteCameraProxy.A0C), (String) null, (String) null, (Map) null);
        String message = exc.getMessage();
        if (message == null) {
            message = "onCameraError : null message";
        }
        CameraApi cameraApi = igLiteCameraProxy.A05;
        if (cameraApi != null) {
            cameraApi.handleCameraEviction(message);
        }
    }

    public Om5(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }

    public final void D0B() {
        Integer num;
        C71004OWb.A00.A00("IgLiteCameraProxy", "onCameraInitialised");
        IgLiteCameraProxy igLiteCameraProxy = this.A00;
        CameraApi cameraApi = igLiteCameraProxy.A05;
        if (cameraApi != null) {
            cameraApi.setCameraState(2);
        }
        if (igLiteCameraProxy.A0H && (num = igLiteCameraProxy.A07) != null) {
            IgLiteCameraProxy.A02(igLiteCameraProxy, num.intValue());
            igLiteCameraProxy.A07 = null;
        }
    }

    public final void D0G() {
        C71004OWb.A00.A00("IgLiteCameraProxy", "onCameraSwitched");
    }

    public final void D0C(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        C71004OWb.A00.A00("IgLiteCameraProxy", 002.A0u("onCameraLocallyEvicted from: ", str, " to ", str2));
        CameraApi cameraApi = this.A00.A05;
        if (cameraApi != null) {
            cameraApi.handleCameraEviction(str2);
        }
    }
}
