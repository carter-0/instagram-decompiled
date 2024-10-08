package X;

import android.content.Context;
import android.location.Location;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.KOp  reason: case insensitive filesystem */
public final class C61850KOp extends LSR implements C66510MUo, C66480MTi {
    public C64700LgV A00;
    public final LRK A01;
    public final AnonymousClass0r6 A02;
    public final 05G A03;
    public final Context A04;
    public final UserSession A05;
    public final C66535MVp A06;
    public final 0sP A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61850KOp(Context context, UserSession userSession, C66535MVp mVp, LRK lrk, 0sP r13, boolean z) {
        super(lrk);
        0qQ.A0B(lrk, 1);
        AnonymousClass7TF.A1D(mVp, 2, userSession);
        this.A01 = lrk;
        this.A06 = mVp;
        this.A04 = context;
        this.A05 = userSession;
        this.A08 = z;
        this.A07 = r13;
        02z A10 = DbS.A10(new C61064Jw2((Venue) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 2, false));
        this.A03 = A10;
        this.A02 = A10;
    }

    public final void A0A(AnonymousClass3Q2 r8, String str) {
        Context context = this.A04;
        UserSession userSession = this.A05;
        1Wr r4 = 1Wr.A00;
        if (r4 != null) {
            C64700LgV lgV = new C64700LgV(context, userSession, this, r4, r8, str);
            this.A00 = lgV;
            lgV.A00();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DjY(List list, String str) {
        0qQ.A0B(list, 0);
        05G r3 = this.A03;
        C61064Jw2 jw2 = (C61064Jw2) r3.getValue();
        r3.Epw(new C61064Jw2((Venue) jw2.A00, str, list, jw2.A03));
        C64700LgV lgV = this.A00;
        if (lgV != null) {
            lgV.A05.removeLocationUpdates(lgV.A03, lgV);
        }
    }

    private final void A00(Venue venue) {
        C64700LgV lgV;
        Location location;
        0eP r0 = null;
        C61075JwD A082 = C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A06(), (AnonymousClass3QO) null, venue, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -129, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        if (this.A08) {
            if (!(venue == null || (lgV = this.A00) == null || (location = lgV.A00) == null)) {
                r0 = AnonymousClass7TE.A1L(Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
            }
            A082 = C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A082, (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, r0, -257, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        }
        A09(A082);
    }

    public final void D1w() {
        05G r5 = this.A03;
        C61064Jw2 jw2 = (C61064Jw2) r5.getValue();
        0sn r4 = 0sn.A00;
        boolean z = jw2.A03;
        0qQ.A0B(r4, 0);
        r5.Epw(new C61064Jw2((Venue) jw2.A00, (String) null, (List) r4, z));
    }

    public final void DOi() {
        this.A06.CjD();
        A00((Venue) null);
    }

    public final void DOl() {
        this.A06.CjE();
        05G r5 = this.A03;
        C61064Jw2 jw2 = (C61064Jw2) r5.getValue();
        List list = (List) jw2.A01;
        r5.Epw(new C61064Jw2((Venue) jw2.A00, jw2.A02, list, JTQ.A1X(list)));
    }

    public final void DOm(Venue venue) {
        this.A06.CjF();
        A00(venue);
        0sP r0 = this.A07;
        if (r0 != null) {
            r0.invoke(venue);
        }
    }
}
