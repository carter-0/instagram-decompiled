package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* renamed from: X.M2y  reason: case insensitive filesystem */
public final class C65883M2y implements Runnable {
    public final /* synthetic */ ClipsStackedTimelineFragment A00;

    public C65883M2y(ClipsStackedTimelineFragment clipsStackedTimelineFragment) {
        this.A00 = clipsStackedTimelineFragment;
    }

    public final void run() {
        int i;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A00;
        AnonymousClass861 r0 = clipsStackedTimelineFragment.A0j;
        if (r0 == null) {
            0qQ.A0F("videoPlaybackViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass863 A0Z = JTP.A0Z(r0);
        if (A0Z != null) {
            i = A0Z.CEG();
        } else {
            i = 0;
        }
        ClipsStackedTimelineFragment.A0D(clipsStackedTimelineFragment, i);
    }
}
