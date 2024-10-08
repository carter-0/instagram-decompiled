package X;

import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import java.util.Set;

public final class A8p {
    public float A00;
    public float A01;
    public final /* synthetic */ C372038zZ A02;

    public A8p(C372038zZ r1) {
        this.A02 = r1;
    }

    public final boolean A00(MotionEvent motionEvent) {
        C372038zZ r2 = this.A02;
        Set set = r2.A0Q;
        Gesture.GestureType gestureType = Gesture.GestureType.TAP;
        if (!set.contains(gestureType)) {
            r2.A0E = true;
            if (r2.A00 != 0 || r2.A01 != 0) {
                return false;
            }
            C372038zZ.A01(r2);
            return false;
        }
        C372038zZ.A05(r2, new Gesture(C372038zZ.A00(r2, gestureType), motionEvent.getX(), motionEvent.getY(), Gesture.GestureState.ENDED, true, this.A00, this.A01));
        return true;
    }
}
