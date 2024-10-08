package X;

import android.content.Context;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.KOm  reason: case insensitive filesystem */
public final class C61847KOm extends LSR {
    public AnonymousClass3Q2 A00;
    public Integer A01;
    public final Context A02;
    public final LPH A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final LRK A06;
    public final DateFormat A07 = new SimpleDateFormat("EEE, LLL d, h:mma z", Locale.US);
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(C66296MMf.A00(this, 27));
    public final 05G A09;
    public final AnonymousClass0Ud A0A;

    public static final C61075JwD A00(C61075JwD jwD, C61847KOm kOm, Integer num) {
        C61100JxB jxB;
        if (num == null || num.intValue() <= 0) {
            jxB = null;
        } else {
            jxB = new C61100JxB(num, (String) null);
        }
        AnonymousClass3Q2 r1 = kOm.A00;
        if (r1 != null) {
            r1.A0v = jxB;
        }
        return C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, jxB, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, jwD, (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -134217729, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public static final boolean A01(C61847KOm kOm) {
        if (kOm.A06.A03() != C62462KgC.CLIPS) {
            return false;
        }
        Integer num = kOm.A01;
        UserSession userSession = kOm.A05;
        if (!C319116q4.A06(userSession) || num == null || num.intValue() < DbS.A04(0Tu.A05, userSession, 36597317545233176L)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61847KOm(Context context, LPH lph, AnonymousClass0iw r13, UserSession userSession, LRK lrk) {
        super(lrk);
        AnonymousClass7TG.A1U(lrk, userSession, r13);
        this.A06 = lrk;
        this.A05 = userSession;
        this.A04 = r13;
        this.A02 = context;
        this.A03 = lph;
        02z A10 = DbS.A10(new C61041Jvf((String) null, (String) null, (Date) null, (DefaultConstructorMarker) null, 63, 0, false, false, false));
        this.A09 = A10;
        this.A0A = A10;
    }
}
