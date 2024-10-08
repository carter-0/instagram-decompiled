package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.KOc  reason: case insensitive filesystem */
public final class C61838KOc extends LSR {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final LRK A03;
    public final C262224Cq A04;
    public final 0V2 A05;
    public final 05G A06;
    public final C61770pa A07;
    public final AnonymousClass0Ud A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C61838KOc(UserSession userSession, LRK lrk) {
        super(lrk);
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U().A04);
        DbZ.A0t(1, lrk, userSession, A022);
        this.A03 = lrk;
        this.A02 = userSession;
        this.A04 = A022;
        02z A10 = DbS.A10(new C61080JwI((C61000Juw) null, (DefaultConstructorMarker) null, 1, 42));
        this.A06 = A10;
        this.A08 = A10;
        05D A0p = JTQ.A0p();
        this.A05 = A0p;
        this.A07 = A0p;
    }

    public final void A0A(C61000Juw juw) {
        String str = juw.A04;
        if (juw.A02 == null && str != null) {
            juw.A02 = Integer.valueOf(AnonymousClass7TG.A0A(00y.A0l(new 11S("[^0-9]").A00(str, ""))));
        }
        A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, juw, (Jv3) null, A06(), (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -268435457, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }
}
