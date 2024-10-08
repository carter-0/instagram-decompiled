package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class KOY extends LSR {
    public final UserSession A00;
    public final LRK A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOY(UserSession userSession, LRK lrk, boolean z) {
        super(lrk);
        0qQ.A0B(userSession, 2);
        this.A01 = lrk;
        this.A00 = userSession;
        this.A04 = z;
        02z A10 = DbS.A10(new C61082JwK(false, (Integer) null, 3, (DefaultConstructorMarker) null, 17));
        this.A02 = A10;
        this.A03 = A10;
    }

    public final void A0A(boolean z) {
        A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -65, 262143, z, false, false, false, false, false, false, false, false, false, false, false, false));
    }
}
