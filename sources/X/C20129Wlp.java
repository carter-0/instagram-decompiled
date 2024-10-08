package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.Wlp  reason: case insensitive filesystem */
public final class C20129Wlp implements Runnable {
    public final /* synthetic */ C17813VgQ A00;
    public final /* synthetic */ Throwable A01;

    public C20129Wlp(C17813VgQ vgQ, Throwable th) {
        this.A00 = vgQ;
        this.A01 = th;
    }

    public final void run() {
        int i;
        XBR xbr = this.A00.A00;
        Throwable th = this.A01;
        if (th instanceof C391719tX) {
            i = ((C391719tX) th).A01;
        } else {
            i = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        }
        xbr.D0y(new C391719tX("Failed to capture using PhotoOutput", th, i));
    }
}
