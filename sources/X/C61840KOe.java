package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.KOe  reason: case insensitive filesystem */
public final class C61840KOe extends LSR {
    public final 28D A00;
    public final UserSession A01;
    public final KO3 A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61840KOe(28D r9, UserSession userSession, KO3 ko3) {
        super(ko3);
        AnonymousClass7TF.A1B(userSession, 1, ko3);
        this.A01 = userSession;
        this.A02 = ko3;
        this.A00 = r9;
        02z A10 = DbS.A10(new C61028JvS((String) null, (DefaultConstructorMarker) null, 15, 1, false, false, false));
        this.A03 = A10;
        this.A04 = A10;
    }

    public final void A0A() {
        if (28D.A2m == this.A00) {
            A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -1, 253951, false, false, false, false, false, false, false, false, false, false, true, false, false));
            FEb fEb = ENZ.A04;
            UserSession userSession = this.A01;
            fEb.A02(DbT.A05(C51966G9m.A0P(userSession)), userSession, (C51911G7f) null, false, true);
        }
    }

    public final void A0B(String str) {
        A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -1, 258047, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }
}
