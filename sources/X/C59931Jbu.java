package X;

import android.graphics.Rect;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jbu  reason: case insensitive filesystem */
public final class C59931Jbu implements C250603lj {
    public static final C59931Jbu A00 = new C59931Jbu();

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        C343317q1 r0;
        0qQ.A0A(r7);
        0qQ.A0A(r8);
        C59929Jbs jbs = (C59929Jbs) r7.A03;
        UserSession userSession = (UserSession) jbs.A02.get();
        C59739JVx jVx = (C59739JVx) jbs.A03.get();
        Medium medium = (Medium) jbs.A01.get();
        if (userSession != null && jVx != null && medium != null) {
            int intValue = r8.CEk(r7).intValue();
            if (intValue == 0) {
                Rect rect = new Rect();
                jVx.A01.getGlobalVisibleRect(rect);
                C343317q1 r02 = jbs.A00;
                if (r02 != null) {
                    r02.A00(rect, medium);
                }
                MQB mqb = jVx.A02;
                0qQ.A0C(mqb, "null cannot be cast to non-null type com.instagram.creation.capture.adapter.model.GalleryGridThumbnailOverlayViewHolder.GalleryGridMediaOverlayViewHolder");
                JX8.A02(medium, userSession, (C378479Py) mqb);
            } else if (intValue == 2 && (r0 = jbs.A00) != null) {
                r0.A01(medium);
            }
        }
    }
}
