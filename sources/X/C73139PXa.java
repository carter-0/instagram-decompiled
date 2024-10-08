package X;

import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* renamed from: X.PXa  reason: case insensitive filesystem */
public final class C73139PXa implements Runnable {
    public final /* synthetic */ IgLiteCameraProxy A00;

    public C73139PXa(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }

    public final void run() {
        this.A00.getApi().enableCamera(false);
    }
}
