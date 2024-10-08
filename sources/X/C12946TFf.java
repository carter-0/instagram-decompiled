package X;

import android.os.Build;

/* renamed from: X.TFf  reason: case insensitive filesystem */
public final class C12946TFf implements Runnable {
    public final /* synthetic */ VLC A00;
    public final /* synthetic */ Exception A01;

    public C12946TFf(VLC vlc, Exception exc) {
        this.A00 = vlc;
        this.A01 = exc;
    }

    public final void run() {
        C18660VwH vwH = this.A00.A00;
        C13553TcP tcP = vwH.A0H;
        Exception exc = this.A01;
        tcP.DDD(exc);
        if (vwH.A0I.A00.CTO(92)) {
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown") && !Build.MODEL.contains("google_sdk")) {
                String str2 = Build.MODEL;
                if (!str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                    if ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT)) {
                        vwH.A0L.Ew8("MediaPipeline::handleMessage", exc, true);
                    }
                }
            }
        }
    }
}
