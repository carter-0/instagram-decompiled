package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayConfiguration;
import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayGlobalConfig;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import com.instagram.common.session.UserSession;

/* renamed from: X.TpU  reason: case insensitive filesystem */
public final class C14080TpU implements X6I {
    public final UserSession A00;

    public final AutoplayConfigRoot Atw() {
        UserSession userSession = this.A00;
        0Tu r3 = 0Tu.A05;
        return new AutoplayConfigRoot(new AutoplayGlobalConfig(0, 1, 3, true, 100, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, 15000, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION), AnonymousClass7TE.A1I(new AutoplayConfiguration(AutoplayLayout.UNKNOWN, AnonymousClass7TE.A1I(new AutoplayCustomization("override_1", (int) 182.A01(r3, userSession, 36602252462658155L), (int) 182.A01(r3, userSession, 36602252462592618L), (int) 182.A01(r3, userSession, 36602252462789228L), AutoplayWhichVideos.Companion.valueOf(182.A04(r3, userSession, 36883727439430164L)))), 100, IgNetworkConsentStorage.MAX_ENTRIES)));
    }

    public final boolean BAr() {
        return 182.A06(0Tu.A05, this.A00, 36320777485820762L);
    }

    public C14080TpU(UserSession userSession) {
        this.A00 = userSession;
    }
}
