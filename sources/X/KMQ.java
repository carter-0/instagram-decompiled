package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

public final class KMQ extends C64378Lau {
    public final /* synthetic */ ClipsStackedTimelineFragment A00;

    public KMQ(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A00 = clipsStackedTimelineFragment;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C60108Jfo jfo = this.A00.A0h;
        if (jfo == null) {
            0qQ.A0F("stackedTimelineViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        jfo.A0J();
        return false;
    }
}
