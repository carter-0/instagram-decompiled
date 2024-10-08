package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.KOa  reason: case insensitive filesystem */
public final class C61836KOa extends LSR {
    public C64722Lgz A00;
    public C357128Wq A01;
    public final LRK A02;
    public final AnonymousClass0r6 A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final 05G A06;

    public C61836KOa(LRK lrk) {
        super(lrk);
        this.A02 = lrk;
        02z A1J = JTO.A1J();
        this.A05 = A1J;
        this.A03 = A1J;
        02z A10 = DbS.A10("");
        this.A06 = A10;
        this.A04 = A10;
    }

    public final void A0A(String str) {
        String str2;
        C61075JwD A062 = A06();
        if (str == null) {
            str2 = (String) this.A06.getValue();
        } else {
            str2 = str;
        }
        A09(C61075JwD.A00((AnonymousClass9J6) null, (C61080JwI) null, (C61066Jw4) null, (C59721JVf) null, (C61046Jvk) null, (C61077JwF) null, (C61079JwH) null, (C61062Jw0) null, (C61100JxB) null, (MediaGenAIDetectionMethod) null, (C61000Juw) null, (Jv3) null, A062, (AnonymousClass3QO) null, (Venue) null, (AudioOverlayTrack) null, (ClipInfo) null, (C272024jy) null, (UpcomingEvent) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (0eP) null, -5, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false));
        if (str == null) {
            str = (String) this.A06.getValue();
        }
        HashSet A002 = C63213KtK.A00(str);
        05G r4 = this.A05;
        List A0a = 00k.A0a(JTO.A0x(r4));
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0a) {
            if (A002.contains(((User) next).getUsername())) {
                A1C.add(next);
            }
        }
        r4.Epw(00k.A0U(A1C));
    }
}
