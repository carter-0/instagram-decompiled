package X;

import com.facebook.browser.lite.webview.SystemWebView;
import org.webrtc.CameraVideoCapturer;

public final class TFR implements Runnable {
    public final /* synthetic */ SlN A00;
    public final /* synthetic */ QLA A01;

    public TFR(SlN slN, QLA qla) {
        this.A00 = slN;
        this.A01 = qla;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.QcV, android.webkit.WebView] */
    public final void run() {
        ((SystemWebView) this.A01).A04.reload();
        SlN slN = this.A00;
        int i = slN.A01;
        int i2 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        if (i == 0) {
            i2 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        }
        slN.A00 += i2;
        slN.A01 = i + 1;
    }
}
