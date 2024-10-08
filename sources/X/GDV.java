package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;

public final class GDV {
    public int A00 = 3;
    public final FragmentActivity A01;
    public final ClipsViewerConfig A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass3W1 A06;
    public final S6e A07;
    public final boolean A08;
    public final GDT A09;

    public GDV(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, 1Xj r7, AnonymousClass4DU r8, AnonymousClass3W1 r9, S6e s6e) {
        this.A01 = fragmentActivity;
        this.A02 = clipsViewerConfig;
        this.A04 = r7;
        this.A06 = r9;
        this.A03 = userSession;
        this.A05 = r8;
        this.A07 = s6e;
        this.A09 = new GDT(userSession);
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = clipsViewerConfig.A0K;
        boolean z = true;
        this.A08 = (clipsWatchAndBrowseData == null || !clipsWatchAndBrowseData.A0K) ? false : z;
    }

    public static final void A00(GDV gdv, String str) {
        1Xj r3 = gdv.A04;
        if (r3 != null) {
            GDT.A00(gdv.A03, r3, gdv.A05, AnonymousClass000.A00(1870), str);
        }
        S6e s6e = gdv.A07;
        if (s6e != null) {
            s6e.A02("secondary_cta", "dismiss", "external_swipe");
        }
    }
}
