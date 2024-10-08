package X;

import org.webrtc.EglRenderer;
import org.webrtc.VideoFrame;

/* renamed from: X.PeY  reason: case insensitive filesystem */
public final class C73542PeY implements EglRenderer.FrameDrawnListenerWithContext {
    public static final C73542PeY A00 = new C73542PeY();

    public final void onFrameDrawn(VideoFrame videoFrame) {
        if (videoFrame instanceof Pr5) {
            ((Pr5) videoFrame).A00.onFrameRendered();
        }
    }
}
