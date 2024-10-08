package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* renamed from: X.M6r  reason: case insensitive filesystem */
public final class C65980M6r implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ClipsStackedTimelineFragment A01;

    public C65980M6r(ClipsStackedTimelineFragment clipsStackedTimelineFragment, int i) {
        this.A01 = clipsStackedTimelineFragment;
        this.A00 = i;
    }

    public final void run() {
        ClipsStackedTimelineFragment.A0D(this.A01, this.A00);
    }
}
