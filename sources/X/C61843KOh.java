package X;

import android.content.Context;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.KOh  reason: case insensitive filesystem */
public final class C61843KOh extends LSR {
    public AnonymousClass3Q2 A00;
    public final Context A01;
    public final C64838Lj0 A02;
    public final UserSession A03;
    public final KO2 A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61843KOh(Context context, UserSession userSession, KO2 ko2) {
        super(ko2);
        0qQ.A0B(userSession, 3);
        this.A04 = ko2;
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = (C64838Lj0) userSession.A01(C64838Lj0.class, new C58710IwJ(userSession, 23));
        02z A10 = DbS.A10(new KO6((String) null, (List) null, -1, false, false, false));
        this.A05 = A10;
        this.A06 = A10;
    }

    public static final void A00(C61843KOh kOh, List list) {
        C61843KOh kOh2 = kOh;
        AnonymousClass3Q2 r2 = kOh2.A00;
        if (r2 != null) {
            List list2 = list;
            r2.A4K = list2;
            kOh2.A02.A00(kOh2.A01, r2);
            kOh2.A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, kOh2.A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, list2, (0eP) null, -1, 262127, false, false, false, false, false, false, false, false, false, false, false, false, false));
        }
    }
}
