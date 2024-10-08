package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public final class KOZ extends LSR {
    public K1L A00;
    public AnonymousClass3Q2 A01;
    public String A02;
    public final KO2 A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;

    public final void A0A(String str) {
        String str2 = str;
        if (0qQ.A0K(str, "not_funded")) {
            str2 = null;
        }
        AnonymousClass3Q2 r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("pendingMedia");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A2w = str2;
        A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, str2, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -262145, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }

    public KOZ(KO2 ko2) {
        super(ko2);
        this.A03 = ko2;
        02z A10 = DbS.A10(new KO4(false, (String) null));
        this.A04 = A10;
        this.A05 = A10;
    }
}
