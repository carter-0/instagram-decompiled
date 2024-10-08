package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.List;

public final class LO6 {
    public String A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass07i A04;

    public final void A01(C293505kq r9, C66483MTm mTm) {
        DownloadedTrack downloadedTrack;
        this.A01 = false;
        List list = r9.A0p;
        if (list != null && AnonymousClass7TE.A1b(list)) {
            UserSession userSession = this.A03;
            if (AnonymousClass8IK.A07(userSession)) {
                new LO4(this.A02, userSession, new C65108LnW(r9, mTm, this), Math.min(90000, C3495980z.A00(userSession).A01)).A01(list);
                return;
            }
        }
        AudioOverlayTrack audioOverlayTrack = r9.A0N;
        if (audioOverlayTrack == null || ((downloadedTrack = audioOverlayTrack.A06) != null && JTQ.A1Z(downloadedTrack.A02))) {
            A00(r9, mTm, this);
            return;
        }
        C63924LDf lDf = new C63924LDf(this.A02, new C64542Ldj(r9, mTm, this), this.A03, audioOverlayTrack);
        C353638Im r1 = lDf.A04;
        AudioOverlayTrack audioOverlayTrack2 = lDf.A03;
        r1.A03(audioOverlayTrack2, lDf.A00, lDf.A01, audioOverlayTrack2.A02, false, true);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.KHA, X.11X] */
    public static final void A00(C293505kq r4, C66483MTm mTm, LO6 lo6) {
        1ES.A00(lo6.A02, lo6.A04, new KHA(2, mTm, lo6, r4));
    }

    public LO6(Context context, AnonymousClass07i r2, UserSession userSession) {
        AnonymousClass7TG.A1Q(context, userSession);
        this.A04 = r2;
        this.A02 = context;
        this.A03 = userSession;
    }
}
