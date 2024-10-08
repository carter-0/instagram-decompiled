package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu;

/* renamed from: X.AOu  reason: case insensitive filesystem */
public final class C40038AOu implements View.OnTouchListener {
    public final /* synthetic */ CameraPreCaptureUtilityMenu A00;

    public C40038AOu(CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu) {
        this.A00 = cameraPreCaptureUtilityMenu;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass8EP r0 = this.A00.A03;
        if (r0 == null) {
            return false;
        }
        r0.A00();
        return false;
    }
}
