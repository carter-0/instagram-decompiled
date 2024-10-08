package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;

/* renamed from: X.AjT  reason: case insensitive filesystem */
public final class C40797AjT implements Runnable {
    public final /* synthetic */ CameraToolMenuItem A00;

    public C40797AjT(CameraToolMenuItem cameraToolMenuItem) {
        this.A00 = cameraToolMenuItem;
    }

    public final void run() {
        CameraToolMenuItem cameraToolMenuItem = this.A00;
        cameraToolMenuItem.A0B = false;
        cameraToolMenuItem.A06 = null;
        cameraToolMenuItem.postInvalidate();
    }
}
