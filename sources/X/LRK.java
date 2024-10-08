package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public abstract class LRK {
    public final UserSession A00;

    public final C61075JwD A02() {
        if (this instanceof KO3) {
            C361278fx r2 = (C361278fx) ((KO3) this).A06.getValue();
            if (r2.A00 == 3) {
                return (C61075JwD) r2.A00();
            }
        }
        return new C61075JwD((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, (AnonymousClass3QO) null, (1iA) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, "", "", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, 0, true, false, false, false, false, false, false, false, false, true, false, false, true, true);
    }

    public final C62462KgC A03() {
        if (this instanceof KO2) {
            return C62462KgC.CLIPS;
        }
        return C62462KgC.FEED;
    }

    public LRK(UserSession userSession) {
        this.A00 = userSession;
    }

    public static AnonymousClass3Q2 A00(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A02(followersShareFragment).A04();
    }

    public static AnonymousClass3Q2 A01(FollowersShareFragment followersShareFragment) {
        return FollowersShareFragment.A02(followersShareFragment).A00;
    }
}
