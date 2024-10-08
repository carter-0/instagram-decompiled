package X;

import android.graphics.drawable.TransitionDrawable;
import org.webrtc.CameraCapturer;

/* renamed from: X.PUl  reason: case insensitive filesystem */
public final class C73054PUl implements Runnable {
    public final /* synthetic */ TransitionDrawable A00;

    public C73054PUl(TransitionDrawable transitionDrawable) {
        this.A00 = transitionDrawable;
    }

    public final void run() {
        this.A00.reverseTransition(CameraCapturer.OPEN_CAMERA_DELAY_MS);
    }
}
