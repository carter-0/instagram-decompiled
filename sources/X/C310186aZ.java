package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.ReelCTAIntf;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.6aZ  reason: invalid class name and case insensitive filesystem */
public final class C310186aZ {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final C273384mU A02;

    public C310186aZ(FragmentActivity fragmentActivity, UserSession userSession, C273384mU r4) {
        0qQ.A0B(userSession, 2);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = r4;
    }

    public final void A00(AnonymousClass0iw r7, C255773uh r8) {
        String A012;
        int ordinal = r8.A0e.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                1Xj r0 = r8.A0b;
                r0.getClass();
                A012 = r0.A2j();
            }
            throw new IllegalStateException("Required value was null.");
        }
        C270184gK r02 = r8.A0d;
        r02.getClass();
        List list = r02.A00.A4Z;
        if (list != null) {
            A012 = AnonymousClass6MS.A01((ReelCTAIntf) list.get(0));
        }
        throw new IllegalStateException("Required value was null.");
        if (A012 != null) {
            int currentPositionMs = ((ReelViewerFragment) this.A02).mVideoPlayer.getCurrentPositionMs();
            UserSession userSession = this.A01;
            C270634h3 r1 = new C270634h3(ClipsViewerSource.REEL_FEED_TIMELINE, userSession);
            r1.A1C = A012;
            r1.A05 = currentPositionMs;
            r1.A0p = r7.getModuleName();
            I6Y.A01(this.A00, r1, userSession, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(String str, AnonymousClass0iw r7) {
        int currentPositionMs = ((ReelViewerFragment) this.A02).mVideoPlayer.getCurrentPositionMs();
        UserSession userSession = this.A01;
        C270634h3 r1 = new C270634h3(ClipsViewerSource.REEL_FEED_TIMELINE, userSession);
        r1.A1C = str;
        r1.A05 = currentPositionMs;
        r1.A0p = r7.getModuleName();
        I6Y.A01(this.A00, r1, userSession, false);
    }
}
