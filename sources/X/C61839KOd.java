package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.KOd  reason: case insensitive filesystem */
public final class C61839KOd extends LSR {
    public final UserSession A00;
    public final LRK A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61839KOd(UserSession userSession, LRK lrk) {
        super(lrk);
        AnonymousClass7TG.A1O(lrk, userSession);
        this.A01 = lrk;
        this.A00 = userSession;
        02z A10 = DbS.A10(new C61066Jw4((UpcomingEvent) null, (DefaultConstructorMarker) null, 7, 3, false, false));
        this.A02 = A10;
        this.A03 = A10;
    }

    public final void A0A(UpcomingEvent upcomingEvent) {
        String str;
        String id = upcomingEvent.getId();
        UpcomingEvent upcomingEvent2 = (UpcomingEvent) ((C61066Jw4) this.A02.getValue()).A00;
        if (upcomingEvent2 != null) {
            str = upcomingEvent2.getId();
        } else {
            str = null;
        }
        if (0qQ.A0K(id, str)) {
            A0B((UpcomingEvent) null);
        }
    }

    public final void A0B(UpcomingEvent upcomingEvent) {
        A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, upcomingEvent, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -4194305, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }
}
