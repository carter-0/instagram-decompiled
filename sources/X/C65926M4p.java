package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.M4p  reason: case insensitive filesystem */
public final class C65926M4p implements Runnable {
    public final /* synthetic */ C315496jz A00;

    public C65926M4p(C315496jz r1) {
        this.A00 = r1;
    }

    public final void run() {
        C315496jz r3 = this.A00;
        r3.A0F = AnonymousClass05K.A0C;
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(r3.A0L));
        A0p.E5Z("reel_viewer_gestures_nux_impression_count", 1);
        A0p.apply();
        AnonymousClass6Z4 r0 = r3.A0E;
        if (r0 != null) {
            AnonymousClass6Z0 r02 = r0.A00;
            C314966j8 r4 = r02.A05;
            if (r4 == null) {
                0qQ.A0F("reelViewerNuxLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            C250973mM r32 = ((ReelViewerFragment) r02.A0U).A0a;
            if (r32 != null) {
                r4.A00(r32, "shown", 0.0d);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
