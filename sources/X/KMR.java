package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

public final class KMR extends C64378Lau {
    public boolean A00;
    public final /* synthetic */ ClipsStackedTimelineFragment A01;

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A01;
        AnonymousClass8RF r0 = clipsStackedTimelineFragment.A0d;
        if (r0 != null) {
            if (r0.A0E() instanceof AnonymousClass8RU) {
                clipsStackedTimelineFragment.A0R();
                return true;
            }
            AnonymousClass8RF r02 = clipsStackedTimelineFragment.A0d;
            if (r02 != null) {
                if (r02.A0E() instanceof AnonymousClass8RX) {
                    clipsStackedTimelineFragment.A0Q();
                    return true;
                }
                this.A00 = false;
                return super.onSingleTapUp(motionEvent);
            }
        }
        0qQ.A0F("clipsTimelineEditorViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public KMR(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A01 = clipsStackedTimelineFragment;
    }
}
