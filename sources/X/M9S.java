package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

public final class M9S implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ClipsStackedTimelineFragment A02;
    public final /* synthetic */ 0eP A03;

    public M9S(ClipsStackedTimelineFragment clipsStackedTimelineFragment, 0eP r2, int i, int i2) {
        this.A02 = clipsStackedTimelineFragment;
        this.A00 = i;
        this.A03 = r2;
        this.A01 = i2;
    }

    public final void run() {
        String str;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A02;
        AnonymousClass861 r0 = clipsStackedTimelineFragment.A0j;
        if (r0 == null) {
            str = "videoPlaybackViewModel";
        } else {
            r0.A01();
            ClipsStackedTimelineFragment.A0D(clipsStackedTimelineFragment, this.A00);
            AnonymousClass8RF r3 = clipsStackedTimelineFragment.A0d;
            if (r3 == null) {
                str = "clipsTimelineEditorViewModel";
            } else {
                r3.A0G(new C355748Rf(this.A01, C51970G9q.A0B(this.A03)));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
